

# EndpointEvent

An event that occurred on an endpoint.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**endpointId** | **String** | The unique ID of the endpoint. |  |
|**type** | **EndpointTypeEnum** |  |  |
|**status** | **EndpointStatusEnum** |  |  |
|**creationTimestamp** | **OffsetDateTime** | The time the endpoint was created. In ISO-8601 format. |  |
|**expirationTimestamp** | **OffsetDateTime** | The time the endpoint token will expire. In ISO-8601 format. Tokens last 24 hours. |  |
|**tag** | **String** | A tag for the endpoint. |  [optional] |
|**eventTime** | **OffsetDateTime** | The time the event occurred. In ISO-8601 format. |  |
|**eventType** | **EndpointEventTypeEnum** |  |  |
|**device** | [**Device**](Device.md) |  |  [optional] |



