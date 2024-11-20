# TranslateApi

All URIs are relative to *https://api.lilt.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchTranslateFile**](TranslateApi.md#batchTranslateFile) | **POST** /v2/translate/file | Translate a File
[**downloadFile**](TranslateApi.md#downloadFile) | **GET** /v2/translate/files | Download translated file
[**monitorFileTranslation**](TranslateApi.md#monitorFileTranslation) | **GET** /v2/translate/file | Monitor file translation
[**translateSegmentPost**](TranslateApi.md#translateSegmentPost) | **POST** /v2/translate | Translate a segment


<a name="batchTranslateFile"></a>
# **batchTranslateFile**
> List&lt;TranslationInfo&gt; batchTranslateFile(fileId, memoryId, configId, withTM)

Translate a File

Start machine translation of one or more Files that have previously been uploaded.  The response will include an &#x60;id&#x60; parameter that can be used to monitor and download the translations in subsequent calls.  Example CURL: &#x60;&#x60;&#x60;bash curl -X POST &#39;https://api.lilt.com/v2/translate/file?key&#x3D;API_KEY&amp;fileId&#x3D;583&amp;memoryId&#x3D;2495&amp;configId&#x3D;123&amp;withTM&#x3D;true&#39; &#x60;&#x60;&#x60;  

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

    TranslateApi apiInstance = new TranslateApi(defaultClient);
    String fileId = "fileId_example"; // String | List of File ids to be translated, comma separated.
    String memoryId = "memoryId_example"; // String | Id of Memory to use in translation.
    BigDecimal configId = new BigDecimal(78); // BigDecimal | An optional pararameter to specify an import configuration to be applied when extracting translatable content from this file.
    Boolean withTM = true; // Boolean | An optional boolean parameter to toggle the use of Translation Memory in the translation of the file.
    try {
      List<TranslationInfo> result = apiInstance.batchTranslateFile(fileId, memoryId, configId, withTM);
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
 **configId** | **BigDecimal**| An optional pararameter to specify an import configuration to be applied when extracting translatable content from this file. | [optional]
 **withTM** | **Boolean**| An optional boolean parameter to toggle the use of Translation Memory in the translation of the file. | [optional]

### Return type

[**List&lt;TranslationInfo&gt;**](TranslationInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Translation Info |  -  |
**401** | Unauthorized |  -  |
**0** | Unexpected error |  -  |

<a name="downloadFile"></a>
# **downloadFile**
> byte[] downloadFile(id)

Download translated file

Download a translated File.  Example CURL: &#x60;&#x60;&#x60;bash curl -X GET &#39;https://api.lilt.com/v2/translate/files?key&#x3D;API_KEY&amp;id&#x3D;1&#39; &#x60;&#x60;&#x60;  

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
 - **Accept**: application/octet-stream, text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A file. |  -  |
**401** | Unauthorized |  -  |
**0** | Unexpected error |  -  |

<a name="monitorFileTranslation"></a>
# **monitorFileTranslation**
> List&lt;TranslationInfo&gt; monitorFileTranslation(translationIds, status, fromTime, toTime)

Monitor file translation

Get information about the one or more Files that are being translated with machine translation. Query filters are optional but at least one must be provided.  Example CURL: &#x60;&#x60;&#x60;bash curl -X GET &#39;https://api.lilt.com/v2/translate/file?key&#x3D;API_KEY&amp;translationIds&#x3D;1,2&amp;fromTime&#x3D;1607966744&amp;toTime&#x3D;1707966744&amp;status&#x3D;InProgress&#39; &#x60;&#x60;&#x60;  

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

    TranslateApi apiInstance = new TranslateApi(defaultClient);
    String translationIds = "translationIds_example"; // String | List of translation ids, comma separated
    String status = "status_example"; // String | One of the translation statuses - `InProgress`, `Completed`, `Failed`, `ReadyForDownload`
    BigDecimal fromTime = new BigDecimal(78); // BigDecimal | Results after this time (inclusive) will be returned, specified as seconds since the Unix epoch.
    BigDecimal toTime = new BigDecimal(78); // BigDecimal | Results before this time (exclusive) will be returned, specified as seconds since the Unix epoch.
    try {
      List<TranslationInfo> result = apiInstance.monitorFileTranslation(translationIds, status, fromTime, toTime);
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

[**List&lt;TranslationInfo&gt;**](TranslationInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Translation Info |  -  |
**401** | Unauthorized |  -  |
**0** | Unexpected error |  -  |

<a name="translateSegmentPost"></a>
# **translateSegmentPost**
> TranslationList translateSegmentPost(body)

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

    TranslateApi apiInstance = new TranslateApi(defaultClient);
    TranslateSegmentBody body = new TranslateSegmentBody(); // TranslateSegmentBody | 
    try {
      TranslationList result = apiInstance.translateSegmentPost(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslateApi#translateSegmentPost");
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
 **body** | [**TranslateSegmentBody**](TranslateSegmentBody.md)|  | [optional]

### Return type

[**TranslationList**](TranslationList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/octet-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A TranslationList object. |  -  |
**401** | Unauthorized |  -  |
**0** | Unexpected error |  -  |

