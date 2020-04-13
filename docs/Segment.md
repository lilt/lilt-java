

# Segment

A Segment is a source string and, optionally, its translation. A Segment can be associated with both a Memory and a Document. The Segment object contains additional metadata about the source and target strings. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | A unique number identifying the Segment. |  [optional]
**createdAt** | **Integer** | Time at which the object was created. Measured in seconds since the Unix epoch. |  [optional]
**updatedAt** | **Integer** | Time at which the object was created. Measured in seconds since the Unix epoch. |  [optional]
**documentId** | **Integer** | A unique Document identifier. |  [optional]
**memoryId** | **Integer** | The Memory with which this Segment is associated. |  [optional]
**source** | **String** | The source string. |  [optional]
**srclang** | **String** | An ISO 639-1 language code. |  [optional]
**target** | **String** | The target string. |  [optional]
**trglang** | **String** | An ISO 639-1 language code. |  [optional]
**isConfirmed** | **Boolean** | The confirmation status. |  [optional]
**isReviewed** | **Boolean** | The review status. |  [optional]



