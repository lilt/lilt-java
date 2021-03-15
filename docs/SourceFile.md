

# SourceFile

A SourceFile is an unprocessed source file that can later be added to a project.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | A unique number identifying the SourceFile. |  [optional]
**name** | **String** | The file name. |  [optional]
**fileHash** | **String** | A unique hash value associated with the file. An MD5 hash of the file content will be used by default. |  [optional]
**exportUri** | **String** | A webhook endpoint that will export the translated document back to the source repository. |  [optional]
**detectedLang** | **String** | Language associated with the file. |  [optional]
**detectedLangConfidence** | **BigDecimal** | Confidence score for the language associated with the file. |  [optional]
**category** | **String** | The category of the file. The options are &#x60;REFERENCE&#x60;, or &#x60;API&#x60;. The default is API. Files with the &#x60;REFERENCE&#x60; category will be displayed as reference material. |  [optional]
**labels** | **List&lt;String&gt;** | The list of labels associated with the file. |  [optional]
**createdAt** | **Integer** | Time at which the object was created. Measured in seconds since the Unix epoch. |  [optional]
**updatedAt** | **Integer** | Time at which the object was created. Measured in seconds since the Unix epoch. |  [optional]



