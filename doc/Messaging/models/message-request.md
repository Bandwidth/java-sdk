
# Message Request

## Structure

`MessageRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ApplicationId` | `String` | Required | The ID of the Application your from number is associated with in the Bandwidth Phone Number Dashboard. | String getApplicationId() | setApplicationId(String applicationId) |
| `To` | `List<String>` | Required | The phone number(s) the message should be sent to in E164 format<br>**Constraints**: *Unique Items Required* | List<String> getTo() | setTo(List<String> to) |
| `From` | `String` | Required | One of your telephone numbers the message should come from in E164 format | String getFrom() | setFrom(String from) |
| `Text` | `String` | Optional | The contents of the text message. Must be 2048 characters or less. | String getText() | setText(String text) |
| `Media` | `List<String>` | Optional | A list of URLs to include as media attachments as part of the message. | List<String> getMedia() | setMedia(List<String> media) |
| `Tag` | `String` | Optional | A custom string that will be included in callback events of the message. Max 1024 characters | String getTag() | setTag(String tag) |
| `Priority` | [`PriorityEnum`](/doc/Messaging/models/priority-enum.md) | Optional | The message's priority, currently for toll-free or short code SMS only. Messages with a priority value of `"high"` are given preference over your other traffic. | PriorityEnum getPriority() | setPriority(PriorityEnum priority) |

## Example (as JSON)

```json
{
  "applicationId": "93de2206-9669-4e07-948d-329f4b722ee2",
  "to": [
    "+15554443333",
    "+15552223333"
  ],
  "from": "+15551113333"
}
```
