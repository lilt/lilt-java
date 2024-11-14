# FilesApi

All URIs are relative to *https://api.lilt.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addLabel**](FilesApi.md#addLabel) | **POST** /v2/files/labels | Add Label to File
[**deleteFile**](FilesApi.md#deleteFile) | **DELETE** /v2/files | Delete a File
[**download**](FilesApi.md#download) | **GET** /v2/files/download | Download file
[**getFiles**](FilesApi.md#getFiles) | **GET** /v2/files | Retrieve a File
[**removeLabel**](FilesApi.md#removeLabel) | **DELETE** /v2/files/labels | Remove Label from File
[**uploadFile**](FilesApi.md#uploadFile) | **POST** /v2/files | Upload a File


<a name="addLabel"></a>
# **addLabel**
> addLabel(id, name)

Add Label to File

Add a label to a File.  Example CURL: &#x60;&#x60;&#x60;bash curl -X POST &#39;https://api.lilt.com/v2/files/labels?key&#x3D;API_KEY&amp;id&#x3D;1&#39; --header &#39;Content-Type: application/json&#39; \\ --data-raw &#39;{     \&quot;name\&quot;: \&quot;label_name\&quot; }&#39; &#x60;&#x60;&#x60; 

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

    FilesApi apiInstance = new FilesApi(defaultClient);
    String id = "id_example"; // String | A File id.
    AddFileLabelRequest name = new AddFileLabelRequest(); // AddFileLabelRequest | 
    try {
      apiInstance.addLabel(id, name);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#addLabel");
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
 **id** | **String**| A File id. |
 **name** | [**AddFileLabelRequest**](AddFileLabelRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream, text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | A success response. |  -  |
**401** | Unauthorized |  -  |
**0** | Unexpected error |  -  |

<a name="deleteFile"></a>
# **deleteFile**
> FileDeleteResponse deleteFile(id)

Delete a File

Delete a File.  Example CURL command: &#x60;&#x60;&#x60;bash   curl -X DELETE https://api.lilt.com/v2/files?key&#x3D;API_KEY&amp;id&#x3D;123  &#x60;&#x60;&#x60;  

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
 - **Accept**: application/json, application/octet-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | A status object. |  -  |
**401** | Unauthorized |  -  |
**0** | Unexpected error |  -  |

<a name="download"></a>
# **download**
> byte[] download(id)

Download file

Download a File.  Example CURL: &#x60;&#x60;&#x60;bash curl -X GET &#39;https://api.lilt.com/v2/files/download?key&#x3D;API_KEY&amp;id&#x3D;1&#39; &#x60;&#x60;&#x60; 

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

    FilesApi apiInstance = new FilesApi(defaultClient);
    String id = "id_example"; // String | A File id.
    try {
      byte[] result = apiInstance.download(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#download");
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
 **id** | **String**| A File id. |

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

<a name="getFiles"></a>
# **getFiles**
> List&lt;SourceFile&gt; getFiles(id, labels)

Retrieve a File

Retrieves one or more files available to your user. Files are not associated with a project or a memory. They are unprocessed and can be used later in the project/document creation workflow step.  To retrieve a specific file, specify the &lt;strong&gt;id&lt;/strong&gt; request parameter. To retrieve all files, omit the &lt;strong&gt;id&lt;/strong&gt; request parameter.  Example CURL command: &#x60;&#x60;&#x60;bash  curl -X GET https://api.lilt.com/v2/files?key&#x3D;API_KEY&amp;id&#x3D;274 &#x60;&#x60;&#x60;

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

    FilesApi apiInstance = new FilesApi(defaultClient);
    Integer id = 56; // Integer | A unique File identifier.
    List<String> labels = Arrays.asList(); // List<String> | One or more labels. This will return the files which contain all of the given labels. 
    try {
      List<SourceFile> result = apiInstance.getFiles(id, labels);
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
 **labels** | [**List&lt;String&gt;**](String.md)| One or more labels. This will return the files which contain all of the given labels.  | [optional]

### Return type

[**List&lt;SourceFile&gt;**](SourceFile.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of files. |  -  |
**401** | Unauthorized |  -  |
**403** | User does not have permission for provided file. |  -  |
**410** | File deleted. |  -  |
**0** | Unexpected error. |  -  |

<a name="removeLabel"></a>
# **removeLabel**
> removeLabel(id, name)

Remove Label from File

Remove a label from a File.  Example CURL: &#x60;&#x60;&#x60;bash curl -X DELETE &#39;https://api.lilt.com/v2/files/labels?key&#x3D;API_KEY&amp;id&#x3D;1&amp;name&#x3D;label_name&#39; &#x60;&#x60;&#x60; 

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

    FilesApi apiInstance = new FilesApi(defaultClient);
    String id = "id_example"; // String | A File id.
    String name = "name_example"; // String | A label name.
    try {
      apiInstance.removeLabel(id, name);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#removeLabel");
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
 **id** | **String**| A File id. |
 **name** | **String**| A label name. |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | A success response. |  -  |
**401** | Unauthorized |  -  |
**0** | Unexpected error |  -  |

<a name="uploadFile"></a>
# **uploadFile**
> SourceFile uploadFile(name, body, fileHash, langId, projectId, category, labels)

Upload a File

Upload a File in any of the formats [documented in our knowledge base](https://support.lilt.com/hc/en-us/articles/360020816253-File-Formats). Request parameters should be passed in as query string parameters.  Example CURL command: &#x60;&#x60;&#x60;bash   curl -X POST https://api.lilt.com/v2/files?key&#x3D;API_KEY&amp;name&#x3D;en_US.json \\   --header \&quot;Content-Type: application/octet-stream\&quot; \\   --data-binary @en_US.json &#x60;&#x60;&#x60; Calls to GET /files are used to monitor the language detection results. The API response will be augmented to include detected language and confidence score.  The language detection will complete asynchronously. Prior to completion, the &#x60;detected_lang&#x60; value will be &#x60;zxx&#x60;, the reserved ISO 639-2 code for \&quot;No linguistic content/not applicable\&quot;.  If the language can not be determined, or the detection process fails, the &#x60;detected_lang&#x60; field will return &#x60;und&#x60;, the reserved ISO 639-2 code for undetermined language, and the &#x60;detected_lang_confidence&#x60; score will be &#x60;0&#x60;.  

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

    FilesApi apiInstance = new FilesApi(defaultClient);
    String name = "name_example"; // String | A file name.
    File body = new File("/path/to/file"); // File | The file contents to be uploaded. The entire POST body will be treated as the file.
    String fileHash = "fileHash_example"; // String | A hash value to associate with the file. The MD5 hash of the body contents will be used by default if a value isn't provided.
    Boolean langId = true; // Boolean | Flag indicating whether to perform language detection on the uploaded file. Default is false.
    Integer projectId = 56; // Integer | The project to associate the uploaded file with.
    String category = "category_example"; // String | The category of the file. The options are `REFERENCE`, or `API`. The default is API. Files with the `REFERENCE` category will be displayed as reference material.
    String labels = "labels_example"; // String | Comma-separated list of labels to add to the uploaded document.
    try {
      SourceFile result = apiInstance.uploadFile(name, body, fileHash, langId, projectId, category, labels);
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
 **body** | **File**| The file contents to be uploaded. The entire POST body will be treated as the file. |
 **fileHash** | **String**| A hash value to associate with the file. The MD5 hash of the body contents will be used by default if a value isn&#39;t provided. | [optional]
 **langId** | **Boolean**| Flag indicating whether to perform language detection on the uploaded file. Default is false. | [optional]
 **projectId** | **Integer**| The project to associate the uploaded file with. | [optional]
 **category** | **String**| The category of the file. The options are &#x60;REFERENCE&#x60;, or &#x60;API&#x60;. The default is API. Files with the &#x60;REFERENCE&#x60; category will be displayed as reference material. | [optional]
 **labels** | **String**| Comma-separated list of labels to add to the uploaded document. | [optional]

### Return type

[**SourceFile**](SourceFile.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json, application/octet-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A SourceFile object. |  -  |
**401** | Unauthorized |  -  |
**0** | Unexpected error |  -  |

