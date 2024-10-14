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
        return switch (sectionCase) {
            case "one" -> Arrays.asList("Bees and me");
            case "multiple" -> Arrays.asList("Bees and me", "Honey for you", "Conclusion");
            default -> Arrays.asList();
        };
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
            System.out.println(createResult);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreateApi#signLiltCreateTerms");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            fail("should not throw exception");
        }
    }
}
