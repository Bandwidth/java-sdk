
# Transcription Metadata

## Structure

`TranscriptionMetadata`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `Status` | `String` | Optional | The current status of the transcription. Current values are 'none', 'processing', 'available', 'error', 'timeout', 'file-size-too-big', and 'file-size-too-small'. Additional states may be added in the future, so your application must be tolerant of unknown values. | String getStatus() | setStatus(String status) |
| `CompletedTime` | `String` | Optional | - | String getCompletedTime() | setCompletedTime(String completedTime) |
| `Url` | `String` | Optional | - | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "id": null,
  "status": null,
  "completedTime": null,
  "url": null
}
```

