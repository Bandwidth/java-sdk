

# MultiChannelChannelListObjectContent

The content of the message.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**text** | **String** | The contents of the text message. Must be 2048 characters or less. |  |
|**suggestions** | [**List&lt;MultiChannelAction&gt;**](MultiChannelAction.md) | An array of suggested actions for the recipient. |  [optional] |
|**media** | **List&lt;URI&gt;** | A list of URLs to include as media attachments as part of the message. Each URL can be at most 4096 characters. |  |
|**orientation** | **StandaloneCardOrientationEnum** |  |  |
|**thumbnailImageAlignment** | **ThumbnailAlignmentEnum** |  |  |
|**cardContent** | [**RbmCardContent**](RbmCardContent.md) |  |  |
|**cardWidth** | **CardWidthEnum** |  |  |
|**cardContents** | [**List&lt;RbmCardContent&gt;**](RbmCardContent.md) |  |  |



