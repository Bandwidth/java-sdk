
# Call Recording Metadata

## Structure

`CallRecordingMetadata`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ApplicationId` | `String` | Optional | - | String getApplicationId() | setApplicationId(String applicationId) |
| `AccountId` | `String` | Optional | - | String getAccountId() | setAccountId(String accountId) |
| `CallId` | `String` | Optional | - | String getCallId() | setCallId(String callId) |
| `ParentCallId` | `String` | Optional | - | String getParentCallId() | setParentCallId(String parentCallId) |
| `RecordingId` | `String` | Optional | - | String getRecordingId() | setRecordingId(String recordingId) |
| `To` | `String` | Optional | - | String getTo() | setTo(String to) |
| `From` | `String` | Optional | - | String getFrom() | setFrom(String from) |
| `TransferCallerId` | `String` | Optional | - | String getTransferCallerId() | setTransferCallerId(String transferCallerId) |
| `TransferTo` | `String` | Optional | - | String getTransferTo() | setTransferTo(String transferTo) |
| `Duration` | `String` | Optional | Format is ISO-8601 | String getDuration() | setDuration(String duration) |
| `Direction` | [`DirectionEnum`](/doc/Voice/models/direction-enum.md) | Optional | - | DirectionEnum getDirection() | setDirection(DirectionEnum direction) |
| `Channels` | `Integer` | Optional | - | Integer getChannels() | setChannels(Integer channels) |
| `StartTime` | `LocalDateTime` | Optional | - | LocalDateTime getStartTime() | setStartTime(LocalDateTime startTime) |
| `EndTime` | `LocalDateTime` | Optional | - | LocalDateTime getEndTime() | setEndTime(LocalDateTime endTime) |
| `FileFormat` | [`FileFormatEnum`](/doc/Voice/models/file-format-enum.md) | Optional | - | FileFormatEnum getFileFormat() | setFileFormat(FileFormatEnum fileFormat) |
| `Status` | `String` | Optional | The current status of the recording. Current values are 'processing', 'partial', 'complete', 'deleted' and 'error'. Additional states may be added in the future, so your application must be tolerant of unknown values. | String getStatus() | setStatus(String status) |
| `MediaUrl` | `String` | Optional | - | String getMediaUrl() | setMediaUrl(String mediaUrl) |
| `Transcription` | [`TranscriptionMetadata`](/doc/Voice/models/transcription-metadata.md) | Optional | - | TranscriptionMetadata getTranscription() | setTranscription(TranscriptionMetadata transcription) |

## Example (as JSON)

```json
{
  "applicationId": null,
  "accountId": null,
  "callId": null,
  "parentCallId": null,
  "recordingId": null,
  "to": null,
  "from": null,
  "transferCallerId": null,
  "transferTo": null,
  "duration": null,
  "direction": null,
  "channels": null,
  "startTime": null,
  "endTime": null,
  "fileFormat": null,
  "status": null,
  "mediaUrl": null,
  "transcription": null
}
```

