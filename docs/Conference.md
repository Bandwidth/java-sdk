

# Conference


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The Bandwidth-generated conference ID. |  [optional] |
|**name** | **String** | The name of the conference, as specified by your application. |  [optional] |
|**createdTime** | **OffsetDateTime** | The time the conference was initiated, in ISO 8601 format. |  [optional] |
|**completedTime** | **OffsetDateTime** | The time the conference was terminated, in ISO 8601 format. |  [optional] |
|**conferenceEventUrl** | **URI** | The URL to send the conference-related events. |  [optional] |
|**conferenceEventMethod** | **CallbackMethodEnum** |  |  [optional] |
|**tag** | **String** | The custom string attached to the conference that will be sent with callbacks. |  [optional] |
|**activeMembers** | [**List&lt;ConferenceMember&gt;**](ConferenceMember.md) | A list of active members of the conference. Omitted if this is a response to the [Get Conferences endpoint](/apis/voice#tag/Conferences/operation/listConferences). |  [optional] |



