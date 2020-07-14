# DocumentsApi

All URIs are relative to *https://lilt.com/2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignDocument**](DocumentsApi.md#assignDocument) | **PUT** /documents/share | Assign a Document
[**createDocument**](DocumentsApi.md#createDocument) | **POST** /documents | Create a Document
[**deleteDocument**](DocumentsApi.md#deleteDocument) | **DELETE** /documents | Delete a Document
[**downloadFile**](DocumentsApi.md#downloadFile) | **GET** /documents/files | Download a File
[**getDocument**](DocumentsApi.md#getDocument) | **GET** /documents | Retrieve a Document
[**pretranslateDocument**](DocumentsApi.md#pretranslateDocument) | **POST** /documents/pretranslate | Pretranslate a Document
[**updateDocument**](DocumentsApi.md#updateDocument) | **PUT** /documents | Update a Document
[**uploadDocumentFile**](DocumentsApi.md#uploadDocumentFile) | **POST** /documents/files | Upload a File


<a name="assignDocument"></a>
# **assignDocument**
> DocumentAssignmentResponse assignDocument(body)

Assign a Document

Assign and unassign a Document for translation and/or review.  

### Example
```java
// Import classes:
import com.lilt.ApiClient;
import com.lilt.ApiException;
import com.lilt.Configuration;
import com.lilt.auth.*;
import com.lilt.models.*;
import com.lilt.api.DocumentsApi;

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

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    DocumentAssignmentParameters body = new DocumentAssignmentParameters(); // DocumentAssignmentParameters | 
    try {
      DocumentAssignmentResponse result = apiInstance.assignDocument(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#assignDocument");
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
 **body** | [**DocumentAssignmentParameters**](DocumentAssignmentParameters.md)|  |

### Return type

[**DocumentAssignmentResponse**](DocumentAssignmentResponse.md)

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

<a name="createDocument"></a>
# **createDocument**
> DocumentWithSegments createDocument(body)

Create a Document

Create a new Document. A Document is a collection of one or more Segments. Documents are nested inside of Projects, and appear in the Project details view in the web app. Document-level relationships between Segments are considered by the machine translation system during adaptation. If there is no inherent document structure in your data, you still might consider grouping related Segments into Documents to improve translation quality. 

### Example
```java
// Import classes:
import com.lilt.ApiClient;
import com.lilt.ApiException;
import com.lilt.Configuration;
import com.lilt.auth.*;
import com.lilt.models.*;
import com.lilt.api.DocumentsApi;

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

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    DocumentParameters body = new DocumentParameters(); // DocumentParameters | 
    try {
      DocumentWithSegments result = apiInstance.createDocument(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#createDocument");
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
 **body** | [**DocumentParameters**](DocumentParameters.md)|  | [optional]

### Return type

[**DocumentWithSegments**](DocumentWithSegments.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A Document object. |  -  |
**0** | Unexpected error |  -  |

<a name="deleteDocument"></a>
# **deleteDocument**
> DocumentDeleteResponse deleteDocument(id)

Delete a Document

Delete a Document. 

### Example
```java
// Import classes:
import com.lilt.ApiClient;
import com.lilt.ApiException;
import com.lilt.Configuration;
import com.lilt.auth.*;
import com.lilt.models.*;
import com.lilt.api.DocumentsApi;

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

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    Integer id = 56; // Integer | A unique Document identifier.
    try {
      DocumentDeleteResponse result = apiInstance.deleteDocument(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#deleteDocument");
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
 **id** | **Integer**| A unique Document identifier. |

### Return type

[**DocumentDeleteResponse**](DocumentDeleteResponse.md)

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

<a name="downloadFile"></a>
# **downloadFile**
> File downloadFile(id, isXliff)

Download a File

Export a Document that has been translated in the Lilt web application. Any Document can be downloaded in XLIFF 1.2 format, or can be retrieved in its original uploaded format by setting &#x60;is_xliff&#x3D;false&#x60;. This endpoint will fail if either (a) export or (b) pre-translation operations are in-progress. The status of those operations can be determined by retrieving the Document resource. Example CURL command: &#x60;&#x60;&#x60;   curl -X GET https://lilt.com/2/documents/files?key&#x3D;API_KEY&amp;id&#x3D;274 -o from_lilt.xliff &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
import com.lilt.ApiClient;
import com.lilt.ApiException;
import com.lilt.Configuration;
import com.lilt.auth.*;
import com.lilt.models.*;
import com.lilt.api.DocumentsApi;

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

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    Integer id = 56; // Integer | An unique Document identifier.
    Boolean isXliff = true; // Boolean | Download the document in XLIFF 1.2 format.
    try {
      File result = apiInstance.downloadFile(id, isXliff);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#downloadFile");
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
 **id** | **Integer**| An unique Document identifier. |
 **isXliff** | **Boolean**| Download the document in XLIFF 1.2 format. | [optional] [default to true]

### Return type

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A file. |  -  |
**502** | File in pretranslation. |  -  |
**0** | Unexpected error |  -  |

<a name="getDocument"></a>
# **getDocument**
> DocumentWithSegments getDocument(id, withSegments)

Retrieve a Document

List a Document.  The listing will include the pretranslation status for the document. When pretranslation is in progress for a document, the &#x60;GET /documents&#x60; endpoint&#39;s response will include &#x60;is_pretranslating &#x3D; true&#x60; as well as a more detailed status property &#x60;status.pretranslation&#x60; one of &#x60;idle&#x60;, &#x60;pending&#x60;, or &#x60;running&#x60;.

### Example
```java
// Import classes:
import com.lilt.ApiClient;
import com.lilt.ApiException;
import com.lilt.Configuration;
import com.lilt.auth.*;
import com.lilt.models.*;
import com.lilt.api.DocumentsApi;

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

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    Integer id = 56; // Integer | A unique Document identifier.
    Boolean withSegments = true; // Boolean | Flag indicating whether full segment information should be returned.
    try {
      DocumentWithSegments result = apiInstance.getDocument(id, withSegments);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#getDocument");
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
 **id** | **Integer**| A unique Document identifier. |
 **withSegments** | **Boolean**| Flag indicating whether full segment information should be returned. | [optional]

### Return type

[**DocumentWithSegments**](DocumentWithSegments.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A Document object. |  -  |
**0** | Unexpected error |  -  |

<a name="pretranslateDocument"></a>
# **pretranslateDocument**
> DocumentPretranslateResponse pretranslateDocument(body, caseSensitive, autoAccept, mode)

Pretranslate a Document

Initiate pretranslation of a list of Documents. This request will mark document(s) as being pretranslated. Pretranslation in this context is: - Applying and confirming exact TM matches based on the Memory of the Project; - Translating all other segments via MT without confirming them.  Example cURL command: &#x60;&#x60;&#x60; curl -X POST https://lilt.com/2/documents/pretranslate?key&#x3D;API_KEY -d {\&quot;id\&quot;: [123]} -H \&quot;Content-Type: application/json\&quot; &#x60;&#x60;&#x60;  Document translation is an asynchronous process that, in effect, is performed in the background.  To check the status of pretranslation for a document, use the &#x60;GET /documents&#x60; endpoint. When pretranslation is in progress for a document, the &#x60;GET /documents&#x60; endpoint&#39;s response will include &#x60;is_pretranslating &#x3D; true&#x60; as well as a more detailed status property &#x60;status.pretranslation&#x60; one of &#x60;idle&#x60;, &#x60;pending&#x60;, or &#x60;running&#x60;.  Once pretranslation is finished, the document can be downloaded via &#x60;GET /documents/files&#x60;. 

### Example
```java
// Import classes:
import com.lilt.ApiClient;
import com.lilt.ApiException;
import com.lilt.Configuration;
import com.lilt.auth.*;
import com.lilt.models.*;
import com.lilt.api.DocumentsApi;

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

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    DocumentPretranslateParameters body = new DocumentPretranslateParameters(); // DocumentPretranslateParameters | 
    Boolean caseSensitive = true; // Boolean | Optional for using case matching against TM hits.
    Boolean autoAccept = true; // Boolean | Optional parameter for auto-accepting 100% TM hits.
    String mode = "mode_example"; // String | An optional parameter indicating how the document will be pretranslated.  The accepted values are `null`, `tm`, or `tm+mt`. Default is `tm+mt`. 
    try {
      DocumentPretranslateResponse result = apiInstance.pretranslateDocument(body, caseSensitive, autoAccept, mode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#pretranslateDocument");
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
 **body** | [**DocumentPretranslateParameters**](DocumentPretranslateParameters.md)|  |
 **caseSensitive** | **Boolean**| Optional for using case matching against TM hits. | [optional]
 **autoAccept** | **Boolean**| Optional parameter for auto-accepting 100% TM hits. | [optional]
 **mode** | **String**| An optional parameter indicating how the document will be pretranslated.  The accepted values are &#x60;null&#x60;, &#x60;tm&#x60;, or &#x60;tm+mt&#x60;. Default is &#x60;tm+mt&#x60;.  | [optional]

### Return type

[**DocumentPretranslateResponse**](DocumentPretranslateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | A status object. |  -  |
**0** | Unexpected error |  -  |

<a name="updateDocument"></a>
# **updateDocument**
> DocumentWithSegments updateDocument(body)

Update a Document

Update a Document. 

### Example
```java
// Import classes:
import com.lilt.ApiClient;
import com.lilt.ApiException;
import com.lilt.Configuration;
import com.lilt.auth.*;
import com.lilt.models.*;
import com.lilt.api.DocumentsApi;

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

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    DocumentUpdateParameters body = new DocumentUpdateParameters(); // DocumentUpdateParameters | 
    try {
      DocumentWithSegments result = apiInstance.updateDocument(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#updateDocument");
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
 **body** | [**DocumentUpdateParameters**](DocumentUpdateParameters.md)|  |

### Return type

[**DocumentWithSegments**](DocumentWithSegments.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A Document object. |  -  |
**0** | Unexpected error |  -  |

<a name="uploadDocumentFile"></a>
# **uploadDocumentFile**
> DocumentWithSegments uploadDocumentFile(name, projectId, body, pretranslate, autoAccept, configId)

Upload a File

Create a Document from a file in any of the formats [documented in our knowledge base](https://support.lilt.com/hc/en-us/articles/360020816253-File-Formats). Request parameters should be passed as JSON object with the header  field &#x60;LILT-API&#x60;. Example CURL command: &#x60;&#x60;&#x60;   curl -X POST https://lilt.com/2/documents/files?key&#x3D;API_KEY \\   --header \&quot;LILT-API: {\\\&quot;name\\\&quot;: \\\&quot;introduction.xliff\\\&quot;,\\\&quot;pretranslate\\\&quot;: \\\&quot;tm+mt\\\&quot;,\\\&quot;project_id\\\&quot;: 9}\&quot; \\   --header \&quot;Content-Type: application/octet-stream\&quot; \\   --data-binary @Introduction.xliff &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
import com.lilt.ApiClient;
import com.lilt.ApiException;
import com.lilt.Configuration;
import com.lilt.auth.*;
import com.lilt.models.*;
import com.lilt.api.DocumentsApi;

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

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    String name = "name_example"; // String | A file name.
    Integer projectId = 56; // Integer | A unique Project identifier.
    String body = "body_example"; // String | The file contents to be uploaded. The entire POST body will be treated as the file. 
    String pretranslate = "pretranslate_example"; // String | An optional parameter indicating if and how the document will be pretranslated upon being uploaded.  The accepted values are `null`, `tm`, or `tm+mt` 
    Boolean autoAccept = true; // Boolean | An optional parameter to auto-accept segments with 100% translation memory matches when the `pretranslate` option is also set, or to auto-accept any target data that is present when the uploaded file is XLIFF. If omitted or set to `false`, no segments will be auto-accepted. 
    Integer configId = 56; // Integer | An optional pararameter to specify an import configuration to be applied when extracting translatable content from this file. 
    try {
      DocumentWithSegments result = apiInstance.uploadDocumentFile(name, projectId, body, pretranslate, autoAccept, configId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#uploadDocumentFile");
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
 **projectId** | **Integer**| A unique Project identifier. |
 **body** | **String**| The file contents to be uploaded. The entire POST body will be treated as the file.  |
 **pretranslate** | **String**| An optional parameter indicating if and how the document will be pretranslated upon being uploaded.  The accepted values are &#x60;null&#x60;, &#x60;tm&#x60;, or &#x60;tm+mt&#x60;  | [optional]
 **autoAccept** | **Boolean**| An optional parameter to auto-accept segments with 100% translation memory matches when the &#x60;pretranslate&#x60; option is also set, or to auto-accept any target data that is present when the uploaded file is XLIFF. If omitted or set to &#x60;false&#x60;, no segments will be auto-accepted.  | [optional]
 **configId** | **Integer**| An optional pararameter to specify an import configuration to be applied when extracting translatable content from this file.  | [optional]

### Return type

[**DocumentWithSegments**](DocumentWithSegments.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A Document object. |  -  |
**0** | Unexpected error |  -  |

