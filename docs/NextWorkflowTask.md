

# NextWorkflowTask

Information about a document workflow task after it has moved a stage.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Identifier of the current workflow task. | 
**newTaskId** | **Integer** | The identifier of the workflow task that is now currently active. |  [optional]
**newStageName** | **String** | The name of the workflow task that is now currently active. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
WORKFLOW_FINISHED | &quot;WORKFLOW_FINISHED&quot;
ALREADY_AT_START | &quot;ALREADY_AT_START&quot;
INVALID_ARGUMENT | &quot;INVALID_ARGUMENT&quot;
POSTCONDITIONS_FAILED | &quot;POSTCONDITIONS_FAILED&quot;
UNKNOWN_ERROR | &quot;UNKNOWN_ERROR&quot;



