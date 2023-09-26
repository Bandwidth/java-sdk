

# UpdateConference


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **ConferenceStateEnum** |  |  [optional] |
|**redirectUrl** | **URI** | The URL to send the [conferenceRedirect](/docs/voice/webhooks/conferenceRedirect) event which will provide new BXML. Not allowed if &#x60;state&#x60; is &#x60;completed&#x60;, but required if &#x60;state&#x60; is &#x60;active&#x60;. |  [optional] |
|**redirectMethod** | **RedirectMethodEnum** |  |  [optional] |
|**username** | **String** | Basic auth username. |  [optional] |
|**password** | **String** | Basic auth password. |  [optional] |
|**redirectFallbackUrl** | **URI** | A fallback url which, if provided, will be used to retry the &#x60;conferenceRedirect&#x60; webhook delivery in case &#x60;redirectUrl&#x60; fails to respond.  Not allowed if &#x60;state&#x60; is &#x60;completed&#x60;. |  [optional] |
|**redirectFallbackMethod** | **RedirectMethodEnum** |  |  [optional] |
|**fallbackUsername** | **String** | Basic auth username. |  [optional] |
|**fallbackPassword** | **String** | Basic auth password. |  [optional] |



