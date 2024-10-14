package com.lilt.testDataSource;

import static org.junit.Assert.*;

import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.model.*;
import com.lilt.client.api.MemoriesApi;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestCreateDataSource {
    private final String dataSourceLanguages;
    private final ApiClient defaultClient;
    private final List<String> shouldFail = Arrays.asList("none_src", "none_trg", "none_both", "unsupported_languages");

    public TestCreateDataSource(String dataSourceLanguages) {
        this.dataSourceLanguages = dataSourceLanguages;
        this.defaultClient = Configuration.getDefaultApiClient();
        this.defaultClient.setBasePath(System.getenv("API_HOST"));
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) this.defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey(System.getenv("API_KEY"));
    }

    @Parameterized.Parameters(name="{0}")
    public static Collection<Object[]> dataSourceLanguages() {
        return Arrays.asList(new Object[][] {
                { "none_src" },
                { "none_trg" },
                { "none_both" },
                { "english" },
                { "non_english" },
                { "source_is_target" },
                { "unsupported_languages" }
        });
    }

    public static Dictionary<String, String> getDataSourceParameters(String datasSourceCase) {
        Dictionary<String, String> parameterDict = new Hashtable<>();
        switch (datasSourceCase) {
            case "none_src":
                parameterDict.put("name", "test-non-src");
                parameterDict.put("srclang", "");
                parameterDict.put("trglang", "en");
                parameterDict.put("srclocale", "US");
                parameterDict.put("trglocale", "");
                break;
            case "none_trg":
                parameterDict.put("name", "test-none-trg");
                parameterDict.put("srclang", "en");
                parameterDict.put("trglang", "");
                parameterDict.put("srclocale", "US");
                parameterDict.put("trglocale", "");
                break;
            case "none_both":
                parameterDict.put("name", "test-none-both");
                parameterDict.put("srclang", "");
                parameterDict.put("trglang", "");
                parameterDict.put("srclocale", "US");
                parameterDict.put("trglocale", "");
                break;
            case "english":
                parameterDict.put("name", "test-english");
                parameterDict.put("srclang", "en");
                parameterDict.put("trglang", "es");
                parameterDict.put("srclocale", "US");
                parameterDict.put("trglocale", "");
                break;
            case "non_english":
                parameterDict.put("name", "test-non-english");
                parameterDict.put("srclang", "de");
                parameterDict.put("trglang", "fr");
                parameterDict.put("srclocale", "DE");
                parameterDict.put("trglocale", "FR");
                break;
            case "source_is_target":
                parameterDict.put("name", "test-source-is-target");
                parameterDict.put("srclang", "fr");
                parameterDict.put("trglang", "fr");
                parameterDict.put("srclocale", "FR");
                parameterDict.put("trglocale", "FR");
                break;
            case "unsupported_languages":
                parameterDict.put("name", "test-unsupported-languages");
                parameterDict.put("srclang", "ac");
                parameterDict.put("trglang", "ad");
                parameterDict.put("srclocale", "");
                parameterDict.put("trglocale", "");
                break;
        }
        return parameterDict;
    };

    public static Memory getExpected(String dataSourceLanguages) {
        Memory expected = new Memory();
        switch (dataSourceLanguages) {
            case "english":
                expected.setSrclang("en");
                expected.setTrglang("es");
                expected.setSrclocale("US");
                expected.setTrglocale(null);
                expected.setName("test-english");
                break;
            case "non_english":
                expected.setSrclang("de");
                expected.setTrglang("fr");
                expected.setSrclocale("DE");
                expected.setTrglocale("FR");
                expected.setName("test-non-english");
                break;
            case "source_is_target":
                expected.setSrclang("fr");
                expected.setTrglang("fr");
                expected.setSrclocale("FR");
                expected.setTrglocale("FR");
                expected.setName("test-source-is-target");
                break;
            default:
                break;
        }
        return expected;
    }

    public static void assertResponse(Memory response, Memory expected) {
        assertEquals(response.getSrclang(), expected.getSrclang());
        assertEquals(response.getTrglang(), expected.getTrglang());
        assertEquals(response.getSrclocale(), expected.getSrclocale());
        assertEquals(response.getTrglocale(), expected.getTrglocale());
        assertEquals(response.getName(), expected.getName());
    }

    @Test
    public void createDataSource() {
        MemoriesApi apiInstance = new MemoriesApi(defaultClient);
        MemoryCreateParameters body = new MemoryCreateParameters();
        Dictionary<String, String> bodyParameters = getDataSourceParameters(this.dataSourceLanguages);
        body.setName(bodyParameters.get("name"));
        body.setSrclang(bodyParameters.get("srclang"));
        body.setTrglang(bodyParameters.get("trglang"));
        body.setSrclocale(bodyParameters.get("srclocale"));
        body.setTrglocale(bodyParameters.get("trglocale"));
        try {
            Memory result = apiInstance.createMemory(body);
            System.out.println(result);
            assertResponse(result, getExpected(this.dataSourceLanguages));
        } catch (ApiException e) {
            System.err.println("Exception when calling MemoriesApi#createMemory");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            if(!this.shouldFail.contains(this.dataSourceLanguages)) {
                fail("should be able to create data source");
            } else {
                assertEquals(e.getCode(), 400);
            }
        }
    }
}
