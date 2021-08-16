# SettingsApi

All URIs are relative to *https://lilt.com/2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOrganizationSettings**](SettingsApi.md#getOrganizationSettings) | **GET** /settings/organization | Update or create a setting
[**getProjectSettings**](SettingsApi.md#getProjectSettings) | **GET** /settings/project/{projectId} | Get settings for a project
[**getUserSettings**](SettingsApi.md#getUserSettings) | **GET** /settings/user | Get settings for a project
[**upsertSetting**](SettingsApi.md#upsertSetting) | **POST** /settings | Get organization-level settings


<a name="getOrganizationSettings"></a>
# **getOrganizationSettings**
> SettingDictionary getOrganizationSettings()

Update or create a setting

Get the organization-level settings for the active users organization  Example CURL:  &#x60;&#x60;&#x60; curl --location --request GET &#39;https://lilt.com/2/settings/organization?key&#x3D;&lt;API_KEY&gt;&#39; \\ &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.SettingsApi;

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

    SettingsApi apiInstance = new SettingsApi(defaultClient);
    try {
      SettingDictionary result = apiInstance.getOrganizationSettings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingsApi#getOrganizationSettings");
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

[**SettingDictionary**](SettingDictionary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Organization settings dictionary. |  -  |
**0** | Unexpected error |  -  |

<a name="getProjectSettings"></a>
# **getProjectSettings**
> SettingDictionary getProjectSettings(projectId)

Get settings for a project

Get the settings as applied to a specific project.  Active settings will combine project-level settings, organization-level settings and fallback to setting default values.  Example CURL:  &#x60;&#x60;&#x60; curl --location --request GET &#39;https://lilt.com/2/settings/project/123?key&#x3D;&lt;API_KEY&gt;&#39; \\ &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.SettingsApi;

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

    SettingsApi apiInstance = new SettingsApi(defaultClient);
    Integer projectId = 56; // Integer | A project id.
    try {
      SettingDictionary result = apiInstance.getProjectSettings(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingsApi#getProjectSettings");
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
 **projectId** | **Integer**| A project id. |

### Return type

[**SettingDictionary**](SettingDictionary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project settings dictionary. |  -  |
**0** | Unexpected error |  -  |

<a name="getUserSettings"></a>
# **getUserSettings**
> SettingDictionary getUserSettings()

Get settings for a project

Get the active settings applied to a user.  Example CURL:  &#x60;&#x60;&#x60; curl --location --request GET &#39;https://lilt.com/2/settings/user?key&#x3D;&lt;API_KEY&gt;&#39; \\ &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.SettingsApi;

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

    SettingsApi apiInstance = new SettingsApi(defaultClient);
    try {
      SettingDictionary result = apiInstance.getUserSettings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingsApi#getUserSettings");
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

[**SettingDictionary**](SettingDictionary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project settings dictionary. |  -  |
**0** | Unexpected error |  -  |

<a name="upsertSetting"></a>
# **upsertSetting**
> Object upsertSetting(body)

Get organization-level settings

Create or update the value for the given setting and setting scope.  Example CURL to set an organization-level setting:  &#x60;&#x60;&#x60; curl --location --request POST &#39;https://lilt.com/2/settings?key&#x3D;&lt;API_KEY&gt;&#39; \\ --header &#39;Content-Type: application/json&#39; \\ --data-raw &#39;{     \&quot;settingName\&quot;: \&quot;requireBatchQaTranslator\&quot;,     \&quot;value\&quot;: false,     \&quot;organizationId\&quot;: 285,     \&quot;scope\&quot;: \&quot;Organization\&quot; }&#39; &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.SettingsApi;

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

    SettingsApi apiInstance = new SettingsApi(defaultClient);
    Object body = null; // Object | 
    try {
      Object result = apiInstance.upsertSetting(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SettingsApi#upsertSetting");
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
 **body** | **Object**|  | [optional]

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
**200** | Updated settings object and updated active settings. |  -  |
**0** | Unexpected error |  -  |

