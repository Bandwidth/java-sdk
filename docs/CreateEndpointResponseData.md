

# CreateEndpointResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**endpointId** | **String** | The unique ID of the endpoint. |  |
|**type** | **EndpointTypeEnum** |  |  |
|**status** | **EndpointStatusEnum** |  |  |
|**creationTimestamp** | **OffsetDateTime** | The time the endpoint was created. In ISO-8601 format. |  |
|**expirationTimestamp** | **OffsetDateTime** | The time the endpoint token will expire. In ISO-8601 format. Tokens last 24 hours. |  |
|**tag** | **String** | A tag for the endpoint. |  [optional] |
|**devices** | [**List&lt;Device&gt;**](Device.md) |  |  [optional] |
|**token** | **String** | The json web token specific to the endpoint. Used to authenticate the client with the media gateway. |  |



