

# ListMessageItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**messageId** | **String** | The message id |  [optional] |
|**accountId** | **String** | The account id associated with this message. |  [optional] |
|**sourceTn** | **String** | The source phone number of the message. |  [optional] |
|**destinationTn** | **String** | The recipient phone number of the message. |  [optional] |
|**messageStatus** | **MessageStatusEnum** |  |  [optional] |
|**messageDirection** | **ListMessageDirectionEnum** |  |  [optional] |
|**messageType** | **MessageTypeEnum** |  |  [optional] |
|**segmentCount** | **Integer** | The number of segments the message was sent as. |  [optional] |
|**errorCode** | **Integer** | The numeric error code of the message. |  [optional] |
|**receiveTime** | **String** | The ISO 8601 datetime of the message. |  [optional] |
|**carrierName** | **String** | The name of the carrier. Not currently supported for MMS coming soon. |  [optional] |
|**messageSize** | **Integer** | The size of the message including message content and headers. |  [optional] |
|**messageLength** | **Integer** | The length of the message content. |  [optional] |
|**attachmentCount** | **Integer** | The number of attachments the message has. |  [optional] |
|**recipientCount** | **Integer** | The number of recipients the message has. |  [optional] |
|**campaignClass** | **String** | The campaign class of the message if it has one. |  [optional] |



