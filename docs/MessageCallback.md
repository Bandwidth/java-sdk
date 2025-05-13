

# MessageCallback

Message Callback Schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**time** | **OffsetDateTime** |  |  |
|**type** | **CallbackTypeEnum** |  |  |
|**to** | **String** |  |  |
|**description** | **String** | A detailed description of the event described by the callback. |  |
|**message** | [**MessageCallbackMessage**](MessageCallbackMessage.md) |  |  |
|**errorCode** | **Integer** | Optional error code, applicable only when type is &#x60;message-failed&#x60;. |  [optional] |
|**carrierName** | **String** | The name of the Authorized Message Provider (AMP) that handled this message. In the US, this is the carrier that the message was sent to. |  [optional] |



