package com.lilt.TestVerifiedTranslate;

import static org.junit.Assert.*;

import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.model.*;
import com.lilt.client.api.FilesApi;
import com.lilt.client.api.JobsApi;
import com.lilt.client.api.TranslateApi;

import java.io.ByteArrayInputStream;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipEntry;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.*;

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

        public MonitorFileHandler(JobsApi jobsApiInstance, String jobId, String jobLength, int numMonitored) {
            this.jobsApiInstance = jobsApiInstance;
            this.jobId = jobId;
            this.jobLength = jobLength;
            this.numMonitored = numMonitored;
        }

        private String monitorJobCreate() {
            try {
                List<Jobs> monitorResult = null;
                while (this.jobLength) {
                    this.jobsApiInstance.deliverJob(this.jobId);
                    monitorResult = this.jobsApiInstance.retrieveAllJobs({
                        "isDelivered": "true",
                        "isArchived": "false"
                    });
                    this.jobLength = monitorResult.length;
                    Thread.sleep(5000);
                    System.out.println("Job length: " + this.jobLength + " || Request No: " + numMonitored);
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
        public String call() throws Exception {
            return monitorJobCreate();
        }
    }

    public class MonitorJobExportHandler implements Callable<String>{
        private final JobsApi jobsApiInstance;
        private final String jobId;
        private int isProcessing;
        private int numMonitored;

        public MonitorJobExportHandler(JobsApi jobsApiInstance, String jobId, int isProcessing, int numMonitored) {
            this.jobsApiInstance = jobsApiInstance;
            this.jobId = jobId;
            this.isProcessing = isProcessing;
            this.numMonitored = numMonitored;
        }

        private String monitorJobExport() {
            try {
                Job monitorResult = null;
                while (this.isProcessing) {
                    Job monitorResult = this.jobsApiInstance.getJob(this.jobId);
                    this.isProcessing = monitorResult.getIsProcessing();
                    Thread.sleep(5000);
                    System.out.println("Job length: " + this.jobLength + " || Request No: " + numMonitored);
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
        String text = "hello world";
        try {
            Files.write(Paths.get(name), text, utf8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        File body = new File(System.getProperty("user.dir") + name);
        String fileId = null;
        try {
            SourceFile fileUploadResult = filesApiInstance.uploadFile(name, body, null, null, null, null, null);
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
        MemoryCreateParameters body = new MemoryCreateParameters();
        body.setName(bodyParameters.get("name"));
        body.setSrclang(bodyParameters.get("en"));
        body.setTrglang(bodyParameters.get("de"));
        body.setSrclocale(bodyParameters.get("US"));
        body.setTrglocale(bodyParameters.get("DE"));
        int memoryId = null;
        try {
            Memory result = apiInstance.createMemory(body);
            int memoryId = result.getId();
            System.out.println("Memory created with ID: " + memoryId);
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
        try {
            Job createJobResponse = jobsApiInstance.createJob(createJobBody);
            int jobId = createJobResponse.getId();
            System.out.println("Job created with ID: " + jobId);
        } catch (ApiException e) {
            System.err.println("Exception when calling JobsApi#createJob");
            printError(e);
            fail("Should be able to create job");
        }

        //Monitor Job Progress
        MonitorJobCreateHandler handler = new MonitorJobCreateHandler(jobsApiInstance, jobId, 0, 0);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        final Future<String> monitorJobCreateHandler = executor.submit(handler);
        try {
            jobLength = monitorJobCreateHandler.get(120, TimeUnit.SECONDS);
            if (jobLength.equals(0)) {
                System.out.println("Job creation exceeding time limit.");
                fail("Job creation should not timeout");
            }
        } catch (TimeoutException | InterruptedException | ExecutionException e) {
            monitorJobCreateHandler.cancel(true);
        }
        executor.shutdownNow();

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
        MonitorJobExportHandler handler = new MonitorJobExportHandler(jobsApiInstance, jobId, exportIsProcessing, 0);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        final Future<String> monitorJobExportHandler = executor.submit(handler);
        try {
            exportIsProcessing = monitorJobExportHandler.get(120, TimeUnit.SECONDS);
            if (exportIsProcessing.equals(1)) {
                System.out.println("Job export exceeding time limit.");
                fail("Job export should not timeout");
            }
        } catch (TimeoutException | InterruptedException | ExecutionException e) {
            monitorJobExportHandler.cancel(true);
        }

        //Download Job
        try {
            byte[] downloadResult = jobsApiInstance.downloadJob(jobId);
            ZipInputStream z = new ZipInputStream(new ByteArrayInputStream(downloadResult));
            a
            ZipEntry zipEntry = z.getNextEntry();
            zipEntry = z.getNextEntry();
            InputStream zipStream = zipFile.getInputStream(zipEntry);
            String zipContents = IOUtils.toString(inputStream, "UTF-8");
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
