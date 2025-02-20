# WebhookConfigurationApi

All URIs are relative to *https://api.lilt.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**servicesConfigurationApiWebhooksDelete**](WebhookConfigurationApi.md#servicesConfigurationApiWebhooksDelete) | **DELETE** /v3/connectors/configuration/webhooks/{id} | Delete a specific Webhook Configuration by ID.
[**webhooksCreate**](WebhookConfigurationApi.md#webhooksCreate) | **POST** /v3/connectors/configuration/webhooks | Creates a new Webhook Configuration
[**webhooksGet**](WebhookConfigurationApi.md#webhooksGet) | **GET** /v3/connectors/configuration/webhooks/{id} | Retrieve a specific Webhook Configuration by ID.
[**webhooksGetMany**](WebhookConfigurationApi.md#webhooksGetMany) | **GET** /v3/connectors/configuration/webhooks | Retrieve a list of Webhook Configurations.
[**webhooksUpdate**](WebhookConfigurationApi.md#webhooksUpdate) | **PUT** /v3/connectors/configuration/webhooks/{id} | Update a specific Webhook Configuration by ID.


<a name="servicesConfigurationApiWebhooksDelete"></a>
# **servicesConfigurationApiWebhooksDelete**
> servicesConfigurationApiWebhooksDelete(id)

Delete a specific Webhook Configuration by ID.

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.WebhookConfigurationApi;

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

    WebhookConfigurationApi apiInstance = new WebhookConfigurationApi(defaultClient);
    Integer id = 12345; // Integer | The Webhook Configuration ID.
    try {
      apiInstance.servicesConfigurationApiWebhooksDelete(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookConfigurationApi#servicesConfigurationApiWebhooksDelete");
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
 **id** | **Integer**| The Webhook Configuration ID. |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Upon success a response with an empty body is returned. |  -  |
**0** | Unexpected error |  -  |

<a name="webhooksCreate"></a>
# **webhooksCreate**
> WebhookResponse webhooksCreate(createWebhookOptions)

Creates a new Webhook Configuration

Creates a new webhook configuration for your LILT organization. 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.WebhookConfigurationApi;

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

    WebhookConfigurationApi apiInstance = new WebhookConfigurationApi(defaultClient);
    CreateWebhookOptions createWebhookOptions = new CreateWebhookOptions(); // CreateWebhookOptions | 
    try {
      WebhookResponse result = apiInstance.webhooksCreate(createWebhookOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookConfigurationApi#webhooksCreate");
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
 **createWebhookOptions** | [**CreateWebhookOptions**](CreateWebhookOptions.md)|  |

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns the newly created webhook configuration. |  -  |
**0** | Unexpected error |  -  |

<a name="webhooksGet"></a>
# **webhooksGet**
> WebhookResponse webhooksGet(id)

Retrieve a specific Webhook Configuration by ID.

Retrieves a specific webhook configuration by its ID. Deleted webhook configurations are not returned. 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.WebhookConfigurationApi;

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

    WebhookConfigurationApi apiInstance = new WebhookConfigurationApi(defaultClient);
    Integer id = 12345; // Integer | The Webhook Configuration ID.
    try {
      WebhookResponse result = apiInstance.webhooksGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookConfigurationApi#webhooksGet");
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
 **id** | **Integer**| The Webhook Configuration ID. |

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns the webhook configuration. |  -  |
**0** | Unexpected error |  -  |

<a name="webhooksGetMany"></a>
# **webhooksGetMany**
> List&lt;WebhookResponse&gt; webhooksGetMany()

Retrieve a list of Webhook Configurations.

Retrieves a list of webhook configurations available to your LILT organization. Use this to manage your webhook configurations. 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.WebhookConfigurationApi;

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

    WebhookConfigurationApi apiInstance = new WebhookConfigurationApi(defaultClient);
    try {
      List<WebhookResponse> result = apiInstance.webhooksGetMany();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookConfigurationApi#webhooksGetMany");
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

[**List&lt;WebhookResponse&gt;**](WebhookResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The webhook configurations response. |  -  |
**0** | Unexpected error |  -  |

<a name="webhooksUpdate"></a>
# **webhooksUpdate**
> WebhookResponse webhooksUpdate(id, inlineObject)

Update a specific Webhook Configuration by ID.

Updates a specific webhook configuration by its ID. Only the fields that are provided in the request body will be updated. 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.WebhookConfigurationApi;

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

    WebhookConfigurationApi apiInstance = new WebhookConfigurationApi(defaultClient);
    Integer id = 12345; // Integer | The Webhook Configuration ID.
    InlineObject inlineObject = new InlineObject(); // InlineObject | 
    try {
      WebhookResponse result = apiInstance.webhooksUpdate(id, inlineObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookConfigurationApi#webhooksUpdate");
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
 **id** | **Integer**| The Webhook Configuration ID. |
 **inlineObject** | [**InlineObject**](InlineObject.md)|  |

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns the updated webhook configuration. |  -  |
**0** | Unexpected error |  -  |

