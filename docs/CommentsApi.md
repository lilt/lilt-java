# CommentsApi

All URIs are relative to *https://lilt.com/2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createComment**](CommentsApi.md#createComment) | **POST** /comments | Create a new comment
[**deleteComment**](CommentsApi.md#deleteComment) | **DELETE** /comments | Delete a Comment
[**getDocumentComments**](CommentsApi.md#getDocumentComments) | **GET** /comments | Retrieve a document&#39;s comments by segment
[**updateComment**](CommentsApi.md#updateComment) | **PUT** /comments | Update an existing comment


<a name="createComment"></a>
# **createComment**
> Comment createComment(documentId, segmentId, body)

Create a new comment

Create a new comment for the specified Segment ID.

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.CommentsApi;

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

    CommentsApi apiInstance = new CommentsApi(defaultClient);
    Integer documentId = 56; // Integer | A unique document identifier.
    Integer segmentId = 56; // Integer | A unique segment identifier.
    CommentBody body = new CommentBody(); // CommentBody | The comment being created
    try {
      Comment result = apiInstance.createComment(documentId, segmentId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#createComment");
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
 **documentId** | **Integer**| A unique document identifier. |
 **segmentId** | **Integer**| A unique segment identifier. |
 **body** | [**CommentBody**](CommentBody.md)| The comment being created |

### Return type

[**Comment**](Comment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A Comment object. |  -  |
**0** | Unexpected error |  -  |

<a name="deleteComment"></a>
# **deleteComment**
> CommentDeleteResponse deleteComment(commentId)

Delete a Comment

Delete a Comment.  Example CURL command: &#x60;&#x60;&#x60;   curl -X DELETE https://lilt.com/2/comments?key&#x3D;API_KEY&amp;comment_id&#x3D;123 &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.CommentsApi;

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

    CommentsApi apiInstance = new CommentsApi(defaultClient);
    Integer commentId = 56; // Integer | A unique Comment identifier.
    try {
      CommentDeleteResponse result = apiInstance.deleteComment(commentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#deleteComment");
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
 **commentId** | **Integer**| A unique Comment identifier. |

### Return type

[**CommentDeleteResponse**](CommentDeleteResponse.md)

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

<a name="getDocumentComments"></a>
# **getDocumentComments**
> DocumentComments getDocumentComments(documentId)

Retrieve a document&#39;s comments by segment

Retrieves all comments associated with a specified document, grouped by their Segment&#39;s ID.  To retrieve a document&#39;s comments, specify the &lt;strong&gt;document_id&lt;/strong&gt; request parameter.  Example CURL command: &#x60;&#x60;&#x60;   curl -X GET https://lilt.com/2/comments?key&#x3D;API_KEY&amp;document_id&#x3D;123 &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.CommentsApi;

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

    CommentsApi apiInstance = new CommentsApi(defaultClient);
    Integer documentId = 56; // Integer | A unique document identifier.
    try {
      DocumentComments result = apiInstance.getDocumentComments(documentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#getDocumentComments");
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
 **documentId** | **Integer**| A unique document identifier. |

### Return type

[**DocumentComments**](DocumentComments.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An object containing lists of comments identified by the id of the segment to which they belong. |  -  |
**403** | Unauthorized. |  -  |
**410** | Comment deleted. |  -  |
**0** | Unexpected error. |  -  |

<a name="updateComment"></a>
# **updateComment**
> Comment updateComment(commentId, documentId, body)

Update an existing comment

Update an existing comment.

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.CommentsApi;

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

    CommentsApi apiInstance = new CommentsApi(defaultClient);
    Integer commentId = 56; // Integer | A unique comment identifier.
    Integer documentId = 56; // Integer | A unique document identifier.
    CommentBody body = new CommentBody(); // CommentBody | The comment being updated.
    try {
      Comment result = apiInstance.updateComment(commentId, documentId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#updateComment");
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
 **commentId** | **Integer**| A unique comment identifier. |
 **documentId** | **Integer**| A unique document identifier. |
 **body** | [**CommentBody**](CommentBody.md)| The comment being updated. |

### Return type

[**Comment**](Comment.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A Comment object. |  -  |
**0** | Unexpected error |  -  |

