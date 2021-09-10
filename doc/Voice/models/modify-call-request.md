
# Modify Call Request

## Structure

`ModifyCallRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `State` | [`StateEnum`](/doc/Voice/models/state-enum.md) | Optional | **Default**: `StateEnum.ACTIVE`<br>*Default: `StateEnum.ACTIVE`* | StateEnum getState() | setState(StateEnum state) |
| `RedirectUrl` | `String` | Optional | Required if state is 'active' | String getRedirectUrl() | setRedirectUrl(String redirectUrl) |
| `RedirectFallbackUrl` | `String` | Optional | - | String getRedirectFallbackUrl() | setRedirectFallbackUrl(String redirectFallbackUrl) |
| `RedirectMethod` | [`RedirectMethodEnum`](/doc/Voice/models/redirect-method-enum.md) | Optional | - | RedirectMethodEnum getRedirectMethod() | setRedirectMethod(RedirectMethodEnum redirectMethod) |
| `RedirectFallbackMethod` | [`RedirectFallbackMethodEnum`](/doc/Voice/models/redirect-fallback-method-enum.md) | Optional | - | RedirectFallbackMethodEnum getRedirectFallbackMethod() | setRedirectFallbackMethod(RedirectFallbackMethodEnum redirectFallbackMethod) |
| `Username` | `String` | Optional | - | String getUsername() | setUsername(String username) |
| `Password` | `String` | Optional | - | String getPassword() | setPassword(String password) |
| `FallbackUsername` | `String` | Optional | - | String getFallbackUsername() | setFallbackUsername(String fallbackUsername) |
| `FallbackPassword` | `String` | Optional | - | String getFallbackPassword() | setFallbackPassword(String fallbackPassword) |
| `Tag` | `String` | Optional | - | String getTag() | setTag(String tag) |

## Example (as JSON)

```json
{
  "state": null,
  "redirectUrl": null,
  "redirectFallbackUrl": null,
  "redirectMethod": null,
  "redirectFallbackMethod": null,
  "username": null,
  "password": null,
  "fallbackUsername": null,
  "fallbackPassword": null,
  "tag": null
}
```

