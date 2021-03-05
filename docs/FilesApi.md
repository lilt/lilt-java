# FilesApi

All URIs are relative to *https://lilt.com/2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteFile**](FilesApi.md#deleteFile) | **DELETE** /files | Delete a File
[**getFiles**](FilesApi.md#getFiles) | **GET** /files | Retrieve a File
[**uploadFile**](FilesApi.md#uploadFile) | **POST** /files | Upload a File


<a name="deleteFile"></a>
# **deleteFile**
> FileDeleteResponse deleteFile(id)

Delete a File

Delete a File.  Example CURL command: &#x60;&#x60;&#x60;   curl -X DELETE https://lilt.com/2/files?key&#x3D;API_KEY&amp;id&#x3D;123 &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.FilesApi;

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

    FilesApi apiInstance = new FilesApi(defaultClient);
    Integer id = 56; // Integer | A unique File identifier.
    try {
      FileDeleteResponse result = apiInstance.deleteFile(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#deleteFile");
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
 **id** | **Integer**| A unique File identifier. |

### Return type

[**FileDeleteResponse**](FileDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | A status object. |  -  |
**0** | Unexpected error |  -  |

<a name="getFiles"></a>
# **getFiles**
> List&lt;com.lilt.client.model.File&gt; getFiles(id)

Retrieve a File

Retrieves one or more files available to your user. Files are not associated with a project or a memory. They are unprocessed and can be used later in the project/document creation workflow step.  To retrieve a specific file, specify the &lt;strong&gt;id&lt;/strong&gt; request parameter. To retrieve all files, omit the &lt;strong&gt;id&lt;/strong&gt; request parameter.  Example CURL command: &#x60;&#x60;&#x60;  curl -X GET https://lilt.com/2/files?key&#x3D;API_KEY&amp;id&#x3D;274&#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.FilesApi;

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

    FilesApi apiInstance = new FilesApi(defaultClient);
    Integer id = 56; // Integer | A unique File identifier.
    try {
      List<com.lilt.client.model.File> result = apiInstance.getFiles(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#getFiles");
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
 **id** | **Integer**| A unique File identifier. | [optional]

### Return type

[**List&lt;com.lilt.client.model.File&gt;**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of files. |  -  |
**403** | Unauthorized. |  -  |
**410** | File deleted. |  -  |
**0** | Unexpected error. |  -  |

<a name="uploadFile"></a>
# **uploadFile**
> com.lilt.client.model.File uploadFile(name, body, exportUri, fileHash, langId, projectId, category, labels)

Upload a File

Upload a File in any of the formats [documented in our knowledge base](https://support.lilt.com/hc/en-us/articles/360020816253-File-Formats). Request parameters should be passed in as query string parameters.  When uploading a file, any parameters needed to issue a request to the specified export_uri can be encoded in the export_uri itself as query parameters. Typical examples of parameters that may be required are an access token to authorize requests to a third-party HTTP API and the unique identifier of a resource available via the third-party HTTP API that corresponds to the file. An example export_uri that encodes a target resource identifier (i.e., source_id) of an associated resource behind a third party HTTP API is given in the CURL command below.  Example CURL command: &#x60;&#x60;&#x60;   curl -X POST https://lilt.com/2/files?key&#x3D;API_KEY&amp;name&#x3D;en_US.json&amp;export_uri&#x3D;https://example.com/export?source_id&#x3D;12345 \\   --header \&quot;Content-Type: application/octet-stream\&quot; \\   --data-binary @en_US.json &#x60;&#x60;&#x60; Calls to GET /files are used to monitor the language detection results. The API response will be augmented to include detected language and confidence score.  The language detection will complete asynchronously. Prior to completion, the &#x60;detected_lang&#x60; value will be &#x60;zxx&#x60;, the reserved ISO 639-2 code for \&quot;No linguistic content/not applicable\&quot;.  If the language can not be determined, or the detection process fails, the &#x60;detected_lang&#x60; field will return &#x60;und&#x60;, the reserved ISO 639-2 code for undetermined language, and the &#x60;detected_lang_confidence&#x60; score will be &#x60;0&#x60;.  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.FilesApi;

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

    FilesApi apiInstance = new FilesApi(defaultClient);
    String name = "name_example"; // String | A file name.
    String body = "body_example"; // String | The file contents to be uploaded. The entire POST body will be treated as the file.
    String exportUri = "exportUri_example"; // String | A webhook endpoint that will export the translated document back to the source repository.
    String fileHash = "fileHash_example"; // String | A hash value to associate with the file. The MD5 hash of the body contents will be used by default if a value isn't provided.
    Boolean langId = true; // Boolean | Flag indicating whether to perform language detection on the uploaded file. Default is false.
    Integer projectId = 56; // Integer | The project to associate the uploaded file with.
    String category = "category_example"; // String | The category of the file. The options are `REFERENCE`, or `API`. The default is API. Files with the `REFERENCE` category will be displayed as reference material.
    String labels = "labels_example"; // String | Comma-separated list of labels to add to the uploaded document.
    try {
      com.lilt.client.model.File result = apiInstance.uploadFile(name, body, exportUri, fileHash, langId, projectId, category, labels);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#uploadFile");
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
 **name** | **String**| A file name. |
 **body** | **String**| The file contents to be uploaded. The entire POST body will be treated as the file. |
 **exportUri** | **String**| A webhook endpoint that will export the translated document back to the source repository. | [optional]
 **fileHash** | **String**| A hash value to associate with the file. The MD5 hash of the body contents will be used by default if a value isn&#39;t provided. | [optional]
 **langId** | **Boolean**| Flag indicating whether to perform language detection on the uploaded file. Default is false. | [optional]
 **projectId** | **Integer**| The project to associate the uploaded file with. | [optional]
 **category** | **String**| The category of the file. The options are &#x60;REFERENCE&#x60;, or &#x60;API&#x60;. The default is API. Files with the &#x60;REFERENCE&#x60; category will be displayed as reference material. | [optional]
 **labels** | **String**| Comma-separated list of labels to add to the uploaded document. | [optional]

### Return type

[**com.lilt.client.model.File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A File object. |  -  |
**0** | Unexpected error |  -  |

