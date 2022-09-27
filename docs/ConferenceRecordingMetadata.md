

# ConferenceRecordingMetadata


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | The user account associated with the call. |  [optional] |
|**conferenceId** | **String** | The unique, Bandwidth-generated ID of the conference that was recorded |  [optional] |
|**name** | **String** | The user-specified name of the conference that was recorded |  [optional] |
|**recordingId** | **String** | The unique ID of this recording |  [optional] |
|**duration** | **String** | The duration of the recording in ISO-8601 format |  [optional] |
|**channels** | **Integer** | Always &#x60;1&#x60; for conference recordings; multi-channel recordings are not supported on conferences. |  [optional] |
|**startTime** | **OffsetDateTime** | Time the call was started, in ISO 8601 format. |  [optional] |
|**endTime** | **OffsetDateTime** | The time that the recording ended in ISO-8601 format |  [optional] |
|**fileFormat** | **FileFormatEnum** |  |  [optional] |
|**status** | **String** | The current status of the process. For recording, current possible values are &#39;processing&#39;, &#39;partial&#39;, &#39;complete&#39;, &#39;deleted&#39;, and &#39;error&#39;. For transcriptions, current possible values are &#39;none&#39;, &#39;processing&#39;, &#39;available&#39;, &#39;error&#39;, &#39;timeout&#39;, &#39;file-size-too-big&#39;, and &#39;file-size-too-small&#39;. Additional states may be added in the future, so your application must be tolerant of unknown values. |  [optional] |
|**mediaUrl** | **URI** | The URL that can be used to download the recording. Only present if the recording is finished and may be downloaded. |  [optional] |



