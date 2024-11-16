package com.lilt.testVerifiedTranslate;

import static org.junit.Assert.*;

import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.model.*;
import com.lilt.client.api.FilesApi;
import com.lilt.client.api.JobsApi;
import com.lilt.client.api.MemoriesApi;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipEntry;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

public class TestVerifiedTranslate {
    private final ApiClient defaultClient;

    public TestVerifiedTranslate() {
        this.defaultClient = Configuration.getDefaultApiClient();
        this.defaultClient.setBasePath(System.getenv("API_HOST"));
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) this.defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey(System.getenv("API_KEY"));
    }

    private void printError(ApiException e) {
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }

    public class MonitorJobCreateHandler implements Callable<String>{
        private final JobsApi jobsApiInstance;
        private final String jobId;
        private String jobLength;
        private int numMonitored;

        public MonitorJobCreateHandler(JobsApi jobsApiInstance, String jobId, String jobLength, int numMonitored) {
            this.jobsApiInstance = jobsApiInstance;
            this.jobId = jobId;
            this.jobLength = jobLength;
            this.numMonitored = numMonitored;
        }

        private String monitorJobCreate() {
            try {
                List<Job> monitorResult = null;
                while (this.jobLength.equals("0")) {
                    this.jobsApiInstance.deliverJob(Integer.parseInt(this.jobId));
                    monitorResult = this.jobsApiInstance.retrieveAllJobs(false, true, 0, 25);
                    this.jobLength = Integer.toString(monitorResult.size());
                    Thread.sleep(5000);
                    System.out.println("Job length: " + this.jobLength + " || Request No: " + numMonitored);
                    numMonitored++;
                    if (numMonitored > 12) {
                        break;
                    }
                }
                assert monitorResult != null;
                return Integer.toString(monitorResult.size());
            } catch (ApiException e) {
                printError(e);
                fail("Should be able to monitor job creation");
            } catch (InterruptedException | NullPointerException e) {
                e.printStackTrace();
                return null;
            }
            return null;
        }

        @Override
        public String call() throws Exception {
            return monitorJobCreate();
        }
    }

    public class MonitorJobExportHandler implements Callable<String>{
        private final JobsApi jobsApiInstance;
        private final String jobId;
        private String isProcessing;
        private int numMonitored;

        public MonitorJobExportHandler(JobsApi jobsApiInstance, String jobId, String isProcessing, int numMonitored) {
            this.jobsApiInstance = jobsApiInstance;
            this.jobId = jobId;
            this.isProcessing = isProcessing;
            this.numMonitored = numMonitored;
        }

        private String monitorJobExport() {
            try {
                Job monitorResult = null;
                while (this.isProcessing.equals("1")) {
                    monitorResult = this.jobsApiInstance.getJob(Integer.parseInt(this.jobId));
                    this.isProcessing = Integer.toString(monitorResult.getIsProcessing());
                    Thread.sleep(5000);
                    System.out.println("Job length: " + this.isProcessing + " || Request No: " + numMonitored);
                    numMonitored++;
                    if (numMonitored > 12) {
                        break;
                    }
                }
                assert monitorResult != null;
                return Integer.toString(monitorResult.getIsProcessing());
            } catch (ApiException e) {
                printError(e);
                fail("Should be able to monitor job export");
            } catch (InterruptedException | NullPointerException e) {
                e.printStackTrace();
                return null;
            }
            return null;
        }

        @Override
        public String call() throws Exception {
            return monitorJobExport();
        }
    }

    @Test
    public void translate() {
        FilesApi filesApiInstance = new FilesApi(defaultClient);
        MemoriesApi memoriesApiInstance = new MemoriesApi(defaultClient);
        JobsApi jobsApiInstance = new JobsApi(defaultClient);

        //Upload File
        String name = "test_file.txt";
        List<String> text = Arrays.asList("hello world");
        try {
            Files.write(Paths.get(name), text, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        File fileBody = new File(System.getProperty("user.dir") + name);
        String fileId = null;
        try {
            SourceFile fileUploadResult = filesApiInstance.uploadFile(name, fileBody, null, null, null, null, null);
            fileId = Integer.toString(fileUploadResult.getId());
            System.out.println("File uploaded with ID: " + fileId);
        } catch (ApiException apiError) {
            System.err.println("Exception when calling FilesApi#uploadFile");
            printError(apiError);
            fail("Should be able to upload file");
        } catch (NullPointerException nullError) {
            nullError.printStackTrace();
            fail("File Upload returned null ID");
        };

        //Create Memory
        MemoryCreateParameters memoryBody = new MemoryCreateParameters();
        memoryBody.setName("name");
        memoryBody.setSrclang("en");
        memoryBody.setTrglang("de");
        memoryBody.setSrclocale("US");
        memoryBody.setTrglocale("DE");
        String memoryId = null;
        try {
            Memory result = memoriesApiInstance.createMemory(memoryBody);
            memoryId = Integer.toString(result.getId());
            System.out.println("Memory created with ID: " + memoryId);
        } catch (ApiException e) {
            System.err.println("Exception when calling MemoriesApi#createMemory");
            printError(e);
            fail("should be able to create data source");
        } catch (NullPointerException nullError) {
            nullError.printStackTrace();
            fail("Memory creation returned null ID");
        };

        //Create Job
        LanguagePair lang = new LanguagePair();
        lang.setTrgLang("de");
        lang.setMemoryId(Integer.parseInt(memoryId));
        List<LanguagePair> languagePairs = new ArrayList<LanguagePair>();
        languagePairs.add(lang);
        List<Integer> fileIds = new ArrayList<Integer>();
        fileIds.add(Integer.parseInt(fileId));
        JobCreateParameters createJobBody = new JobCreateParameters();
        createJobBody.setName("test_job");
        createJobBody.setSrcLang("en");
        createJobBody.setSrcLocale("US");
        createJobBody.setLanguagePairs(languagePairs);
        createJobBody.setFileIds(fileIds);
        String jobId = null;
        try {
            Job createJobResponse = jobsApiInstance.createJob(createJobBody);
            jobId = Integer.toString(createJobResponse.getId());
            System.out.println("Job created with ID: " + jobId);
        } catch (ApiException e) {
            System.err.println("Exception when calling JobsApi#createJob");
            printError(e);
            fail("Should be able to create job");
        }

        //Monitor Job Progress
        MonitorJobCreateHandler jobCreateHandler = new MonitorJobCreateHandler(jobsApiInstance, jobId, "0", 0);
        ExecutorService jobCreateExecutor = Executors.newSingleThreadExecutor();
        final Future<String> monitorJobCreateHandler = jobCreateExecutor.submit(jobCreateHandler);
        try {
            String jobLength = monitorJobCreateHandler.get(120, TimeUnit.SECONDS);
            if (jobLength.equals("0")) {
                System.out.println("Job creation exceeding time limit.");
                fail("Job creation should not timeout");
            }
        } catch (TimeoutException | InterruptedException | ExecutionException e) {
            monitorJobCreateHandler.cancel(true);
        }
        jobCreateExecutor.shutdownNow();

        //Export Job
        int jobIdInt = Integer.parseInt(jobId);
        String exportIsProcessing = null;
        try {
            jobsApiInstance.exportJob(jobIdInt, "files");
            Job exportJobResponse = jobsApiInstance.getJob(jobIdInt);
            exportIsProcessing = Integer.toString(exportJobResponse.getIsProcessing());
        } catch (ApiException e) {
            System.err.println("Exception when calling JobsApi#exportJob");
            printError(e);
            fail("Should be able to export job");
        }

        //Monitor Export Progress
        MonitorJobExportHandler jobExportHandler = new MonitorJobExportHandler(jobsApiInstance, jobId, exportIsProcessing, 0);
        ExecutorService jobExportExecutor = Executors.newSingleThreadExecutor();
        final Future<String> monitorJobExportHandler = jobExportExecutor.submit(jobExportHandler);
        try {
            exportIsProcessing = monitorJobExportHandler.get(120, TimeUnit.SECONDS);
            if (exportIsProcessing.equals("1")) {
                System.out.println("Job export exceeding time limit.");
                fail("Job export should not timeout");
            }
        } catch (TimeoutException | InterruptedException | ExecutionException e) {
            monitorJobExportHandler.cancel(true);
        }
        jobExportExecutor.shutdownNow();

        //Download Job
        try {
            byte[] downloadResult = jobsApiInstance.downloadJob(jobIdInt);
            ZipInputStream zip = new ZipInputStream(new ByteArrayInputStream(downloadResult));
            zip.getNextEntry();
            String zipContents = IOUtils.toString(zip, "UTF-8");
            assertEquals(zipContents, "hello world");
        } catch (ApiException e) {
            System.err.println("Exception when calling JobsApi#downloadJob");
            printError(e);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Archive Job
        try {
            jobsApiInstance.archiveJob(jobIdInt);
            Job updatedJob = jobsApiInstance.getJob(jobIdInt);
            assertEquals(updatedJob.getStatus(), "archived");
        } catch (ApiException e) {
            System.err.println("Exception when calling JobsApi#archiveJob");
            printError(e);
            fail("Should be able to archive job");
        }

        //Test Clean Up
        try {
            filesApiInstance.deleteFile(Integer.parseInt(fileId));
            jobsApiInstance.deleteJob(jobIdInt);
            memoriesApiInstance.deleteMemory(Integer.parseInt(memoryId));
        } catch (ApiException e) {
            System.err.println("Exception during test clean up");
            printError(e);
            fail("Should be able to clean up tests");
        }
    }
}
