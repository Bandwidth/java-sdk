

# VerificationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**businessAddress** | [**Address**](Address.md) |  |  |
|**businessContact** | [**Contact**](Contact.md) |  |  |
|**messageVolume** | **Integer** | Estimated monthly volume of messages from the toll-free number. |  |
|**phoneNumbers** | **List&lt;String&gt;** |  |  |
|**useCase** | **String** | The category of the use case. |  |
|**useCaseSummary** | **String** | A general idea of the use case and customer. |  |
|**productionMessageContent** | **String** | Example of message content. |  |
|**optInWorkflow** | [**OptInWorkflow**](OptInWorkflow.md) |  |  |
|**additionalInformation** | **String** | Any additional information. |  [optional] |
|**isvReseller** | **String** | ISV name. |  [optional] |
|**privacyPolicyUrl** | **String** | The Toll-Free Verification request privacy policy URL. |  [optional] |
|**termsAndConditionsUrl** | **String** | The Toll-Free Verification request terms and conditions policy URL. |  [optional] |
|**businessDba** | **String** | The company &#39;Doing Business As&#39;. |  [optional] |
|**businessRegistrationNumber** | **String** | US Federal Tax ID Number (EIN) or Canada Business Number (CBN). Optional until early 2026. If a value is provided for this field, a value must be provided for &#x60;businessRegistrationType&#x60; and &#x60;businessEntityType&#x60;. Available starting October 1st, 2025. |  [optional] |
|**businessRegistrationType** | **BusinessRegistrationTypeEnum** |  |  [optional] |
|**businessEntityType** | **BusinessEntityTypeEnum** |  |  [optional] |
|**helpMessageResponse** | **String** | A message that gets sent to users requesting help. |  [optional] |
|**ageGatedContent** | **Boolean** | Indicates whether the content is age-gated. |  [optional] |



