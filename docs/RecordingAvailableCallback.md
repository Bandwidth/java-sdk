

# RecordingAvailableCallback

The Recording Available event is sent after a recording has been processed. It indicates that the recording is available for download.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventType** | **String** | The event type, value can be one of the following: answer, bridgeComplete, bridgeTargetComplete, conferenceCreated, conferenceRedirect, conferenceMemberJoin, conferenceMemberExit, conferenceCompleted, conferenceRecordingAvailable, disconnect, dtmf, gather, initiate, machineDetectionComplete, recordingComplete, recordingAvailable, redirect, transcriptionAvailable, transferAnswer, transferComplete, transferDisconnect. |  [optional] |
|**eventTime** | **OffsetDateTime** | The approximate UTC date and time when the event was generated by the Bandwidth server, in ISO 8601 format. This may not be exactly the time of event execution. |  [optional] |
|**accountId** | **String** | The user account associated with the call. |  [optional] |
|**applicationId** | **String** | The id of the application associated with the call. |  [optional] |
|**from** | **String** | The provided identifier of the caller. Must be a phone number in E.164 format (e.g. +15555555555). |  [optional] |
|**to** | **String** | The phone number that received the call, in E.164 format (e.g. +15555555555). |  [optional] |
|**direction** | **CallDirectionEnum** |  |  [optional] |
|**callId** | **String** | The call id associated with the event. |  [optional] |
|**callUrl** | **URI** | The URL of the call associated with the event. |  [optional] |
|**parentCallId** | **String** | (optional) If the event is related to the B leg of a &lt;Transfer&gt;, the call id of the original call leg that executed the &lt;Transfer&gt;. Otherwise, this field will not be present. |  [optional] |
|**recordingId** | **String** | The unique ID of this recording |  [optional] |
|**mediaUrl** | **URI** | The URL that can be used to download the recording. Only present if the recording is finished and may be downloaded. |  [optional] |
|**enqueuedTime** | **OffsetDateTime** | (optional) If call queueing is enabled and this is an outbound call, time the call was queued, in ISO 8601 format. |  [optional] |
|**startTime** | **OffsetDateTime** | Time the call was started, in ISO 8601 format. |  [optional] |
|**endTime** | **OffsetDateTime** | The time that the recording ended in ISO-8601 format |  [optional] |
|**duration** | **String** | The duration of the recording in ISO-8601 format |  [optional] |
|**fileFormat** | **FileFormatEnum** |  |  [optional] |
|**channels** | **Integer** | Always &#x60;1&#x60; for conference recordings; multi-channel recordings are not supported on conferences. |  [optional] |
|**tag** | **String** | (optional) The tag specified on call creation. If no tag was specified or it was previously cleared, this field will not be present. |  [optional] |
|**status** | **String** | The current status of the process. For recording, current possible values are &#39;processing&#39;, &#39;partial&#39;, &#39;complete&#39;, &#39;deleted&#39;, and &#39;error&#39;. For transcriptions, current possible values are &#39;none&#39;, &#39;processing&#39;, &#39;available&#39;, &#39;error&#39;, &#39;timeout&#39;, &#39;file-size-too-big&#39;, and &#39;file-size-too-small&#39;. Additional states may be added in the future, so your application must be tolerant of unknown values. |  [optional] |
|**transferCallerId** | **String** | The phone number used as the from field of the B-leg call, in E.164 format (e.g. +15555555555). |  [optional] |
|**transferTo** | **String** | The phone number used as the to field of the B-leg call, in E.164 format (e.g. +15555555555). |  [optional] |



