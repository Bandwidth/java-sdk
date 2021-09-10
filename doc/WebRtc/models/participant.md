
# Participant

A participant object

## Structure

`Participant`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | Unique id of the participant | String getId() | setId(String id) |
| `CallbackUrl` | `String` | Optional | Full callback url to use for notifications about this participant | String getCallbackUrl() | setCallbackUrl(String callbackUrl) |
| `PublishPermissions` | [`List<PublishPermissionEnum>`](/doc/WebRtc/models/publish-permission-enum.md) | Optional | Defines if this participant can publish audio or video<br>**Constraints**: *Unique Items Required* | List<PublishPermissionEnum> getPublishPermissions() | setPublishPermissions(List<PublishPermissionEnum> publishPermissions) |
| `Sessions` | `List<String>` | Optional | List of session ids this participant is associated with<br><br>Capped to one | List<String> getSessions() | setSessions(List<String> sessions) |
| `Subscriptions` | [`Subscriptions`](/doc/WebRtc/models/subscriptions.md) | Optional | - | Subscriptions getSubscriptions() | setSubscriptions(Subscriptions subscriptions) |
| `Tag` | `String` | Optional | User defined tag to associate with the participant | String getTag() | setTag(String tag) |
| `DeviceApiVersion` | [`DeviceApiVersionEnum`](/doc/WebRtc/models/device-api-version-enum.md) | Optional | Optional field to define the device api version of this participant<br>**Default**: `DeviceApiVersionEnum.V2`<br>*Default: `DeviceApiVersionEnum.V2`* | DeviceApiVersionEnum getDeviceApiVersion() | setDeviceApiVersion(DeviceApiVersionEnum deviceApiVersion) |

## Example (as JSON)

```json
{
  "id": null,
  "callbackUrl": null,
  "publishPermissions": null,
  "sessions": null,
  "subscriptions": null,
  "tag": null,
  "deviceApiVersion": null
}
```

