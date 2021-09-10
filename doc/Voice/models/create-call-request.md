
# Create Call Request

## Structure

`CreateCallRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `From` | `String` | Required | Format is E164 | String getFrom() | setFrom(String from) |
| `To` | `String` | Required | Format is E164 or SIP URI | String getTo() | setTo(String to) |
| `Uui` | `String` | Optional | A comma-separated list of 'User-To-User' headers to be sent in the INVITE when calling a SIP URI. Each value must end with an 'encoding' parameter as described in https://tools.ietf.org/html/rfc7433. Only 'jwt' and 'base64' encodings are allowed. The entire value cannot exceed 350 characters, including parameters and separators. | String getUui() | setUui(String uui) |
| `CallTimeout` | `Double` | Optional | - | Double getCallTimeout() | setCallTimeout(Double callTimeout) |
| `CallbackTimeout` | `Double` | Optional | - | Double getCallbackTimeout() | setCallbackTimeout(Double callbackTimeout) |
| `AnswerUrl` | `String` | Required | - | String getAnswerUrl() | setAnswerUrl(String answerUrl) |
| `AnswerFallbackUrl` | `String` | Optional | - | String getAnswerFallbackUrl() | setAnswerFallbackUrl(String answerFallbackUrl) |
| `Username` | `String` | Optional | - | String getUsername() | setUsername(String username) |
| `Password` | `String` | Optional | - | String getPassword() | setPassword(String password) |
| `FallbackUsername` | `String` | Optional | - | String getFallbackUsername() | setFallbackUsername(String fallbackUsername) |
| `FallbackPassword` | `String` | Optional | - | String getFallbackPassword() | setFallbackPassword(String fallbackPassword) |
| `AnswerMethod` | [`AnswerMethodEnum`](/doc/Voice/models/answer-method-enum.md) | Optional | - | AnswerMethodEnum getAnswerMethod() | setAnswerMethod(AnswerMethodEnum answerMethod) |
| `AnswerFallbackMethod` | [`AnswerFallbackMethodEnum`](/doc/Voice/models/answer-fallback-method-enum.md) | Optional | - | AnswerFallbackMethodEnum getAnswerFallbackMethod() | setAnswerFallbackMethod(AnswerFallbackMethodEnum answerFallbackMethod) |
| `DisconnectUrl` | `String` | Optional | - | String getDisconnectUrl() | setDisconnectUrl(String disconnectUrl) |
| `DisconnectMethod` | [`DisconnectMethodEnum`](/doc/Voice/models/disconnect-method-enum.md) | Optional | - | DisconnectMethodEnum getDisconnectMethod() | setDisconnectMethod(DisconnectMethodEnum disconnectMethod) |
| `Tag` | `String` | Optional | - | String getTag() | setTag(String tag) |
| `ApplicationId` | `String` | Required | - | String getApplicationId() | setApplicationId(String applicationId) |
| `MachineDetection` | [`MachineDetectionRequest`](/doc/Voice/models/machine-detection-request.md) | Optional | - | MachineDetectionRequest getMachineDetection() | setMachineDetection(MachineDetectionRequest machineDetection) |

## Example (as JSON)

```json
{
  "from": "+15555555555",
  "to": "+15555555555, sip:john@doe.com",
  "answerUrl": null,
  "applicationId": null
}
```

