

# DocumentAssignmentParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | A unique Document identifier. | 
**email** | **String** | An email address. | 
**isTranslator** | **Boolean** | If true, assign for translating. If false, then unassign. |  [optional]
**isReviewer** | **Boolean** | If true, assign for reviewing. If false, then unassign. |  [optional]
**dueDate** | **OffsetDateTime** | Due date for translation or review (set based on &#x60;is_translator&#x60; and &#x60;is_reviewer&#x60; flags). |  [optional]



