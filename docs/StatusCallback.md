

# StatusCallback

Represents a status callback for an outbound MT SMS or MMS or RBM message.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**time** | **OffsetDateTime** |  |  |
|**eventTime** | **OffsetDateTime** | Represents the time at which the message was read, for &#x60;message-read&#x60; callbacks. |  [optional] |
|**type** | **StatusCallbackTypeEnum** |  |  |
|**to** | **String** | The destination phone number the message was sent to. For status callbacks, this the the Bandwidth user&#39;s client phone number. |  |
|**description** | **String** | A detailed description of the event described by the callback. |  |
|**message** | [**StatusCallbackMessage**](StatusCallbackMessage.md) |  |  |
|**errorCode** | **Integer** | Optional error code, applicable only when type is &#x60;message-failed&#x60;. |  [optional] |
|**carrierName** | **String** | The name of the Authorized Message Provider (AMP) that handled this message.  In the US, this is the carrier that the message was sent to. This field is present only when this account feature has been enabled. |  [optional] |



