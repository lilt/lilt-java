# JobsApi

All URIs are relative to *https://api.lilt.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archiveJob**](JobsApi.md#archiveJob) | **POST** /v2/jobs/{jobId}/archive | Archive a Job
[**createJob**](JobsApi.md#createJob) | **POST** /v2/jobs | Create a Job
[**deleteJob**](JobsApi.md#deleteJob) | **DELETE** /v2/jobs/{jobId} | Delete a Job
[**deliverJob**](JobsApi.md#deliverJob) | **POST** /v2/jobs/{jobId}/deliver | Deliver a Job
[**downloadJob**](JobsApi.md#downloadJob) | **GET** /v2/jobs/{jobId}/download | Download a Job
[**exportJob**](JobsApi.md#exportJob) | **GET** /v2/jobs/{jobId}/export | Export a Job
[**getJob**](JobsApi.md#getJob) | **GET** /v2/jobs/{jobId} | Retrieve a Job
[**getJobLeverageStats**](JobsApi.md#getJobLeverageStats) | **POST** /v2/jobs/{jobId}/stats | Retrieve Job Leverage Stats
[**reactivateJob**](JobsApi.md#reactivateJob) | **POST** /v2/jobs/{jobId}/reactivate | Reactivate a Job
[**retrieveAllJobs**](JobsApi.md#retrieveAllJobs) | **GET** /v2/jobs | Retrieve all Jobs
[**unarchiveJob**](JobsApi.md#unarchiveJob) | **POST** /v2/jobs/{jobId}/unarchive | Unarchive a Job
[**updateJob**](JobsApi.md#updateJob) | **PUT** /v2/jobs/{jobId} | Update a Job


<a name="archiveJob"></a>
# **archiveJob**
> Job archiveJob(jobId)

Archive a Job

Set job to archived, unassign all linguists and archive all projects and documents inside the job.  It will return the archived job.  Example CURL command:  &#x60;&#x60;&#x60;bash curl -X POST &#39;https://api.lilt.com/v2/jobs/{id}/archive?key&#x3D;API_KEY&#39; &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.JobsApi;

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

    JobsApi apiInstance = new JobsApi(defaultClient);
    Integer jobId = 56; // Integer | A job id.
    try {
      Job result = apiInstance.archiveJob(jobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#archiveJob");
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
 **jobId** | **Integer**| A job id. |

### Return type

[**Job**](Job.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A job object. |  -  |
**401** | Unauthorized |  -  |
**0** | Unexpected error |  -  |

<a name="createJob"></a>
# **createJob**
> Job createJob(body)

Create a Job

Create a Job. A Job is a collection of Projects. A Job will contain multiple projects, based on the language pair. A Project is associated with exactly one Memory.  Jobs appear in the Jobs dashboard of the web app.  Example CURL command:  &#x60;&#x60;&#x60;bash curl -X POST &#39;https://api.lilt.com/v2/jobs?key&#x3D;API_KEY&#39; \\ --header &#39;Content-Type: application/json&#39; \\ --data-raw &#39;{   \&quot;name\&quot;: \&quot;test job\&quot;,   \&quot;fileIds\&quot;: [5009, 5010, 5011],   \&quot;due\&quot;: \&quot;2022-05-05T10:56:44.985Z\&quot;,   \&quot;srcLang\&quot;: \&quot;en\&quot;,   \&quot;srcLocale\&quot;: \&quot;US\&quot;,   \&quot;languagePairs\&quot;: [       { \&quot;memoryId\&quot;: 3121, \&quot;trgLang\&quot;: \&quot;de\&quot; },       { \&quot;memoryId\&quot;: 2508, \&quot;trgLang\&quot;: \&quot;fr\&quot; },       { \&quot;memoryId\&quot;: 3037, \&quot;trgLang\&quot;: \&quot;zh\&quot; }     ] }&#39; &#x60;&#x60;&#x60;  

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.JobsApi;

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

    JobsApi apiInstance = new JobsApi(defaultClient);
    JobCreateParameters body = new JobCreateParameters(); // JobCreateParameters | 
    try {
      Job result = apiInstance.createJob(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#createJob");
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
 **body** | [**JobCreateParameters**](JobCreateParameters.md)|  |

### Return type

[**Job**](Job.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/octet-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A Job object. |  -  |
**401** | Unauthorized |  -  |
**0** | Unexpected error |  -  |

<a name="deleteJob"></a>
# **deleteJob**
> JobDeleteResponse deleteJob(jobId)

Delete a Job

Delete a job, deletes all projects and documents in the job, deletes all the segments from all the job&#39;s translation memories.  Example CURL command:  &#x60;&#x60;&#x60;bash curl -X DELETE &#39;https://api.lilt.com/v2/jobs/{id}?key&#x3D;API_KEY&#39; &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.JobsApi;

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

    JobsApi apiInstance = new JobsApi(defaultClient);
    Integer jobId = 56; // Integer | A job id.
    try {
      JobDeleteResponse result = apiInstance.deleteJob(jobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#deleteJob");
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
 **jobId** | **Integer**| A job id. |

### Return type

[**JobDeleteResponse**](JobDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A status object. |  -  |
**401** | Unauthorized |  -  |
**0** | Unexpected error |  -  |

<a name="deliverJob"></a>
# **deliverJob**
> Job deliverJob(jobId)

Deliver a Job

Set the job state to delivered and set all the projects in the job to done  It will return the delivered job.  Example CURL command:  &#x60;&#x60;&#x60;bash curl -X POST &#39;https://api.lilt.com/v2/jobs/{id}/deliver?key&#x3D;API_KEY&#39; &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.JobsApi;

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

    JobsApi apiInstance = new JobsApi(defaultClient);
    Integer jobId = 56; // Integer | A job id.
    try {
      Job result = apiInstance.deliverJob(jobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#deliverJob");
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
 **jobId** | **Integer**| A job id. |

### Return type

[**Job**](Job.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A job object. |  -  |
**401** | Unauthorized |  -  |
**0** | Unexpected error |  -  |

<a name="downloadJob"></a>
# **downloadJob**
> byte[] downloadJob(jobId)

Download a Job

Make sure you have exported a job with the same id before using this api.  Downloading files requires the exported job &#x60;id&#x60; in the param.  Example CURL command:  &#x60;&#x60;&#x60;bash curl -X GET &#39;https://api.lilt.com/v2/jobs/{id}/download?key&#x3D;API_KEY&#39; &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.JobsApi;

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

    JobsApi apiInstance = new JobsApi(defaultClient);
    Integer jobId = 56; // Integer | A job id.
    try {
      byte[] result = apiInstance.downloadJob(jobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#downloadJob");
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
 **jobId** | **Integer**| A job id. |

### Return type

**byte[]**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | zipped file |  -  |
**401** | Unauthorized |  -  |
**0** | Unexpected error |  -  |

<a name="exportJob"></a>
# **exportJob**
> exportJob(jobId, type)

Export a Job

Prepare job files for download. To export translated documents from the job use the query parameter &#x60;type&#x3D;files&#x60;:  Example CURL command:  &#x60;&#x60;&#x60;bash curl -X GET &#39;https://api.lilt.com/v2/jobs/{id}/export?key&#x3D;API_KEY&amp;type&#x3D;files&#39; &#x60;&#x60;&#x60;  To export job memories use the query parameter &#x60;type&#x3D;memory&#x60;.  The status of the export can be checked by requesting the job &#x60;GET /jobs/:jobId&#x60;, &#x60;job.isProcessing&#x60; will be &#x60;1&#x60; while in progress, &#x60;0&#x60; when idle and &#x60;-2&#x60; when the export failed.

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.JobsApi;

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

    JobsApi apiInstance = new JobsApi(defaultClient);
    Integer jobId = 56; // Integer | A job id.
    String type = "type_example"; // String | category for files and memory.
    try {
      apiInstance.exportJob(jobId, type);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#exportJob");
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
 **jobId** | **Integer**| A job id. |
 **type** | **String**| category for files and memory. |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 200 status. |  -  |
**401** | Unauthorized |  -  |
**0** | Unexpected error |  -  |

<a name="getJob"></a>
# **getJob**
> Job getJob(jobId)

Retrieve a Job

Retrieves a job data along with stats. To retrieve a specific job, you will need the job &#x60;id&#x60; in the url path.  Example CURL command:  &#x60;&#x60;&#x60;bash curl -X GET &#39;https://api.lilt.com/v2/jobs/{id}?key&#x3D;API_KEY&#39; &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.JobsApi;

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

    JobsApi apiInstance = new JobsApi(defaultClient);
    Integer jobId = 56; // Integer | A job id.
    try {
      Job result = apiInstance.getJob(jobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#getJob");
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
 **jobId** | **Integer**| A job id. |

### Return type

[**Job**](Job.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A job object. |  -  |
**401** | Unauthorized |  -  |
**0** | Unexpected error |  -  |

<a name="getJobLeverageStats"></a>
# **getJobLeverageStats**
> JobLeverageStats getJobLeverageStats(jobId)

Retrieve Job Leverage Stats

Get the TM leverage stats for the job (new/exact/fuzzy matches).  Example CURL command:  &#x60;&#x60;&#x60;bash curl -X POST &#39;https://api.lilt.com/v2/jobs/{id}/stats?key&#x3D;API_KEY&#39; &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.JobsApi;

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

    JobsApi apiInstance = new JobsApi(defaultClient);
    Integer jobId = 56; // Integer | A job id.
    try {
      JobLeverageStats result = apiInstance.getJobLeverageStats(jobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#getJobLeverageStats");
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
 **jobId** | **Integer**| A job id. |

### Return type

[**JobLeverageStats**](JobLeverageStats.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A job leverage stats object. |  -  |
**401** | Unauthorized |  -  |
**0** | Unexpected error |  -  |

<a name="reactivateJob"></a>
# **reactivateJob**
> Job reactivateJob(jobId)

Reactivate a Job

Set the job state to active. Does not change the state of projects associated with the given job.  It will return the reactivated job.  Example CURL command:  &#x60;&#x60;&#x60;bash curl -X POST &#39;https://api.lilt.com/v2/jobs/{id}/reactivate?key&#x3D;API_KEY&#39; &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.JobsApi;

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

    JobsApi apiInstance = new JobsApi(defaultClient);
    Integer jobId = 56; // Integer | A job id.
    try {
      Job result = apiInstance.reactivateJob(jobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#reactivateJob");
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
 **jobId** | **Integer**| A job id. |

### Return type

[**Job**](Job.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A job object. |  -  |
**401** | Unauthorized |  -  |
**0** | Unexpected error |  -  |

<a name="retrieveAllJobs"></a>
# **retrieveAllJobs**
> List&lt;Job&gt; retrieveAllJobs(isArchived, isDelivered, offset, limit)

Retrieve all Jobs

Get all Jobs within a given offset and limit. You can retrieve jobs from your account using the above API.  Example CURL command:  &#x60;&#x60;&#x60;bash curl -X GET &#39;https://api.lilt.com/v2/jobs?key&#x3D;API_KEY&amp;isArchived&#x3D;false&#39; &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.JobsApi;

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

    JobsApi apiInstance = new JobsApi(defaultClient);
    Boolean isArchived = true; // Boolean | Retrieves all jobs that are archived.
    Boolean isDelivered = true; // Boolean | Retrieves all jobs that are delivered.
    Integer offset = 56; // Integer | Return jobs starting at the offset row. If not given the default offset will be 0.
    Integer limit = 56; // Integer | The maximum number of jobs to be returned. If not given the default limit will be 25.
    try {
      List<Job> result = apiInstance.retrieveAllJobs(isArchived, isDelivered, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#retrieveAllJobs");
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
 **isArchived** | **Boolean**| Retrieves all jobs that are archived. | [optional]
 **isDelivered** | **Boolean**| Retrieves all jobs that are delivered. | [optional]
 **offset** | **Integer**| Return jobs starting at the offset row. If not given the default offset will be 0. | [optional]
 **limit** | **Integer**| The maximum number of jobs to be returned. If not given the default limit will be 25. | [optional]

### Return type

[**List&lt;Job&gt;**](Job.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of Job objects. |  -  |
**401** | Unauthorized |  -  |
**0** | Unexpected error |  -  |

<a name="unarchiveJob"></a>
# **unarchiveJob**
> Job unarchiveJob(jobId)

Unarchive a Job

Set job to unarchived, the job will move to active status.  Example CURL command:  &#x60;&#x60;&#x60;bash curl -X POST &#39;https://api.lilt.com/v2/jobs/{id}/unarchive?key&#x3D;API_KEY&#39; &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.JobsApi;

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

    JobsApi apiInstance = new JobsApi(defaultClient);
    Integer jobId = 56; // Integer | A job id.
    try {
      Job result = apiInstance.unarchiveJob(jobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#unarchiveJob");
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
 **jobId** | **Integer**| A job id. |

### Return type

[**Job**](Job.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A job object. |  -  |
**401** | Unauthorized |  -  |
**0** | Unexpected error |  -  |

<a name="updateJob"></a>
# **updateJob**
> Job updateJob(jobId, body)

Update a Job

Updates a job with the new job properties. To update a specific job, you will need the job &#x60;id&#x60; in the url path.  You can update job&#39;s name and due date by passing the property and new value in the body.  Example CURL command:  &#x60;&#x60;&#x60;bash curl -X PUT &#39;https://api.lilt.com/v2/jobs/{id}?key&#x3D;API_KEY&#39; \\ --header &#39;Content-Type: application/json&#39; \\ --data-raw &#39;{   \&quot;name\&quot;: \&quot;test job\&quot;,   \&quot;due\&quot;: \&quot;2022-05-05T10:56:44.985Z\&quot; }&#39; &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.JobsApi;

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

    JobsApi apiInstance = new JobsApi(defaultClient);
    Integer jobId = 56; // Integer | A job id.
    JobUpdateParameters body = new JobUpdateParameters(); // JobUpdateParameters | 
    try {
      Job result = apiInstance.updateJob(jobId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#updateJob");
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
 **jobId** | **Integer**| A job id. |
 **body** | [**JobUpdateParameters**](JobUpdateParameters.md)|  | [optional]

### Return type

[**Job**](Job.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/octet-stream, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A job object. |  -  |
**401** | Unauthorized |  -  |
**0** | Unexpected error |  -  |

