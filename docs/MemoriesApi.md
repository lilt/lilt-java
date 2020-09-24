# MemoriesApi

All URIs are relative to *https://lilt.com/2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMemory**](MemoriesApi.md#createMemory) | **POST** /memories | Create a Memory
[**deleteMemory**](MemoriesApi.md#deleteMemory) | **DELETE** /memories | Delete a Memory
[**getMemory**](MemoriesApi.md#getMemory) | **GET** /memories | Retrieve a Memory
[**importMemoryFile**](MemoriesApi.md#importMemoryFile) | **POST** /memories/import | File import for a Memory
[**queryMemory**](MemoriesApi.md#queryMemory) | **GET** /memories/query | Query a Memory
[**syncDeleteMemory**](MemoriesApi.md#syncDeleteMemory) | **DELETE** /memories/sync | Delete-sync for a Memory
[**syncDownMemory**](MemoriesApi.md#syncDownMemory) | **GET** /memories/sync | Get-sync for a Memory
[**syncInsertMemory**](MemoriesApi.md#syncInsertMemory) | **POST** /memories/sync | Insert-sync for a Memory
[**syncUpdateMemory**](MemoriesApi.md#syncUpdateMemory) | **PUT** /memories/sync | Update-sync for a Memory
[**updateMemory**](MemoriesApi.md#updateMemory) | **PUT** /memories | Update the name of a Memory


<a name="createMemory"></a>
# **createMemory**
> Memory createMemory(body)

Create a Memory

Create a new Memory. A Memory is a container that collects source/target sentences for a specific language pair (e.g., English&gt;French). The data in the Memory is used to train the MT system, populate the TM, and update the lexicon. Memories are private to your account - the data is not shared across users - unless you explicitly share a Memory with your team (via web app only).  &lt;a href&#x3D;\&quot;https://lilt.com/kb/memory/memories\&quot; target&#x3D;_blank&gt;Refer to our KB&lt;/a&gt; for a more detailed description.  

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
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A Memory object. |  -  |
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
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A status object. |  -  |
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
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of Memory objects. |  -  |
**0** | Unexpected error |  -  |

<a name="importMemoryFile"></a>
# **importMemoryFile**
> MemoryImportResponse importMemoryFile(memoryId, name, body)

File import for a Memory

Imports common translation memory or termbase file formats to a specific Lilt memory. Currently supported file formats are &#x60;*.tmx&#x60;, &#x60;*.sdltm&#x60; and &#x60;*.tmq&#x60; for TM data; &#x60;*.csv&#x60; and &#x60;*.tbx&#x60; for termbase data. Request parameters should be passed as JSON object with the header field &#x60;LILT-API&#x60;.  Example cURL command to upload a translation memory file named &#x60;my_memory.sdltm&#x60; in the current working directory: &#x60;&#x60;&#x60;   curl -X POST https://lilt.com/2/memories/import?key&#x3D;API_KEY \\     --header \&quot;LILT-API: {\\\&quot;name\\\&quot;: \\\&quot;my_memory.sdltm\\\&quot;,\\\&quot;memory_id\\\&quot;: 42}\&quot; \\     --header \&quot;Content-Type: application/octet-stream\&quot; \\     --data-binary @my_memory.sdltm &#x60;&#x60;&#x60;  

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

    MemoriesApi apiInstance = new MemoriesApi(defaultClient);
    Integer memoryId = 56; // Integer | A unique Memory identifier.
    String name = "name_example"; // String | Name of the TM or termbase file.
    String body = "body_example"; // String | The file contents to be uploaded. The entire POST body will be treated as the file.
    try {
      MemoryImportResponse result = apiInstance.importMemoryFile(memoryId, name, body);
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
 **body** | **String**| The file contents to be uploaded. The entire POST body will be treated as the file. |

### Return type

[**MemoryImportResponse**](MemoryImportResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A status object. |  -  |
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
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of TranslationMemoryEntry objects. |  -  |
**0** | Unexpected error |  -  |

<a name="syncDeleteMemory"></a>
# **syncDeleteMemory**
> MemoryInsertResponse syncDeleteMemory(id, fromTime, toTime, when)

Delete-sync for a Memory

Deletes segments in the Memory matching the &#x60;from_time&#x60;, &#x60;to_time&#x60; and &#x60;when&#x60; parameters.  Example CURL command: &#x60;&#x60;&#x60;   curl -X DELETE https://lilt.com/2/memories/sync?key&#x3D;API_KEY&amp;id&#x3D;42&amp;from_time&#x3D;1491048000&amp;to_time&#x3D;1491049800&amp;when&#x3D;created &#x60;&#x60;&#x60;  

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

    MemoriesApi apiInstance = new MemoriesApi(defaultClient);
    Integer id = 56; // Integer | A unique Memory identifier.
    Integer fromTime = 56; // Integer | Unix time stamp (epoch, in seconds) of the start of the Memory section.
    Integer toTime = 56; // Integer | Unix time stamp (epoch, in seconds) of the end of the Memory section.
    String when = "when_example"; // String | The date field on which retrieved segments match from/to time stamps: `created`, `updated`, `deleted`.
    try {
      MemoryInsertResponse result = apiInstance.syncDeleteMemory(id, fromTime, toTime, when);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MemoriesApi#syncDeleteMemory");
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
 **fromTime** | **Integer**| Unix time stamp (epoch, in seconds) of the start of the Memory section. | [optional]
 **toTime** | **Integer**| Unix time stamp (epoch, in seconds) of the end of the Memory section. | [optional]
 **when** | **String**| The date field on which retrieved segments match from/to time stamps: &#x60;created&#x60;, &#x60;updated&#x60;, &#x60;deleted&#x60;. | [optional]

### Return type

[**MemoryInsertResponse**](MemoryInsertResponse.md)

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

<a name="syncDownMemory"></a>
# **syncDownMemory**
> byte[] syncDownMemory(id, fromTime, toTime, when)

Get-sync for a Memory

Get all or part of a memory in TMX 1.4b format. If the &#x60;from_time&#x60; and/or &#x60;to_time&#x60; are omitted, then all segments are returned. The parameter &#x60;when&#x60; specifies on which date field &#x60;from_time&#x60; and &#x60;to_time&#x60; are matched. Possible values are &#x60;created&#x60; (when the segment was originally created in the memory), &#x60;updated&#x60; (when the segment was lastly updated), and &#x60;deleted&#x60; (when the segment was deleted).  Example CURL command: &#x60;&#x60;&#x60;   curl -X GET https://lilt.com/2/memories/sync?key&#x3D;API_KEY&amp;id&#x3D;42 -o from_lilt.tmx &#x60;&#x60;&#x60;  

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

    MemoriesApi apiInstance = new MemoriesApi(defaultClient);
    Integer id = 56; // Integer | A unique Memory identifier.
    Integer fromTime = 56; // Integer | Unix time stamp (epoch, in seconds) of the start of the Memory section.
    Integer toTime = 56; // Integer | Unix time stamp (epoch, in seconds) of the end of the Memory section.
    String when = "when_example"; // String | The date field on which retrieved segments match from/to time stamps: `created`, `updated`, `deleted`. If this parameter is omitted, then the whole Memory is returned.
    try {
      byte[] result = apiInstance.syncDownMemory(id, fromTime, toTime, when);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MemoriesApi#syncDownMemory");
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
 **fromTime** | **Integer**| Unix time stamp (epoch, in seconds) of the start of the Memory section. | [optional]
 **toTime** | **Integer**| Unix time stamp (epoch, in seconds) of the end of the Memory section. | [optional]
 **when** | **String**| The date field on which retrieved segments match from/to time stamps: &#x60;created&#x60;, &#x60;updated&#x60;, &#x60;deleted&#x60;. If this parameter is omitted, then the whole Memory is returned. | [optional]

### Return type

**byte[]**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/x-tmx

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A TMX 1.4b file. |  -  |
**0** | Unexpected error |  -  |

<a name="syncInsertMemory"></a>
# **syncInsertMemory**
> MemoryInsertResponse syncInsertMemory(id, body, name)

Insert-sync for a Memory

Inserts a TM in TMX 1.4b format into the Memory. Request parameters should be passed as JSON object with the header field &#x60;LILT-API&#x60;.  Example CURL command: &#x60;&#x60;&#x60;   curl -X POST https://lilt.com/2/memories/sync?key&#x3D;API_KEY \\     --header \&quot;LILT-API: {\\\&quot;name\\\&quot;: \\\&quot;my_memory.tmx\\\&quot;,\\\&quot;id\\\&quot;: 42}\&quot; \\     --header \&quot;Content-Type: application/octet-stream\&quot; \\     --data-binary @my_memory.tmx &#x60;&#x60;&#x60;  

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

    MemoriesApi apiInstance = new MemoriesApi(defaultClient);
    Integer id = 56; // Integer | A unique Memory identifier.
    String body = "body_example"; // String | The file contents to be uploaded. The entire POST body will be treated as the file.
    String name = "name_example"; // String | Name of the TMX file.
    try {
      MemoryInsertResponse result = apiInstance.syncInsertMemory(id, body, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MemoriesApi#syncInsertMemory");
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
 **body** | **String**| The file contents to be uploaded. The entire POST body will be treated as the file. |
 **name** | **String**| Name of the TMX file. | [optional]

### Return type

[**MemoryInsertResponse**](MemoryInsertResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A status object. |  -  |
**0** | Unexpected error |  -  |

<a name="syncUpdateMemory"></a>
# **syncUpdateMemory**
> MemoryUpdateResponse syncUpdateMemory(id, body, fromTime, toTime, when)

Update-sync for a Memory

Updates the Memory with given TMX file. Request parameters should be passed as JSON object with the header field &#x60;LILT-API&#x60;. The number of segments returned by the &#x60;from_time&#x60;, &#x60;to_time&#x60;, &#x60;when&#x60; parameters and the number of segments in the TMX file need to be identical.  Example CURL command: &#x60;&#x60;&#x60;   curl -X PUT https://lilt.com/2/memories/sync?key&#x3D;API_KEY \\     --header \&quot;LILT-API: {\\\&quot;name\\\&quot;: \\\&quot;my_memory.tmx\\\&quot;, \\\&quot;id\\\&quot;: 42, \\\&quot;from_time\\\&quot;: 1491048000, \\\&quot;to_time\\\&quot;: 1491049800, \&quot;when\&quot;: \&quot;Updated\&quot;}\&quot; \\     --header \&quot;Content-Type: application/octet-stream\&quot; \\     --data-binary @my_memory.tmx &#x60;&#x60;&#x60;  

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

    MemoriesApi apiInstance = new MemoriesApi(defaultClient);
    Integer id = 56; // Integer | A unique Memory identifier.
    String body = "body_example"; // String | The file contents to be uploaded. The entire PUT body will be treated as the file.
    Integer fromTime = 56; // Integer | Unix time stamp (epoch, in seconds) of the start of the Memory section.
    Integer toTime = 56; // Integer | Unix time stamp (epoch, in seconds) of the end of the Memory section.
    String when = "when_example"; // String | The date field on which retrieved segments match from/to time stamps: `created`, `updated`, `deleted`.
    try {
      MemoryUpdateResponse result = apiInstance.syncUpdateMemory(id, body, fromTime, toTime, when);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MemoriesApi#syncUpdateMemory");
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
 **body** | **String**| The file contents to be uploaded. The entire PUT body will be treated as the file. |
 **fromTime** | **Integer**| Unix time stamp (epoch, in seconds) of the start of the Memory section. | [optional]
 **toTime** | **Integer**| Unix time stamp (epoch, in seconds) of the end of the Memory section. | [optional]
 **when** | **String**| The date field on which retrieved segments match from/to time stamps: &#x60;created&#x60;, &#x60;updated&#x60;, &#x60;deleted&#x60;. | [optional]

### Return type

[**MemoryUpdateResponse**](MemoryUpdateResponse.md)

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
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A Memory object. |  -  |
**0** | Unexpected error |  -  |

