package com.lilt.testCreateContent;

import static org.junit.Assert.*;

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
        this.defaultClient.addDefaultHeader("x-is-automated-test", "true");
        this.defaultClient.addDefaultHeader("x-is-expected-error", "true");
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

    public static void assertExpected(LiltCreateContent response, List<String> expectedSections) {
        assertEquals(response.getLanguage(), "en-US");
        assertEquals(response.getTemplate(), "blog-post");
        LiltCreateContentTemplateParams responseTemplateParams = response.getTemplateParams();
        assertEquals((int) responseTemplateParams.getContentLength(), 1000);
        assertNull(responseTemplateParams.getMemoryId());
        assertEquals(responseTemplateParams.getLanguage(), "en-US");
        for (int index=0; index <expectedSections.size(); index++) {
            assertEquals(responseTemplateParams.getSections().get(index), expectedSections.get(index));
        }
        assertEquals(responseTemplateParams.getSummary(), "a blog post about how important bees are to my honey farm");
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
        LiltCreateContentRequest requestBody = new LiltCreateContentRequest();
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
            assertExpected(latest, getSections(this.sectionCase));
            apiInstance.deleteLiltCreateContent(latest.getId());
        } catch (ApiException e) {
            System.err.println("Exception when calling CreateApi#signLiltCreateTerms");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            fail("should not throw exception");
        }
    }
}
