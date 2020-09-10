# LexiconApi

All URIs are relative to *https://lilt.com/2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**queryLexicon**](LexiconApi.md#queryLexicon) | **GET** /lexicon | Query a Lexicon
[**updateLexicon**](LexiconApi.md#updateLexicon) | **POST** /lexicon | Update a Lexicon


<a name="queryLexicon"></a>
# **queryLexicon**
> List&lt;LexiconEntry&gt; queryLexicon(memoryId, srclang, trglang, query, n)

Query a Lexicon

Query the Lexicon. The Lexicon is an editable termbase / concordance that is integrated with the Memory.  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.LexiconApi;

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

    LexiconApi apiInstance = new LexiconApi(defaultClient);
    Integer memoryId = 56; // Integer | A unique Memory identifier.
    String srclang = "srclang_example"; // String | An ISO 639-1 language code.
    String trglang = "trglang_example"; // String | An ISO 639-1 language code.
    String query = "query_example"; // String | The query term.
    Integer n = 1; // Integer | The maximum number of results to return.
    try {
      List<LexiconEntry> result = apiInstance.queryLexicon(memoryId, srclang, trglang, query, n);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LexiconApi#queryLexicon");
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
 **memoryId** | **Integer**| A unique Memory identifier. |
 **srclang** | **String**| An ISO 639-1 language code. |
 **trglang** | **String**| An ISO 639-1 language code. |
 **query** | **String**| The query term. |
 **n** | **Integer**| The maximum number of results to return. | [optional] [default to 1]

### Return type

[**List&lt;LexiconEntry&gt;**](LexiconEntry.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of LexiconEntry objects. |  -  |
**0** | Unexpected error |  -  |

<a name="updateLexicon"></a>
# **updateLexicon**
> LexiconUpdateResponse updateLexicon(body)

Update a Lexicon

Update the Lexicon (Termbase as displayed in the ui) with a new term. The maximum source length is 250 characters.  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.LexiconApi;

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

    LexiconApi apiInstance = new LexiconApi(defaultClient);
    LexiconUpdateParameters body = new LexiconUpdateParameters(); // LexiconUpdateParameters | 
    try {
      LexiconUpdateResponse result = apiInstance.updateLexicon(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LexiconApi#updateLexicon");
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
 **body** | [**LexiconUpdateParameters**](LexiconUpdateParameters.md)|  |

### Return type

[**LexiconUpdateResponse**](LexiconUpdateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A status object. |  -  |
**0** | Unexpected error |  -  |

