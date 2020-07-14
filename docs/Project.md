

# Project

A Project is a collection of zero or more Documents. It is specific to a language pair, and is associated with exactly one Memory for that language pair. The Memory association cannot be changed after the Project is created. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | A unique number identifying the Project. |  [optional]
**memoryId** | **Integer** | A unique number identifying the associated Memory. |  [optional]
**srclang** | **String** | An ISO 639-1 language identifier. |  [optional]
**trglang** | **String** | An ISO 639-1 language identifier. |  [optional]
**srclocale** | **String** | A locale identifier, supported for srclang. |  [optional]
**trglocale** | **String** | A locale identifier, supported for trglang. |  [optional]
**name** | **String** | A name for the project. |  [optional]
**state** | **String** | The project&#39;s state. The possible states are &#39;backlog&#39;, &#39;inProgress&#39;, &#39;inReview&#39;, &#39;inQA&#39;, and &#39;done&#39; |  [optional]
**dueDate** | **Integer** | The due date. Measured in seconds since the Unix epoch. |  [optional]
**archived** | **Boolean** | The archived state of the Project. |  [optional]
**metadata** | [**Object**](.md) | A JSON object for storing various project metadata. |  [optional]
**sampleReviewPercentage** | **Integer** | The project&#39;s sample review percentage. |  [optional]
**createdAt** | **Integer** | Time at which the object was created. Measured in seconds since the Unix epoch. |  [optional]
**updatedAt** | **Integer** | Time at which the object was created. Measured in seconds since the Unix epoch. |  [optional]
**document** | [**List&lt;DocumentWithoutSegments&gt;**](DocumentWithoutSegments.md) | A list of Documents. |  [optional]



