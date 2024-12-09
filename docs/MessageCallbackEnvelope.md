

# MessageCallbackEnvelope

Message Callback Envelope

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**time** | **OffsetDateTime** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**to** | **String** |  |  |
|**description** | **String** |  |  |
|**message** | [**CallbackMessage**](CallbackMessage.md) |  |  |
|**errorCode** | **Integer** | Optional error code, applicable only when type is message-failed |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| RECEIVED | &quot;message-received&quot; |
| DELIVERED | &quot;message-delivered&quot; |
| SENT | &quot;message-sent&quot; |
| FAILED | &quot;message-failed&quot; |



