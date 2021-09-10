
# Subscriptions

## Structure

`Subscriptions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SessionId` | `String` | Required | Session the subscriptions are associated with<br><br>If this is the only field, the subscriber will be subscribed to all participants in the session (including any participants that are later added to the session) | String getSessionId() | setSessionId(String sessionId) |
| `Participants` | [`List<ParticipantSubscription>`](/doc/WebRtc/models/participant-subscription.md) | Optional | Subset of participants to subscribe to in the session. Optional. | List<ParticipantSubscription> getParticipants() | setParticipants(List<ParticipantSubscription> participants) |

## Example (as JSON)

```json
{
  "sessionId": "d8886aad-b956-4e1b-b2f4-d7c9f8162772"
}
```

