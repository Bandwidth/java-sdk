
# Result

## Structure

`Result`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ResponseCode` | `Integer` | Optional | Our vendor's response code. | Integer getResponseCode() | setResponseCode(Integer responseCode) |
| `Message` | `String` | Optional | Message associated with the response code. | String getMessage() | setMessage(String message) |
| `E164Format` | `String` | Optional | The telephone number in E.164 format. | String getE164Format() | setE164Format(String e164Format) |
| `Formatted` | `String` | Optional | The formatted version of the telephone number. | String getFormatted() | setFormatted(String formatted) |
| `Country` | `String` | Optional | The country of the telephone number. | String getCountry() | setCountry(String country) |
| `LineType` | `String` | Optional | The line type of the telephone number. | String getLineType() | setLineType(String lineType) |
| `LineProvider` | `String` | Optional | The service provider of the telephone number. | String getLineProvider() | setLineProvider(String lineProvider) |
| `MobileCountryCode` | `String` | Optional | The first half of the Home Network Identity (HNI). | String getMobileCountryCode() | setMobileCountryCode(String mobileCountryCode) |
| `MobileNetworkCode` | `String` | Optional | The second half of the HNI. | String getMobileNetworkCode() | setMobileNetworkCode(String mobileNetworkCode) |

## Example (as JSON)

```json
{
  "Response Code": null,
  "Message": null,
  "E.164 Format": null,
  "Formatted": null,
  "Country": null,
  "Line Type": null,
  "Line Provider": null,
  "Mobile Country Code": null,
  "Mobile Network Code": null
}
```

