# WorkflowsApi

All URIs are relative to *https://lilt.com/2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advanceWorkflowStage**](WorkflowsApi.md#advanceWorkflowStage) | **POST** /document/{documentId}/task/{taskId}/advance | Advance workflow to the next stage
[**getDocumentWorkflow**](WorkflowsApi.md#getDocumentWorkflow) | **GET** /workflows/document/{documentId} | Retrieve document Workflow metadata
[**getWorkflowTemplates**](WorkflowsApi.md#getWorkflowTemplates) | **GET** /workflows/templates | Retrieve workflow templates
[**rejectWorkflowStage**](WorkflowsApi.md#rejectWorkflowStage) | **POST** /document/{documentId}/task/{taskId}/reject | Move workflow to the previous stage
[**setDocumentStage**](WorkflowsApi.md#setDocumentStage) | **PUT** /workflows/{documentId}/stage | Set Workflow stage for a document


<a name="advanceWorkflowStage"></a>
# **advanceWorkflowStage**
> NextWorkflowTask advanceWorkflowStage(documentId, taskId)

Advance workflow to the next stage

Advance a workflow to the next stage and mark current workflow task as complete.  Example CURL: &#x60;&#x60;&#x60; curl --X --request POST &#39;https://lilt.com/2/workflows/document/{documentId}/task/{taskId}/advance?key&#x3D;API_KEY&#39; &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.WorkflowsApi;

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

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    Integer documentId = 56; // Integer | A document id.
    Integer taskId = 56; // Integer | The task id of the current workflow stage.
    try {
      NextWorkflowTask result = apiInstance.advanceWorkflowStage(documentId, taskId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#advanceWorkflowStage");
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
 **documentId** | **Integer**| A document id. |
 **taskId** | **Integer**| The task id of the current workflow stage. |

### Return type

[**NextWorkflowTask**](NextWorkflowTask.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An object with a documents next task Workflow metadata. |  -  |

<a name="getDocumentWorkflow"></a>
# **getDocumentWorkflow**
> DocumentWorkflow getDocumentWorkflow(documentId)

Retrieve document Workflow metadata

Get Workflow metadata related to a document. This is useful for gathering information about the current Workflow stage of a document.  Example CURL: &#x60;&#x60;&#x60; curl --X --request GET &#39;https://lilt.com/2/workflows/document/{documentId}?key&#x3D;API_KEY&#39; &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.WorkflowsApi;

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

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    Integer documentId = 56; // Integer | A document id.
    try {
      DocumentWorkflow result = apiInstance.getDocumentWorkflow(documentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#getDocumentWorkflow");
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
 **documentId** | **Integer**| A document id. |

### Return type

[**DocumentWorkflow**](DocumentWorkflow.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An object with document Workflow metadata. |  -  |

<a name="getWorkflowTemplates"></a>
# **getWorkflowTemplates**
> List&lt;WorkflowTemplate&gt; getWorkflowTemplates()

Retrieve workflow templates

Get all the possible Workflow Templates owned by the team. Useful for retrieving the ids corresponding to each workflow tables, and passing them to subsequent requests, for example, creating a new Job with a specific Workflow.  Example CURL: &#x60;&#x60;&#x60; curl --X --request GET &#39;https://lilt.com/2/workflows/templates?key&#x3D;API_KEY&#39; &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.WorkflowsApi;

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

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    try {
      List<WorkflowTemplate> result = apiInstance.getWorkflowTemplates();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#getWorkflowTemplates");
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

[**List&lt;WorkflowTemplate&gt;**](WorkflowTemplate.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An array with a team&#39;s available WorkflowTemplates. |  -  |

<a name="rejectWorkflowStage"></a>
# **rejectWorkflowStage**
> NextWorkflowTask rejectWorkflowStage(documentId, taskId)

Move workflow to the previous stage

Move a workflow to the previous stage and mark current workflow task as rejected.  Example CURL: &#x60;&#x60;&#x60; curl --X --request POST &#39;https://lilt.com/2/workflows/document/{documentId}/task/{taskId}/reject?key&#x3D;API_KEY&#39; &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.WorkflowsApi;

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

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    Integer documentId = 56; // Integer | A document id.
    Integer taskId = 56; // Integer | The task id of the current workflow stage.
    try {
      NextWorkflowTask result = apiInstance.rejectWorkflowStage(documentId, taskId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#rejectWorkflowStage");
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
 **documentId** | **Integer**| A document id. |
 **taskId** | **Integer**| The task id of the current workflow stage. |

### Return type

[**NextWorkflowTask**](NextWorkflowTask.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An object with a documents next task Workflow metadata. |  -  |

<a name="setDocumentStage"></a>
# **setDocumentStage**
> NextWorkflowTask setDocumentStage(documentId, workflowStageId)

Set Workflow stage for a document

Set the Workflow stage for a document. You can find the stage information required for this request from the \&quot;Retrieve document Workflow metadata\&quot; endpoint.  Example CURL: &#x60;&#x60;&#x60; curl --X --request PUT &#39;https://lilt.com/2/workflows/document/{documentId}/stage?key&#x3D;API_KEY&#39; \\ --header &#39;Content-Type: application/json&#39; \\ --data-raw &#39;{   \&quot;workflowStageId\&quot;: {workflowStageId} }&#39; &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.WorkflowsApi;

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

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    Integer documentId = 56; // Integer | A document id.
    SetDocumentStageRequest workflowStageId = new SetDocumentStageRequest(); // SetDocumentStageRequest | 
    try {
      NextWorkflowTask result = apiInstance.setDocumentStage(documentId, workflowStageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#setDocumentStage");
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
 **documentId** | **Integer**| A document id. |
 **workflowStageId** | [**SetDocumentStageRequest**](SetDocumentStageRequest.md)|  | [optional]

### Return type

[**NextWorkflowTask**](NextWorkflowTask.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An object with a documents next task Workflow metadata. |  -  |

