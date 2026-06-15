

# MultiChannelAction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **RbmActionTypeEnum** |  |  |
|**text** | **String** | Displayed text for user to click |  |
|**postbackData** | **byte[]** | Base64 payload the customer receives when the reply is clicked. |  |
|**phoneNumber** | **String** | The phone number to dial. Must be E164 format. |  |
|**latitude** | **Double** | The latitude of the location. Must be in range [-90.000000, 90.000000]. |  |
|**longitude** | **Double** | The longitude of the location. Must be in range [-180.000000, 180.000000]. |  |
|**label** | **String** | The label of the location. |  [optional] |
|**title** | **String** | The title of the event. |  |
|**startTime** | **OffsetDateTime** | The start time of the event. Must be a valid RFC-3339 value, e.g., 2021-03-14T01:59:26Z or 2021-03-13T20:59:26-05:00. |  |
|**endTime** | **OffsetDateTime** | The end time of the event. Must be a valid RFC-3339 value, e.g., 2021-03-14T01:59:26Z or 2021-03-13T20:59:26-05:00. |  |
|**description** | **String** | The description of the event. |  [optional] |
|**url** | **URI** | The URL to open in browser. Must use http:// or https:// scheme. |  |
|**application** | **RbmOpenUrlEnum** |  |  [optional] |
|**webviewViewMode** | **RbmWebViewEnum** |  |  [optional] |



