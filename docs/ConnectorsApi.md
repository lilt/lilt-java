# ConnectorsApi

All URIs are relative to *https://lilt.com/2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConnector**](ConnectorsApi.md#createConnector) | **POST** /connectors | Upload a Connector
[**deleteConnector**](ConnectorsApi.md#deleteConnector) | **DELETE** /connectors | Delete a Connector
[**exportConnectorJob**](ConnectorsApi.md#exportConnectorJob) | **POST** /connectors/jobs/deliver | Deliver a Connector Job
[**getConnectorJobs**](ConnectorsApi.md#getConnectorJobs) | **GET** /connectors/jobs | Retrieve a Connector Job
[**getConnectors**](ConnectorsApi.md#getConnectors) | **GET** /connectors | Retrieve a Connector
[**syncConnector**](ConnectorsApi.md#syncConnector) | **POST** /connectors/sync | Sync a Connector
[**updateConnector**](ConnectorsApi.md#updateConnector) | **PUT** /connectors | Upload a Connector


<a name="createConnector"></a>
# **createConnector**
> Connector createConnector(body)

Upload a Connector

Create a new connector linked to a supported external cms. 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.ConnectorsApi;

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

<a name="deleteConnector"></a>
# **deleteConnector**
> ConnectorDeleteResponse deleteConnector(id)

Delete a Connector

Delete a Connector.  Example CURL command: &#x60;&#x60;&#x60;   curl -X DELETE https://lilt.com/2/connectors?key&#x3D;API_KEY&amp;id&#x3D;123 &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.ConnectorsApi;

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

<a name="exportConnectorJob"></a>
# **exportConnectorJob**
> exportConnectorJob(id)

Deliver a Connector Job

Request an export job for the given connector job ID. This will check Lilt for completed projects that are associated with this job and deliver them to the target system.  Example CURL command: &#x60;&#x60;&#x60;  curl -X POST https://lilt.com/2/connectors/jobs/deliver?key&#x3D;API_KEY&amp;id&#x3D;9274 &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.ConnectorsApi;

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
    Integer id = 56; // Integer | A unique Connector Job identifier.
    try {
      apiInstance.exportConnectorJob(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorsApi#exportConnectorJob");
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
 **id** | **Integer**| A unique Connector Job identifier. |

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
**200** | A success status code. |  -  |
**0** | Unexpected error |  -  |

<a name="getConnectorJobs"></a>
# **getConnectorJobs**
> List&lt;ConnectorJob&gt; getConnectorJobs(id)

Retrieve a Connector Job

Retrieves a connector job available to your user. Use this to check the status of jobs started by the &#x60;/connectors/sync&#x60; and &#x60;/connectors/jobs/deliver&#x60; endpoints.  Example CURL command: &#x60;&#x60;&#x60;  curl -X GET https://lilt.com/2/connectors/jobs?key&#x3D;API_KEY&amp;id&#x3D;9274 &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.ConnectorsApi;

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
    Integer id = 56; // Integer | A unique Connector Job identifier.
    try {
      List<ConnectorJob> result = apiInstance.getConnectorJobs(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorsApi#getConnectorJobs");
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
 **id** | **Integer**| A unique Connector Job identifier. |

### Return type

[**List&lt;ConnectorJob&gt;**](ConnectorJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of Connector Jobs. |  -  |
**0** | Unexpected error |  -  |

<a name="getConnectors"></a>
# **getConnectors**
> List&lt;Connector&gt; getConnectors(id)

Retrieve a Connector

Retrieves one or more connectors available to your user. Connectors are not associated with a project or a memory.  To retrieve a specific connector, specify the &lt;strong&gt;id&lt;/strong&gt; request parameter. To retrieve all connectors, omit the &lt;strong&gt;id&lt;/strong&gt; request parameter.  Example CURL command: &#x60;&#x60;&#x60;  curl -X GET https://lilt.com/2/connectors?key&#x3D;API_KEY&amp;id&#x3D;274&#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.ConnectorsApi;

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
      List<Connector> result = apiInstance.getConnectors(id);
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

[**List&lt;Connector&gt;**](Connector.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of Connectors. |  -  |
**403** | Unauthorized. |  -  |
**410** | Connector deleted. |  -  |
**0** | Unexpected error. |  -  |

<a name="syncConnector"></a>
# **syncConnector**
> ConnectorJob syncConnector(id)

Sync a Connector

Request an import job for the given connector ID. This will check the target system for new content to pull into Lilt.  Example CURL command: &#x60;&#x60;&#x60;  curl -X GET https://lilt.com/2/connectors/sync?key&#x3D;API_KEY&amp;id&#x3D;128 &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.ConnectorsApi;

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
      ConnectorJob result = apiInstance.syncConnector(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorsApi#syncConnector");
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

[**ConnectorJob**](ConnectorJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A Connector Job object. |  -  |
**0** | Unexpected error |  -  |

<a name="updateConnector"></a>
# **updateConnector**
> Connector updateConnector(body)

Upload a Connector

Create a new connector linked to a supported external content source. 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.ConnectorsApi;

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
    ConnectorArguments body = new ConnectorArguments(); // ConnectorArguments | 
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
 **body** | [**ConnectorArguments**](ConnectorArguments.md)|  |

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

