
# Order Status

If requestId exists, the result for that request is returned. See the Examples for details on the various responses that you can receive.  Generally, if you see a Response Code of 0 in a result for a TN, information will be available for it.  Any other Response Code will indicate no information was available for the TN.

## Structure

`OrderStatus`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | The requestId. | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | The status of the request (IN_PROGRESS, COMPLETE, PARTIAL_COMPLETE, or FAILED). | String getStatus() | setStatus(String status) |
| `FailedTelephoneNumbers` | `List<String>` | Optional | The telephone numbers whose lookup failed | List<String> getFailedTelephoneNumbers() | setFailedTelephoneNumbers(List<String> failedTelephoneNumbers) |
| `Result` | [`List<Result>`](/doc/PhoneNumberLookup/models/result.md) | Optional | The carrier information results for the specified telephone number. | List<Result> getResult() | setResult(List<Result> result) |

## Example (as JSON)

```json
{
  "requestId": null,
  "status": null,
  "failedTelephoneNumbers": null,
  "result": null
}
```

