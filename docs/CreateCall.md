

# CreateCall


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**to** | **String** | The destination to call (must be an E.164 formatted number (e.g. &#x60;+15555551212&#x60;) or a SIP URI (e.g. &#x60;sip:user@server.example&#x60;)). |  |
|**from** | **String** | A Bandwidth phone number on your account the call should come from (must be in E.164 format, like &#x60;+15555551212&#x60;) even if &#x60;privacy&#x60; is set to true. |  |
|**privacy** | **Boolean** | Hide the calling number. The &#x60;displayName&#x60; field can be used to customize the displayed name. |  [optional] |
|**displayName** | **String** | The caller display name to use when the call is created.  May not exceed 256 characters nor contain control characters such as new lines. If &#x60;privacy&#x60; is true, only the following values are valid: &#x60;Restricted&#x60;, &#x60;Anonymous&#x60;, &#x60;Private&#x60;, or &#x60;Unavailable&#x60;. |  [optional] |
|**uui** | **String** | A comma-separated list of &#39;User-To-User&#39; headers to be sent in the INVITE when calling a SIP URI. Each value must end with an &#39;encoding&#39; parameter as described in &lt;a href&#x3D;&#39;https://tools.ietf.org/html/rfc7433&#39;&gt;RFC 7433&lt;/a&gt;. Only &#39;jwt&#39;, &#39;base64&#39; and &#39;hex&#39; encodings are allowed. The entire value cannot exceed 350 characters, including parameters and separators. |  [optional] |
|**applicationId** | **String** | The id of the application associated with the &#x60;from&#x60; number. |  |
|**answerUrl** | **URI** | The full URL to send the &lt;a href&#x3D;&#39;/docs/voice/webhooks/answer&#39;&gt;Answer&lt;/a&gt; event to when the called party answers. This endpoint should return the first &lt;a href&#x3D;&#39;/docs/voice/bxml&#39;&gt;BXML document&lt;/a&gt; to be executed in the call.  Must use &#x60;https&#x60; if specifying &#x60;username&#x60; and &#x60;password&#x60;. |  |
|**answerMethod** | **CallbackMethodEnum** |  |  [optional] |
|**username** | **String** | Basic auth username. |  [optional] |
|**password** | **String** | Basic auth password. |  [optional] |
|**answerFallbackUrl** | **URI** | A fallback url which, if provided, will be used to retry the &#x60;answer&#x60; webhook delivery in case &#x60;answerUrl&#x60; fails to respond  Must use &#x60;https&#x60; if specifying &#x60;fallbackUsername&#x60; and &#x60;fallbackPassword&#x60;. |  [optional] |
|**answerFallbackMethod** | **CallbackMethodEnum** |  |  [optional] |
|**fallbackUsername** | **String** | Basic auth username. |  [optional] |
|**fallbackPassword** | **String** | Basic auth password. |  [optional] |
|**disconnectUrl** | **URI** | The URL to send the &lt;a href&#x3D;&#39;/docs/voice/webhooks/disconnect&#39;&gt;Disconnect&lt;/a&gt; event to when the call ends. This event does not expect a BXML response. |  [optional] |
|**disconnectMethod** | **CallbackMethodEnum** |  |  [optional] |
|**callTimeout** | **Double** | The timeout (in seconds) for the callee to answer the call after it starts ringing. If the call does not start ringing within 30s, the call will be cancelled regardless of this value.  Can be any numeric value (including decimals) between 1 and 300. |  [optional] |
|**callbackTimeout** | **Double** | This is the timeout (in seconds) to use when delivering webhooks for the call. Can be any numeric value (including decimals) between 1 and 25. |  [optional] |
|**machineDetection** | [**MachineDetectionConfiguration**](MachineDetectionConfiguration.md) |  |  [optional] |
|**priority** | **Integer** | The priority of this call over other calls from your account. For example, if during a call your application needs to place a new call and bridge it with the current call, you might want to create the call with priority 1 so that it will be the next call picked off your queue, ahead of other less time sensitive calls. A lower value means higher priority, so a priority 1 call takes precedence over a priority 2 call. |  [optional] |
|**tag** | **String** | A custom string that will be sent with all webhooks for this call unless overwritten by a future &lt;a href&#x3D;&#39;/docs/voice/bxml/tag&#39;&gt;&#x60;&lt;Tag&gt;&#x60;&lt;/a&gt; verb or &#x60;tag&#x60; attribute on another verb, or cleared.  May be cleared by setting &#x60;tag&#x3D;\&quot;\&quot;&#x60;  Max length 256 characters. |  [optional] |



