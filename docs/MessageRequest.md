

# MessageRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**applicationId** | **String** | The ID of the Application your from number is associated with in the Bandwidth Phone Number Dashboard. |  |
|**to** | **Set&lt;String&gt;** | The phone number(s) the message should be sent to in E164 format. |  |
|**from** | **String** | Either an alphanumeric sender ID or the sender&#39;s Bandwidth phone number in E.164 format, which must be hosted within Bandwidth and linked to the account that is generating the message.  Alphanumeric Sender IDs can contain up to 11 characters, upper-case letters A-Z, lower-case letters a-z, numbers 0-9, space, hyphen -, plus +, underscore _ and ampersand &amp;. Alphanumeric Sender IDs must contain at least one letter. |  |
|**text** | **String** | The contents of the text message. Must be 2048 characters or less. |  [optional] |
|**media** | **List&lt;URI&gt;** | A list of URLs to include as media attachments as part of the message. Each URL can be at most 4096 characters. |  [optional] |
|**tag** | **String** | A custom string that will be included in callback events of the message. Max 1024 characters. |  [optional] |
|**priority** | **PriorityEnum** |  |  [optional] |
|**expiration** | **OffsetDateTime** | A string with the date/time value that the message will automatically expire by. This must be a valid RFC-3339 value, e.g., 2021-03-14T01:59:26Z or 2021-03-13T20:59:26-05:00. Must be a date-time in the future. |  [optional] |



