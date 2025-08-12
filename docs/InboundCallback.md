

# InboundCallback

Represents an inbound callback.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**time** | **OffsetDateTime** |  |  |
|**type** | **InboundCallbackTypeEnum** |  |  |
|**to** | **String** | The destination phone number the message was sent to.  For inbound callbacks, this is the Bandwidth number or alphanumeric identifier that received the message.  |  |
|**description** | **String** | A detailed description of the event described by the callback. |  |
|**message** | [**InboundCallbackMessage**](InboundCallbackMessage.md) |  |  |
|**carrierName** | **String** | The name of the Authorized Message Provider (AMP) that handled this message.  In the US, this is the carrier that the message was sent to. This field is present only when this account feature has been enabled. |  [optional] |



