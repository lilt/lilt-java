

# Job

A Job is a collection of multiple Projects. Each project is specific to a language pair, and is associated with exactly one Memory for that language pair. The Memory association cannot be changed after the Project is created. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | A name for the job. |  [optional]
**creationStatus** | **String** | Status of job creation process that includes PENDING, COMPLETE, and FAILED. |  [optional]
**deliveredAt** | **OffsetDateTime** |  |  [optional]
**status** | **String** | Current status of job that includes archived, delivered, and active. |  [optional]
**due** | **OffsetDateTime** | An ISO string date. |  [optional]
**id** | **Integer** | An id for the job. |  [optional]
**isProcessing** | **Integer** | Values include &#x60;1&#x60; while in progress, &#x60;0&#x60; when idle and &#x60;-2&#x60; when processing failed. |  [optional]
**stats** | [**JobStats**](JobStats.md) |  |  [optional]



