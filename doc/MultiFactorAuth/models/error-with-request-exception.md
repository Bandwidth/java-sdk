
# Error With Request Exception

## Structure

`ErrorWithRequestException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Error` | `String` | Optional | An error message pertaining to what the issue could be | String getError() | setError(String error) |
| `RequestId` | `String` | Optional | The associated requestId from AWS | String getRequestId() | setRequestId(String requestId) |

## Example (as JSON)

```json
{
  "error": null,
  "requestId": null
}
```

