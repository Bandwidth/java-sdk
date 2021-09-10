
# Conference State

## Structure

`ConferenceState`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `CreatedTime` | `LocalDateTime` | Optional | - | LocalDateTime getCreatedTime() | setCreatedTime(LocalDateTime createdTime) |
| `CompletedTime` | `LocalDateTime` | Optional | - | LocalDateTime getCompletedTime() | setCompletedTime(LocalDateTime completedTime) |
| `ConferenceEventUrl` | `String` | Optional | - | String getConferenceEventUrl() | setConferenceEventUrl(String conferenceEventUrl) |
| `ConferenceEventMethod` | [`ConferenceEventMethodEnum`](/doc/Voice/models/conference-event-method-enum.md) | Optional | - | ConferenceEventMethodEnum getConferenceEventMethod() | setConferenceEventMethod(ConferenceEventMethodEnum conferenceEventMethod) |
| `Tag` | `String` | Optional | - | String getTag() | setTag(String tag) |
| `ActiveMembers` | [`List<ConferenceMemberState>`](/doc/Voice/models/conference-member-state.md) | Optional | - | List<ConferenceMemberState> getActiveMembers() | setActiveMembers(List<ConferenceMemberState> activeMembers) |

## Example (as JSON)

```json
{
  "id": null,
  "name": null,
  "createdTime": null,
  "completedTime": null,
  "conferenceEventUrl": null,
  "conferenceEventMethod": null,
  "tag": null,
  "activeMembers": null
}
```

