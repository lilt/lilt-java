package com.lilt.testDataSource;

import static org.junit.Assert.*;

import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.model.*;
import com.lilt.client.api.MemoriesApi;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestUploadTMX {
    private final String tmxFileCase;
    private final ApiClient defaultClient;

    public TestUploadTMX(String tmxFileCase) {
        this.tmxFileCase = tmxFileCase;
        this.defaultClient = Configuration.getDefaultApiClient();
        this.defaultClient.setBasePath(System.getenv("API_HOST"));
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) this.defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey(System.getenv("API_KEY"));
    }

    @Parameterized.Parameters(name="{0}")
    public static Collection<Object[]> tmxFileCase() {
        return Arrays.asList(new Object[][] {
                { "wrong_data" },
                { "normal" }
        });
    }

    public static String getTMXName(String tmxFileCase) {
        switch (tmxFileCase) {
            case "wrong_data":
                return "get_documents.json";
            case "normal":
                return "fr_to_en.tmx";
            default:
                return "";
        }
    }

    public static File getTMXFile(String tmxFileCase) {
        String filepath = "";
        switch (tmxFileCase) {
            case "wrong_data":
                filepath = "/src/test-resources/get_documents.json";
                break;
            case "normal":
                filepath = "/src/test-resources/test-fr_to_en.tmx";
                break;
            default:
                filepath = "";
        }
        try {
            return new File(System.getProperty("user.dir") + filepath);
        } catch (NullPointerException e) {
            System.out.println("Could not find file");
            fail("Should always be able to access test-resources");
            return null;
        }
    }

    private void printError(ApiException e) {
        System.err.println("Exception when calling FilesApi#uploadFile");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }

    public class MonitorFileHandler implements Callable<String> {
        private MemoriesApi memoriesApiInstance;
        private int memoryId;
        private Boolean translationStatus;
        private int numMonitored;

        public MonitorFileHandler(MemoriesApi memoriesApiInstance, int memoryId, Boolean translationStatus, int numMonitored) {
            this.memoriesApiInstance = memoriesApiInstance;
            this.memoryId = memoryId;
            this.translationStatus = translationStatus;
            this.numMonitored = numMonitored;
        }

        private Boolean monitorFile() {
            try {
                List<Memory> monitorResult = null;
                while (this.translationStatus) {
                    monitorResult = this.memoriesApiInstance.getMemory(this.memoryId);
                    this.translationStatus = monitorResult.get(0).getIsProcessing();
                    Thread.sleep(5000);
                    System.out.println("Translation status: " + this.translationStatus + " || Request No: " + numMonitored);
                    numMonitored++;
                    if (numMonitored > 12) {
                        break;
                    }
                }
                return monitorResult.get(0).getIsProcessing();
            } catch (ApiException e) {
                e.printStackTrace();
                fail("Should be able to monitor translation");
            } catch (InterruptedException e) {
                e.printStackTrace();
                fail("Should not be interrupted");
            }
            return null;
        }

        @Override
        public String call() throws Exception {
            return Boolean.toString(monitorFile());
        }
    }


    @Test
    public void createDataSource() {
        MemoriesApi apiInstance = new MemoriesApi(defaultClient);
        MemoryCreateParameters body = new MemoryCreateParameters();
        body.setName("test-fr_to_en");
        body.setSrclang("fr");
        body.setTrglang("en");
        body.setSrclocale("FR");
        body.setTrglocale("US");
        try {
            Memory createMemoryResult = apiInstance.createMemory(body);
            int memoryId = createMemoryResult.getId();
            String name = getTMXName(this.tmxFileCase);
            File fileContents = getTMXFile(this.tmxFileCase);
            List<SDLXLIFFFilter> sdlxliffFilters = Arrays.asList();
            Boolean hasHeaderRow = null;
            Boolean skipDuplicates = true;

            MemoryImportResponse importMemoryResult = apiInstance.importMemoryFile(memoryId, name, fileContents, sdlxliffFilters, hasHeaderRow, skipDuplicates);
            System.out.println(importMemoryResult);
            int intIsProcessing = importMemoryResult.getIsProcessing();
            assertEquals(intIsProcessing, 1);

            Boolean isProcessing = intIsProcessing == 1;
            MonitorFileHandler handler = new MonitorFileHandler(apiInstance, memoryId, isProcessing, 0);
            ExecutorService executor = Executors.newSingleThreadExecutor();
            final Future<String> monitorHandler = executor.submit(handler);

            try {
                isProcessing = monitorHandler.get(120, TimeUnit.SECONDS) == "true";
                if (isProcessing) {
                    System.out.println("Translation exceeding time limit. Switching to finished translation.");
                    fail("Memory file processing should not timeout");
                }
            } catch (TimeoutException | ExecutionException | InterruptedException e) {
                monitorHandler.cancel(true);
            }
            executor.shutdownNow();

            String query = "chatte";
            List<TranslationMemoryEntry> result = apiInstance.queryMemory(memoryId, query, 10);
            if (this.tmxFileCase.equals("wrong_data")) {
                assert result.isEmpty();
            } else {
                assertEquals(result.get(0).getSource(), "chatte");
                assertEquals(result.get(0).getTarget(), "cat");
            }
            apiInstance.deleteMemory(memoryId);

        } catch (ApiException e) {
            printError(e);
            fail("should not throw exception");
        }
    }
}
