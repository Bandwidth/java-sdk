# bandwidth-sdk

Bandwidth
- API version: 1.0.0
  - Generator version: 7.10.0

Bandwidth's Communication APIs

  For more information, please visit [https://dev.bandwidth.com](https://dev.bandwidth.com)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.bandwidth.sdk</groupId>
  <artifactId>bandwidth-sdk</artifactId>
  <version>1.0.0-dev</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'bandwidth-sdk' jar has been published to maven central.
    mavenLocal()       // Needed if the 'bandwidth-sdk' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.bandwidth.sdk:bandwidth-sdk:1.0.0-dev"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/bandwidth-sdk-1.0.0-dev.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.model.*;
import com.bandwidth.sdk.api.CallsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    CallsApi apiInstance = new CallsApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    CreateCall createCall = new CreateCall(); // CreateCall | JSON object containing information to create an outbound call
    try {
      CreateCallResponse result = apiInstance.createCall(accountId, createCall);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallsApi#createCall");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CallsApi* | [**createCall**](docs/CallsApi.md#createCall) | **POST** /accounts/{accountId}/calls | Create Call
*CallsApi* | [**getCallState**](docs/CallsApi.md#getCallState) | **GET** /accounts/{accountId}/calls/{callId} | Get Call State Information
*CallsApi* | [**listCalls**](docs/CallsApi.md#listCalls) | **GET** /accounts/{accountId}/calls | Get Calls
*CallsApi* | [**updateCall**](docs/CallsApi.md#updateCall) | **POST** /accounts/{accountId}/calls/{callId} | Update Call
*CallsApi* | [**updateCallBxml**](docs/CallsApi.md#updateCallBxml) | **PUT** /accounts/{accountId}/calls/{callId}/bxml | Update Call BXML
*ConferencesApi* | [**downloadConferenceRecording**](docs/ConferencesApi.md#downloadConferenceRecording) | **GET** /accounts/{accountId}/conferences/{conferenceId}/recordings/{recordingId}/media | Download Conference Recording
*ConferencesApi* | [**getConference**](docs/ConferencesApi.md#getConference) | **GET** /accounts/{accountId}/conferences/{conferenceId} | Get Conference Information
*ConferencesApi* | [**getConferenceMember**](docs/ConferencesApi.md#getConferenceMember) | **GET** /accounts/{accountId}/conferences/{conferenceId}/members/{memberId} | Get Conference Member
*ConferencesApi* | [**getConferenceRecording**](docs/ConferencesApi.md#getConferenceRecording) | **GET** /accounts/{accountId}/conferences/{conferenceId}/recordings/{recordingId} | Get Conference Recording Information
*ConferencesApi* | [**listConferenceRecordings**](docs/ConferencesApi.md#listConferenceRecordings) | **GET** /accounts/{accountId}/conferences/{conferenceId}/recordings | Get Conference Recordings
*ConferencesApi* | [**listConferences**](docs/ConferencesApi.md#listConferences) | **GET** /accounts/{accountId}/conferences | Get Conferences
*ConferencesApi* | [**updateConference**](docs/ConferencesApi.md#updateConference) | **POST** /accounts/{accountId}/conferences/{conferenceId} | Update Conference
*ConferencesApi* | [**updateConferenceBxml**](docs/ConferencesApi.md#updateConferenceBxml) | **PUT** /accounts/{accountId}/conferences/{conferenceId}/bxml | Update Conference BXML
*ConferencesApi* | [**updateConferenceMember**](docs/ConferencesApi.md#updateConferenceMember) | **PUT** /accounts/{accountId}/conferences/{conferenceId}/members/{memberId} | Update Conference Member
*MediaApi* | [**deleteMedia**](docs/MediaApi.md#deleteMedia) | **DELETE** /users/{accountId}/media/{mediaId} | Delete Media
*MediaApi* | [**getMedia**](docs/MediaApi.md#getMedia) | **GET** /users/{accountId}/media/{mediaId} | Get Media
*MediaApi* | [**listMedia**](docs/MediaApi.md#listMedia) | **GET** /users/{accountId}/media | List Media
*MediaApi* | [**uploadMedia**](docs/MediaApi.md#uploadMedia) | **PUT** /users/{accountId}/media/{mediaId} | Upload Media
*MessagesApi* | [**createMessage**](docs/MessagesApi.md#createMessage) | **POST** /users/{accountId}/messages | Create Message
*MessagesApi* | [**listMessages**](docs/MessagesApi.md#listMessages) | **GET** /users/{accountId}/messages | List Messages
*MfaApi* | [**generateMessagingCode**](docs/MfaApi.md#generateMessagingCode) | **POST** /accounts/{accountId}/code/messaging | Messaging Authentication Code
*MfaApi* | [**generateVoiceCode**](docs/MfaApi.md#generateVoiceCode) | **POST** /accounts/{accountId}/code/voice | Voice Authentication Code
*MfaApi* | [**verifyCode**](docs/MfaApi.md#verifyCode) | **POST** /accounts/{accountId}/code/verify | Verify Authentication Code
*PhoneNumberLookupApi* | [**createLookup**](docs/PhoneNumberLookupApi.md#createLookup) | **POST** /accounts/{accountId}/tnlookup | Create Lookup
*PhoneNumberLookupApi* | [**getLookupStatus**](docs/PhoneNumberLookupApi.md#getLookupStatus) | **GET** /accounts/{accountId}/tnlookup/{requestId} | Get Lookup Request Status
*RecordingsApi* | [**deleteRecording**](docs/RecordingsApi.md#deleteRecording) | **DELETE** /accounts/{accountId}/calls/{callId}/recordings/{recordingId} | Delete Recording
*RecordingsApi* | [**deleteRecordingMedia**](docs/RecordingsApi.md#deleteRecordingMedia) | **DELETE** /accounts/{accountId}/calls/{callId}/recordings/{recordingId}/media | Delete Recording Media
*RecordingsApi* | [**deleteRecordingTranscription**](docs/RecordingsApi.md#deleteRecordingTranscription) | **DELETE** /accounts/{accountId}/calls/{callId}/recordings/{recordingId}/transcription | Delete Transcription
*RecordingsApi* | [**downloadCallRecording**](docs/RecordingsApi.md#downloadCallRecording) | **GET** /accounts/{accountId}/calls/{callId}/recordings/{recordingId}/media | Download Recording
*RecordingsApi* | [**getCallRecording**](docs/RecordingsApi.md#getCallRecording) | **GET** /accounts/{accountId}/calls/{callId}/recordings/{recordingId} | Get Call Recording
*RecordingsApi* | [**getRecordingTranscription**](docs/RecordingsApi.md#getRecordingTranscription) | **GET** /accounts/{accountId}/calls/{callId}/recordings/{recordingId}/transcription | Get Transcription
*RecordingsApi* | [**listAccountCallRecordings**](docs/RecordingsApi.md#listAccountCallRecordings) | **GET** /accounts/{accountId}/recordings | Get Call Recordings
*RecordingsApi* | [**listCallRecordings**](docs/RecordingsApi.md#listCallRecordings) | **GET** /accounts/{accountId}/calls/{callId}/recordings | List Call Recordings
*RecordingsApi* | [**transcribeCallRecording**](docs/RecordingsApi.md#transcribeCallRecording) | **POST** /accounts/{accountId}/calls/{callId}/recordings/{recordingId}/transcription | Create Transcription Request
*RecordingsApi* | [**updateCallRecordingState**](docs/RecordingsApi.md#updateCallRecordingState) | **PUT** /accounts/{accountId}/calls/{callId}/recording | Update Recording
*StatisticsApi* | [**getStatistics**](docs/StatisticsApi.md#getStatistics) | **GET** /accounts/{accountId}/statistics | Get Account Statistics
*TollFreeVerificationApi* | [**createWebhookSubscription**](docs/TollFreeVerificationApi.md#createWebhookSubscription) | **POST** /accounts/{accountId}/tollFreeVerification/webhooks/subscriptions | Create Webhook Subscription
*TollFreeVerificationApi* | [**deleteWebhookSubscription**](docs/TollFreeVerificationApi.md#deleteWebhookSubscription) | **DELETE** /accounts/{accountId}/tollFreeVerification/webhooks/subscriptions/{id} | Delete Webhook Subscription
*TollFreeVerificationApi* | [**getTollFreeVerificationStatus**](docs/TollFreeVerificationApi.md#getTollFreeVerificationStatus) | **GET** /accounts/{accountId}/phoneNumbers/{phoneNumber}/tollFreeVerification | Get Toll-Free Verification Status
*TollFreeVerificationApi* | [**listTollFreeUseCases**](docs/TollFreeVerificationApi.md#listTollFreeUseCases) | **GET** /tollFreeVerification/useCases | List Toll-Free Use Cases
*TollFreeVerificationApi* | [**listWebhookSubscriptions**](docs/TollFreeVerificationApi.md#listWebhookSubscriptions) | **GET** /accounts/{accountId}/tollFreeVerification/webhooks/subscriptions | List Webhook Subscriptions
*TollFreeVerificationApi* | [**requestTollFreeVerification**](docs/TollFreeVerificationApi.md#requestTollFreeVerification) | **POST** /accounts/{accountId}/tollFreeVerification | Request Toll-Free Verification
*TollFreeVerificationApi* | [**updateTollFreeVerificationRequest**](docs/TollFreeVerificationApi.md#updateTollFreeVerificationRequest) | **PUT** /accounts/{accountId}/phoneNumbers/{phoneNumber}/tollFreeVerification | Update Toll-Free Verification Request
*TollFreeVerificationApi* | [**updateWebhookSubscription**](docs/TollFreeVerificationApi.md#updateWebhookSubscription) | **PUT** /accounts/{accountId}/tollFreeVerification/webhooks/subscriptions/{id} | Update Webhook Subscription
*TranscriptionsApi* | [**deleteRealTimeTranscription**](docs/TranscriptionsApi.md#deleteRealTimeTranscription) | **DELETE** /accounts/{accountId}/calls/{callId}/transcriptions/{transcriptionId} | Delete a specific transcription
*TranscriptionsApi* | [**getRealTimeTranscription**](docs/TranscriptionsApi.md#getRealTimeTranscription) | **GET** /accounts/{accountId}/calls/{callId}/transcriptions/{transcriptionId} | Retrieve a specific transcription
*TranscriptionsApi* | [**listRealTimeTranscriptions**](docs/TranscriptionsApi.md#listRealTimeTranscriptions) | **GET** /accounts/{accountId}/calls/{callId}/transcriptions | Enumerate transcriptions made with StartTranscription


## Documentation for Models

 - [AccountStatistics](docs/AccountStatistics.md)
 - [AdditionalDenialReason](docs/AdditionalDenialReason.md)
 - [Address](docs/Address.md)
 - [AnswerCallback](docs/AnswerCallback.md)
 - [BridgeCompleteCallback](docs/BridgeCompleteCallback.md)
 - [BridgeTargetCompleteCallback](docs/BridgeTargetCompleteCallback.md)
 - [CallDirectionEnum](docs/CallDirectionEnum.md)
 - [CallRecordingMetadata](docs/CallRecordingMetadata.md)
 - [CallState](docs/CallState.md)
 - [CallStateEnum](docs/CallStateEnum.md)
 - [CallTranscription](docs/CallTranscription.md)
 - [CallTranscriptionDetectedLanguageEnum](docs/CallTranscriptionDetectedLanguageEnum.md)
 - [CallTranscriptionMetadata](docs/CallTranscriptionMetadata.md)
 - [CallTranscriptionResponse](docs/CallTranscriptionResponse.md)
 - [CallTranscriptionTrackEnum](docs/CallTranscriptionTrackEnum.md)
 - [CallbackMethodEnum](docs/CallbackMethodEnum.md)
 - [CallbackTypeEnum](docs/CallbackTypeEnum.md)
 - [CodeRequest](docs/CodeRequest.md)
 - [Conference](docs/Conference.md)
 - [ConferenceCompletedCallback](docs/ConferenceCompletedCallback.md)
 - [ConferenceCreatedCallback](docs/ConferenceCreatedCallback.md)
 - [ConferenceMember](docs/ConferenceMember.md)
 - [ConferenceMemberExitCallback](docs/ConferenceMemberExitCallback.md)
 - [ConferenceMemberJoinCallback](docs/ConferenceMemberJoinCallback.md)
 - [ConferenceRecordingAvailableCallback](docs/ConferenceRecordingAvailableCallback.md)
 - [ConferenceRecordingMetadata](docs/ConferenceRecordingMetadata.md)
 - [ConferenceRedirectCallback](docs/ConferenceRedirectCallback.md)
 - [ConferenceStateEnum](docs/ConferenceStateEnum.md)
 - [Contact](docs/Contact.md)
 - [CreateCall](docs/CreateCall.md)
 - [CreateCallResponse](docs/CreateCallResponse.md)
 - [CreateLookupResponse](docs/CreateLookupResponse.md)
 - [CreateMessageRequestError](docs/CreateMessageRequestError.md)
 - [DeferredResult](docs/DeferredResult.md)
 - [DisconnectCallback](docs/DisconnectCallback.md)
 - [Diversion](docs/Diversion.md)
 - [DtmfCallback](docs/DtmfCallback.md)
 - [Error](docs/Error.md)
 - [FailureWebhook](docs/FailureWebhook.md)
 - [FieldError](docs/FieldError.md)
 - [FileFormatEnum](docs/FileFormatEnum.md)
 - [GatherCallback](docs/GatherCallback.md)
 - [InitiateCallback](docs/InitiateCallback.md)
 - [LinksObject](docs/LinksObject.md)
 - [ListMessageDirectionEnum](docs/ListMessageDirectionEnum.md)
 - [ListMessageItem](docs/ListMessageItem.md)
 - [LookupRequest](docs/LookupRequest.md)
 - [LookupResult](docs/LookupResult.md)
 - [LookupStatus](docs/LookupStatus.md)
 - [LookupStatusEnum](docs/LookupStatusEnum.md)
 - [MachineDetectionCompleteCallback](docs/MachineDetectionCompleteCallback.md)
 - [MachineDetectionConfiguration](docs/MachineDetectionConfiguration.md)
 - [MachineDetectionModeEnum](docs/MachineDetectionModeEnum.md)
 - [MachineDetectionResult](docs/MachineDetectionResult.md)
 - [Media](docs/Media.md)
 - [Message](docs/Message.md)
 - [MessageCallback](docs/MessageCallback.md)
 - [MessageCallbackMessage](docs/MessageCallbackMessage.md)
 - [MessageDirectionEnum](docs/MessageDirectionEnum.md)
 - [MessageRequest](docs/MessageRequest.md)
 - [MessageStatusEnum](docs/MessageStatusEnum.md)
 - [MessageTypeEnum](docs/MessageTypeEnum.md)
 - [MessagesList](docs/MessagesList.md)
 - [MessagingCodeResponse](docs/MessagingCodeResponse.md)
 - [MessagingRequestError](docs/MessagingRequestError.md)
 - [MfaForbiddenRequestError](docs/MfaForbiddenRequestError.md)
 - [MfaRequestError](docs/MfaRequestError.md)
 - [MfaUnauthorizedRequestError](docs/MfaUnauthorizedRequestError.md)
 - [OptInWorkflow](docs/OptInWorkflow.md)
 - [PageInfo](docs/PageInfo.md)
 - [PriorityEnum](docs/PriorityEnum.md)
 - [RecordingAvailableCallback](docs/RecordingAvailableCallback.md)
 - [RecordingCompleteCallback](docs/RecordingCompleteCallback.md)
 - [RecordingStateEnum](docs/RecordingStateEnum.md)
 - [RecordingTranscriptionMetadata](docs/RecordingTranscriptionMetadata.md)
 - [RecordingTranscriptions](docs/RecordingTranscriptions.md)
 - [RedirectCallback](docs/RedirectCallback.md)
 - [RedirectMethodEnum](docs/RedirectMethodEnum.md)
 - [StirShaken](docs/StirShaken.md)
 - [Tag](docs/Tag.md)
 - [TelephoneNumber](docs/TelephoneNumber.md)
 - [TfvBasicAuthentication](docs/TfvBasicAuthentication.md)
 - [TfvCallbackStatusEnum](docs/TfvCallbackStatusEnum.md)
 - [TfvError](docs/TfvError.md)
 - [TfvStatus](docs/TfvStatus.md)
 - [TfvStatusEnum](docs/TfvStatusEnum.md)
 - [TfvSubmissionInfo](docs/TfvSubmissionInfo.md)
 - [TfvSubmissionWrapper](docs/TfvSubmissionWrapper.md)
 - [TnLookupRequestError](docs/TnLookupRequestError.md)
 - [TranscribeRecording](docs/TranscribeRecording.md)
 - [Transcription](docs/Transcription.md)
 - [TranscriptionAvailableCallback](docs/TranscriptionAvailableCallback.md)
 - [TransferAnswerCallback](docs/TransferAnswerCallback.md)
 - [TransferCompleteCallback](docs/TransferCompleteCallback.md)
 - [TransferDisconnectCallback](docs/TransferDisconnectCallback.md)
 - [UpdateCall](docs/UpdateCall.md)
 - [UpdateCallRecording](docs/UpdateCallRecording.md)
 - [UpdateConference](docs/UpdateConference.md)
 - [UpdateConferenceMember](docs/UpdateConferenceMember.md)
 - [VerificationDenialWebhook](docs/VerificationDenialWebhook.md)
 - [VerificationRequest](docs/VerificationRequest.md)
 - [VerificationUpdateRequest](docs/VerificationUpdateRequest.md)
 - [VerificationWebhook](docs/VerificationWebhook.md)
 - [VerifyCodeRequest](docs/VerifyCodeRequest.md)
 - [VerifyCodeResponse](docs/VerifyCodeResponse.md)
 - [VoiceApiError](docs/VoiceApiError.md)
 - [VoiceCodeResponse](docs/VoiceCodeResponse.md)
 - [WebhookSubscription](docs/WebhookSubscription.md)
 - [WebhookSubscriptionBasicAuthentication](docs/WebhookSubscriptionBasicAuthentication.md)
 - [WebhookSubscriptionRequestSchema](docs/WebhookSubscriptionRequestSchema.md)
 - [WebhookSubscriptionTypeEnum](docs/WebhookSubscriptionTypeEnum.md)
 - [WebhookSubscriptionsListBody](docs/WebhookSubscriptionsListBody.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="Basic"></a>
### Basic

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

letstalk@bandwidth.com

