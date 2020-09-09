# Lilt-java-client

Lilt REST API
- API version: v2.0
  - Build date: 2020-04-13T16:28:14.210947-07:00[America/Los_Angeles]

The Lilt REST API enables programmatic access to the full-range of Lilt backend services including:
  * Training of and translating with interactive, adaptive machine translation
  * Large-scale translation memory
  * The Lexicon (a large-scale termbase)
  * Programmatic control of the Lilt CAT environment
  * Translation memory synchronization

Requests and responses are in JSON format. The REST API only responds to HTTPS / SSL requests.
## Authentication
Requests are authenticated via REST API key, which requires the Business plan.

Requests are authenticated using [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Add your REST API key as both the `username` and `password`.

For development, you may also pass the REST API key via the `key` query parameter. This is less secure than HTTP Basic Auth, and is not recommended for production use.


  For more information, please visit [https://lilt.com/docs/api](https://lilt.com/docs/api)

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
  <artifactId>lilt-java-client</artifactId>
  <version>2.0.1</version>
  <scope>compile</scope>
</dependency>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/lilt-java-client-2.0.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.lilt.ApiClient;
import com.lilt.ApiException;
import com.lilt.Configuration;
import com.lilt.auth.*;
import com.lilt.models.*;
import com.lilt.api.DocumentsApi;

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

    DocumentsApi apiInstance = new DocumentsApi(defaultClient);
    DocumentAssignmentParameters body = new DocumentAssignmentParameters(); // DocumentAssignmentParameters | 
    try {
      DocumentAssignmentResponse result = apiInstance.assignDocument(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#assignDocument");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://lilt.com/2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DocumentsApi* | [**assignDocument**](docs/DocumentsApi.md#assignDocument) | **PUT** /documents/share | Assign a Document
*DocumentsApi* | [**createDocument**](docs/DocumentsApi.md#createDocument) | **POST** /documents | Create a Document
*DocumentsApi* | [**deleteDocument**](docs/DocumentsApi.md#deleteDocument) | **DELETE** /documents | Delete a Document
*DocumentsApi* | [**downloadFile**](docs/DocumentsApi.md#downloadFile) | **GET** /documents/files | Download a File
*DocumentsApi* | [**getDocument**](docs/DocumentsApi.md#getDocument) | **GET** /documents | Retrieve a Document
*DocumentsApi* | [**pretranslateDocument**](docs/DocumentsApi.md#pretranslateDocument) | **POST** /documents/pretranslate | Pretranslate a Document
*DocumentsApi* | [**updateDocument**](docs/DocumentsApi.md#updateDocument) | **PUT** /documents | Update a Document
*DocumentsApi* | [**uploadDocumentFile**](docs/DocumentsApi.md#uploadDocumentFile) | **POST** /documents/files | Upload a File
*FilesApi* | [**deleteFile**](docs/FilesApi.md#deleteFile) | **DELETE** /files | Delete a File
*FilesApi* | [**getFiles**](docs/FilesApi.md#getFiles) | **GET** /files | Retrieve a File
*FilesApi* | [**uploadFile**](docs/FilesApi.md#uploadFile) | **POST** /files | Upload a File
*LanguagesApi* | [**getLanguages**](docs/LanguagesApi.md#getLanguages) | **GET** /languages | Retrieve supported languages
*LexiconApi* | [**queryLexicon**](docs/LexiconApi.md#queryLexicon) | **GET** /lexicon | Query a Lexicon
*LexiconApi* | [**updateLexicon**](docs/LexiconApi.md#updateLexicon) | **POST** /lexicon | Update a Lexicon
*MemoriesApi* | [**createMemory**](docs/MemoriesApi.md#createMemory) | **POST** /memories | Create a Memory
*MemoriesApi* | [**deleteMemory**](docs/MemoriesApi.md#deleteMemory) | **DELETE** /memories | Delete a Memory
*MemoriesApi* | [**getMemory**](docs/MemoriesApi.md#getMemory) | **GET** /memories | Retrieve a Memory
*MemoriesApi* | [**importMemoryFile**](docs/MemoriesApi.md#importMemoryFile) | **POST** /memories/import | File import for a Memory
*MemoriesApi* | [**queryMemory**](docs/MemoriesApi.md#queryMemory) | **GET** /memories/query | Query a Memory
*MemoriesApi* | [**syncDeleteMemory**](docs/MemoriesApi.md#syncDeleteMemory) | **DELETE** /memories/sync | Delete-sync for a Memory
*MemoriesApi* | [**syncDownMemory**](docs/MemoriesApi.md#syncDownMemory) | **GET** /memories/sync | Get-sync for a Memory
*MemoriesApi* | [**syncInsertMemory**](docs/MemoriesApi.md#syncInsertMemory) | **POST** /memories/sync | Insert-sync for a Memory
*MemoriesApi* | [**syncUpdateMemory**](docs/MemoriesApi.md#syncUpdateMemory) | **PUT** /memories/sync | Update-sync for a Memory
*MemoriesApi* | [**updateMemory**](docs/MemoriesApi.md#updateMemory) | **PUT** /memories | Update the name of a Memory
*ProjectsApi* | [**createProject**](docs/ProjectsApi.md#createProject) | **POST** /projects | Create a Project
*ProjectsApi* | [**deleteProject**](docs/ProjectsApi.md#deleteProject) | **DELETE** /projects | Delete a Project
*ProjectsApi* | [**getProject**](docs/ProjectsApi.md#getProject) | **GET** /projects | Retrieve a Project
*ProjectsApi* | [**getProjectReport**](docs/ProjectsApi.md#getProjectReport) | **GET** /projects/quote | Retrieve Project report
*ProjectsApi* | [**getProjectStatus**](docs/ProjectsApi.md#getProjectStatus) | **GET** /projects/status | Retrieve Project status
*ProjectsApi* | [**updateProject**](docs/ProjectsApi.md#updateProject) | **PUT** /projects | Update a Project
*QaApi* | [**qaCheck**](docs/QaApi.md#qaCheck) | **GET** /qa | Perform QA check
*RootApi* | [**root**](docs/RootApi.md#root) | **GET** / | Retrieve the REST API root
*SegmentsApi* | [**createSegment**](docs/SegmentsApi.md#createSegment) | **POST** /segments | Create a Segment
*SegmentsApi* | [**deleteSegment**](docs/SegmentsApi.md#deleteSegment) | **DELETE** /segments | Delete a Segment
*SegmentsApi* | [**getSegment**](docs/SegmentsApi.md#getSegment) | **GET** /segments | Retrieve a Segment
*SegmentsApi* | [**tagSegment**](docs/SegmentsApi.md#tagSegment) | **GET** /segments/tag | Tag a Segment
*SegmentsApi* | [**updateSegment**](docs/SegmentsApi.md#updateSegment) | **PUT** /segments | Update a Segment
*TranslateApi* | [**registerSegment**](docs/TranslateApi.md#registerSegment) | **GET** /translate/register | Register a segment
*TranslateApi* | [**translateSegment**](docs/TranslateApi.md#translateSegment) | **GET** /translate | Translate a segment


## Documentation for Models

 - [ApiRoot](docs/ApiRoot.md)
 - [DocumentAssignmentParameters](docs/DocumentAssignmentParameters.md)
 - [DocumentAssignmentResponse](docs/DocumentAssignmentResponse.md)
 - [DocumentDeleteResponse](docs/DocumentDeleteResponse.md)
 - [DocumentParameters](docs/DocumentParameters.md)
 - [DocumentPretranslateParameters](docs/DocumentPretranslateParameters.md)
 - [DocumentPretranslateResponse](docs/DocumentPretranslateResponse.md)
 - [DocumentPretranslating](docs/DocumentPretranslating.md)
 - [DocumentPretranslatingStatus](docs/DocumentPretranslatingStatus.md)
 - [DocumentUpdateParameters](docs/DocumentUpdateParameters.md)
 - [DocumentWithSegments](docs/DocumentWithSegments.md)
 - [DocumentWithoutSegments](docs/DocumentWithoutSegments.md)
 - [DocumentWithoutSegmentsStatus](docs/DocumentWithoutSegmentsStatus.md)
 - [Error](docs/Error.md)
 - [FileDeleteResponse](docs/FileDeleteResponse.md)
 - [LanguagesResponse](docs/LanguagesResponse.md)
 - [LexiconEntry](docs/LexiconEntry.md)
 - [LexiconEntryExamples](docs/LexiconEntryExamples.md)
 - [LexiconEntrySourceSpan](docs/LexiconEntrySourceSpan.md)
 - [LexiconEntryTargetSpan](docs/LexiconEntryTargetSpan.md)
 - [LexiconEntryTranslations](docs/LexiconEntryTranslations.md)
 - [LexiconUpdateParameters](docs/LexiconUpdateParameters.md)
 - [LexiconUpdateResponse](docs/LexiconUpdateResponse.md)
 - [MatchBand](docs/MatchBand.md)
 - [Memory](docs/Memory.md)
 - [MemoryCreateParameters](docs/MemoryCreateParameters.md)
 - [MemoryDeleteResponse](docs/MemoryDeleteResponse.md)
 - [MemoryImportResponse](docs/MemoryImportResponse.md)
 - [MemoryInsertResponse](docs/MemoryInsertResponse.md)
 - [MemoryUpdateParameters](docs/MemoryUpdateParameters.md)
 - [MemoryUpdateResponse](docs/MemoryUpdateResponse.md)
 - [Project](docs/Project.md)
 - [ProjectCreateParameters](docs/ProjectCreateParameters.md)
 - [ProjectDeleteResponse](docs/ProjectDeleteResponse.md)
 - [ProjectQuote](docs/ProjectQuote.md)
 - [ProjectStatus](docs/ProjectStatus.md)
 - [ProjectUpdateResponse](docs/ProjectUpdateResponse.md)
 - [QARuleMatches](docs/QARuleMatches.md)
 - [QARuleMatchesContext](docs/QARuleMatchesContext.md)
 - [QARuleMatchesMatches](docs/QARuleMatchesMatches.md)
 - [QARuleMatchesReplacements](docs/QARuleMatchesReplacements.md)
 - [QARuleMatchesRule](docs/QARuleMatchesRule.md)
 - [QARuleMatchesRuleCategory](docs/QARuleMatchesRuleCategory.md)
 - [QARuleMatchesRuleUrls](docs/QARuleMatchesRuleUrls.md)
 - [ResourceStatus](docs/ResourceStatus.md)
 - [Segment](docs/Segment.md)
 - [SegmentCreateParameters](docs/SegmentCreateParameters.md)
 - [SegmentDeleteResponse](docs/SegmentDeleteResponse.md)
 - [SegmentUpdateParameters](docs/SegmentUpdateParameters.md)
 - [TaggedSegment](docs/TaggedSegment.md)
 - [TranslateRegisterResponse](docs/TranslateRegisterResponse.md)
 - [Translation](docs/Translation.md)
 - [TranslationList](docs/TranslationList.md)
 - [TranslationMemoryEntry](docs/TranslationMemoryEntry.md)


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

support@lilt.com

