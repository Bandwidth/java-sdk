

# Participant

Participant object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique id of the participant. |  [optional] [readonly] |
|**callbackUrl** | **String** | Full callback url to use for notifications about this participant. |  [optional] |
|**publishPermissions** | **Set&lt;PublishPermissionsEnum&gt;** | Defines if this participant can publish audio or video. |  [optional] |
|**sessions** | **List&lt;String&gt;** | List of session ids this participant is associated with  Capped to one  Upon creation of a Participant, returns as an empty array. |  [optional] [readonly] |
|**subscriptions** | [**Subscriptions**](Subscriptions.md) |  |  [optional] |
|**tag** | **String** | User defined tag to associate with the participant. |  [optional] |
|**deviceApiVersion** | **DeviceApiVersionEnum** |  |  [optional] |



