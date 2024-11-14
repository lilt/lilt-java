# LanguagesApi

All URIs are relative to *https://api.lilt.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLanguages**](LanguagesApi.md#getLanguages) | **GET** /v2/languages | Retrieve supported languages


<a name="getLanguages"></a>
# **getLanguages**
> LanguagesResponse getLanguages()

Retrieve supported languages

Get a list of supported languages.  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.LanguagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lilt.com");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    LanguagesApi apiInstance = new LanguagesApi(defaultClient);
    try {
      LanguagesResponse result = apiInstance.getLanguages();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LanguagesApi#getLanguages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LanguagesResponse**](LanguagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An object listing supported languages and their corresponding locales. |  -  |
**401** | Unauthorized |  -  |
**0** | Unexpected error |  -  |

