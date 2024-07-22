# CreateApi

All URIs are relative to *https://api.lilt.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteLiltCreateContent**](CreateApi.md#deleteLiltCreateContent) | **DELETE** /v2/create/{contentId} | Delete Lilt Create content
[**generateLiltCreateContent**](CreateApi.md#generateLiltCreateContent) | **POST** /v2/create | Generate new Lilt Create content
[**getLiltCreateById**](CreateApi.md#getLiltCreateById) | **GET** /v2/create/{contentId} | Get Lilt Create content by ID.
[**getLiltCreateContent**](CreateApi.md#getLiltCreateContent) | **GET** /v2/create | Get Lilt Create content
[**getLiltCreatePreferences**](CreateApi.md#getLiltCreatePreferences) | **GET** /v2/create/preferences | Get Lilt Create preferences
[**regenerateLiltCreateContent**](CreateApi.md#regenerateLiltCreateContent) | **GET** /v2/create/{contentId}/create | Regenerate Lilt Create content
[**signLiltCreateTerms**](CreateApi.md#signLiltCreateTerms) | **POST** /v2/create/terms-and-conditions | Sign the Lilt Create terms and conditions
[**updateLiltCreateContent**](CreateApi.md#updateLiltCreateContent) | **PUT** /v2/create/{contentId} | Update Lilt Create content
[**updateLiltCreatePreferences**](CreateApi.md#updateLiltCreatePreferences) | **PUT** /v2/create/preferences | Update Lilt Create preferences


<a name="deleteLiltCreateContent"></a>
# **deleteLiltCreateContent**
> InlineResponse200 deleteLiltCreateContent(contentId)

Delete Lilt Create content

Delete a piece of Lilt Create content.  Example CURL: &#x60;&#x60;&#x60; curl --X --request DELETE &#39;https://api.lilt.com/v2/create/1234?key&#x3D;API_KEY&#39; &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.CreateApi;

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

    CreateApi apiInstance = new CreateApi(defaultClient);
    Integer contentId = 56; // Integer | The content ID.
    try {
      InlineResponse200 result = apiInstance.deleteLiltCreateContent(contentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateApi#deleteLiltCreateContent");
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
 **contentId** | **Integer**| The content ID. |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Delete Lilt Create Content Response. |  -  |

<a name="generateLiltCreateContent"></a>
# **generateLiltCreateContent**
> generateLiltCreateContent(templateParams)

Generate new Lilt Create content

Generate new Lilt Create content with the given parameters.  Example CURL: &#x60;&#x60;&#x60; curl --X --request POST &#39;https://api.lilt.com/v2/create?key&#x3D;API_KEY&#39; \\ --header &#39;Content-Type: application/json&#39; \\ --data-raw &#39;{   \&quot;language\&quot;:\&quot;en-US\&quot;,   \&quot;template\&quot;:\&quot;blog-post\&quot;,   \&quot;templateParams\&quot;:{     \&quot;contentLength\&quot;:\&quot;100\&quot;,     \&quot;language\&quot;:\&quot;en-US\&quot;,     \&quot;sections\&quot;:[],     \&quot;summary\&quot;:\&quot;a blog post about hiking\&quot;     },   \&quot;preferences\&quot;:{\&quot;tone\&quot;:\&quot;formal\&quot;,\&quot;styleguide\&quot;:\&quot;\&quot;} }&#39; &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.CreateApi;

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

    CreateApi apiInstance = new CreateApi(defaultClient);
    LiltCreateContent templateParams = new LiltCreateContent(); // LiltCreateContent | Input parameters that determine what content will be generated. 
    try {
      apiInstance.generateLiltCreateContent(templateParams);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateApi#generateLiltCreateContent");
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
 **templateParams** | [**LiltCreateContent**](LiltCreateContent.md)| Input parameters that determine what content will be generated.  |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An event stream produced by Server Side Events. The following events are supported. - message: an object with the newly generated text (e.g. {\&quot;text\&quot;: \&quot;hello\&quot;}) - message: upon completion of events the string \&quot;[DONE]\&quot; will be emitted - fullcontent: an object containing the full response  |  -  |

<a name="getLiltCreateById"></a>
# **getLiltCreateById**
> LiltCreateContent getLiltCreateById(contentId)

Get Lilt Create content by ID.

Get Lilt Create content by ID.  Example CURL: &#x60;&#x60;&#x60; curl --X --request GET &#39;https://api.lilt.com/v2/create/1234?key&#x3D;API_KEY&#39; &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.CreateApi;

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

    CreateApi apiInstance = new CreateApi(defaultClient);
    Integer contentId = 56; // Integer | The content ID.
    try {
      LiltCreateContent result = apiInstance.getLiltCreateById(contentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateApi#getLiltCreateById");
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
 **contentId** | **Integer**| The content ID. |

### Return type

[**LiltCreateContent**](LiltCreateContent.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Lilt Create content. |  -  |

<a name="getLiltCreateContent"></a>
# **getLiltCreateContent**
> List&lt;LiltCreateContent&gt; getLiltCreateContent()

Get Lilt Create content

Get a list of all content that has been generated by Lilt Create.  Example CURL: &#x60;&#x60;&#x60; curl --X --request GET &#39;https://api.lilt.com/v2/create?key&#x3D;API_KEY&#39; &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.CreateApi;

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

    CreateApi apiInstance = new CreateApi(defaultClient);
    try {
      List<LiltCreateContent> result = apiInstance.getLiltCreateContent();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateApi#getLiltCreateContent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;LiltCreateContent&gt;**](LiltCreateContent.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An object with a documents next task Workflow metadata. |  -  |

<a name="getLiltCreatePreferences"></a>
# **getLiltCreatePreferences**
> getLiltCreatePreferences()

Get Lilt Create preferences

Get the stored preferences for Lilt Create.  Example CURL: &#x60;&#x60;&#x60; curl --X --request POST &#39;https://api.lilt.com/v2/create/preferences?key&#x3D;API_KEY&#39; &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.CreateApi;

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

    CreateApi apiInstance = new CreateApi(defaultClient);
    try {
      apiInstance.getLiltCreatePreferences();
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateApi#getLiltCreatePreferences");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An object describing the stored preferences. |  -  |

<a name="regenerateLiltCreateContent"></a>
# **regenerateLiltCreateContent**
> regenerateLiltCreateContent(contentId)

Regenerate Lilt Create content

Regenerate the given piece of content with the current parameters.  Example CURL: &#x60;&#x60;&#x60; curl --X --request GET &#39;https://api.lilt.com/v2/create/1234/create?key&#x3D;API_KEY&#39; &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.CreateApi;

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

    CreateApi apiInstance = new CreateApi(defaultClient);
    Integer contentId = 56; // Integer | The content ID.
    try {
      apiInstance.regenerateLiltCreateContent(contentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateApi#regenerateLiltCreateContent");
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
 **contentId** | **Integer**| The content ID. |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An event stream produced by Server Side Events. The following events are supported. - message: an object with the newly generated text (e.g. {\&quot;text\&quot;: \&quot;hello\&quot;}) - message: upon completion of events the string \&quot;[DONE]\&quot; will be emitted - fullcontent: an object containing the full response  |  -  |

<a name="signLiltCreateTerms"></a>
# **signLiltCreateTerms**
> SignLiltCreateTermsResponse signLiltCreateTerms(signedAgreement)

Sign the Lilt Create terms and conditions

Lilt Create requires that the terms and conditions are signed first before using it. The terms and conditions can be signed by using this endpoint.  Example CURL: &#x60;&#x60;&#x60; curl --X --request POST &#39;https://api.lilt.com/v2/create/terms-and-conditions?key&#x3D;API_KEY&#39; \\ --header &#39;Content-Type: application/json&#39; \\ --data-raw &#39;{\&quot;signedAgreement\&quot;: true}&#39; &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.CreateApi;

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

    CreateApi apiInstance = new CreateApi(defaultClient);
    CreateConverterConfigParameters signedAgreement = new CreateConverterConfigParameters(); // CreateConverterConfigParameters | 
    try {
      SignLiltCreateTermsResponse result = apiInstance.signLiltCreateTerms(signedAgreement);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateApi#signLiltCreateTerms");
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
 **signedAgreement** | [**CreateConverterConfigParameters**](CreateConverterConfigParameters.md)|  |

### Return type

[**SignLiltCreateTermsResponse**](SignLiltCreateTermsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An object indicating whether the agreement has been signed or not.  |  -  |

<a name="updateLiltCreateContent"></a>
# **updateLiltCreateContent**
> LiltCreateContent updateLiltCreateContent(contentId, body)

Update Lilt Create content

Update a piece of Lilt Create content.  Example CURL: &#x60;&#x60;&#x60; curl --X --request PUT &#39;https://api.lilt.com/v2/create/1234?key&#x3D;API_KEY&#39; \\ --header &#39;Content-Type: application/json&#39; \\ --data-raw &#39;{\&quot;language\&quot;:\&quot;de-DE\&quot;}&#39; &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.CreateApi;

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

    CreateApi apiInstance = new CreateApi(defaultClient);
    Integer contentId = 56; // Integer | The content ID.
    LiltCreateContent body = new LiltCreateContent(); // LiltCreateContent | 
    try {
      LiltCreateContent result = apiInstance.updateLiltCreateContent(contentId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateApi#updateLiltCreateContent");
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
 **contentId** | **Integer**| The content ID. |
 **body** | [**LiltCreateContent**](LiltCreateContent.md)|  | [optional]

### Return type

[**LiltCreateContent**](LiltCreateContent.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The updated Lilt Create content. |  -  |

<a name="updateLiltCreatePreferences"></a>
# **updateLiltCreatePreferences**
> updateLiltCreatePreferences(styleguide)

Update Lilt Create preferences

Update the stored preferences for Lilt Create.  Example CURL: &#x60;&#x60;&#x60; curl --X --request PUT &#39;https://api.lilt.com/v2/create/preferences?key&#x3D;API_KEY&#39; \\ --header &#39;Content-Type: application/json&#39; \\ --data-raw &#39;{\&quot;tone\&quot;: \&quot;formal\&quot;, \&quot;styleguide\&quot;: \&quot;\&quot;}&#39; &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.CreateApi;

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

    CreateApi apiInstance = new CreateApi(defaultClient);
    LiltCreateContent styleguide = new LiltCreateContent(); // LiltCreateContent | Which styleguide to use.
    try {
      apiInstance.updateLiltCreatePreferences(styleguide);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateApi#updateLiltCreatePreferences");
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
 **styleguide** | [**LiltCreateContent**](LiltCreateContent.md)| Which styleguide to use. | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The updated Lilt Create preferences. |  -  |

