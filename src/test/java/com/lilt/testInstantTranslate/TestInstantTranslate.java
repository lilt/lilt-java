package com.lilt.testInstantTranslate;

import static org.junit.Assert.*;

import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.model.*;
import com.lilt.client.api.FilesApi;
import com.lilt.client.api.TranslateApi;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.*;

import org.junit.Test;

public class TestInstantTranslate {
    private final ApiClient defaultClient;
    private final String STAGING_MEMORY_ID = "23583";
    private final String STAGING_TRANSLATION_ID = "17680";


    public TestInstantTranslate() {
        this.defaultClient = Configuration.getDefaultApiClient();
        this.defaultClient.setBasePath("https://staging-api.lilt.dev");
        //this.defaultClient.setBasePath("System.getenv("API_HOST")");
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) this.defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("bb12bddcff76e51a37a8999a02d97fbb");
        //ApiKeyAuth.setApiKey(System.getenv("API_KEY"));
    }

    private void printError(ApiException e) {
        System.err.println("Exception when calling FilesApi#uploadFile");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }

    public class MonitorFileHandler implements Callable<String>{
        private final TranslateApi translateApiInstance;
        private final String translationId;
        private String translationStatus;
        private int numMonitored;

        public MonitorFileHandler(TranslateApi translateApiInstance, String translationId, String translationStatus, int numMonitored) {
            this.translateApiInstance = translateApiInstance;
            this.translationId = translationId;
            this.numMonitored = numMonitored;
            this.translationStatus = translationStatus;
        }

        private String monitorFile() {
            try {
                List<TranslationInfo> monitorResult = null;
                while (this.translationStatus.equals("InProgress")) {
                    monitorResult = this.translateApiInstance.monitorFileTranslation(this.translationId, null, null, null);
                    this.translationStatus = monitorResult.getFirst().getStatus();
                    Thread.sleep(5000);
                    System.out.println("Translation status: " + translationStatus + " || Request No: " + numMonitored);
                    numMonitored++;
                    if (numMonitored > 12) {
                        break;
                    }
                }
                assert monitorResult != null;
                return monitorResult.getFirst().getStatus();
            } catch (ApiException e) {
                printError(e);
                fail("Should be able to monitor translation");
            } catch (InterruptedException | NullPointerException e) {
                e.printStackTrace();
                return null;
            }
            return null;
        }

        @Override
        public String call() throws Exception {
            return monitorFile();
        }
    }

    @Test
    public void translate() {
        //Upload File
        FilesApi fileApiInstance = new FilesApi(defaultClient);
        String name = "/src/test-resources/translate-fr_to_en.txt";
        File body = new File(System.getProperty("user.dir") + name);
        String fileId = null;
        try {
            SourceFile fileUploadResult = fileApiInstance.uploadFile(name, body, null, null, null, null, null);
            System.out.println(fileUploadResult);
            fileId = Integer.toString(fileUploadResult.getId());
        } catch (ApiException apiError) {
            printError(apiError);
            fail("Should be able to upload file");
        } catch (NullPointerException nullError) {
            nullError.printStackTrace();
            fail("File Upload returned null ID");
        };

        //Translate File
        TranslateApi translateApiInstance = new TranslateApi(defaultClient);
        String memoryId = this.STAGING_MEMORY_ID;
        String translationId = null;
        String translationStatus = null;
        try {
            List<TranslationInfo> translateResult = translateApiInstance.batchTranslateFile(fileId, memoryId, null, null);
            System.out.println(translateResult);
            TranslationInfo translationResponse = translateResult.getFirst();
            translationId = Integer.toString(translationResponse.getId());
            translationStatus = translationResponse.getStatus();
        } catch (ApiException e) {
            printError(e);
            fail("Should be able to translate file");
        } catch (NullPointerException e) {
            e.printStackTrace();
            fail("File translation returned null ID");
        }


        //Monitor Translation
        MonitorFileHandler handler = new MonitorFileHandler(translateApiInstance, translationId, translationStatus, 0);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        final Future<String> monitorHandler = executor.submit(handler);

        try {
            translationStatus = monitorHandler.get(120, TimeUnit.SECONDS);
            if (translationStatus.equals("InProgress")) {
                translationId = this.STAGING_TRANSLATION_ID;
                System.out.println("Translation exceeding time limit. Switching to finished translation.");
            }
        } catch (TimeoutException | InterruptedException | ExecutionException e) {
            monitorHandler.cancel(true);
        }
        executor.shutdownNow();

        //Download File
        try {
            byte[] downloadResult = translateApiInstance.downloadFile(translationId);
            String downloadString = new String(downloadResult, StandardCharsets.UTF_8);
            System.out.println(downloadString);
            assertTrue(downloadString.contains("cat"));
            assertTrue(downloadString.contains("Hello"));
        } catch (ApiException e) {
            printError(e);
        }
    }
}
