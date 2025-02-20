# lilt-java

Lilt REST API
- API version: v3.0.1
  - Build date: 2025-02-20T18:18:58.249Z[GMT]

Lilt REST API Support: https://lilt.atlassian.net/servicedesk/customer/portals   
The Lilt REST API enables programmatic access to the full-range of Lilt backend services including:
  * Training of and translating with interactive, adaptive machine translation
  * Large-scale translation memory
  * The Lexicon (a large-scale termbase)
  * Programmatic control of the Lilt CAT environment
  * Translation memory synchronization

Requests and responses are in JSON format. The REST API only responds to HTTPS / SSL requests. 
The base url for this REST API is `https://api.lilt.com/`.

## Authentication

Requests are authenticated via REST API key, which requires the Business plan.

Requests are authenticated using [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Add your REST API key as both the `username` and `password`.

For development, you may also pass the REST API key via the `key` query parameter. This is less secure than HTTP Basic Auth, and is not recommended for production use.

## Quotas

Our services have a general quota of 4000 requests per minute. Should you hit the maximum requests per minute, you will need to wait 60 seconds before you can send another request.



*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.lilt.client</groupId>
  <artifactId>lilt-java</artifactId>
  <version>v3.0.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.lilt.client:lilt-java:v3.0.1"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/lilt-java-v3.0.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.lilt.client.ApiClient;
import com.lilt.client.ApiException;
import com.lilt.client.Configuration;
import com.lilt.client.auth.*;
import com.lilt.client.models.*;
import com.lilt.client.api.CreateApi;

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

    CreateApi apiInstance = new CreateApi(defaultClient);
    Integer contentId = 56; // Integer | The content ID.
    try {
      InlineResponse200 result = apiInstance.deleteLiltCreateContent(contentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreateApi#deleteLiltCreateContent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.lilt.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CreateApi* | [**deleteLiltCreateContent**](docs/CreateApi.md#deleteLiltCreateContent) | **DELETE** /v2/create/{contentId} | Delete Lilt Create content
*CreateApi* | [**generateLiltCreateContent**](docs/CreateApi.md#generateLiltCreateContent) | **POST** /v2/create | Generate new Lilt Create content
*CreateApi* | [**getLiltCreateById**](docs/CreateApi.md#getLiltCreateById) | **GET** /v2/create/{contentId} | Get Lilt Create content by ID.
*CreateApi* | [**getLiltCreateContent**](docs/CreateApi.md#getLiltCreateContent) | **GET** /v2/create | Get Lilt Create content
*CreateApi* | [**getLiltCreatePreferences**](docs/CreateApi.md#getLiltCreatePreferences) | **GET** /v2/create/preferences | Get Lilt Create preferences
*CreateApi* | [**regenerateLiltCreateContent**](docs/CreateApi.md#regenerateLiltCreateContent) | **GET** /v2/create/{contentId}/create | Regenerate Lilt Create content
*CreateApi* | [**signLiltCreateTerms**](docs/CreateApi.md#signLiltCreateTerms) | **POST** /v2/create/terms-and-conditions | Sign the Lilt Create terms and conditions
*CreateApi* | [**updateLiltCreateContent**](docs/CreateApi.md#updateLiltCreateContent) | **PUT** /v2/create/{contentId} | Update Lilt Create content
*CreateApi* | [**updateLiltCreatePreferences**](docs/CreateApi.md#updateLiltCreatePreferences) | **PUT** /v2/create/preferences | Update Lilt Create preferences
*DocumentsApi* | [**downloadDocument**](docs/DocumentsApi.md#downloadDocument) | **GET** /v2/documents/files | Download a Document
*DocumentsApi* | [**uploadDocument**](docs/DocumentsApi.md#uploadDocument) | **POST** /v2/documents/files | Upload a File
*FilesApi* | [**addLabel**](docs/FilesApi.md#addLabel) | **POST** /v2/files/labels | Add Label to File
*FilesApi* | [**deleteFile**](docs/FilesApi.md#deleteFile) | **DELETE** /v2/files | Delete a File
*FilesApi* | [**download**](docs/FilesApi.md#download) | **GET** /v2/files/download | Download file
*FilesApi* | [**getFiles**](docs/FilesApi.md#getFiles) | **GET** /v2/files | Retrieve a File
*FilesApi* | [**removeLabel**](docs/FilesApi.md#removeLabel) | **DELETE** /v2/files/labels | Remove Label from File
*FilesApi* | [**uploadFile**](docs/FilesApi.md#uploadFile) | **POST** /v2/files | Upload a File
*JobsApi* | [**archiveJob**](docs/JobsApi.md#archiveJob) | **POST** /v2/jobs/{jobId}/archive | Archive a Job
*JobsApi* | [**createJob**](docs/JobsApi.md#createJob) | **POST** /v2/jobs | Create a Job
*JobsApi* | [**deleteJob**](docs/JobsApi.md#deleteJob) | **DELETE** /v2/jobs/{jobId} | Delete a Job
*JobsApi* | [**deliverJob**](docs/JobsApi.md#deliverJob) | **POST** /v2/jobs/{jobId}/deliver | Deliver a Job
*JobsApi* | [**downloadJob**](docs/JobsApi.md#downloadJob) | **GET** /v2/jobs/{jobId}/download | Download a Job
*JobsApi* | [**exportJob**](docs/JobsApi.md#exportJob) | **GET** /v2/jobs/{jobId}/export | Export a Job
*JobsApi* | [**getJob**](docs/JobsApi.md#getJob) | **GET** /v2/jobs/{jobId} | Retrieve a Job
*JobsApi* | [**getJobLeverageStats**](docs/JobsApi.md#getJobLeverageStats) | **POST** /v2/jobs/{jobId}/stats | Retrieve Job Leverage Stats
*JobsApi* | [**reactivateJob**](docs/JobsApi.md#reactivateJob) | **POST** /v2/jobs/{jobId}/reactivate | Reactivate a Job
*JobsApi* | [**retrieveAllJobs**](docs/JobsApi.md#retrieveAllJobs) | **GET** /v2/jobs | Retrieve all Jobs
*JobsApi* | [**unarchiveJob**](docs/JobsApi.md#unarchiveJob) | **POST** /v2/jobs/{jobId}/unarchive | Unarchive a Job
*JobsApi* | [**updateJob**](docs/JobsApi.md#updateJob) | **PUT** /v2/jobs/{jobId} | Update a Job
*LanguagesApi* | [**getLanguages**](docs/LanguagesApi.md#getLanguages) | **GET** /v2/languages | Retrieve supported languages
*MemoriesApi* | [**createMemory**](docs/MemoriesApi.md#createMemory) | **POST** /v2/memories | Create a Memory
*MemoriesApi* | [**deleteMemory**](docs/MemoriesApi.md#deleteMemory) | **DELETE** /v2/memories | Delete a Memory
*MemoriesApi* | [**deleteSegmentFromMemory**](docs/MemoriesApi.md#deleteSegmentFromMemory) | **DELETE** /v2/memories/segment | Delete a segment from a memory.
*MemoriesApi* | [**downloadTermbase**](docs/MemoriesApi.md#downloadTermbase) | **GET** /v2/memories/termbase/download | Termbase download for a Memory
*MemoriesApi* | [**exportTermbase**](docs/MemoriesApi.md#exportTermbase) | **POST** /v2/memories/termbase/export | Termbase export for a Memory
*MemoriesApi* | [**getMemory**](docs/MemoriesApi.md#getMemory) | **GET** /v2/memories | Retrieve a Memory
*MemoriesApi* | [**importMemoryFile**](docs/MemoriesApi.md#importMemoryFile) | **POST** /v2/memories/import | File import for a Memory
*MemoriesApi* | [**queryMemory**](docs/MemoriesApi.md#queryMemory) | **GET** /v2/memories/query | Query a Memory
*MemoriesApi* | [**updateMemory**](docs/MemoriesApi.md#updateMemory) | **PUT** /v2/memories | Update the name of a Memory
*ProjectsApi* | [**createProject**](docs/ProjectsApi.md#createProject) | **POST** /v2/projects | Create a Project
*ProjectsApi* | [**deleteProject**](docs/ProjectsApi.md#deleteProject) | **DELETE** /v2/projects | Delete a Project
*ProjectsApi* | [**getProjects**](docs/ProjectsApi.md#getProjects) | **GET** /v2/projects | Retrieve a Project
*TranslateApi* | [**batchTranslateFile**](docs/TranslateApi.md#batchTranslateFile) | **POST** /v2/translate/file | Translate a File
*TranslateApi* | [**downloadFile**](docs/TranslateApi.md#downloadFile) | **GET** /v2/translate/files | Download translated file
*TranslateApi* | [**monitorFileTranslation**](docs/TranslateApi.md#monitorFileTranslation) | **GET** /v2/translate/file | Monitor file translation
*TranslateApi* | [**translateSegmentPost**](docs/TranslateApi.md#translateSegmentPost) | **POST** /v2/translate | Translate a segment
*WebhookConfigurationApi* | [**servicesConfigurationApiWebhooksDelete**](docs/WebhookConfigurationApi.md#servicesConfigurationApiWebhooksDelete) | **DELETE** /v3/connectors/configuration/webhooks/{id} | Delete a specific Webhook Configuration by ID.
*WebhookConfigurationApi* | [**webhooksCreate**](docs/WebhookConfigurationApi.md#webhooksCreate) | **POST** /v3/connectors/configuration/webhooks | Creates a new Webhook Configuration
*WebhookConfigurationApi* | [**webhooksGet**](docs/WebhookConfigurationApi.md#webhooksGet) | **GET** /v3/connectors/configuration/webhooks/{id} | Retrieve a specific Webhook Configuration by ID.
*WebhookConfigurationApi* | [**webhooksGetMany**](docs/WebhookConfigurationApi.md#webhooksGetMany) | **GET** /v3/connectors/configuration/webhooks | Retrieve a list of Webhook Configurations.
*WebhookConfigurationApi* | [**webhooksUpdate**](docs/WebhookConfigurationApi.md#webhooksUpdate) | **PUT** /v3/connectors/configuration/webhooks/{id} | Update a specific Webhook Configuration by ID.
*WorkflowsApi* | [**getWorkflowTemplates**](docs/WorkflowsApi.md#getWorkflowTemplates) | **GET** /v2/workflows/templates | Retrieve workflow templates


## Documentation for Models

 - [AddFileLabelRequest](docs/AddFileLabelRequest.md)
 - [CreateConverterConfigParameters](docs/CreateConverterConfigParameters.md)
 - [CreateWebhookOptions](docs/CreateWebhookOptions.md)
 - [DeleteSegmentFromMemoryResponse](docs/DeleteSegmentFromMemoryResponse.md)
 - [DocumentWithSegments](docs/DocumentWithSegments.md)
 - [DocumentWithoutSegments](docs/DocumentWithoutSegments.md)
 - [DocumentWithoutSegmentsStatus](docs/DocumentWithoutSegmentsStatus.md)
 - [Error](docs/Error.md)
 - [FileDeleteResponse](docs/FileDeleteResponse.md)
 - [GetLiltCreateContentResponse](docs/GetLiltCreateContentResponse.md)
 - [InlineObject](docs/InlineObject.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [Job](docs/Job.md)
 - [JobCreateParameters](docs/JobCreateParameters.md)
 - [JobDeleteResponse](docs/JobDeleteResponse.md)
 - [JobLeverageStats](docs/JobLeverageStats.md)
 - [JobProject](docs/JobProject.md)
 - [JobStats](docs/JobStats.md)
 - [JobUpdateParameters](docs/JobUpdateParameters.md)
 - [LanguagePair](docs/LanguagePair.md)
 - [LanguagesResponse](docs/LanguagesResponse.md)
 - [LiltCreateContent](docs/LiltCreateContent.md)
 - [LiltCreateContentPreferences](docs/LiltCreateContentPreferences.md)
 - [LiltCreateContentRequest](docs/LiltCreateContentRequest.md)
 - [LiltCreateContentTemplateParams](docs/LiltCreateContentTemplateParams.md)
 - [Memory](docs/Memory.md)
 - [MemoryCreateParameters](docs/MemoryCreateParameters.md)
 - [MemoryDeleteResponse](docs/MemoryDeleteResponse.md)
 - [MemoryImportResponse](docs/MemoryImportResponse.md)
 - [MemoryUpdateParameters](docs/MemoryUpdateParameters.md)
 - [Project](docs/Project.md)
 - [ProjectCreateParameters](docs/ProjectCreateParameters.md)
 - [ProjectDeleteResponse](docs/ProjectDeleteResponse.md)
 - [ProjectStats](docs/ProjectStats.md)
 - [SDLXLIFFFilter](docs/SDLXLIFFFilter.md)
 - [Segment](docs/Segment.md)
 - [SignLiltCreateTermsResponse](docs/SignLiltCreateTermsResponse.md)
 - [SourceFile](docs/SourceFile.md)
 - [TermbaseExportResponse](docs/TermbaseExportResponse.md)
 - [TranslateSegmentBody](docs/TranslateSegmentBody.md)
 - [Translation](docs/Translation.md)
 - [TranslationInfo](docs/TranslationInfo.md)
 - [TranslationList](docs/TranslationList.md)
 - [TranslationMemoryEntry](docs/TranslationMemoryEntry.md)
 - [WebhookResponse](docs/WebhookResponse.md)
 - [WorkflowStageAssignment](docs/WorkflowStageAssignment.md)
 - [WorkflowStageTemplate](docs/WorkflowStageTemplate.md)
 - [WorkflowTemplate](docs/WorkflowTemplate.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: key
- **Location**: URL query string

### BasicAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



