

# Project

A Project is a collection of zero or more Documents. It is specific to a language pair, and is associated with exactly one Memory for that language pair. The Memory association cannot be changed after the Project is created. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | A unique number identifying the Project. |  [optional]
**memoryId** | **Integer** | A unique number identifying the associated Memory. |  [optional]
**jobId** | **Integer** | A unique number identifying the associated Job. |  [optional]
**srclang** | **String** | An ISO 639-1 language identifier. |  [optional]
**trglang** | **String** | An ISO 639-1 language identifier. |  [optional]
**srclocale** | **String** | A locale identifier, supported for srclang. |  [optional]
**trglocale** | **String** | A locale identifier, supported for trglang. |  [optional]
**name** | **String** | A name for the project. |  [optional]
**state** | **String** | The project&#39;s state. The possible states are &#x60;backlog&#x60;, &#x60;inProgress&#x60;, &#x60;inReview&#x60;, &#x60;inQA&#x60;, and &#x60;done&#x60;. |  [optional]
**dueDate** | **Integer** | The due date. Measured in seconds since the Unix epoch. |  [optional]
**archived** | **Boolean** | The archived state of the Project. |  [optional]
**metadata** | **Object** | A JSON object of key/value string pairs. Stores custom project information. |  [optional]
**sampleReviewPercentage** | **Integer** | The project&#39;s sample review percentage. |  [optional]
**createdAt** | **Integer** | Time at which the object was created. Measured in seconds since the Unix epoch. |  [optional]
**updatedAt** | **Integer** | Time at which the object was created. Measured in seconds since the Unix epoch. |  [optional]
**workflowStatus** | [**WorkflowStatusEnum**](#WorkflowStatusEnum) | The status of the Workflow for the current project. This may not be present for all project endpoints even with workflows enabled. |  [optional]
**document** | [**List&lt;DocumentWithoutSegments&gt;**](DocumentWithoutSegments.md) | A list of Documents. |  [optional]



## Enum: WorkflowStatusEnum

Name | Value
---- | -----
READY_TO_START | &quot;READY_TO_START&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
DONE | &quot;DONE&quot;



