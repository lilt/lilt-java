

# QARuleMatchesMatches

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**context** | [**QARuleMatchesContext**](QARuleMatchesContext.md) |  | 
**length** | **Integer** | The length of the error in characters. | 
**message** | **String** | Message about the error displayed to the user. | 
**offset** | **Integer** | The 0-based character offset of the error in the text. | 
**replacements** | [**List&lt;QARuleMatchesReplacements&gt;**](QARuleMatchesReplacements.md) | Replacements that might correct the error. The array can be empty, in this case there is no suggested replacement. | 
**rule** | [**QARuleMatchesRule**](QARuleMatchesRule.md) |  |  [optional]
**shortMessage** | **String** | An optional shorter version of &#39;message&#39;. |  [optional]



