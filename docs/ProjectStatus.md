

# ProjectStatus

The status of a Project. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | A unique Project identifier. |  [optional]
**numSourceWords** | **Integer** | The number of source words in the Project. |  [optional]
**numWordsConfirmed** | **Integer** | The number of confirmed source words. |  [optional]
**numWordsReviewed** | **Integer** | The number of reviewed source words. |  [optional]
**timeElapsed** | **Integer** | The total time spent on the project by all resources. Measured in milliseconds. |  [optional]
**timeElapsedTranslation** | **Integer** | The total time spent on translation by all resources. Measured in milliseconds. |  [optional]
**timeElapsedResearch** | **Integer** | The total time spent on research by all resources. Measured in milliseconds. |  [optional]
**timeElapsedReview** | **Integer** | The total time spent on reviewing by all resources. Measured in milliseconds. |  [optional]
**resources** | [**List&lt;ResourceStatus&gt;**](ResourceStatus.md) | A list of ResourceStatus objects that represent per-resource statistics. |  [optional]



