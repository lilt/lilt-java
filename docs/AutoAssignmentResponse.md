

# AutoAssignmentResponse

Auto assignment status.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**projectId** | **BigDecimal** | The id of the project. | 
**success** | **Boolean** | True if the operation was successful for this project. | 
**error** | **String** | An optional error message if success &#x3D; false |  [optional]
**errors** | [**List&lt;AssignmentError&gt;**](AssignmentError.md) | A list of errors if there were any. |  [optional]
**assignments** | [**List&lt;AssignmentDetails&gt;**](AssignmentDetails.md) | Assignment details, like which user was assigned and which role. |  [optional]



