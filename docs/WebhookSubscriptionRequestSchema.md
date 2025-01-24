

# WebhookSubscriptionRequestSchema


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**basicAuthentication** | [**TfvBasicAuthentication**](TfvBasicAuthentication.md) |  |  [optional] |
|**callbackUrl** | **String** | Callback URL to receive status updates from Bandwidth. When a webhook subscription is registered with Bandwidth under a given account ID, it will be used to send status updates for all requests submitted under that account ID. |  |
|**sharedSecretKey** | **String** | An ASCII string submitted by the user as a shared secret key for generating an HMAC header for callbacks. |  [optional] |



