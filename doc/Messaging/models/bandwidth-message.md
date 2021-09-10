
# Bandwidth Message

## Structure

`BandwidthMessage`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The id of the message | String getId() | setId(String id) |
| `Owner` | `String` | Optional | The Bandwidth phone number associated with the message | String getOwner() | setOwner(String owner) |
| `ApplicationId` | `String` | Optional | The application ID associated with the message | String getApplicationId() | setApplicationId(String applicationId) |
| `Time` | `String` | Optional | The datetime stamp of the message in ISO 8601 | String getTime() | setTime(String time) |
| `SegmentCount` | `Integer` | Optional | The number of segments the original message from the user is broken into before sending over to carrier networks | Integer getSegmentCount() | setSegmentCount(Integer segmentCount) |
| `Direction` | `String` | Optional | The direction of the message relative to Bandwidth. Can be in or out | String getDirection() | setDirection(String direction) |
| `To` | `List<String>` | Optional | The phone number recipients of the message<br>**Constraints**: *Unique Items Required* | List<String> getTo() | setTo(List<String> to) |
| `From` | `String` | Optional | The phone number the message was sent from | String getFrom() | setFrom(String from) |
| `Media` | `List<String>` | Optional | The list of media URLs sent in the message. Including a `filename` field in the `Content-Disposition` header of the media linked with a URL will set the displayed file name. This is a best practice to ensure that your media has a readable file name.<br>**Constraints**: *Unique Items Required* | List<String> getMedia() | setMedia(List<String> media) |
| `Text` | `String` | Optional | The contents of the message | String getText() | setText(String text) |
| `Tag` | `String` | Optional | The custom string set by the user | String getTag() | setTag(String tag) |
| `Priority` | `String` | Optional | The priority specified by the user | String getPriority() | setPriority(String priority) |

## Example (as JSON)

```json
{
  "id": null,
  "owner": null,
  "applicationId": null,
  "time": null,
  "segmentCount": null,
  "direction": null,
  "to": null,
  "from": null,
  "media": null,
  "text": null,
  "tag": null,
  "priority": null
}
```

