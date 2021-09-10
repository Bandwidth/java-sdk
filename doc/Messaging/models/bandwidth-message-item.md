
# Bandwidth Message Item

## Structure

`BandwidthMessageItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MessageId` | `String` | Optional | The message id | String getMessageId() | setMessageId(String messageId) |
| `AccountId` | `String` | Optional | The account id of the message | String getAccountId() | setAccountId(String accountId) |
| `SourceTn` | `String` | Optional | The source phone number of the message | String getSourceTn() | setSourceTn(String sourceTn) |
| `DestinationTn` | `String` | Optional | The recipient phone number of the message | String getDestinationTn() | setDestinationTn(String destinationTn) |
| `MessageStatus` | `String` | Optional | The status of the message | String getMessageStatus() | setMessageStatus(String messageStatus) |
| `MessageDirection` | `String` | Optional | The direction of the message relative to Bandwidth. INBOUND or OUTBOUND | String getMessageDirection() | setMessageDirection(String messageDirection) |
| `MessageType` | `String` | Optional | The type of message. sms or mms | String getMessageType() | setMessageType(String messageType) |
| `SegmentCount` | `Integer` | Optional | The number of segments the message was sent as | Integer getSegmentCount() | setSegmentCount(Integer segmentCount) |
| `ErrorCode` | `Integer` | Optional | The numeric error code of the message | Integer getErrorCode() | setErrorCode(Integer errorCode) |
| `ReceiveTime` | `String` | Optional | The ISO 8601 datetime of the message | String getReceiveTime() | setReceiveTime(String receiveTime) |
| `CarrierName` | `String` | Optional | The name of the carrier. Not currently supported for MMS, coming soon | String getCarrierName() | setCarrierName(String carrierName) |
| `MessageSize` | `Integer` | Optional | The size of the message including message content and headers | Integer getMessageSize() | setMessageSize(Integer messageSize) |
| `MessageLength` | `Integer` | Optional | The length of the message content | Integer getMessageLength() | setMessageLength(Integer messageLength) |
| `AttachmentCount` | `Integer` | Optional | The number of attachments the message has | Integer getAttachmentCount() | setAttachmentCount(Integer attachmentCount) |
| `RecipientCount` | `Integer` | Optional | The number of recipients the message has | Integer getRecipientCount() | setRecipientCount(Integer recipientCount) |
| `CampaignClass` | `String` | Optional | The campaign class of the message, if it has one | String getCampaignClass() | setCampaignClass(String campaignClass) |

## Example (as JSON)

```json
{
  "messageId": null,
  "accountId": null,
  "sourceTn": null,
  "destinationTn": null,
  "messageStatus": null,
  "messageDirection": null,
  "messageType": null,
  "segmentCount": null,
  "errorCode": null,
  "receiveTime": null,
  "carrierName": null,
  "messageSize": null,
  "messageLength": null,
  "attachmentCount": null,
  "recipientCount": null,
  "campaignClass": null
}
```

