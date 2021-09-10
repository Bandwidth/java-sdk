
# Bandwidth Callback Message

## Structure

`BandwidthCallbackMessage`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Time` | `String` | Optional | - | String getTime() | setTime(String time) |
| `Type` | `String` | Optional | - | String getType() | setType(String type) |
| `To` | `String` | Optional | - | String getTo() | setTo(String to) |
| `ErrorCode` | `String` | Optional | - | String getErrorCode() | setErrorCode(String errorCode) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `Message` | [`BandwidthMessage`](/doc/Messaging/models/bandwidth-message.md) | Optional | - | BandwidthMessage getMessage() | setMessage(BandwidthMessage message) |

## Example (as JSON)

```json
{
  "time": null,
  "type": null,
  "to": null,
  "errorCode": null,
  "description": null,
  "message": null
}
```

