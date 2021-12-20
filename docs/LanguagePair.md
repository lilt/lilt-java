

# LanguagePair

A language pair couples the source and target language along with memory and pre-translations settings associated to a project. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**srcLang** | **String** | Source langauge, an ISO 639-1 language identifier. |  [optional]
**srcLocale** | **String** | A locale identifier, supported for source langauge. |  [optional]
**trgLang** | **String** | Target langauge, an ISO 639-1 language identifier. | 
**trgLocale** | **String** | A locale identifier, supported for target language. |  [optional]
**dueDate** | **String** | An ISO date. |  [optional]
**memoryId** | **Integer** | A unique number identifying the associated Memory. | 
**pretranslate** | **Boolean** | Attribute translation authorship of exact matches to the creator of the document being pretranslated. |  [optional]
**autoAccept** | **Boolean** | Accept and lock exact matches. |  [optional]
**caseSensitive** | **Boolean** | Use case sensitive translation memory matching. |  [optional]
**takeMatchAttribution** | **Boolean** | Use MT for unmatched segments. |  [optional]
**configId** | **Integer** | Configuration id |  [optional]



