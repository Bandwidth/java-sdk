
# Error Exception

## Structure

`ErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `int` | Required | - | int getCode() | setCode(int code) |
| `Message` | `String` | Required | - | String getMessage() | setMessage(String message) |

## Example (as JSON)

```json
{
  "code": 500,
  "message": "There was an unexpected error"
}
```

