

# JobProject

A job project contains project statistical data that belongs to a specific job. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | An id for the project. |  [optional]
**srcLang** | **String** | Source language, an ISO 639-1 language identifier. |  [optional]
**srcLocale** | **String** | A locale identifier, supported for source language. |  [optional]
**trgLang** | **String** | Target language, an ISO 639-1 language identifier. |  [optional]
**trgLocale** | **String** | A locale identifier, supported for target language. |  [optional]
**name** | **String** | A name for the project. |  [optional]
**due** | **String** | An ISO date. |  [optional]
**isComplete** | **Boolean** | A state that checks project was completed. |  [optional]
**isArchived** | **Boolean** | The archived state of the project. |  [optional]
**state** | **String** | Current state of the project. Example, backlog, inProgress, inReview, done. |  [optional]
**numSourceTokens** | **Integer** | Total number of source tokens. |  [optional]
**createdAt** | **String** | Time at which the object was created. |  [optional]
**updatedAt** | **String** | Time at which the object was updated. |  [optional]
**isDeleted** | **Boolean** | A state that checks project was deleted. |  [optional]
**memoryId** | **Integer** | A unique number identifying the associated Memory. |  [optional]
**workflowStatus** | [**WorkflowStatusEnum**](#WorkflowStatusEnum) | The status of the Workflow for the current project. |  [optional]
**workflowName** | **String** | Human readable name of the workflow associated with the current project. |  [optional]



## Enum: WorkflowStatusEnum

Name | Value
---- | -----
READY_TO_START | &quot;READY_TO_START&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
DONE | &quot;DONE&quot;



