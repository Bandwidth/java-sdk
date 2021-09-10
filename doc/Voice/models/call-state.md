
# Call State

## Structure

`CallState`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CallId` | `String` | Optional | - | String getCallId() | setCallId(String callId) |
| `ParentCallId` | `String` | Optional | - | String getParentCallId() | setParentCallId(String parentCallId) |
| `ApplicationId` | `String` | Optional | - | String getApplicationId() | setApplicationId(String applicationId) |
| `AccountId` | `String` | Optional | - | String getAccountId() | setAccountId(String accountId) |
| `To` | `String` | Optional | - | String getTo() | setTo(String to) |
| `From` | `String` | Optional | - | String getFrom() | setFrom(String from) |
| `Direction` | `String` | Optional | - | String getDirection() | setDirection(String direction) |
| `State` | `String` | Optional | The current state of the call. Current possible values are 'initiated', 'answered' and 'disconnected'. Additional states may be added in the future, so your application must be tolerant of unknown values. | String getState() | setState(String state) |
| `Identity` | `String` | Optional | - | String getIdentity() | setIdentity(String identity) |
| `StirShaken` | `Map<String, String>` | Optional | - | Map<String, String> getStirShaken() | setStirShaken(Map<String, String> stirShaken) |
| `StartTime` | `LocalDateTime` | Optional | - | LocalDateTime getStartTime() | setStartTime(LocalDateTime startTime) |
| `AnswerTime` | `LocalDateTime` | Optional | - | LocalDateTime getAnswerTime() | setAnswerTime(LocalDateTime answerTime) |
| `EndTime` | `LocalDateTime` | Optional | - | LocalDateTime getEndTime() | setEndTime(LocalDateTime endTime) |
| `DisconnectCause` | `String` | Optional | The reason the call was disconnected, or null if the call is still active. Current values are 'cancel', 'timeout', 'busy', 'rejected', 'hangup', 'invalid-bxml', 'callback-error', 'application-error', 'error', 'account-limit', 'node-capacity-exceeded' and 'unknown'. Additional causes may be added in the future, so your application must be tolerant of unknown values. | String getDisconnectCause() | setDisconnectCause(String disconnectCause) |
| `ErrorMessage` | `String` | Optional | - | String getErrorMessage() | setErrorMessage(String errorMessage) |
| `ErrorId` | `String` | Optional | - | String getErrorId() | setErrorId(String errorId) |
| `LastUpdate` | `LocalDateTime` | Optional | - | LocalDateTime getLastUpdate() | setLastUpdate(LocalDateTime lastUpdate) |

## Example (as JSON)

```json
{
  "callId": null,
  "parentCallId": null,
  "applicationId": null,
  "accountId": null,
  "to": null,
  "from": null,
  "direction": null,
  "state": null,
  "identity": null,
  "stirShaken": null,
  "startTime": null,
  "answerTime": null,
  "endTime": null,
  "disconnectCause": null,
  "errorMessage": null,
  "errorId": null,
  "lastUpdate": null
}
```

