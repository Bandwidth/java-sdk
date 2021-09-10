
# Accounts Participants Response

## Structure

`AccountsParticipantsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Participant` | [`Participant`](/doc/WebRtc/models/participant.md) | Optional | A participant object | Participant getParticipant() | setParticipant(Participant participant) |
| `Token` | `String` | Optional | Auth token for the returned participant<br><br>This should be passed to the participant so that they can connect to the platform | String getToken() | setToken(String token) |

## Example (as JSON)

```json
{
  "participant": null,
  "token": null
}
```

