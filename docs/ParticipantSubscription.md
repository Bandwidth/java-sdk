

# ParticipantSubscription


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**participantId** | **String** | The Participant the subscriber will be subscribed to |  |
|**streamAliases** | **Set&lt;String&gt;** | (optional) An array of specific streamAliases owned by the Participant that the subscriber will be subscribed to. Background: A streamAlias is created by a WebRTC client when it connects and declares a name for the related stream. The client is responsible for informing the application of any created streamAliases to enable the application to subscribe to specific streamAliases. Subscribing to a &#x60;streamAlias&#x60; that does not exist is undefined. If the array is empty all aliases are assumed. |  [optional] |



