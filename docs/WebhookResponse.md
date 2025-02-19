

# WebhookResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | The unique identifier for the webhook configuration. | 
**webhookName** | **String** | The name of the webhook configuration. | 
**webhookUrl** | **URI** | The URL to which the webhook notifications will be sent. | 
**eventType** | [**List&lt;EventTypeEnum&gt;**](#List&lt;EventTypeEnum&gt;) | The list of event types that will trigger the webhook notification. | 



## Enum: List&lt;EventTypeEnum&gt;

Name | Value
---- | -----
JOB_DELIVER | &quot;JOB_DELIVER&quot;
JOB_UPDATE | &quot;JOB_UPDATE&quot;
PROJECT_DELIVER | &quot;PROJECT_DELIVER&quot;
PROJECT_UPDATE | &quot;PROJECT_UPDATE&quot;



