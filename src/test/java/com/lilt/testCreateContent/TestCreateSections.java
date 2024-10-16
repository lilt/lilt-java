package com.lilt.testCreateContent;

import static org.junit.Assert.*;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.model.*;
import com.lilt.client.api.CreateApi;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestCreateSections {
    private final String sectionCase;
    private final ApiClient defaultClient;

    public TestCreateSections(String sectionCase) {
        this.sectionCase = sectionCase;
        this.defaultClient = Configuration.getDefaultApiClient();
        this.defaultClient.setBasePath(System.getenv("API_HOST"));
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) this.defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey(System.getenv("API_KEY"));
    }

    @Parameterized.Parameters(name="{0}")
    public static Collection<Object[]> charCases() {
        return Arrays.asList(new Object[][] {
                {"none"},
                {"one"},
                {"multiple"}
        });
    }

    public static List<String> getSections(String sectionCase) {
        switch (sectionCase) {
            case "one":
                return Arrays.asList("Bees and me");
            case "multiple":
                return Arrays.asList("Bees and me", "Honey for you", "Conclusion");
            default:
                return Arrays.asList();
        }
    }

    public static JsonObject getExpected(String charCase) {
        List<String> sections = Arrays.asList();
        switch (charCase) {
            case "none":
                break;
            case "normal":
                sections.add("Bees and me");
                break;
            case "over500":
                sections.add("Bees and me");
                sections.add("Honey for you");
                sections.add("Conclusion");
                break;
        }
        JsonObject expected = new JsonObject();
        JsonObject templateParams = new JsonObject();
        expected.addProperty("language", "en-US");
        expected.addProperty("template", "blog-post");
        templateParams.addProperty("contentLength", 1000);
        templateParams.addProperty("memoryId", (String) null);
        templateParams.addProperty("language", "en-US");
        templateParams.add("sections", (JsonElement) sections);
        templateParams.addProperty("summary", "a blog post about how important bees are to my honey farm");
        return expected;
    }

    public static Boolean assertExpected(LiltCreateContent response, JsonObject expected) {
        assertEquals(response.getLanguage(), expected.get("language"));
        assertEquals(response.getTemplate(), expected.get("template"));
        LiltCreateContentTemplateParams responseTemplateParams = response.getTemplateParams();
        JsonObject expectedTemplateParams = (JsonObject) expected.get("templateParams");
        List<String> expectedSections = (List<String>) expectedTemplateParams.get("sections");
        assertEquals(responseTemplateParams.getContentLength(), expectedTemplateParams.get("contentLength"));
        assertEquals(responseTemplateParams.getMemoryId(), expected.get("memoryId"));
        assertEquals(responseTemplateParams.getLanguage(), expectedTemplateParams.get("language"));
        assertArrayEquals(responseTemplateParams.getSections().toArray(), expectedSections.toArray());
        assertEquals(responseTemplateParams.getSummary(), expectedTemplateParams.get("summary"));
    }

    @Test
    public void create() {
        CreateApi apiInstance = new CreateApi(defaultClient);
        CreateConverterConfigParameters signedAgreement = new CreateConverterConfigParameters();
        signedAgreement.setSignedAgreement(true);
        LiltCreateContentTemplateParams templateParams = new LiltCreateContentTemplateParams();
        templateParams.setContentLength(1000);
        templateParams.setLanguage("en-US");
        templateParams.setSummary("a blog post about how important bees are to my honey farm");
        templateParams.setSections(getSections(this.sectionCase));
        LiltCreateContentPreferences preferences = new LiltCreateContentPreferences();
        preferences.setTone("formal");
        LiltCreateContent requestBody = new LiltCreateContent();
        requestBody.setLanguage("en-US");
        requestBody.setTemplate("blog-post");
        requestBody.setTemplateParams(templateParams);
        requestBody.setPreferences(preferences);

        try {
            SignLiltCreateTermsResponse signResult = apiInstance.signLiltCreateTerms(signedAgreement);
            System.out.println(signResult);
            assertEquals(signResult.getSignedAgreement(), true);
            apiInstance.generateLiltCreateContent(requestBody);
            GetLiltCreateContentResponse createResult = apiInstance.getLiltCreateContent();
            List<LiltCreateContent> createResultContents = createResult.getContents();
            LiltCreateContent latest = createResultContents.get(createResultContents.size() - 1);
            System.out.println(latest);
            assertExpected(latest, getExpected(this.sectionCase));
        } catch (ApiException e) {
            System.err.println("Exception when calling CreateApi#signLiltCreateTerms");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            fail("should not throw exception");
        }
    }
}
