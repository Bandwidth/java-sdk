

# MultiChannelMessageData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**messageId** | **String** | The ID of the message. |  [optional] |
|**status** | **MultiChannelStatusEnum** |  |  [optional] |
|**time** | **OffsetDateTime** | The time the message was received by the Bandwidth API. |  [optional] |
|**direction** | **MultiChannelMessageDirectionEnum** |  |  [optional] |
|**from** | **String** | The sender ID of the message. This could be an alphanumeric sender ID. |  [optional] |
|**to** | **String** | The phone number the message should be sent to in E164 format. |  [optional] |
|**applicationId** | **String** | The ID of the Application your from number or senderId is associated with in the Bandwidth Phone Number Dashboard. |  [optional] |
|**channel** | **MultiChannelMessageChannelEnum** |  |  [optional] |
|**tag** | **String** | A custom string that will be included in callback events of the message. Max 1024 characters. |  [optional] |



