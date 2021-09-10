
# Create Call Response

## Structure

`CreateCallResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountId` | `String` | Required | - | String getAccountId() | setAccountId(String accountId) |
| `CallId` | `String` | Required | - | String getCallId() | setCallId(String callId) |
| `ApplicationId` | `String` | Required | - | String getApplicationId() | setApplicationId(String applicationId) |
| `To` | `String` | Required | - | String getTo() | setTo(String to) |
| `From` | `String` | Required | - | String getFrom() | setFrom(String from) |
| `StartTime` | `LocalDateTime` | Optional | - | LocalDateTime getStartTime() | setStartTime(LocalDateTime startTime) |
| `CallUrl` | `String` | Required | - | String getCallUrl() | setCallUrl(String callUrl) |
| `CallTimeout` | `Double` | Optional | - | Double getCallTimeout() | setCallTimeout(Double callTimeout) |
| `CallbackTimeout` | `Double` | Optional | - | Double getCallbackTimeout() | setCallbackTimeout(Double callbackTimeout) |
| `AnswerUrl` | `String` | Required | - | String getAnswerUrl() | setAnswerUrl(String answerUrl) |
| `AnswerMethod` | [`AnswerMethodEnum`](/doc/Voice/models/answer-method-enum.md) | Required | - | AnswerMethodEnum getAnswerMethod() | setAnswerMethod(AnswerMethodEnum answerMethod) |
| `AnswerFallbackUrl` | `String` | Optional | - | String getAnswerFallbackUrl() | setAnswerFallbackUrl(String answerFallbackUrl) |
| `AnswerFallbackMethod` | [`AnswerFallbackMethodEnum`](/doc/Voice/models/answer-fallback-method-enum.md) | Optional | - | AnswerFallbackMethodEnum getAnswerFallbackMethod() | setAnswerFallbackMethod(AnswerFallbackMethodEnum answerFallbackMethod) |
| `DisconnectUrl` | `String` | Optional | - | String getDisconnectUrl() | setDisconnectUrl(String disconnectUrl) |
| `DisconnectMethod` | [`DisconnectMethodEnum`](/doc/Voice/models/disconnect-method-enum.md) | Required | - | DisconnectMethodEnum getDisconnectMethod() | setDisconnectMethod(DisconnectMethodEnum disconnectMethod) |
| `Username` | `String` | Optional | - | String getUsername() | setUsername(String username) |
| `Password` | `String` | Optional | - | String getPassword() | setPassword(String password) |
| `FallbackUsername` | `String` | Optional | - | String getFallbackUsername() | setFallbackUsername(String fallbackUsername) |
| `FallbackPassword` | `String` | Optional | - | String getFallbackPassword() | setFallbackPassword(String fallbackPassword) |
| `Tag` | `String` | Optional | - | String getTag() | setTag(String tag) |

## Example (as JSON)

```json
{
  "accountId": "accountId0",
  "callId": "callId0",
  "applicationId": "applicationId0",
  "to": "to6",
  "from": "from2",
  "startTime": null,
  "callUrl": "callUrl2",
  "callTimeout": null,
  "callbackTimeout": null,
  "answerUrl": "answerUrl8",
  "answerMethod": "POST",
  "answerFallbackUrl": null,
  "answerFallbackMethod": null,
  "disconnectUrl": null,
  "disconnectMethod": "POST",
  "username": null,
  "password": null,
  "fallbackUsername": null,
  "fallbackPassword": null,
  "tag": null
}
```

