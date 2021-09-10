
# Transcribe Recording Request

## Structure

`TranscribeRecordingRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CallbackUrl` | `String` | Optional | - | String getCallbackUrl() | setCallbackUrl(String callbackUrl) |
| `CallbackMethod` | [`CallbackMethodEnum`](/doc/Voice/models/callback-method-enum.md) | Optional | - | CallbackMethodEnum getCallbackMethod() | setCallbackMethod(CallbackMethodEnum callbackMethod) |
| `Username` | `String` | Optional | - | String getUsername() | setUsername(String username) |
| `Password` | `String` | Optional | - | String getPassword() | setPassword(String password) |
| `Tag` | `String` | Optional | - | String getTag() | setTag(String tag) |
| `CallbackTimeout` | `Double` | Optional | - | Double getCallbackTimeout() | setCallbackTimeout(Double callbackTimeout) |

## Example (as JSON)

```json
{
  "callbackUrl": null,
  "callbackMethod": null,
  "username": null,
  "password": null,
  "tag": null,
  "callbackTimeout": null
}
```

