# WorkflowsApi

All URIs are relative to *https://api.lilt.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWorkflowTemplates**](WorkflowsApi.md#getWorkflowTemplates) | **GET** /v2/workflows/templates | Retrieve workflow templates


<a name="getWorkflowTemplates"></a>
# **getWorkflowTemplates**
> List&lt;WorkflowTemplate&gt; getWorkflowTemplates()

Retrieve workflow templates

Get all of the possible Workflow Templates owned by the team. Useful for retrieving the ids corresponding to each workflow tables, and passing them to subsequent requests, for example, creating a new Job with a specific Workflow. Example CURL: &#x60;&#x60;&#x60;bash curl -X GET &#39;https://api.lilt.com/v2/workflows/templates?key&#x3D;API_KEY&#39; &#x60;&#x60;&#x60; 

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

