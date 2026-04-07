

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
|**businessRegistrationNumber** | **String** | Government-issued business identifying number.  **Note: As of October 19th, 2026 this field will be required when &#x60;businessEntityType&#x60; is _not_ &#x60;SOLE_PROPRIETOR&#x60;. If this field is provided, &#x60;businessRegistrationType&#x60; and &#x60;businessRegistrationIssuingCountry&#x60; are also required.**  |  [optional] |
|**businessRegistrationType** | **BusinessRegistrationTypeEnum** |  |  [optional] |
|**businessRegistrationIssuingCountry** | **String** | The country issuing the business registration in ISO-3166-1 alpha-3 format. Alpha-2 format is accepted by the API, but alpha-3 is highly encouraged.  **Note: As of October 19th, 2026 this field will be required when &#x60;businessRegistrationNumber&#x60; is provided.**  | Registration Type     | Supported Countries                | |----------------------|------------------------------------| | EIN                  | USA                                | | CBN                  | CAN                                | | NEQ                  | CAN                                | | PROVINCIAL_NUMBER    | CAN                                | | CRN                  | GBR, HKG                           | | VAT                  | GBR, IRL, BRA, NLD                 | | ACN                  | AUS                                | | ABN                  | AUS                                | | BRN                  | HKG                                | | SIREN                | FRA                                | | SIRET                | FRA                                | | NZBN                 | NZL                                | | UST_IDNR             | DEU                                | | CIF                  | ESP                                | | NIF                  | ESP                                | | CNPJ                 | BRA                                | | UID                  | CHE                                | | OTHER                | Must Provide Country Code          | |  [optional] |
|**businessEntityType** | **BusinessEntityTypeEnum** |  |  |
|**helpMessageResponse** | **String** | A message that gets sent to users requesting help. |  [optional] |
|**ageGatedContent** | **Boolean** | Indicates whether the content is age-gated. |  [optional] |
|**cvToken** | **String** | The token provided by Campaign Verify to validate your political use case. Only required for 527 political organizations. If you are not a 527 political organization, this field should be omitted. Supplying an empty string will likely result in rejection. |  [optional] |



