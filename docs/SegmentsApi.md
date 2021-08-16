# SegmentsApi

All URIs are relative to *https://lilt.com/2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSegment**](SegmentsApi.md#createSegment) | **POST** /segments | Create a Segment
[**deleteSegment**](SegmentsApi.md#deleteSegment) | **DELETE** /segments | Delete a Segment
[**getSegment**](SegmentsApi.md#getSegment) | **GET** /segments | Retrieve a Segment
[**segmentsReviewUnlockPost**](SegmentsApi.md#segmentsReviewUnlockPost) | **POST** /segments/review/unlock | Unaccept and unlock segments
[**tagSegment**](SegmentsApi.md#tagSegment) | **GET** /segments/tag | Tag a Segment
[**updateSegment**](SegmentsApi.md#updateSegment) | **PUT** /segments | Update a Segment


<a name="createSegment"></a>
# **createSegment**
> Object createSegment(body)

Create a Segment

Create a Segment and add it to a Memory. A Segment is a source/target pair that is used to train the machine translation system and populate the translation memory. This is not intended to be used on documents and will throw an error.  The maximum source length is 5,000 characters.  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.SegmentsApi;

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

    SegmentsApi apiInstance = new SegmentsApi(defaultClient);
    SegmentCreateParameters body = new SegmentCreateParameters(); // SegmentCreateParameters | 
    try {
      Object result = apiInstance.createSegment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#createSegment");
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
 **body** | [**SegmentCreateParameters**](SegmentCreateParameters.md)|  |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A Segment object. |  -  |
**0** | Unexpected error |  -  |

<a name="deleteSegment"></a>
# **deleteSegment**
> SegmentDeleteResponse deleteSegment(id)

Delete a Segment

Delete a Segment from memory. This will not delete a segment from a document. 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.SegmentsApi;

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

    SegmentsApi apiInstance = new SegmentsApi(defaultClient);
    Integer id = 56; // Integer | A unique Segment identifier.
    try {
      SegmentDeleteResponse result = apiInstance.deleteSegment(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#deleteSegment");
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
 **id** | **Integer**| A unique Segment identifier. |

### Return type

[**SegmentDeleteResponse**](SegmentDeleteResponse.md)

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

<a name="getSegment"></a>
# **getSegment**
> Object getSegment(id, includeComments)

Retrieve a Segment

Retrieve a Segment.  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.SegmentsApi;

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

    SegmentsApi apiInstance = new SegmentsApi(defaultClient);
    Integer id = 56; // Integer | A unique Segment identifier.
    Boolean includeComments = false; // Boolean | Include comments in the response.
    try {
      Object result = apiInstance.getSegment(id, includeComments);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#getSegment");
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
 **id** | **Integer**| A unique Segment identifier. |
 **includeComments** | **Boolean**| Include comments in the response. | [optional] [default to false]

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A Segment object. |  -  |
**0** | Unexpected error |  -  |

<a name="segmentsReviewUnlockPost"></a>
# **segmentsReviewUnlockPost**
> List&lt;String&gt; segmentsReviewUnlockPost(body)

Unaccept and unlock segments

Unaccept and unlock segments. Sets individual segments&#39; \&quot;Review Done\&quot; to false. Confirmed segments will remain confirmed.  Example curl: &#x60;&#x60;&#x60;   curl --X --request POST &#39;https://lilt.com/2/segments/review/unlock?key&#x3D;API_KEY&#39; \\   --header &#39;Content-Type: application/json&#39; \\   --data-raw &#39;{       \&quot;segmentIds\&quot;: [23921, 23922]   }&#39; &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.SegmentsApi;

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

    SegmentsApi apiInstance = new SegmentsApi(defaultClient);
    Object body = null; // Object | segment ids to update
    try {
      List<String> result = apiInstance.segmentsReviewUnlockPost(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#segmentsReviewUnlockPost");
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
 **body** | **Object**| segment ids to update |

### Return type

**List&lt;String&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | array of updated segments |  -  |

<a name="tagSegment"></a>
# **tagSegment**
> Object tagSegment(sourceTagged, target, memoryId)

Tag a Segment

Project tags for a segment. The &#x60;source_tagged&#x60; string contains one or more SGML tags. The &#x60;target&#x60; string is untagged. This endpoint will automatically place the source tags in the target.  Usage charges apply to this endpoint for production REST API keys.  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.SegmentsApi;

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

    SegmentsApi apiInstance = new SegmentsApi(defaultClient);
    String sourceTagged = "sourceTagged_example"; // String | The tagged source string.
    String target = "target_example"; // String | The target string.
    Integer memoryId = 56; // Integer | A unique Memory identifier.
    try {
      Object result = apiInstance.tagSegment(sourceTagged, target, memoryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#tagSegment");
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
 **sourceTagged** | **String**| The tagged source string. |
 **target** | **String**| The target string. |
 **memoryId** | **Integer**| A unique Memory identifier. |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A TaggedSegment object. |  -  |
**0** | Unexpected error |  -  |

<a name="updateSegment"></a>
# **updateSegment**
> Object updateSegment(body)

Update a Segment

Update a Segment in memory. The Memory will be updated with the new target string.  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.SegmentsApi;

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

    SegmentsApi apiInstance = new SegmentsApi(defaultClient);
    SegmentUpdateParameters body = new SegmentUpdateParameters(); // SegmentUpdateParameters | 
    try {
      Object result = apiInstance.updateSegment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#updateSegment");
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
 **body** | [**SegmentUpdateParameters**](SegmentUpdateParameters.md)|  |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A Segment object. |  -  |
**0** | Unexpected error |  -  |

