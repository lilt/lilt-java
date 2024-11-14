# MemoriesApi

All URIs are relative to *https://api.lilt.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMemory**](MemoriesApi.md#createMemory) | **POST** /v2/memories | Create a Memory
[**deleteMemory**](MemoriesApi.md#deleteMemory) | **DELETE** /v2/memories | Delete a Memory
[**deleteSegmentFromMemory**](MemoriesApi.md#deleteSegmentFromMemory) | **DELETE** /v2/memories/segment | Delete a segment from a memory.
[**downloadTermbase**](MemoriesApi.md#downloadTermbase) | **GET** /v2/memories/termbase/download | Termbase download for a Memory
[**exportTermbase**](MemoriesApi.md#exportTermbase) | **POST** /v2/memories/termbase/export | Termbase export for a Memory
[**getMemory**](MemoriesApi.md#getMemory) | **GET** /v2/memories | Retrieve a Memory
[**importMemoryFile**](MemoriesApi.md#importMemoryFile) | **POST** /v2/memories/import | File import for a Memory
[**queryMemory**](MemoriesApi.md#queryMemory) | **GET** /v2/memories/query | Query a Memory
[**updateMemory**](MemoriesApi.md#updateMemory) | **PUT** /v2/memories | Update the name of a Memory


<a name="createMemory"></a>
# **createMemory**
> Memory createMemory(body)

Create a Memory

Create a new Memory. A Memory is a container that collects source/target sentences for a specific language pair (e.g., English&gt;French). The data in the Memory is used to train the MT system, populate the TM, and update the lexicon. Memories are private to your account - the data is not shared across users - unless you explicitly share a Memory with your team (via web app only).  &lt;a href&#x3D;\&quot;https://support.lilt.com/hc/en-us/sections/360012579193-Lilt-Translate-Engine\&quot; target&#x3D;_blank&gt;Refer to our KB&lt;/a&gt; for a more detailed description.  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.MemoriesApi;

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

    MemoriesApi apiInstance = new MemoriesApi(defaultClient);
    MemoryCreateParameters body = new MemoryCreateParameters(); // MemoryCreateParameters | 
    try {
      Memory result = apiInstance.createMemory(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MemoriesApi#createMemory");
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
 **body** | [**MemoryCreateParameters**](MemoryCreateParameters.md)|  |

### Return type

[**Memory**](Memory.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/octet-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A Memory object. |  -  |
**401** | Unauthorized |  -  |
**0** | Unexpected error |  -  |

<a name="deleteMemory"></a>
# **deleteMemory**
> MemoryDeleteResponse deleteMemory(id)

Delete a Memory

Delete a Memory. 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.MemoriesApi;

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

    MemoriesApi apiInstance = new MemoriesApi(defaultClient);
    Integer id = 56; // Integer | A unique Memory identifier.
    try {
      MemoryDeleteResponse result = apiInstance.deleteMemory(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MemoriesApi#deleteMemory");
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
 **id** | **Integer**| A unique Memory identifier. |

### Return type

[**MemoryDeleteResponse**](MemoryDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A status object. |  -  |
**401** | Unauthorized |  -  |
**0** | Unexpected error |  -  |

<a name="deleteSegmentFromMemory"></a>
# **deleteSegmentFromMemory**
> DeleteSegmentFromMemoryResponse deleteSegmentFromMemory(id, segmentId)

Delete a segment from a memory.

Delete a segment from a memory.  &#x60;&#x60;&#x60;bash   curl -X DELETE https://api.lilt.com/v2/memories/segment?key&#x3D;API_KEY&amp;id&#x3D;ID&amp;segment_id&#x3D;$SEGMENT_ID &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.MemoriesApi;

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

    MemoriesApi apiInstance = new MemoriesApi(defaultClient);
    Integer id = 56; // Integer | A unique Memory identifier.
    Integer segmentId = 56; // Integer | A unique Segment identifier.
    try {
      DeleteSegmentFromMemoryResponse result = apiInstance.deleteSegmentFromMemory(id, segmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MemoriesApi#deleteSegmentFromMemory");
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
 **id** | **Integer**| A unique Memory identifier. |
 **segmentId** | **Integer**| A unique Segment identifier. |

### Return type

[**DeleteSegmentFromMemoryResponse**](DeleteSegmentFromMemoryResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A success resposne. |  -  |
**401** | Unauthorized |  -  |
**0** | Unexpected error |  -  |

<a name="downloadTermbase"></a>
# **downloadTermbase**
> byte[] downloadTermbase(id)

Termbase download for a Memory

Downloads the termbase export for the given memory as a CSV file.  Ensure you first call the &#x60;/2/memories/termbase/export&#x60; endpoint to start the export process before you try to download it.  &#x60;&#x60;&#x60;bash   curl -X GET https://api.lilt.com/v2/memories/termbase/download?key&#x3D;API_KEY&amp;id&#x3D;ID &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.MemoriesApi;

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

    MemoriesApi apiInstance = new MemoriesApi(defaultClient);
    Integer id = 56; // Integer | A unique Memory identifier.
    try {
      byte[] result = apiInstance.downloadTermbase(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MemoriesApi#downloadTermbase");
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
 **id** | **Integer**| A unique Memory identifier. |

### Return type

**byte[]**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A file. |  -  |
**401** | Unauthorized |  -  |
**0** | Unexpected error |  -  |

<a name="exportTermbase"></a>
# **exportTermbase**
> TermbaseExportResponse exportTermbase(id)

Termbase export for a Memory

Exports the termbase entries for the given memory into a CSV file.  Calling this endpoint will begin the export process in the background. Check that the processing is complete by polling the &#x60;GET /2/memories&#x60; endpoint. When the &#x60;is_processing&#x60; value is 0 then call the &#x60;POST /2/memories/termbase/download&#x60; endpoint.  &#x60;&#x60;&#x60;bash   curl -X POST https://api.lilt.com/v2/memories/termbase/export?key&#x3D;API_KEY&amp;id&#x3D;ID &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.MemoriesApi;

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

    MemoriesApi apiInstance = new MemoriesApi(defaultClient);
    Integer id = 56; // Integer | A unique Memory identifier.
    try {
      TermbaseExportResponse result = apiInstance.exportTermbase(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MemoriesApi#exportTermbase");
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
 **id** | **Integer**| A unique Memory identifier. |

### Return type

[**TermbaseExportResponse**](TermbaseExportResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A status object. |  -  |
**401** | Unauthorized |  -  |
**0** | Unexpected error |  -  |

<a name="getMemory"></a>
# **getMemory**
> List&lt;Memory&gt; getMemory(id)

Retrieve a Memory

Retrieve a Memory. If you cannot access the Memory (401 error) please check permissions (e.g. in case you created the Memory via the web app with a different account you may have to explicitly share that Memory).  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.MemoriesApi;

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

    MemoriesApi apiInstance = new MemoriesApi(defaultClient);
    Integer id = 56; // Integer | An optional Memory identifier.
    try {
      List<Memory> result = apiInstance.getMemory(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MemoriesApi#getMemory");
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
 **id** | **Integer**| An optional Memory identifier. | [optional]

### Return type

[**List&lt;Memory&gt;**](Memory.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of Memory objects. |  -  |
**401** | Unauthorized |  -  |
**404** | Memory not found. |  -  |
**0** | Unexpected error |  -  |

<a name="importMemoryFile"></a>
# **importMemoryFile**
> MemoryImportResponse importMemoryFile(memoryId, name, body, sdlxliffFilters, hasHeaderRow, skipDuplicates)

File import for a Memory

Imports common translation memory or termbase file formats to a specific Lilt memory. Currently supported file formats are &#x60;*.tmx&#x60;, &#x60;*.sdltm&#x60;, &#x60;*.sdlxliff&#x60;(With custom Filters), &#39;*.xliff&#39;, and &#x60;*.tmq&#x60; for TM data; &#x60;*.csv&#x60; and &#x60;*.tbx&#x60; for termbase data. Request parameters should be passed as JSON object with the header field &#x60;LILT-API&#x60;.  Example CURL command to upload a translation memory file named &#x60;my_memory.sdltm&#x60; in the current working directory: &#x60;&#x60;&#x60;bash   curl -X POST https://api.lilt.com/v2/memories/import?key&#x3D;API_KEY \\     --header \&quot;LILT-API: {\\\&quot;name\\\&quot;: \\\&quot;my_memory.sdltm\\\&quot;,\\\&quot;memory_id\\\&quot;: 42}\&quot; \\     --header \&quot;Content-Type: application/octet-stream\&quot; \\     --data-binary @my_memory.sdltm &#x60;&#x60;&#x60;  Example CURL command to upload a translation memory file named &#x60;my_memory.sdlxliff&#x60; in the current working directory, with Custom Filters based on SDLXLIFF fields, conf_name which maps to, percentage, and whether we should ignore unlocked segments. &#x60;&#x60;&#x60;bash   curl -X POST https://api.lilt.com/v2/memories/import?key&#x3D;API_KEY \\     --header \&quot;LILT-API: {\\\&quot;name\\\&quot;: \\\&quot;my_memory.sdlxliff\\\&quot;,\\\&quot;memory_id\\\&quot;: 12,\\\&quot;sdlxliff_filters\\\&quot;:[{\\\&quot;conf_name\\\&quot;: \\\&quot;Translated\\\&quot;, \\\&quot;percentage\\\&quot;: 100, \\\&quot;allow_unlocked\\\&quot;: false}]\&quot;}\&quot; \\     --header \&quot;Content-Type: application/octet-stream\&quot; \\     --data-binary @my_memory.sdlxliff &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.MemoriesApi;

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

    MemoriesApi apiInstance = new MemoriesApi(defaultClient);
    Integer memoryId = 56; // Integer | A unique Memory identifier.
    String name = "name_example"; // String | Name of the TM or termbase file.
    File body = new File("/path/to/file"); // File | The file contents to be uploaded. The entire POST body will be treated as the file.
    List<SDLXLIFFFilter> sdlxliffFilters = Arrays.asList(); // List<SDLXLIFFFilter> | Contains Filter information Unique to SDLXLIFF
    Boolean hasHeaderRow = true; // Boolean | A flag indicating whether an imported Termbase CSV has a header row or not (the default value is `false`).
    Boolean skipDuplicates = true; // Boolean | A flag indicating whether or not to skip the import of segments which already exist in the memory. (the default value is `false`). 
    try {
      MemoryImportResponse result = apiInstance.importMemoryFile(memoryId, name, body, sdlxliffFilters, hasHeaderRow, skipDuplicates);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MemoriesApi#importMemoryFile");
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
 **name** | **String**| Name of the TM or termbase file. |
 **body** | **File**| The file contents to be uploaded. The entire POST body will be treated as the file. |
 **sdlxliffFilters** | [**List&lt;SDLXLIFFFilter&gt;**](SDLXLIFFFilter.md)| Contains Filter information Unique to SDLXLIFF | [optional]
 **hasHeaderRow** | **Boolean**| A flag indicating whether an imported Termbase CSV has a header row or not (the default value is &#x60;false&#x60;). | [optional]
 **skipDuplicates** | **Boolean**| A flag indicating whether or not to skip the import of segments which already exist in the memory. (the default value is &#x60;false&#x60;).  | [optional]

### Return type

[**MemoryImportResponse**](MemoryImportResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json, application/octet-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A status object. |  -  |
**401** | Unauthorized |  -  |
**0** | Unexpected error |  -  |

<a name="queryMemory"></a>
# **queryMemory**
> List&lt;TranslationMemoryEntry&gt; queryMemory(id, query, n)

Query a Memory

Perform a translation memory query. 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.MemoriesApi;

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

    MemoriesApi apiInstance = new MemoriesApi(defaultClient);
    Integer id = 56; // Integer | A unique Memory identifier.
    String query = "query_example"; // String | A source query.
    Integer n = 10; // Integer | Maximum number of results to return.
    try {
      List<TranslationMemoryEntry> result = apiInstance.queryMemory(id, query, n);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MemoriesApi#queryMemory");
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
 **id** | **Integer**| A unique Memory identifier. |
 **query** | **String**| A source query. |
 **n** | **Integer**| Maximum number of results to return. | [optional] [default to 10]

### Return type

[**List&lt;TranslationMemoryEntry&gt;**](TranslationMemoryEntry.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of TranslationMemoryEntry objects. |  -  |
**401** | Unauthorized |  -  |
**0** | Unexpected error |  -  |

<a name="updateMemory"></a>
# **updateMemory**
> Memory updateMemory(body)

Update the name of a Memory

Update a Memory. 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.MemoriesApi;

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

    MemoriesApi apiInstance = new MemoriesApi(defaultClient);
    MemoryUpdateParameters body = new MemoryUpdateParameters(); // MemoryUpdateParameters | 
    try {
      Memory result = apiInstance.updateMemory(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MemoriesApi#updateMemory");
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
 **body** | [**MemoryUpdateParameters**](MemoryUpdateParameters.md)|  |

### Return type

[**Memory**](Memory.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/octet-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A Memory object. |  -  |
**401** | Unauthorized |  -  |
**0** | Unexpected error |  -  |

