

# WorkflowStage

Workflow stage information.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Identifier of the stage. |  [optional]
**name** | **String** | Name of the stage. | 
**active** | **Boolean** | Flag which is set to true when the stage is active for a document. |  [optional]
**assignmentType** | [**AssignmentTypeEnum**](#AssignmentTypeEnum) | An enum to represent all possible types of Workflow stage. | 



## Enum: AssignmentTypeEnum

Name | Value
---- | -----
READY_TO_START | &quot;READY_TO_START&quot;
TRANSLATE | &quot;TRANSLATE&quot;
REVIEW | &quot;REVIEW&quot;
SECONDARY_REVIEW | &quot;SECONDARY_REVIEW&quot;
DONE | &quot;DONE&quot;



