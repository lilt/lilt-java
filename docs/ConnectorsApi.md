# ConnectorsApi

All URIs are relative to *https://lilt.com/2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConnector**](ConnectorsApi.md#createConnector) | **POST** /connectors | Upload a Connector
[**deleteConnector**](ConnectorsApi.md#deleteConnector) | **DELETE** /connectors | Delete a Connector
[**getConnectors**](ConnectorsApi.md#getConnectors) | **GET** /connectors | Retrieve a Connector
[**updateConnector**](ConnectorsApi.md#updateConnector) | **PUT** /connectors | Upload a Connector


<a name="createConnector"></a>
# **createConnector**
> Connector createConnector(body)

Upload a Connector

Create a new connector linked to a supported external cms. 

### Example
```java
// Import classes:
import com.lilt.ApiClient;
import com.lilt.ApiException;
import com.lilt.Configuration;
import com.lilt.auth.*;
import com.lilt.models.*;
import com.lilt.api.ConnectorsApi;

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

    ConnectorsApi apiInstance = new ConnectorsApi(defaultClient);
    Connector1 body = new Connector1(); // Connector1 | 
    try {
      Connector result = apiInstance.createConnector(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorsApi#createConnector");
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
 **body** | [**Connector1**](Connector1.md)|  |

### Return type

[**Connector**](Connector.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A Connector object. |  -  |
**0** | Unexpected error |  -  |

<a name="deleteConnector"></a>
# **deleteConnector**
> ConnectorDeleteResponse deleteConnector(id)

Delete a Connector

Delete a Connector.  Example CURL command: &#x60;&#x60;&#x60;   curl -X DELETE https://lilt.com/2/connectors?key&#x3D;API_KEY&amp;id&#x3D;123 &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
import com.lilt.ApiClient;
import com.lilt.ApiException;
import com.lilt.Configuration;
import com.lilt.auth.*;
import com.lilt.models.*;
import com.lilt.api.ConnectorsApi;

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

    ConnectorsApi apiInstance = new ConnectorsApi(defaultClient);
    Integer id = 56; // Integer | A unique Connector identifier.
    try {
      ConnectorDeleteResponse result = apiInstance.deleteConnector(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorsApi#deleteConnector");
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
 **id** | **Integer**| A unique Connector identifier. |

### Return type

[**ConnectorDeleteResponse**](ConnectorDeleteResponse.md)

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

<a name="getConnectors"></a>
# **getConnectors**
> Connector getConnectors(id)

Retrieve a Connector

Retrieves one or more connectors available to your user. Connectors are not associated with a project or a memory.  To retrieve a specific connector, specify the &lt;strong&gt;id&lt;/strong&gt; request parameter. To retrieve all connectors, omit the &lt;strong&gt;id&lt;/strong&gt; request parameter.  Example cURL command: &#x60;&#x60;&#x60;  curl -X GET https://lilt.com/2/connectors?key&#x3D;API_KEY&amp;id&#x3D;274&#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.lilt.ApiClient;
import com.lilt.ApiException;
import com.lilt.Configuration;
import com.lilt.auth.*;
import com.lilt.models.*;
import com.lilt.api.ConnectorsApi;

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

    ConnectorsApi apiInstance = new ConnectorsApi(defaultClient);
    Integer id = 56; // Integer | A unique Connector identifier.
    try {
      Connector result = apiInstance.getConnectors(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorsApi#getConnectors");
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
 **id** | **Integer**| A unique Connector identifier. | [optional]

### Return type

[**Connector**](Connector.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A connector. |  -  |
**403** | Unauthorized. |  -  |
**410** | Connector deleted. |  -  |
**0** | Unexpected error. |  -  |

<a name="updateConnector"></a>
# **updateConnector**
> Connector updateConnector(body)

Upload a Connector

Create a new connector linked to a supported external content source. 

### Example
```java
// Import classes:
import com.lilt.ApiClient;
import com.lilt.ApiException;
import com.lilt.Configuration;
import com.lilt.auth.*;
import com.lilt.models.*;
import com.lilt.api.ConnectorsApi;

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

    ConnectorsApi apiInstance = new ConnectorsApi(defaultClient);
    Connector body = new Connector(); // Connector | 
    try {
      Connector result = apiInstance.updateConnector(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorsApi#updateConnector");
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
 **body** | [**Connector**](Connector.md)|  |

### Return type

[**Connector**](Connector.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A Connector object. |  -  |
**0** | Unexpected error |  -  |

