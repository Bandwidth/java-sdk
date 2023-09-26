

# LookupStatus

If requestId exists, the result for that request is returned. See the Examples for details on the various responses that you can receive. Generally, if you see a Response Code of 0 in a result for a TN, information will be available for it.  Any other Response Code will indicate no information was available for the TN.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The requestId. |  [optional] |
|**status** | **LookupStatusEnum** |  |  [optional] |
|**result** | [**List&lt;LookupResult&gt;**](LookupResult.md) | The carrier information results for the specified telephone number. |  [optional] |
|**failedTelephoneNumbers** | **List&lt;String&gt;** | The telephone numbers whose lookup failed. |  [optional] |



