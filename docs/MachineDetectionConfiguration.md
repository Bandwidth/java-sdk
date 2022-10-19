

# MachineDetectionConfiguration

The machine detection request used to perform <a href='/docs/voice/guides/machineDetection'>machine detection</a> on the call.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mode** | **MachineDetectionModeEnum** |  |  [optional] |
|**detectionTimeout** | **Double** | The timeout used for the whole operation, in seconds. If no result is determined in this period, a callback with a &#x60;timeout&#x60; result is sent. |  [optional] |
|**silenceTimeout** | **Double** | If no speech is detected in this period, a callback with a &#39;silence&#39; result is sent. |  [optional] |
|**speechThreshold** | **Double** | When speech has ended and a result couldn&#39;t be determined based on the audio content itself, this value is used to determine if the speaker is a machine based on the speech duration. If the length of the speech detected is greater than or equal to this threshold, the result will be &#39;answering-machine&#39;. If the length of speech detected is below this threshold, the result will be &#39;human&#39;. |  [optional] |
|**speechEndThreshold** | **Double** | Amount of silence (in seconds) before assuming the callee has finished speaking. |  [optional] |
|**machineSpeechEndThreshold** | **Double** | When an answering machine is detected, the amount of silence (in seconds) before assuming the message has finished playing.  If not provided it will default to the speechEndThreshold value. |  [optional] |
|**delayResult** | **Boolean** | If set to &#39;true&#39; and if an answering machine is detected, the &#39;answering-machine&#39; callback will be delayed until the machine is done speaking, or an end of message tone is detected, or until the &#39;detectionTimeout&#39; is exceeded. If false, the &#39;answering-machine&#39; result is sent immediately. |  [optional] |
|**callbackUrl** | **URI** | The URL to send the &#39;machineDetectionComplete&#39; webhook when the detection is completed. Only for &#39;async&#39; mode. |  [optional] |
|**callbackMethod** | **CallbackMethodEnum** |  |  [optional] |
|**username** | **String** | Basic auth username. |  [optional] |
|**password** | **String** | Basic auth password. |  [optional] |
|**fallbackUrl** | **URI** | A fallback URL which, if provided, will be used to retry the machine detection complete webhook delivery in case &#x60;callbackUrl&#x60; fails to respond |  [optional] |
|**fallbackMethod** | **CallbackMethodEnum** |  |  [optional] |
|**fallbackUsername** | **String** | Basic auth username. |  [optional] |
|**fallbackPassword** | **String** | Basic auth password. |  [optional] |


