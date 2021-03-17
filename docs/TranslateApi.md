# TranslateApi

All URIs are relative to *https://lilt.com/2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchTranslateFile**](TranslateApi.md#batchTranslateFile) | **POST** /translate/file | Translate a File
[**downloadFile**](TranslateApi.md#downloadFile) | **GET** /translate/files | Download translated file
[**monitorFileTranslation**](TranslateApi.md#monitorFileTranslation) | **GET** /translate/file | Monitor file translation
[**registerSegment**](TranslateApi.md#registerSegment) | **GET** /translate/register | Register a segment
[**translateSegment**](TranslateApi.md#translateSegment) | **GET** /translate | Translate a segment


<a name="batchTranslateFile"></a>
# **batchTranslateFile**
> TranslationInfo batchTranslateFile(fileId, memoryId)

Translate a File

Start machine translation of one or more Files that have previously been uploaded.  The response will include an &#x60;id&#x60; parameter that can be used to monitor and download the translations in subsequent calls.  Example CURL: &#x60;&#x60;&#x60; curl --X --request POST &#39;https://lilt.com/2/translate/file?key&#x3D;API_KEY&amp;fileId&#x3D;583&amp;memoryId&#x3D;2495&#39; &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.TranslateApi;

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

    TranslateApi apiInstance = new TranslateApi(defaultClient);
    String fileId = "fileId_example"; // String | List of File ids to be translated, comma separated.
    String memoryId = "memoryId_example"; // String | Id of Memory to use in translation.
    try {
      TranslationInfo result = apiInstance.batchTranslateFile(fileId, memoryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslateApi#batchTranslateFile");
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
 **fileId** | **String**| List of File ids to be translated, comma separated. |
 **memoryId** | **String**| Id of Memory to use in translation. |

### Return type

[**TranslationInfo**](TranslationInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Translation info |  -  |
**0** | Unexpected error |  -  |

<a name="downloadFile"></a>
# **downloadFile**
> byte[] downloadFile(id)

Download translated file

Download a translated File.  Example CURL: &#x60;&#x60;&#x60; curl --X --request GET &#39;https://lilt.com/2/translate/files?key&#x3D;API_KEY&amp;id&#x3D;1&#39; &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.TranslateApi;

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

    TranslateApi apiInstance = new TranslateApi(defaultClient);
    String id = "id_example"; // String | A translation id.
    try {
      byte[] result = apiInstance.downloadFile(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslateApi#downloadFile");
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
 **id** | **String**| A translation id. |

### Return type

**byte[]**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A file. |  -  |

<a name="monitorFileTranslation"></a>
# **monitorFileTranslation**
> TranslationInfo monitorFileTranslation(translationIds, status, fromTime, toTime)

Monitor file translation

Get information about the one or more Files that are being translated with machine translation. Query filters are optional but at least one must be provided.  Example CURL: &#x60;&#x60;&#x60; curl --X --request GET &#39;https://lilt.com/2/translate/file?key&#x3D;API_KEY&amp;translationIds&#x3D;1,2&amp;fromTime&#x3D;1607966744&amp;toTime&#x3D;1707966744&amp;status&#x3D;InProgress&#39; &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.TranslateApi;

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

    TranslateApi apiInstance = new TranslateApi(defaultClient);
    String translationIds = "translationIds_example"; // String | List of translation ids, comma separated
    String status = "status_example"; // String | One of the translation statuses - `InProgress`, `Completed`, `Failed`, `ReadyForDownload`
    BigDecimal fromTime = new BigDecimal(); // BigDecimal | Results after this time (inclusive) will be returned, specified as seconds since the Unix epoch.
    BigDecimal toTime = new BigDecimal(); // BigDecimal | Results before this time (exclusive) will be returned, specified as seconds since the Unix epoch.
    try {
      TranslationInfo result = apiInstance.monitorFileTranslation(translationIds, status, fromTime, toTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslateApi#monitorFileTranslation");
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
 **translationIds** | **String**| List of translation ids, comma separated | [optional]
 **status** | **String**| One of the translation statuses - &#x60;InProgress&#x60;, &#x60;Completed&#x60;, &#x60;Failed&#x60;, &#x60;ReadyForDownload&#x60; | [optional]
 **fromTime** | **BigDecimal**| Results after this time (inclusive) will be returned, specified as seconds since the Unix epoch. | [optional]
 **toTime** | **BigDecimal**| Results before this time (exclusive) will be returned, specified as seconds since the Unix epoch. | [optional]

### Return type

[**TranslationInfo**](TranslationInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Translation info |  -  |
**0** | Unexpected error |  -  |

<a name="registerSegment"></a>
# **registerSegment**
> TranslateRegisterResponse registerSegment(source, srclang, trglang)

Register a segment

Register a source string for interactive translation. The &#x60;source_hash&#x60; value that is returned by this request is required by the &#x60;prefix&#x60; parameter for the translation endpoint. The maximum source length is 5,000 characters. Usage charges apply to this endpoint for production REST API keys.  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.TranslateApi;

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

    TranslateApi apiInstance = new TranslateApi(defaultClient);
    String source = "source_example"; // String | A source string to be registered.
    String srclang = "srclang_example"; // String | An ISO 639-1 language code.
    String trglang = "trglang_example"; // String | An ISO 639-1 language code.
    try {
      TranslateRegisterResponse result = apiInstance.registerSegment(source, srclang, trglang);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslateApi#registerSegment");
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
 **source** | **String**| A source string to be registered. |
 **srclang** | **String**| An ISO 639-1 language code. |
 **trglang** | **String**| An ISO 639-1 language code. |

### Return type

[**TranslateRegisterResponse**](TranslateRegisterResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A status object. |  -  |
**0** | Unexpected error |  -  |

<a name="translateSegment"></a>
# **translateSegment**
> TranslationList translateSegment(memoryId, source, sourceHash, prefix, n, rich, tmMatches, projectTags)

Translate a segment

Translate a source string.  Setting the &#x60;rich&#x60; parameter to &#x60;true&#x60; will change the response format to include additional information about each translation including a model score, word alignments,  and formatting information. The rich format can be seen in the example response on this page.  By default, this endpoint also returns translation memory (TM) fuzzy matches, along with associated scores. Fuzzy matches always appear ahead of machine translation output in the response.  The maximum source length is 5,000 characters.  Usage charges apply to this endpoint for production REST API keys.  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.TranslateApi;

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

    TranslateApi apiInstance = new TranslateApi(defaultClient);
    Integer memoryId = 56; // Integer | A unique Memory identifier.
    String source = "source_example"; // String | The source text to be translated.
    Integer sourceHash = 56; // Integer | A source hash code.
    String prefix = "prefix_example"; // String | A target prefix.
    Integer n = 1; // Integer | Return top n translations (deprecated).
    Boolean rich = false; // Boolean | Returns rich translation information (e.g., with word alignments).
    Boolean tmMatches = true; // Boolean | Include translation memory fuzzy matches.
    Boolean projectTags = false; // Boolean | Project tags. Projects tags in source to target if set to true.
    try {
      TranslationList result = apiInstance.translateSegment(memoryId, source, sourceHash, prefix, n, rich, tmMatches, projectTags);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslateApi#translateSegment");
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
 **source** | **String**| The source text to be translated. | [optional]
 **sourceHash** | **Integer**| A source hash code. | [optional]
 **prefix** | **String**| A target prefix. | [optional]
 **n** | **Integer**| Return top n translations (deprecated). | [optional] [default to 1]
 **rich** | **Boolean**| Returns rich translation information (e.g., with word alignments). | [optional] [default to false]
 **tmMatches** | **Boolean**| Include translation memory fuzzy matches. | [optional] [default to true]
 **projectTags** | **Boolean**| Project tags. Projects tags in source to target if set to true. | [optional] [default to false]

### Return type

[**TranslationList**](TranslationList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A TranslationList object. |  -  |
**0** | Unexpected error |  -  |

