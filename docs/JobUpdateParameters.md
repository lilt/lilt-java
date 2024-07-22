

# JobUpdateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | A name for the Job. |  [optional]
**dueDate** | **Integer** | An ISO string date. |  [optional]
**isProcessing** | [**IsProcessingEnum**](#IsProcessingEnum) | The processing status of the job. Provide one of the following integers to indicate the status.  Ok &#x3D; 0 Started &#x3D; 1 ExportError &#x3D; -2  |  [optional]
**processingErrorMsg** | **String** | The processing error message. |  [optional]



## Enum: IsProcessingEnum

Name | Value
---- | -----
_0 | &quot;0&quot;
_1 | &quot;1&quot;
_2 | &quot;-2&quot;



