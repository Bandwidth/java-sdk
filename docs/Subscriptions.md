

# Subscriptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sessionId** | **String** | If present, and not overridden by the array of participants, it  represents the session the subscriptions are associated with. If this is the only field, the subscriber will be subscribed to all participants in the session (including any participants that are later added to the session). Upon creation of a Participant, returns as an empty object. |  [optional] |
|**participants** | [**List&lt;ParticipantSubscription&gt;**](ParticipantSubscription.md) | (optional) A list of participants  in the session that will be subscribed to.  If present and not  empty or null, this will override  any sessionId specified in the body. Returns empty if used during the creation of a Participant.  |  [optional] |



