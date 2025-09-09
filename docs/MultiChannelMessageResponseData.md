

# MultiChannelMessageResponseData

The data returned in a multichannel message response.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the message. |  |
|**time** | **OffsetDateTime** | The time the message was received by the Bandwidth API. |  |
|**direction** | **MessageDirectionEnum** |  |  |
|**to** | **Set&lt;String&gt;** | The destination phone number(s) of the message, in E164 format. |  |
|**channelList** | [**List&lt;MultiChannelMessageResponseDataChannelListInner&gt;**](MultiChannelMessageResponseDataChannelListInner.md) | A list of message bodies. The messages will be attempted in the order they are listed. Once a message sends successfully, the others will be ignored. |  |
|**tag** | **String** | A custom string that will be included in callback events of the message. Max 1024 characters. |  [optional] |
|**priority** | **PriorityEnum** |  |  [optional] |
|**expiration** | **OffsetDateTime** | A string with the date/time value that the message will automatically expire by. This must be a valid RFC-3339 value, e.g., 2021-03-14T01:59:26Z or 2021-03-13T20:59:26-05:00. Must be a date-time in the future. |  [optional] |



