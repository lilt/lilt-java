

# Memory

A Memory is a collection of parallel (source/target) segments from which a MT/TM model is trained. When a translator confirms a segment in the Interface, a parallel segment is added to the Memory. Parallel segments from existing translation memories and bitexts can also be added to the Memory via the REST API. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | A unique number identifying the Memory. |  [optional]
**srclang** | **String** | An ISO 639-1 language identifier. |  [optional]
**trglang** | **String** | An ISO 639-1 language identifier. |  [optional]
**srclocale** | **String** | An ISO 639-1 language identifier. |  [optional]
**trglocale** | **String** | An ISO 639-1 language identifier. |  [optional]
**name** | **String** | A name for the Memory. |  [optional]
**version** | **Integer** | The current version of the Memory, which is the number of updates since the memory was created. |  [optional]
**createdAt** | **Integer** | Time at which the object was created. Measured in seconds since the Unix epoch. |  [optional]
**updatedAt** | **Integer** | Time at which the object was created. Measured in seconds since the Unix epoch. |  [optional]
**numSegments** | **Integer** | The number of confirmed Segments incorporated into this Memory. |  [optional]
**resources** | **List&lt;String&gt;** | The resource files (translation memories and termbases) associated with this Memory. |  [optional]



