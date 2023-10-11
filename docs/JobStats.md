

# JobStats

A job stats shows an overview of job's statistical data including total number of exact words, fuzzy words, language pairs, projects, etc. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exactWords** | **Integer** | Total number of exact words. |  [optional]
**fuzzyWords** | **Integer** | Total number of fuzzy words. |  [optional]
**newWords** | **Integer** | Total number of fuzzy words. |  [optional]
**numDeliveredProjects** | **Integer** | Total number of delivered projects. |  [optional]
**numLanguagePairs** | **Integer** | Total number of delivered projects. |  [optional]
**numProjects** | **Integer** | Total number of projects. |  [optional]
**percentReviewed** | **Integer** | Overall percentage of documents reviewed. |  [optional]
**percentTranslated** | **Integer** | Overall percentage of documents translated. |  [optional]
**projects** | [**List&lt;JobProject&gt;**](JobProject.md) |  |  [optional]
**sourceWords** | **Integer** | Total number of source words. |  [optional]
**uniqueLanguagePairs** | **Integer** | Number of unique language pairs. |  [optional]
**uniqueLinguists** | **Integer** | Number of unique linguists. |  [optional]
**workflowStatus** | [**WorkflowStatusEnum**](#WorkflowStatusEnum) | The status of the Workflow for the current job. |  [optional]



## Enum: WorkflowStatusEnum

Name | Value
---- | -----
READY_TO_START | &quot;READY_TO_START&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
DONE | &quot;DONE&quot;



