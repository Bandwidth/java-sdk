

# Message


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The id of the message. |  [optional] |
|**owner** | **String** | The Bandwidth phone number associated with the message. |  [optional] |
|**applicationId** | **String** | The application ID associated with the message. |  [optional] |
|**time** | **OffsetDateTime** | The datetime stamp of the message in ISO 8601 |  [optional] |
|**segmentCount** | **Integer** | The number of segments the original message from the user is broken into before sending over to carrier networks. |  [optional] |
|**direction** | **MessageDirectionEnum** |  |  [optional] |
|**to** | **Set&lt;String&gt;** | The phone number recipients of the message. |  [optional] |
|**from** | **String** | The phone number the message was sent from. |  [optional] |
|**media** | **Set&lt;String&gt;** | The list of media URLs sent in the message. Including a &#x60;filename&#x60; field in the &#x60;Content-Disposition&#x60; header of the media linked with a URL will set the displayed file name. This is a best practice to ensure that your media has a readable file name. |  [optional] |
|**text** | **String** | The contents of the message. |  [optional] |
|**tag** | **String** | The custom string set by the user. |  [optional] |
|**priority** | **PriorityEnum** |  |  [optional] |
|**expiration** | **OffsetDateTime** | A string with the date/time value that the message will automatically expire by. This must be a valid RFC-3339 value, e.g., 2021-03-14T01:59:26Z or 2021-03-13T20:59:26-05:00. Must be a date-time in the future. |  [optional] |



