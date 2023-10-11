

# WorkflowStageTemplate

A single stage within a Workflow Template.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The human readable name of a Workflow stage. |  [optional]
**assignmentType** | [**AssignmentTypeEnum**](#AssignmentTypeEnum) | An enum to represent all possible types of Workflow stage. |  [optional]



## Enum: AssignmentTypeEnum

Name | Value
---- | -----
READY_TO_START | &quot;READY_TO_START&quot;
TRANSLATE | &quot;TRANSLATE&quot;
REVIEW | &quot;REVIEW&quot;
SECONDARY_REVIEW | &quot;SECONDARY_REVIEW&quot;
DONE | &quot;DONE&quot;



