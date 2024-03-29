# QaApi

All URIs are relative to *https://lilt.com/2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**qaCheck**](QaApi.md#qaCheck) | **GET** /qa | Perform QA check


<a name="qaCheck"></a>
# **qaCheck**
> QARuleMatches qaCheck(target, trglang, source, srclang, memoryId)

Perform QA check

Perform QA checks on a target string. Optionally, you can specify a source string for additional bilingual checks, e.g. number consistency. 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.QaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://lilt.com/2");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    QaApi apiInstance = new QaApi(defaultClient);
    String target = "target_example"; // String | A target string to be checked.
    String trglang = "trglang_example"; // String | An ISO 639-1 language code.
    String source = "source_example"; // String | An optional source string.
    String srclang = "srclang_example"; // String | An ISO 639-1 language code.
    Integer memoryId = 56; // Integer | Any custom rules defined for this Memory will also be applied as part of the QA check. 
    try {
      QARuleMatches result = apiInstance.qaCheck(target, trglang, source, srclang, memoryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QaApi#qaCheck");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **target** | **String**| A target string to be checked. |
 **trglang** | **String**| An ISO 639-1 language code. |
 **source** | **String**| An optional source string. | [optional]
 **srclang** | **String**| An ISO 639-1 language code. | [optional]
 **memoryId** | **Integer**| Any custom rules defined for this Memory will also be applied as part of the QA check.  | [optional]

### Return type

[**QARuleMatches**](QARuleMatches.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A QARuleMatches object. |  -  |
**0** | Unexpected error |  -  |

