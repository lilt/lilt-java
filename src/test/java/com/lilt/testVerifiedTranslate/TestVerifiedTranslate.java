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
import java.io.InputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipEntry;

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

    public class MonitorJobCreateHandler implements Callable<Integer>{
        private final JobsApi jobsApiInstance;
        private final int jobId;
        private int jobLength;
        private int numMonitored;

        public MonitorJobCreateHandler(JobsApi jobsApiInstance, int jobId, int jobLength, int numMonitored) {
            this.jobsApiInstance = jobsApiInstance;
            this.jobId = jobId;
            this.jobLength = jobLength;
            this.numMonitored = numMonitored;
        }

        private int monitorJobCreate() {
            try {
                List<Job> monitorResult = null;
                while (this.jobLength.equals(0)) {
                    this.jobsApiInstance.deliverJob(this.jobId);
                    monitorResult = this.jobsApiInstance.retrieveAllJobs(false, true, 0, 25);
                    this.jobLength = monitorResult.length;
                    Thread.sleep(5000);
                    System.out.println("Job length: " + Integer.toString(this.jobLength) + " || Request No: " + Integer.toString(numMonitored));
                    numMonitored++;
                    if (numMonitored > 12) {
                        break;
                    }
                }
                assert monitorResult != null;
                return monitorResult.length;
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
        public int call() throws Exception {
            return monitorJobCreate();
        }
    }

    public class MonitorJobExportHandler implements Callable<Integer>{
        private final JobsApi jobsApiInstance;
        private final int jobId;
        private int isProcessing;
        private int numMonitored;

        public MonitorJobExportHandler(JobsApi jobsApiInstance, int jobId, int isProcessing, int numMonitored) {
            this.jobsApiInstance = jobsApiInstance;
            this.jobId = jobId;
            this.isProcessing = isProcessing;
            this.numMonitored = numMonitored;
        }

        private int monitorJobExport() {
            try {
                Job monitorResult = null;
                while (this.isProcessing.equals(1)) {
                    monitorResult = this.jobsApiInstance.getJob(this.jobId);
                    this.isProcessing = monitorResult.getIsProcessing();
                    Thread.sleep(5000);
                    System.out.println("Job length: " + Integer.toString(this.isProcessing) + " || Request No: " + Integer.toString(numMonitored));
                    numMonitored++;
                    if (numMonitored > 12) {
                        break;
                    }
                }
                assert monitorResult != null;
                return monitorResult.getIsProcessing();
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
        public int call() throws Exception {
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
        String text = "hello world";
        try {
            Files.write(Paths.get(name), text, "utf8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        File fileBody = new File(System.getProperty("user.dir") + name);
        int fileId = null;
        try {
            SourceFile fileUploadResult = filesApiInstance.uploadFile(name, fileBody, null, null, null, null, null);
            fileId = fileUploadResult.getId();
            System.out.println("File uploaded with ID: " + Integer.toString(fileId));
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
        int memoryId = null;
        try {
            Memory result = memoriesApiInstance.createMemory(memoryBody);
            memoryId = result.getId();
            System.out.println("Memory created with ID: " + Integer.toString(memoryId));
        } catch (ApiException e) {
            System.err.println("Exception when calling MemoriesApi#createMemory");
            printError(e);
            fail("should be able to create data source");
        }

        //Create Job
        LanguagePair lang = new LanguagePair();
        lang.setTrgLang("de");
        lang.setMemoryId(memoryId);
        List<LanguagePair> languagePairs = new ArrayList<LanguagePair>();
        languagePairs.add(lang);
        List<Integer> fileIds = new ArrayList<Integer>();
        fileIds.add(fileId);
        JobCreateParameters createJobBody = new JobCreateParameters();
        createJobBody.setName("test_job");
        createJobBody.setSrcLang("en");
        createJobBody.setSrcLocale("US");
        createJobBody.setLanguagePairs(languagePairs);
        createJobBody.setFileIds(fileIds);
        int jobId = null;
        try {
            Job createJobResponse = jobsApiInstance.createJob(createJobBody);
            jobId = createJobResponse.getId();
            System.out.println("Job created with ID: " + Integer.toString(jobId));
        } catch (ApiException e) {
            System.err.println("Exception when calling JobsApi#createJob");
            printError(e);
            fail("Should be able to create job");
        }

        //Monitor Job Progress
        MonitorJobCreateHandler jobCreateHandler = new MonitorJobCreateHandler(jobsApiInstance, jobId, 0, 0);
        ExecutorService jobCreateExecutor = Executors.newSingleThreadExecutor();
        final Future<String> monitorJobCreateHandler = jobCreateExecutor.submit(jobCreateHandler);
        try {
            int jobLength = monitorJobCreateHandler.get(120, TimeUnit.SECONDS);
            if (jobLength.equals(0)) {
                System.out.println("Job creation exceeding time limit.");
                fail("Job creation should not timeout");
            }
        } catch (TimeoutException | InterruptedException | ExecutionException e) {
            monitorJobCreateHandler.cancel(true);
        }
        jobCreateExecutor.shutdownNow();

        //Export Job
        try {
            jobsApiInstance.exportJob(jobId, "files");
            Job exportJobResponse = jobsApiInstance.getJob(jobId);
            int exportIsProcessing = exportJobResponse.getIsProcessing();
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
            int exportIsProcessing = monitorJobExportHandler.get(120, TimeUnit.SECONDS);
            if (exportIsProcessing.equals(1)) {
                System.out.println("Job export exceeding time limit.");
                fail("Job export should not timeout");
            }
        } catch (TimeoutException | InterruptedException | ExecutionException e) {
            monitorJobExportHandler.cancel(true);
        }
        jobExportExecutor.shutdownNow();

        //Download Job
        try {
            byte[] downloadResult = jobsApiInstance.downloadJob(jobId);
            ZipInputStream zip = new ZipInputStream(new ByteArrayInputStream(downloadResult));
            ZipEntry zipEntry = zip.getNextEntry();
            zipEntry = zip.getNextEntry();
            InputStream zipStream = zip.getInputStream(zipEntry);
            String zipContents = IOUtils.toString(zipStream, "UTF-8");
            assertEquals(zipContents, "hello world");
        } catch (ApiException e) {
            System.err.println("Exception when calling JobsApi#downloadJob");
            printError(e);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Archive Job
        try {
            jobsApiInstance.archiveJob(jobId);
            Job updatedJob = jobsApiInstance.getJob(jobId);
            assertEquals(updatedJob.getStatus(), "archived");
        } catch (ApiException e) {
            System.err.println("Exception when calling JobsApi#archiveJob");
            printError(e);
            fail("Should be able to archive job");
        }

        //Test Clean Up
        filesApiInstance.deleteFile(fileId);
        jobsApiInstance.deleteJob(jobId);
        memoriesApiInstance.deleteMemory(memoryId);
    }
}
