

# MessageCallbackMessage

Message payload schema within a MessageCallback

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**owner** | **String** |  |  |
|**applicationId** | **String** |  |  |
|**time** | **OffsetDateTime** |  |  |
|**segmentCount** | **Integer** |  |  |
|**direction** | **MessageDirectionEnum** |  |  |
|**to** | **Set&lt;String&gt;** |  |  |
|**from** | **String** |  |  |
|**text** | **String** |  |  |
|**tag** | **String** |  |  [optional] |
|**media** | **List&lt;URI&gt;** | Optional media, applicable only for mms |  [optional] |
|**priority** | **PriorityEnum** |  |  [optional] |



