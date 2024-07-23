

# RecordingTranscriptionMetadata

If the recording was transcribed, metadata about the transcription

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique transcription ID |  [optional] |
|**status** | **String** | The current status of the process. For recording, current possible values are &#39;processing&#39;, &#39;partial&#39;, &#39;complete&#39;, &#39;deleted&#39;, and &#39;error&#39;. For transcriptions, current possible values are &#39;none&#39;, &#39;processing&#39;, &#39;available&#39;, &#39;error&#39;, &#39;timeout&#39;, &#39;file-size-too-big&#39;, and &#39;file-size-too-small&#39;. Additional states may be added in the future, so your application must be tolerant of unknown values. |  [optional] |
|**completedTime** | **OffsetDateTime** | The time that the transcription was completed |  [optional] |
|**url** | **URI** | The URL of the [transcription](#operation/getCallTranscription) |  [optional] |



