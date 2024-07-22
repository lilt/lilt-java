

# LanguagePair

A language pair couples the source and target language along with memory and pre-translations settings associated to a project. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**srcLang** | **String** | Source language, an ISO 639-1 language identifier. |  [optional]
**srcLocale** | **String** | A locale identifier, supported for source language. |  [optional]
**trgLang** | **String** | Target language, an ISO 639-1 language identifier. | 
**trgLocale** | **String** | A locale identifier, supported for target language. |  [optional]
**dueDate** | **String** | An ISO date. |  [optional]
**memoryId** | **Integer** | A unique number identifying the associated Memory. | 
**externalModelId** | **Integer** | A unique identifier for working with a third party model in the Lilt Platform |  [optional]
**pretranslate** | **Boolean** | Attribute translation authorship of exact matches to the creator of the document being pretranslated. |  [optional]
**autoAccept** | **Boolean** | Accept and lock exact matches. |  [optional]
**caseSensitive** | **Boolean** | Use case sensitive translation memory matching. |  [optional]
**takeMatchAttribution** | **Boolean** | Use MT for unmatched segments. |  [optional]
**configId** | **Integer** | Configuration id |  [optional]
**workflowTemplateId** | **Integer** | Workflow Template id, to assign a specific Workflow to the project created out of this Language Pair. WorkflowTemplateIds can be retrieved via the /workflows/templates endpoint. If not specified then the Job level workflowTemplateId will be used. |  [optional]
**workflowTemplateName** | **Integer** | Workflow Template Name, when passed with TeamId it allows for an on the fly look up of the correct WorkflowTemplate to use. If workflowTemplateId is passed the workflowTemplateId supercedes other lookups. |  [optional]
**workflowStageAssignments** | [**List&lt;WorkflowStageAssignment&gt;**](WorkflowStageAssignment.md) |  |  [optional]



