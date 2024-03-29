

# TranscribeRecording


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callbackUrl** | **URI** | The URL to send the [TranscriptionAvailable](/docs/voice/webhooks/transcriptionAvailable) event to. You should not include sensitive or personally-identifiable information in the callbackUrl field! Always use the proper username and password fields for authorization. |  [optional] |
|**callbackMethod** | **CallbackMethodEnum** |  |  [optional] |
|**username** | **String** | Basic auth username. |  [optional] |
|**password** | **String** | Basic auth password. |  [optional] |
|**tag** | **String** | (optional) The tag specified on call creation. If no tag was specified or it was previously cleared, this field will not be present. |  [optional] |
|**callbackTimeout** | **Double** | This is the timeout (in seconds) to use when delivering the webhook to &#x60;callbackUrl&#x60;. Can be any numeric value (including decimals) between 1 and 25. |  [optional] |
|**detectLanguage** | **Boolean** | A boolean value to indicate that the recording may not be in English, and the transcription service will need to detect the dominant language the recording is in and transcribe accordingly. Current supported languages are English, French, and Spanish. |  [optional] |



