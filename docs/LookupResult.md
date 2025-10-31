

# LookupResult

Carrier information results for the specified telephone number.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phoneNumber** | **String** | The telephone number in E.164 format. |  [optional] |
|**lineType** | **LineTypeEnum** |  |  [optional] |
|**messagingProvider** | **String** | The messaging service provider of the telephone number. |  [optional] |
|**voiceProvider** | **String** | The voice service provider of the telephone number. |  [optional] |
|**countryCodeA3** | **String** | The country code of the telephone number in ISO 3166-1 alpha-3 format. |  [optional] |
|**deactivationReporter** | **String** | [DNI-Only](#section/DNI-Only). The carrier that reported a deactivation event for this phone number.  |  [optional] |
|**deactivationDate** | **String** | [DNI-Only](#section/DNI-Only). The datetime the carrier reported a deactivation event. |  [optional] |
|**deactivationEvent** | **DeactivationEventEnum** |  |  [optional] |
|**latestMessageDeliveryStatus** | **LatestMessageDeliveryStatusEnum** |  |  [optional] |
|**initialMessageDeliveryStatusDate** | **LocalDate** | [DNI-Only](#section/DNI-Only). The date the phone number entered the status described in &#x60;latestMessageDeliveryStatus&#x60;.  Think of this as the \&quot;start time\&quot; for that status. Value resets every time the &#x60;latestMessageDeliveryStatus&#x60; changes. |  [optional] |
|**latestMessageDeliveryStatusDate** | **LocalDate** | [DNI-Only](#section/DNI-Only). The date bandwidth last received delivery status information for this phone number.  Use this field to understand how up-to-date the &#x60;latestMessageDeliveryStatus&#x60; is. Value resets every time the &#x60;latestMessageDeliveryStatus&#x60; changes. |  [optional] |



