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

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestSign {
    private final boolean sign;
    private final ApiClient defaultClient;

    public TestSign(boolean sign) {
        this.sign = sign;
        this.defaultClient = Configuration.getDefaultApiClient();
        this.defaultClient.setBasePath(System.getenv("API_HOST"));
        this.defaultClient.addDefaultHeader("x-is-automated-test", "true");
        this.defaultClient.addDefaultHeader("x-is-expected-error", "true");
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) this.defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey(System.getenv("API_KEY"));
    }

    @Parameterized.Parameters(name="{0}")
    public static Collection<Object[]> booleans() {
        return Arrays.asList(new Object[][] {
                { true }, { false }
        });
    }

    @Test
    public void sign() {
        CreateApi apiInstance = new CreateApi(this.defaultClient);
        CreateConverterConfigParameters signedAgreement = new CreateConverterConfigParameters();
        signedAgreement.setSignedAgreement(this.sign);
        try {
            SignLiltCreateTermsResponse result = apiInstance.signLiltCreateTerms(signedAgreement);
            System.out.println(result);
            assertEquals(result.getSignedAgreement(), this.sign);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreateApi#signLiltCreateTerms");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            fail("should not throw exception");
        }
    }
}
