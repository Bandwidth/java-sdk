

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
|**segmentCount** | **Integer** | The number of segments the user&#39;s message is broken into before sending over carrier networks. |  [optional] |
|**errorCode** | **Integer** | The numeric error code of the message. |  [optional] |
|**receiveTime** | **OffsetDateTime** | The ISO 8601 datetime of the message. |  [optional] |
|**carrierName** | **String** | The name of the carrier. Not currently supported for MMS coming soon. |  [optional] |
|**messageSize** | **Integer** | The size of the message including message content and headers. |  [optional] |
|**messageLength** | **Integer** | The length of the message content. |  [optional] |
|**attachmentCount** | **Integer** | The number of attachments the message has. |  [optional] |
|**recipientCount** | **Integer** | The number of recipients the message has. |  [optional] |
|**campaignClass** | **String** | The campaign class of the message if it has one. |  [optional] |
|**campaignId** | **String** | The campaign ID of the message if it has one. |  [optional] |
|**bwLatency** | **Integer** | The Bandwidth latency of the message in seconds. Only available for accounts with the Advanced Quality Metrics feature enabled. |  [optional] |
|**carrierLatency** | **Integer** | The carrier latency of the message in seconds. Only available for OUTBOUND messages from accounts with the Advanced Quality Metrics feature enabled. |  [optional] |
|**callingNumberCountryA3** | **String** | The A3 country code of the calling number. |  [optional] |
|**calledNumberCountryA3** | **String** | The A3 country code of the called number. |  [optional] |
|**product** | **String** | The messaging product associated with the message. |  [optional] |
|**location** | **String** | The location ID associated with this message. |  [optional] |



