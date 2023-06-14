

# MessageRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**applicationId** | **String** | The ID of the Application your from number is associated with in the Bandwidth Phone Number Dashboard. |  |
|**to** | **Set&lt;String&gt;** | The phone number(s) the message should be sent to in E164 format. |  |
|**from** | **String** | One of your telephone numbers the message should come from in E164 format. |  |
|**text** | **String** | The contents of the text message. Must be 2048 characters or less. |  [optional] |
|**media** | **List&lt;URI&gt;** | A list of URLs to include as media attachments as part of the message. Each URL can be at most 4096 characters. |  [optional] |
|**tag** | **String** | A custom string that will be included in callback events of the message. Max 1024 characters. |  [optional] |
|**priority** | **PriorityEnum** |  |  [optional] |
|**expiration** | **String** | A string with the date/time value that the message will automatically expire by. This must be a valid RFC-3339 value, e.g., 2021-03-14T01:59:26Z or 2021-03-13T20:59:26-05:00. |  [optional] |


