
# Call Callback

This object represents all possible fields that may be included in callbacks related to call events, including events that come from BXML verbs

## Structure

`CallCallback`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EventType` | `String` | Optional | - | String getEventType() | setEventType(String eventType) |
| `EventTime` | `String` | Optional | - | String getEventTime() | setEventTime(String eventTime) |
| `AccountId` | `String` | Optional | - | String getAccountId() | setAccountId(String accountId) |
| `ApplicationId` | `String` | Optional | - | String getApplicationId() | setApplicationId(String applicationId) |
| `From` | `String` | Optional | - | String getFrom() | setFrom(String from) |
| `To` | `String` | Optional | - | String getTo() | setTo(String to) |
| `Direction` | `String` | Optional | - | String getDirection() | setDirection(String direction) |
| `CallId` | `String` | Optional | - | String getCallId() | setCallId(String callId) |
| `CallUrl` | `String` | Optional | - | String getCallUrl() | setCallUrl(String callUrl) |
| `StartTime` | `String` | Optional | - | String getStartTime() | setStartTime(String startTime) |
| `AnswerTime` | `String` | Optional | - | String getAnswerTime() | setAnswerTime(String answerTime) |
| `TransferCallerId` | `String` | Optional | - | String getTransferCallerId() | setTransferCallerId(String transferCallerId) |
| `TransferTo` | `String` | Optional | - | String getTransferTo() | setTransferTo(String transferTo) |
| `Cause` | `String` | Optional | - | String getCause() | setCause(String cause) |
| `ErrorMessage` | `String` | Optional | - | String getErrorMessage() | setErrorMessage(String errorMessage) |
| `ErrorId` | `String` | Optional | - | String getErrorId() | setErrorId(String errorId) |
| `EndTime` | `String` | Optional | - | String getEndTime() | setEndTime(String endTime) |
| `Digit` | `String` | Optional | - | String getDigit() | setDigit(String digit) |
| `ParentCallId` | `String` | Optional | - | String getParentCallId() | setParentCallId(String parentCallId) |
| `RecordingId` | `String` | Optional | - | String getRecordingId() | setRecordingId(String recordingId) |
| `Duration` | `String` | Optional | - | String getDuration() | setDuration(String duration) |
| `FileFormat` | `String` | Optional | - | String getFileFormat() | setFileFormat(String fileFormat) |
| `MediaUrl` | `String` | Optional | - | String getMediaUrl() | setMediaUrl(String mediaUrl) |
| `Tag` | `String` | Optional | - | String getTag() | setTag(String tag) |
| `Channels` | `Integer` | Optional | - | Integer getChannels() | setChannels(Integer channels) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `Digits` | `String` | Optional | - | String getDigits() | setDigits(String digits) |
| `TerminatingDigit` | `String` | Optional | - | String getTerminatingDigit() | setTerminatingDigit(String terminatingDigit) |
| `Transcription` | [`Transcription`](/doc/Voice/models/transcription.md) | Optional | - | Transcription getTranscription() | setTranscription(Transcription transcription) |
| `Diversion` | [`Diversion`](/doc/Voice/models/diversion.md) | Optional | - | Diversion getDiversion() | setDiversion(Diversion diversion) |

## Example (as JSON)

```json
{
  "eventType": null,
  "eventTime": null,
  "accountId": null,
  "applicationId": null,
  "from": null,
  "to": null,
  "direction": null,
  "callId": null,
  "callUrl": null,
  "startTime": null,
  "answerTime": null,
  "transferCallerId": null,
  "transferTo": null,
  "cause": null,
  "errorMessage": null,
  "errorId": null,
  "endTime": null,
  "digit": null,
  "parentCallId": null,
  "recordingId": null,
  "duration": null,
  "fileFormat": null,
  "mediaUrl": null,
  "tag": null,
  "channels": null,
  "status": null,
  "digits": null,
  "terminatingDigit": null,
  "transcription": null,
  "diversion": null
}
```

