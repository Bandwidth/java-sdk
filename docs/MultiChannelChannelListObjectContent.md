

# MultiChannelChannelListObjectContent

The content of the message.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**text** | **String** | The contents of the text message. Must be 2048 characters or less. |  |
|**suggestions** | [**List&lt;MultiChannelAction&gt;**](MultiChannelAction.md) | An array of suggested actions for the recipient. |  [optional] |
|**media** | [**List&lt;MmsMessageContentFile&gt;**](MmsMessageContentFile.md) |  |  |
|**orientation** | **StandaloneCardOrientationEnum** |  |  |
|**thumbnailImageAlignment** | **ThumbnailAlignmentEnum** |  |  |
|**cardContent** | [**RbmCardContent**](RbmCardContent.md) |  |  |
|**cardWidth** | **CardWidthEnum** |  |  |
|**cardContents** | [**List&lt;RbmCardContent&gt;**](RbmCardContent.md) |  |  |



