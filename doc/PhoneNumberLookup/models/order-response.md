
# Order Response

The request has been accepted for processing but not yet finished and in a terminal state (COMPLETE, PARTIAL_COMPLETE, or FAILED)

## Structure

`OrderResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | - | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |

## Example (as JSON)

```json
{
  "requestId": null,
  "status": null
}
```

