# DocumentsApi

All URIs are relative to *https://lilt.com/2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignDocument**](DocumentsApi.md#assignDocument) | **PUT** /documents/share | Assign a Document
[**createDocument**](DocumentsApi.md#createDocument) | **POST** /documents | Create a Document
[**deleteDocument**](DocumentsApi.md#deleteDocument) | **DELETE** /documents | Delete a Document
[**downloadDocument**](DocumentsApi.md#downloadDocument) | **GET** /documents/files | Download a Document
[**getDocument**](DocumentsApi.md#getDocument) | **GET** /documents | Retrieve a Document
[**markReviewDone**](DocumentsApi.md#markReviewDone) | **POST** /documents/done/review | Mark review done
[**markTranslationDone**](DocumentsApi.md#markTranslationDone) | **POST** /documents/done/translation | Mark translation done
[**pretranslateDocuments**](DocumentsApi.md#pretranslateDocuments) | **POST** /documents/pretranslate | Pretranslate a Document
[**unlockDocuments**](DocumentsApi.md#unlockDocuments) | **POST** /documents/done/unlock | Unlock documents
[**updateDocument**](DocumentsApi.md#updateDocument) | **PUT** /documents | Update a Document
[**uploadDocument**](DocumentsApi.md#uploadDocument) | **POST** /documents/files | Upload a File


<a name="assignDocument"></a>
# **assignDocument**
> DocumentAssignmentResponse assignDocument(body)

Assign a Document

Assign and unassign a Document for translation and/or review.  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.DocumentsApi;

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
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.DocumentsApi;

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
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.DocumentsApi;

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

<a name="downloadDocument"></a>
# **downloadDocument**
> byte[] downloadDocument(id, isXliff)

Download a Document

Export a Document that has been translated in the Lilt web application. Any Document can be downloaded in XLIFF 1.2 format, or can be retrieved in its original uploaded format by setting &#x60;is_xliff&#x3D;false&#x60;. This endpoint will fail if either (a) export or (b) pre-translation operations are in-progress. The status of those operations can be determined by retrieving the Document resource. Example CURL command: &#x60;&#x60;&#x60;   curl -X GET https://lilt.com/2/documents/files?key&#x3D;API_KEY&amp;id&#x3D;274 -o from_lilt.xliff &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.DocumentsApi;

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
      byte[] result = apiInstance.downloadDocument(id, isXliff);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#downloadDocument");
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
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.DocumentsApi;

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

<a name="markReviewDone"></a>
# **markReviewDone**
> List&lt;BigDecimal&gt; markReviewDone(body)

Mark review done

Mark the review of documents as done/undone in bulk.  When being marked positively as done:  - Documents must not already be marked as done for review. - Documents must already be marked as done for translation. - This request will also trigger an email notification.  Example curl: &#x60;&#x60;&#x60;   curl --X --request POST &#39;https://lilt.com/2/documents/done/review?key&#x3D;API_KEY&#39; \\   --header &#39;Content-Type: application/json&#39; \\   --data-raw &#39;{       \&quot;documentIds\&quot;: [23921, 23922],       \&quot;isDone\&quot;: true   }&#39; &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.DocumentsApi;

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
    DocumentDoneUpdateParameters2 body = new DocumentDoneUpdateParameters2(); // DocumentDoneUpdateParameters2 | 
    try {
      List<BigDecimal> result = apiInstance.markReviewDone(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#markReviewDone");
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
 **body** | [**DocumentDoneUpdateParameters2**](DocumentDoneUpdateParameters2.md)|  |

### Return type

[**List&lt;BigDecimal&gt;**](BigDecimal.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | array of updated documents |  -  |

<a name="markTranslationDone"></a>
# **markTranslationDone**
> List&lt;BigDecimal&gt; markTranslationDone(body)

Mark translation done

Mark the translation of documents as done/undone in bulk.  When being marked positively as done:  - Documents must not already be marked as done and all segments must be confirmed. - This request will also trigger an email notification to a document&#39;s assigned reviewer that the document is ready for review.  When being marked as un-done: - Documents must not be marked as complete for review.  Example curl: &#x60;&#x60;&#x60;   curl --X --request POST &#39;https://lilt.com/2/documents/done/translation?key&#x3D;API_KEY&#39; \\   --header &#39;Content-Type: application/json&#39; \\   --data-raw &#39;{       \&quot;documentIds\&quot;: [23921, 23922],       \&quot;isDone\&quot;: true   }&#39; &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.DocumentsApi;

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
    DocumentDoneUpdateParameters1 body = new DocumentDoneUpdateParameters1(); // DocumentDoneUpdateParameters1 | 
    try {
      List<BigDecimal> result = apiInstance.markTranslationDone(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#markTranslationDone");
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
 **body** | [**DocumentDoneUpdateParameters1**](DocumentDoneUpdateParameters1.md)|  |

### Return type

[**List&lt;BigDecimal&gt;**](BigDecimal.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | array of updated documents |  -  |

<a name="pretranslateDocuments"></a>
# **pretranslateDocuments**
> DocumentPretranslateResponse pretranslateDocuments(body, autoAccept, caseSensitive, attributeToCreator, mode)

Pretranslate a Document

Initiate pretranslation of a list of Documents. This request will mark document(s) as being pretranslated. Pretranslation in this context is: - Applying and confirming exact TM matches based on the Memory of the Project; - Translating all other segments via MT without confirming them.  Example CURL command: &#x60;&#x60;&#x60; curl -X POST https://lilt.com/2/documents/pretranslate?key&#x3D;API_KEY -d {\&quot;id\&quot;: [123]} -H \&quot;Content-Type: application/json\&quot; &#x60;&#x60;&#x60;  Document translation is an asynchronous process that, in effect, is performed in the background.  To check the status of pretranslation for a document, use the &#x60;GET /documents&#x60; endpoint. When pretranslation is in progress for a document, the &#x60;GET /documents&#x60; endpoint&#39;s response will include &#x60;is_pretranslating &#x3D; true&#x60; as well as a more detailed status property &#x60;status.pretranslation&#x60; one of &#x60;idle&#x60;, &#x60;pending&#x60;, or &#x60;running&#x60;.  Once pretranslation is finished, the document can be downloaded via &#x60;GET /documents/files&#x60;. 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.DocumentsApi;

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
    Boolean autoAccept = true; // Boolean | Deprecated, use body param instead. Optional parameter for auto-accepting 100% TM hits.
    Boolean caseSensitive = true; // Boolean | Deprecated, use body param instead. Optional for using case matching against TM hits.
    Boolean attributeToCreator = true; // Boolean | Deprecated, use body param instead. Optional parameter for attributing translation authorship of exact matches to document creator.
    String mode = "mode_example"; // String | Deprecated, use body param instead. An optional parameter indicating how the document will be pretranslated.  The accepted values are `tm`, or `tm+mt`. Default is `tm`. 
    try {
      DocumentPretranslateResponse result = apiInstance.pretranslateDocuments(body, autoAccept, caseSensitive, attributeToCreator, mode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#pretranslateDocuments");
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
 **autoAccept** | **Boolean**| Deprecated, use body param instead. Optional parameter for auto-accepting 100% TM hits. | [optional]
 **caseSensitive** | **Boolean**| Deprecated, use body param instead. Optional for using case matching against TM hits. | [optional]
 **attributeToCreator** | **Boolean**| Deprecated, use body param instead. Optional parameter for attributing translation authorship of exact matches to document creator. | [optional]
 **mode** | **String**| Deprecated, use body param instead. An optional parameter indicating how the document will be pretranslated.  The accepted values are &#x60;tm&#x60;, or &#x60;tm+mt&#x60;. Default is &#x60;tm&#x60;.  | [optional]

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

<a name="unlockDocuments"></a>
# **unlockDocuments**
> List&lt;BigDecimal&gt; unlockDocuments(body)

Unlock documents

Unlock documents for translation. Sets document \&quot;Translation Done\&quot; and \&quot;Review Done\&quot; to false.  Example curl: &#x60;&#x60;&#x60;   curl --X --request POST &#39;https://lilt.com/2/documents/done/unlock?key&#x3D;API_KEY&#39; \\   --header &#39;Content-Type: application/json&#39; \\   --data-raw &#39;{       \&quot;documentIds\&quot;: [23921, 23922]   }&#39; &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.DocumentsApi;

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
    DocumentDoneUpdateParameters body = new DocumentDoneUpdateParameters(); // DocumentDoneUpdateParameters | 
    try {
      List<BigDecimal> result = apiInstance.unlockDocuments(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#unlockDocuments");
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
 **body** | [**DocumentDoneUpdateParameters**](DocumentDoneUpdateParameters.md)|  |

### Return type

[**List&lt;BigDecimal&gt;**](BigDecimal.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | array of updated documents |  -  |

<a name="updateDocument"></a>
# **updateDocument**
> DocumentWithSegments updateDocument(body)

Update a Document

Update a Document. 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.DocumentsApi;

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

<a name="uploadDocument"></a>
# **uploadDocument**
> DocumentWithSegments uploadDocument(name, projectId, body, pretranslate, autoAccept, caseSensitive, matchAttribution, configId)

Upload a File

Create a Document from a file in any of the formats [documented in our knowledge base](https://support.lilt.com/hc/en-us/articles/360020816253-File-Formats). Request parameters should be passed as JSON object with the header field &#x60;LILT-API&#x60;.  File names in the header can only contain [US-ASCII characters](https://en.wikipedia.org/wiki/ASCII). File names with characters outside of US-ASCII should be [URI encoded](https://en.wikipedia.org/wiki/Percent-encoding) or transliterated to US-ASCII strings.  Example CURL command: &#x60;&#x60;&#x60;   curl -X POST https://lilt.com/2/documents/files?key&#x3D;API_KEY \\   --header \&quot;LILT-API: {\\\&quot;name\\\&quot;: \\\&quot;introduction.xliff\\\&quot;,\\\&quot;pretranslate\\\&quot;: \\\&quot;tm+mt\\\&quot;,\\\&quot;project_id\\\&quot;: 9}\&quot; \\   --header \&quot;Content-Type: application/octet-stream\&quot; \\   --data-binary @Introduction.xliff &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.DocumentsApi;

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
    File body = new File("/path/to/file"); // File | The file contents to be uploaded. The entire POST body will be treated as the file. 
    String pretranslate = "pretranslate_example"; // String | An optional parameter indicating if and how the document will be pretranslated upon being uploaded. The accepted values are `TM`, or `TM+MT` 
    Boolean autoAccept = true; // Boolean | An optional parameter to auto-accept segments with 100% translation memory matches when the `pretranslate` option is also set, or to auto-accept any target data that is present when the uploaded file is XLIFF. If omitted or set to `false`, no segments will be auto-accepted. 
    Boolean caseSensitive = true; // Boolean | An optional parameter to use case sensitive translation memory matching when the `pretranslate` option is also enabled. Matches must have identical character-by-character case to qualify as matches. Default value is `false` 
    Boolean matchAttribution = true; // Boolean | An optional parameter to attribute translation authorship of exact matches to the author of the file when the `pretranslate` option is also enabled. Default value is `false` 
    Integer configId = 56; // Integer | An optional pararameter to specify an import configuration to be applied when extracting translatable content from this file. 
    try {
      DocumentWithSegments result = apiInstance.uploadDocument(name, projectId, body, pretranslate, autoAccept, caseSensitive, matchAttribution, configId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#uploadDocument");
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
 **body** | **File**| The file contents to be uploaded. The entire POST body will be treated as the file.  |
 **pretranslate** | **String**| An optional parameter indicating if and how the document will be pretranslated upon being uploaded. The accepted values are &#x60;TM&#x60;, or &#x60;TM+MT&#x60;  | [optional]
 **autoAccept** | **Boolean**| An optional parameter to auto-accept segments with 100% translation memory matches when the &#x60;pretranslate&#x60; option is also set, or to auto-accept any target data that is present when the uploaded file is XLIFF. If omitted or set to &#x60;false&#x60;, no segments will be auto-accepted.  | [optional]
 **caseSensitive** | **Boolean**| An optional parameter to use case sensitive translation memory matching when the &#x60;pretranslate&#x60; option is also enabled. Matches must have identical character-by-character case to qualify as matches. Default value is &#x60;false&#x60;  | [optional]
 **matchAttribution** | **Boolean**| An optional parameter to attribute translation authorship of exact matches to the author of the file when the &#x60;pretranslate&#x60; option is also enabled. Default value is &#x60;false&#x60;  | [optional]
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

