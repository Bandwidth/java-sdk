
# Conference Recording Metadata

## Structure

`ConferenceRecordingMetadata`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountId` | `String` | Optional | - | String getAccountId() | setAccountId(String accountId) |
| `ConferenceId` | `String` | Optional | - | String getConferenceId() | setConferenceId(String conferenceId) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `RecordingId` | `String` | Optional | - | String getRecordingId() | setRecordingId(String recordingId) |
| `Duration` | `String` | Optional | Format is ISO-8601 | String getDuration() | setDuration(String duration) |
| `Channels` | `Integer` | Optional | - | Integer getChannels() | setChannels(Integer channels) |
| `StartTime` | `LocalDateTime` | Optional | - | LocalDateTime getStartTime() | setStartTime(LocalDateTime startTime) |
| `EndTime` | `LocalDateTime` | Optional | - | LocalDateTime getEndTime() | setEndTime(LocalDateTime endTime) |
| `FileFormat` | [`FileFormatEnum`](/doc/Voice/models/file-format-enum.md) | Optional | - | FileFormatEnum getFileFormat() | setFileFormat(FileFormatEnum fileFormat) |
| `Status` | `String` | Optional | The current status of the recording. Current possible values are 'processing', 'partial', 'complete', 'deleted', and 'error'. Additional states may be added in the future, so your application must be tolerant of unknown values. | String getStatus() | setStatus(String status) |
| `MediaUrl` | `String` | Optional | - | String getMediaUrl() | setMediaUrl(String mediaUrl) |

## Example (as JSON)

```json
{
  "accountId": null,
  "conferenceId": null,
  "name": null,
  "recordingId": null,
  "duration": null,
  "channels": null,
  "startTime": null,
  "endTime": null,
  "fileFormat": null,
  "status": null,
  "mediaUrl": null
}
```

