

# TranslationInfo

Information describing a batch translation process. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique identifier for this translation. |  [optional]
**fileId** | **Integer** | id of the File that is being translated. |  [optional]
**status** | **String** | Status of the translation - &#x60;InProgress&#x60;, &#x60;ReadyForDownload&#x60;, &#x60;Completed&#x60;, &#x60;Failed&#x60;. |  [optional]
**createdAt** | **Integer** | Time when this translation was started, in seconds since the Unix epoch. |  [optional]
**errorMsg** | **String** | Error message, present when status is &#x60;Failed&#x60;. |  [optional]



