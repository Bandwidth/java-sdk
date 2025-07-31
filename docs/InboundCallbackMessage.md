

# InboundCallbackMessage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier of the message. |  |
|**owner** | **String** | The Bandwidth phone number or alphanumeric identifier associated with the message. |  |
|**applicationId** | **String** | The ID of the Application your from number or senderId is associated with in the Bandwidth Phone Number Dashboard. |  |
|**time** | **OffsetDateTime** |  |  |
|**segmentCount** | **Integer** | The number of segments the user&#39;s message is broken into before sending over carrier networks. |  |
|**direction** | **MessageDirectionEnum** |  |  |
|**to** | **Set&lt;String&gt;** | The phone number recipients of the message. |  |
|**from** | **String** | The Bandwidth phone number or alphanumeric identifier the message was sent from. |  |
|**text** | **String** |  |  [optional] |
|**tag** | **String** | A custom string that will be included in callback events of the message. Max 1024 characters. |  [optional] |
|**media** | **List&lt;URI&gt;** | Optional media, not applicable for sms |  [optional] |
|**priority** | **PriorityEnum** |  |  [optional] |
|**channel** | **MultiChannelMessageChannelEnum** |  |  [optional] |
|**content** | [**MultiChannelMessageContent**](MultiChannelMessageContent.md) |  |  [optional] |
|**suggestionResponse** | [**RbmSuggestionResponse**](RbmSuggestionResponse.md) |  |  [optional] |
|**locationResponse** | [**RbmLocationResponse**](RbmLocationResponse.md) |  |  [optional] |



