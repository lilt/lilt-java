

# WorkflowTemplate

A workflow template which defines the workflow's possible steps (combination of Translation, Review and Customer Review).
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **BigDecimal** | Identifier of a teams Workflow template. Can be used during Job creation for specifying the workflow used for a job or language pair. |  [optional]
**name** | **String** |  |  [optional]
**teamId** | **BigDecimal** | The name of a given Workflow template. |  [optional]
**stages** | [**List&lt;WorkflowStageTemplate&gt;**](WorkflowStageTemplate.md) | The stages in this workflow template. |  [optional]



