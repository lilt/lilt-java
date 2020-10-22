# ProjectsApi

All URIs are relative to *https://lilt.com/2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProject**](ProjectsApi.md#createProject) | **POST** /projects | Create a Project
[**deleteProject**](ProjectsApi.md#deleteProject) | **DELETE** /projects | Delete a Project
[**getProjectReport**](ProjectsApi.md#getProjectReport) | **GET** /projects/quote | Retrieve Project report
[**getProjectStatus**](ProjectsApi.md#getProjectStatus) | **GET** /projects/status | Retrieve Project status
[**getProjects**](ProjectsApi.md#getProjects) | **GET** /projects | Retrieve a Project
[**updateProject**](ProjectsApi.md#updateProject) | **PUT** /projects | Update a Project


<a name="createProject"></a>
# **createProject**
> Project createProject(body)

Create a Project

Create a Project. A Project is a collection of Documents.  A Project is associated with exactly one Memory.  Projects appear in the dashboard of the web app.  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.ProjectsApi;

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

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    ProjectCreateParameters body = new ProjectCreateParameters(); // ProjectCreateParameters | 
    try {
      Project result = apiInstance.createProject(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#createProject");
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
 **body** | [**ProjectCreateParameters**](ProjectCreateParameters.md)|  |

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A Project object. |  -  |
**0** | Unexpected error |  -  |

<a name="deleteProject"></a>
# **deleteProject**
> ProjectDeleteResponse deleteProject(id)

Delete a Project

Delete a Project. 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.ProjectsApi;

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

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    Integer id = 56; // Integer | A unique Project identifier.
    try {
      ProjectDeleteResponse result = apiInstance.deleteProject(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#deleteProject");
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
 **id** | **Integer**| A unique Project identifier. | [optional]

### Return type

[**ProjectDeleteResponse**](ProjectDeleteResponse.md)

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

<a name="getProjectReport"></a>
# **getProjectReport**
> ProjectQuote getProjectReport(id)

Retrieve Project report

Get information about a project that can be used for quoting. This includes: * A translation memory leverage report * Word count * Segment count  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.ProjectsApi;

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

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    Integer id = 56; // Integer | A unique Project identifier.
    try {
      ProjectQuote result = apiInstance.getProjectReport(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getProjectReport");
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
 **id** | **Integer**| A unique Project identifier. |

### Return type

[**ProjectQuote**](ProjectQuote.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An object that represents a Project quote. |  -  |
**0** | Unexpected error |  -  |

<a name="getProjectStatus"></a>
# **getProjectStatus**
> ProjectStatus getProjectStatus(id)

Retrieve Project status

Retrieve the status of a Project.  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.ProjectsApi;

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

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    Integer id = 56; // Integer | A unique Project identifier.
    try {
      ProjectStatus result = apiInstance.getProjectStatus(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getProjectStatus");
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
 **id** | **Integer**| A unique Project identifier. |

### Return type

[**ProjectStatus**](ProjectStatus.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An object that represents a Project status report. |  -  |
**0** | Unexpected error |  -  |

<a name="getProjects"></a>
# **getProjects**
> List&lt;Project&gt; getProjects(id, srclang, trglang, fromTime, toTime, state, archived, connectorId)

Retrieve a Project

Retrieves one or more projects, including the documents associated with each project. Retrieving a project is the most efficient way to retrieve a single project or a list of all available projects.  To retrieve a specific project, specify the &#x60;id&#x60; request parameter. To retrieve all projects, omit the &#x60;id&#x60; request parameter. To limit the retrieved projects to those with a particular source language or target language, specify the corresponding ISO 639-1 language codes in the &#x60;srclang&#x60; and &#x60;trglang&#x60; request parameters, respectively.

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.ProjectsApi;

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

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    Integer id = 56; // Integer | A unique Project identifier.
    String srclang = "srclang_example"; // String | An ISO 639-1 language code.
    String trglang = "trglang_example"; // String | An ISO 639-1 language code.
    Integer fromTime = 56; // Integer | Unix time stamp (epoch, in seconds) of Projects with `created_at` greater than or equal to the value.
    Integer toTime = 56; // Integer | Unix time stamp (epoch, in seconds) of Projects with `created_at` less than the value.
    String state = "state_example"; // String | A project state (backlog, inProgress, inReview, inQA, done).
    Boolean archived = true; // Boolean | A flag that toggles whether to include archived projects in the response (the default is `true`).
    Integer connectorId = 56; // Integer | A unique Connector identifier.
    try {
      List<Project> result = apiInstance.getProjects(id, srclang, trglang, fromTime, toTime, state, archived, connectorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getProjects");
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
 **id** | **Integer**| A unique Project identifier. | [optional]
 **srclang** | **String**| An ISO 639-1 language code. | [optional]
 **trglang** | **String**| An ISO 639-1 language code. | [optional]
 **fromTime** | **Integer**| Unix time stamp (epoch, in seconds) of Projects with &#x60;created_at&#x60; greater than or equal to the value. | [optional]
 **toTime** | **Integer**| Unix time stamp (epoch, in seconds) of Projects with &#x60;created_at&#x60; less than the value. | [optional]
 **state** | **String**| A project state (backlog, inProgress, inReview, inQA, done). | [optional]
 **archived** | **Boolean**| A flag that toggles whether to include archived projects in the response (the default is &#x60;true&#x60;). | [optional]
 **connectorId** | **Integer**| A unique Connector identifier. | [optional]

### Return type

[**List&lt;Project&gt;**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of Project objects. |  -  |
**0** | Unexpected error |  -  |

<a name="updateProject"></a>
# **updateProject**
> Project updateProject(body)

Update a Project

Update a Project. 

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.ProjectsApi;

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

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    ProjectUpdateResponse body = new ProjectUpdateResponse(); // ProjectUpdateResponse | 
    try {
      Project result = apiInstance.updateProject(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#updateProject");
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
 **body** | [**ProjectUpdateResponse**](ProjectUpdateResponse.md)|  |

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A Project object. |  -  |
**0** | Unexpected error |  -  |

