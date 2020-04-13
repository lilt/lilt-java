

# TranslationList

An ranked list of translations and associated metadata.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**untokenizedSource** | **String** | The untokenized source segment. Punctuation has not been separated from words. |  [optional]
**tokenizedSource** | **String** | The tokenized source segment. Punctuation has been separated from words. |  [optional]
**sourceDelimiters** | **List&lt;String&gt;** | A format string that indicates, for each word, if the word should be preceded by a space. |  [optional]
**translation** | [**List&lt;Translation&gt;**](Translation.md) | A list of Translation objects. |  [optional]



