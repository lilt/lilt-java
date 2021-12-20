

# Comment

A Comment is a translator's or a reviewer's comment on a segment. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | A unique number identifying the Comment. |  [optional]
**text** | **String** | The comment text. |  [optional]
**annotations** | [**List&lt;Annotation&gt;**](Annotation.md) | A list of optional Annotations. |  [optional]
**isResolved** | **Boolean** | Whether the Comment is resolved. |  [optional]
**documentId** | **Integer** | The document to which the comment belongs. |  [optional]
**segmentId** | **Integer** | The individual segment to which the comment applies. |  [optional]
**segmentRevisionId** | **Integer** | The revision of the individual segment to which the comment applies. |  [optional]
**userId** | **Integer** | The user who created this comment. |  [optional]
**createdAt** | **Integer** | Time at which the object was created. Measured in seconds since the Unix epoch. |  [optional]



