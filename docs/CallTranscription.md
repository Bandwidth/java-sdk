

# CallTranscription


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**detectedLanguage** | [**DetectedLanguageEnum**](#DetectedLanguageEnum) | The detected language for this transcription. |  [optional] |
|**track** | [**TrackEnum**](#TrackEnum) | Which &#x60;track&#x60; this transcription is derived from. |  [optional] |
|**text** | **String** | The transcription itself. |  [optional] |
|**confidence** | **Double** | How confident the transcription engine was in transcribing the associated audio (from &#x60;0&#x60; to &#x60;1&#x60;). |  [optional] |



## Enum: DetectedLanguageEnum

| Name | Value |
|---- | -----|
| EN_US | &quot;en-US&quot; |
| ES_US | &quot;es-US&quot; |
| FR_FR | &quot;fr-FR&quot; |



## Enum: TrackEnum

| Name | Value |
|---- | -----|
| INBOUND | &quot;inbound&quot; |
| OUTBOUND | &quot;outbound&quot; |



