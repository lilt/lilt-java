# ConverterConfigApi

All URIs are relative to *https://lilt.com/2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addConverterConfig**](ConverterConfigApi.md#addConverterConfig) | **PUT** /configs/converter | Add Converter Config
[**deleteConverterConfig**](ConverterConfigApi.md#deleteConverterConfig) | **DELETE** /configs/converter/{configId} | Delete Converter Config
[**deleteFilterMapping**](ConverterConfigApi.md#deleteFilterMapping) | **DELETE** /configs/converter/{configId}/{fileExtension} | Delete Filter Mapping
[**editFilterMapping**](ConverterConfigApi.md#editFilterMapping) | **PUT** /configs/converter/{configId}/{fileExtension} | Add Filter Mapping
[**getConverterConfigById**](ConverterConfigApi.md#getConverterConfigById) | **GET** /configs/converter/{configId} | Fetch Converter Config by Id
[**getConverterConfigs**](ConverterConfigApi.md#getConverterConfigs) | **GET** /configs/converter | List Converter Configs


<a name="addConverterConfig"></a>
# **addConverterConfig**
> ConverterConfigUpdateResponse addConverterConfig(organizationId, body)

Add Converter Config

Add a file filter configuration for your Organization. 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.ConverterConfigApi;

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

    ConverterConfigApi apiInstance = new ConverterConfigApi(defaultClient);
    Integer organizationId = 56; // Integer | A unique Organization identifier.
    CreateConverterConfigParameters body = new CreateConverterConfigParameters(); // CreateConverterConfigParameters | 
    try {
      ConverterConfigUpdateResponse result = apiInstance.addConverterConfig(organizationId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConverterConfigApi#addConverterConfig");
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
 **organizationId** | **Integer**| A unique Organization identifier. |
 **body** | [**CreateConverterConfigParameters**](CreateConverterConfigParameters.md)|  | [optional]

### Return type

[**ConverterConfigUpdateResponse**](ConverterConfigUpdateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The config id of the configuration created. |  -  |
**0** | Unexpected error |  -  |

<a name="deleteConverterConfig"></a>
# **deleteConverterConfig**
> InlineResponse200 deleteConverterConfig(configId)

Delete Converter Config

Delete a file filter configuration by id. 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.ConverterConfigApi;

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

    ConverterConfigApi apiInstance = new ConverterConfigApi(defaultClient);
    Integer configId = 56; // Integer | A unique configuration identifier.
    try {
      InlineResponse200 result = apiInstance.deleteConverterConfig(configId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConverterConfigApi#deleteConverterConfig");
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
 **configId** | **Integer**| A unique configuration identifier. |

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
**200** | The config id of the configuration deleted. |  -  |
**0** | Unexpected error |  -  |

<a name="deleteFilterMapping"></a>
# **deleteFilterMapping**
> Map&lt;String, String&gt; deleteFilterMapping(configId, fileExtension)

Delete Filter Mapping

Delete a file filter mapping by id and file extension. 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.ConverterConfigApi;

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

    ConverterConfigApi apiInstance = new ConverterConfigApi(defaultClient);
    Integer configId = 56; // Integer | A unique configuration identifier.
    String fileExtension = "fileExtension_example"; // String | A file extension to delete.
    try {
      Map<String, String> result = apiInstance.deleteFilterMapping(configId, fileExtension);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConverterConfigApi#deleteFilterMapping");
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
 **configId** | **Integer**| A unique configuration identifier. |
 **fileExtension** | **String**| A file extension to delete. |

### Return type

**Map&lt;String, String&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A map of config id to string escaped config json. |  -  |
**0** | Unexpected error |  -  |

<a name="editFilterMapping"></a>
# **editFilterMapping**
> Map&lt;String, String&gt; editFilterMapping(configId, fileExtension, body)

Add Filter Mapping

Add a specific filter mapping to your file filter configuration 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.ConverterConfigApi;

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

    ConverterConfigApi apiInstance = new ConverterConfigApi(defaultClient);
    Integer configId = 56; // Integer | A unique configuration identifier.
    String fileExtension = "fileExtension_example"; // String | A file extension for the filter mapping.
    EditFilterMappingParameters body = new EditFilterMappingParameters(); // EditFilterMappingParameters | 
    try {
      Map<String, String> result = apiInstance.editFilterMapping(configId, fileExtension, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConverterConfigApi#editFilterMapping");
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
 **configId** | **Integer**| A unique configuration identifier. |
 **fileExtension** | **String**| A file extension for the filter mapping. |
 **body** | [**EditFilterMappingParameters**](EditFilterMappingParameters.md)|  | [optional]

### Return type

**Map&lt;String, String&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A map of config id to string escaped config json. |  -  |
**0** | Unexpected error |  -  |

<a name="getConverterConfigById"></a>
# **getConverterConfigById**
> Map&lt;String, String&gt; getConverterConfigById(configId)

Fetch Converter Config by Id

Fetch a file filter configuration by id. 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.ConverterConfigApi;

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

    ConverterConfigApi apiInstance = new ConverterConfigApi(defaultClient);
    Integer configId = 56; // Integer | A unique configuration identifier.
    try {
      Map<String, String> result = apiInstance.getConverterConfigById(configId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConverterConfigApi#getConverterConfigById");
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
 **configId** | **Integer**| A unique configuration identifier. |

### Return type

**Map&lt;String, String&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A map of config id to string escaped config json. |  -  |
**0** | Unexpected error |  -  |

<a name="getConverterConfigs"></a>
# **getConverterConfigs**
> Map&lt;String, String&gt; getConverterConfigs(organizationId)

List Converter Configs

List all file filter configurations for your Organization. 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.ConverterConfigApi;

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

    ConverterConfigApi apiInstance = new ConverterConfigApi(defaultClient);
    Integer organizationId = 56; // Integer | A unique Organization identifier.
    try {
      Map<String, String> result = apiInstance.getConverterConfigs(organizationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConverterConfigApi#getConverterConfigs");
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
 **organizationId** | **Integer**| A unique Organization identifier. |

### Return type

**Map&lt;String, String&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A map of config id to string escaped config json. |  -  |
**0** | Unexpected error |  -  |

