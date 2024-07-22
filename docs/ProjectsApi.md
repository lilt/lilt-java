# ProjectsApi

All URIs are relative to *https://api.lilt.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProject**](ProjectsApi.md#createProject) | **POST** /v2/projects | Create a Project
[**deleteProject**](ProjectsApi.md#deleteProject) | **DELETE** /v2/projects | Delete a Project
[**getProjects**](ProjectsApi.md#getProjects) | **GET** /v2/projects | Retrieve a Project


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

<a name="getProjects"></a>
# **getProjects**
> List&lt;Project&gt; getProjects(id, srclang, trglang, fromTime, toTime, state, archived, connectorId)

Retrieve a Project

Retrieves one or more projects, including the documents associated with each project. Retrieving a project is the most efficient way to retrieve a single project, multiple projects or a list of all available projects.  To retrieve a specific project, specify the &#x60;id&#x60; request parameter or you can retrieve multiple projects by adding comma (,) between ids eg. &#x60;?id&#x3D;1234,5678&#x60;. To retrieve all projects, omit the &#x60;id&#x60; request parameter. To limit the retrieved projects to those with a particular source language or target language, specify the corresponding ISO 639-1 language codes in the &#x60;srclang&#x60; and &#x60;trglang&#x60; request parameters, respectively.

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

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    Integer id = 56; // Integer | A unique Project identifier. It can be a single id or multiple ids separated by a comma
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
 **id** | **Integer**| A unique Project identifier. It can be a single id or multiple ids separated by a comma | [optional]
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

