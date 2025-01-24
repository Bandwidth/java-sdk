

# WebhookSubscription

Information about a webhook that Bandwidth should send upon the completion of event customer has subscribed to.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**accountId** | **String** |  |  [optional] |
|**callbackUrl** | **String** | Callback URL to receive status updates from Bandwidth. When a webhook subscription is registered with Bandwidth under a given account ID, it will be used to send status updates for all requests submitted under that account ID. |  |
|**type** | **WebhookSubscriptionTypeEnum** |  |  [optional] |
|**basicAuthentication** | [**WebhookSubscriptionBasicAuthentication**](WebhookSubscriptionBasicAuthentication.md) |  |  [optional] |
|**createdDate** | **OffsetDateTime** |  |  [optional] |
|**modifiedDate** | **OffsetDateTime** |  |  [optional] |



