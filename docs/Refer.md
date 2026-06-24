# Refer

The <Refer> BXML verb initiates a SIP REFER on an existing inbound SIP URI call, instructing the remote SIP endpoint to contact a third party directly. On success the call is terminated — the remote endpoint redirects away from Bandwidth entirely. On failure, BXML returned from referCompleteUrl can be used for recovery.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sipUri** | **SipUri** | The SIP URI to refer the call to. Must start with sip:. | required |
|**referCompleteUrl** | **URI** | URL to send the Refer Complete event to and request new BXML for failure recovery. May be a relative URL. |  [optional] |
|**referCompleteMethod** | **String** | The HTTP method to use for the request to referCompleteUrl. GET or POST. Default value is POST. |  [optional] |
|**tag** | **String** | A custom string that will be sent with these and all future callbacks unless overwritten by a future tag attribute or cleared. May be cleared by setting tag="". Max length 256 characters. |  [optional] |




