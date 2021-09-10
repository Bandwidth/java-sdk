
# Modify Conference Request

## Structure

`ModifyConferenceRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | [`StatusEnum`](/doc/Voice/models/status-enum.md) | Optional | - | StatusEnum getStatus() | setStatus(StatusEnum status) |
| `RedirectUrl` | `String` | Optional | - | String getRedirectUrl() | setRedirectUrl(String redirectUrl) |
| `RedirectFallbackUrl` | `String` | Optional | - | String getRedirectFallbackUrl() | setRedirectFallbackUrl(String redirectFallbackUrl) |
| `RedirectMethod` | [`RedirectMethodEnum`](/doc/Voice/models/redirect-method-enum.md) | Optional | - | RedirectMethodEnum getRedirectMethod() | setRedirectMethod(RedirectMethodEnum redirectMethod) |
| `RedirectFallbackMethod` | [`RedirectFallbackMethodEnum`](/doc/Voice/models/redirect-fallback-method-enum.md) | Optional | - | RedirectFallbackMethodEnum getRedirectFallbackMethod() | setRedirectFallbackMethod(RedirectFallbackMethodEnum redirectFallbackMethod) |
| `Username` | `String` | Optional | - | String getUsername() | setUsername(String username) |
| `Password` | `String` | Optional | - | String getPassword() | setPassword(String password) |
| `FallbackUsername` | `String` | Optional | - | String getFallbackUsername() | setFallbackUsername(String fallbackUsername) |
| `FallbackPassword` | `String` | Optional | - | String getFallbackPassword() | setFallbackPassword(String fallbackPassword) |

## Example (as JSON)

```json
{
  "status": null,
  "redirectUrl": null,
  "redirectFallbackUrl": null,
  "redirectMethod": null,
  "redirectFallbackMethod": null,
  "username": null,
  "password": null,
  "fallbackUsername": null,
  "fallbackPassword": null
}
```

