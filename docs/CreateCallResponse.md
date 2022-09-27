

# CreateCallResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**applicationId** | **String** | The id of the application associated with the &#x60;from&#x60; number. |  |
|**accountId** | **String** | The bandwidth account ID associated with the call |  |
|**callId** | **String** | Programmable Voice API Call ID |  |
|**to** | **String** | Recipient of the outgoing call |  |
|**from** | **String** | Phone number that created the outbound call |  |
|**enqueuedTime** | **OffsetDateTime** | Time the call was accepted into the queue |  [optional] |
|**callUrl** | **URI** | The URL to update call state |  |
|**callTimeout** | **Double** | The timeout (in seconds) for the callee to answer the call after it starts ringing. |  [optional] |
|**callbackTimeout** | **Double** | This is the timeout (in seconds) to use when delivering webhooks for the call. |  [optional] |
|**tag** | **String** | Custom tag value |  [optional] |
|**answerMethod** | **CallbackMethodEnum** |  |  |
|**answerUrl** | **URI** | URL to deliver the &#x60;answer&#x60; event webhook. |  |
|**answerFallbackMethod** | **CallbackMethodEnum** |  |  [optional] |
|**answerFallbackUrl** | **URI** | Fallback URL to deliver the &#x60;answer&#x60; event webhook. |  [optional] |
|**disconnectMethod** | **CallbackMethodEnum** |  |  |
|**disconnectUrl** | **URI** | URL to deliver the &#x60;disconnect&#x60; event webhook. |  [optional] |
|**username** | **String** | Basic auth username. |  [optional] |
|**password** | **String** | Basic auth password. |  [optional] |
|**fallbackUsername** | **String** | Basic auth username. |  [optional] |
|**fallbackPassword** | **String** | Basic auth password. |  [optional] |
|**priority** | **BigDecimal** | The priority of this call over other calls from your account. |  [optional] |



