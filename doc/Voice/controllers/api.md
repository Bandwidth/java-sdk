# API

```java
APIController aPIController = client.getVoiceClient().getAPIController();
```

## Class Name

`APIController`

## Methods

* [Create Call](/doc/Voice/controllers/api.md#create-call)
* [Get Call](/doc/Voice/controllers/api.md#get-call)
* [Modify Call](/doc/Voice/controllers/api.md#modify-call)
* [Modify Call Recording State](/doc/Voice/controllers/api.md#modify-call-recording-state)
* [Get Call Recordings](/doc/Voice/controllers/api.md#get-call-recordings)
* [Get Call Recording](/doc/Voice/controllers/api.md#get-call-recording)
* [Delete Recording](/doc/Voice/controllers/api.md#delete-recording)
* [Get Download Call Recording](/doc/Voice/controllers/api.md#get-download-call-recording)
* [Delete Recording Media](/doc/Voice/controllers/api.md#delete-recording-media)
* [Get Call Transcription](/doc/Voice/controllers/api.md#get-call-transcription)
* [Create Transcribe Call Recording](/doc/Voice/controllers/api.md#create-transcribe-call-recording)
* [Delete Call Transcription](/doc/Voice/controllers/api.md#delete-call-transcription)
* [Get Conferences](/doc/Voice/controllers/api.md#get-conferences)
* [Get Conference](/doc/Voice/controllers/api.md#get-conference)
* [Modify Conference](/doc/Voice/controllers/api.md#modify-conference)
* [Modify Conference Member](/doc/Voice/controllers/api.md#modify-conference-member)
* [Get Conference Member](/doc/Voice/controllers/api.md#get-conference-member)
* [Get Conference Recordings](/doc/Voice/controllers/api.md#get-conference-recordings)
* [Get Conference Recording](/doc/Voice/controllers/api.md#get-conference-recording)
* [Get Download Conference Recording](/doc/Voice/controllers/api.md#get-download-conference-recording)
* [Get Query Call Recordings](/doc/Voice/controllers/api.md#get-query-call-recordings)


# Create Call

Creates an outbound phone call.

```java
CompletableFuture<ApiResponse<CreateCallResponse>> createCallAsync(
    final String accountId,
    final CreateCallRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | - |
| `body` | [`CreateCallRequest`]($m/Voice/CreateCallRequest) | Body, Required | - |

## Server

`Server.VOICEDEFAULT`

## Response Type

[`CreateCallResponse`]($m/Voice/CreateCallResponse)

## Example Usage

```java
String accountId = "accountId0";
CreateCallRequest body = new CreateCallRequest();
body.setFrom("+15555555555");
body.setTo("+15555555555, sip:john@doe.com");
body.setAnswerUrl("answerUrl4");
body.setApplicationId("applicationId6");

aPIController.createCallAsync(accountId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Something's not quite right... Your request is invalid. Please fix it before trying again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 401 | Your credentials are invalid. Please use your Bandwidth dashboard credentials to authenticate to the API. | `ApiException` |
| 403 | User unauthorized to perform this action. | [`ApiErrorException`]($m/Voice/ApiError) |
| 404 | The resource specified cannot be found or does not belong to you. | [`ApiErrorException`]($m/Voice/ApiError) |
| 415 | We don't support that media type. If a request body is required, please send it to us as `application/json`. | [`ApiErrorException`]($m/Voice/ApiError) |
| 429 | You're sending requests to this endpoint too frequently. Please slow your request rate down and try again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 500 | Something unexpected happened. Please try again. | [`ApiErrorException`]($m/Voice/ApiError) |


# Get Call

Returns near-realtime metadata about the specified call.

```java
CompletableFuture<ApiResponse<CallState>> getCallAsync(
    final String accountId,
    final String callId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | - |
| `callId` | `String` | Template, Required | - |

## Server

`Server.VOICEDEFAULT`

## Response Type

[`CallState`]($m/Voice/CallState)

## Example Usage

```java
String accountId = "accountId0";
String callId = "callId0";

aPIController.getCallAsync(accountId, callId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Something's not quite right... Your request is invalid. Please fix it before trying again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 401 | Your credentials are invalid. Please use your Bandwidth dashboard credentials to authenticate to the API. | `ApiException` |
| 403 | User unauthorized to perform this action. | [`ApiErrorException`]($m/Voice/ApiError) |
| 404 | The resource specified cannot be found or does not belong to you. | [`ApiErrorException`]($m/Voice/ApiError) |
| 415 | We don't support that media type. If a request body is required, please send it to us as `application/json`. | [`ApiErrorException`]($m/Voice/ApiError) |
| 429 | You're sending requests to this endpoint too frequently. Please slow your request rate down and try again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 500 | Something unexpected happened. Please try again. | [`ApiErrorException`]($m/Voice/ApiError) |


# Modify Call

Interrupts and replaces an active call's BXML document.

```java
CompletableFuture<ApiResponse<Void>> modifyCallAsync(
    final String accountId,
    final String callId,
    final ModifyCallRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | - |
| `callId` | `String` | Template, Required | - |
| `body` | [`ModifyCallRequest`]($m/Voice/ModifyCallRequest) | Body, Required | - |

## Server

`Server.VOICEDEFAULT`

## Response Type

`void`

## Example Usage

```java
String accountId = "accountId0";
String callId = "callId0";
ModifyCallRequest body = new ModifyCallRequest();

aPIController.modifyCallAsync(accountId, callId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Something's not quite right... Your request is invalid. Please fix it before trying again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 401 | Your credentials are invalid. Please use your Bandwidth dashboard credentials to authenticate to the API. | `ApiException` |
| 403 | User unauthorized to perform this action. | [`ApiErrorException`]($m/Voice/ApiError) |
| 404 | The resource specified cannot be found or does not belong to you. | [`ApiErrorException`]($m/Voice/ApiError) |
| 415 | We don't support that media type. If a request body is required, please send it to us as `application/json`. | [`ApiErrorException`]($m/Voice/ApiError) |
| 429 | You're sending requests to this endpoint too frequently. Please slow your request rate down and try again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 500 | Something unexpected happened. Please try again. | [`ApiErrorException`]($m/Voice/ApiError) |


# Modify Call Recording State

Pauses or resumes a recording.

```java
CompletableFuture<ApiResponse<Void>> modifyCallRecordingStateAsync(
    final String accountId,
    final String callId,
    final ModifyCallRecordingRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | - |
| `callId` | `String` | Template, Required | - |
| `body` | [`ModifyCallRecordingRequest`]($m/Voice/ModifyCallRecordingRequest) | Body, Required | - |

## Server

`Server.VOICEDEFAULT`

## Response Type

`void`

## Example Usage

```java
String accountId = "accountId0";
String callId = "callId0";
ModifyCallRecordingRequest body = new ModifyCallRecordingRequest();
body.setState(State1Enum.PAUSED);

aPIController.modifyCallRecordingStateAsync(accountId, callId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Something's not quite right... Your request is invalid. Please fix it before trying again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 401 | Your credentials are invalid. Please use your Bandwidth dashboard credentials to authenticate to the API. | `ApiException` |
| 403 | User unauthorized to perform this action. | [`ApiErrorException`]($m/Voice/ApiError) |
| 404 | The resource specified cannot be found or does not belong to you. | [`ApiErrorException`]($m/Voice/ApiError) |
| 415 | We don't support that media type. If a request body is required, please send it to us as `application/json`. | [`ApiErrorException`]($m/Voice/ApiError) |
| 429 | You're sending requests to this endpoint too frequently. Please slow your request rate down and try again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 500 | Something unexpected happened. Please try again. | [`ApiErrorException`]($m/Voice/ApiError) |


# Get Call Recordings

Returns a (potentially empty) list of metadata for the recordings that took place during the specified call.

```java
CompletableFuture<ApiResponse<List<CallRecordingMetadata>>> getCallRecordingsAsync(
    final String accountId,
    final String callId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | - |
| `callId` | `String` | Template, Required | - |

## Server

`Server.VOICEDEFAULT`

## Response Type

[`List<CallRecordingMetadata>`]($m/Voice/CallRecordingMetadata)

## Example Usage

```java
String accountId = "accountId0";
String callId = "callId0";

aPIController.getCallRecordingsAsync(accountId, callId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Something's not quite right... Your request is invalid. Please fix it before trying again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 401 | Your credentials are invalid. Please use your Bandwidth dashboard credentials to authenticate to the API. | `ApiException` |
| 403 | User unauthorized to perform this action. | [`ApiErrorException`]($m/Voice/ApiError) |
| 404 | The resource specified cannot be found or does not belong to you. | [`ApiErrorException`]($m/Voice/ApiError) |
| 415 | We don't support that media type. If a request body is required, please send it to us as `application/json`. | [`ApiErrorException`]($m/Voice/ApiError) |
| 429 | You're sending requests to this endpoint too frequently. Please slow your request rate down and try again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 500 | Something unexpected happened. Please try again. | [`ApiErrorException`]($m/Voice/ApiError) |


# Get Call Recording

Returns metadata for the specified recording.

```java
CompletableFuture<ApiResponse<CallRecordingMetadata>> getCallRecordingAsync(
    final String accountId,
    final String callId,
    final String recordingId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | - |
| `callId` | `String` | Template, Required | - |
| `recordingId` | `String` | Template, Required | - |

## Server

`Server.VOICEDEFAULT`

## Response Type

[`CallRecordingMetadata`]($m/Voice/CallRecordingMetadata)

## Example Usage

```java
String accountId = "accountId0";
String callId = "callId0";
String recordingId = "recordingId2";

aPIController.getCallRecordingAsync(accountId, callId, recordingId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Something's not quite right... Your request is invalid. Please fix it before trying again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 401 | Your credentials are invalid. Please use your Bandwidth dashboard credentials to authenticate to the API. | `ApiException` |
| 403 | User unauthorized to perform this action. | [`ApiErrorException`]($m/Voice/ApiError) |
| 404 | The resource specified cannot be found or does not belong to you. | [`ApiErrorException`]($m/Voice/ApiError) |
| 415 | We don't support that media type. If a request body is required, please send it to us as `application/json`. | [`ApiErrorException`]($m/Voice/ApiError) |
| 429 | You're sending requests to this endpoint too frequently. Please slow your request rate down and try again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 500 | Something unexpected happened. Please try again. | [`ApiErrorException`]($m/Voice/ApiError) |


# Delete Recording

Deletes the specified recording.

```java
CompletableFuture<ApiResponse<Void>> deleteRecordingAsync(
    final String accountId,
    final String callId,
    final String recordingId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | - |
| `callId` | `String` | Template, Required | - |
| `recordingId` | `String` | Template, Required | - |

## Server

`Server.VOICEDEFAULT`

## Response Type

`void`

## Example Usage

```java
String accountId = "accountId0";
String callId = "callId0";
String recordingId = "recordingId2";

aPIController.deleteRecordingAsync(accountId, callId, recordingId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Something's not quite right... Your request is invalid. Please fix it before trying again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 401 | Your credentials are invalid. Please use your Bandwidth dashboard credentials to authenticate to the API. | `ApiException` |
| 403 | User unauthorized to perform this action. | [`ApiErrorException`]($m/Voice/ApiError) |
| 404 | The resource specified cannot be found or does not belong to you. | [`ApiErrorException`]($m/Voice/ApiError) |
| 415 | We don't support that media type. If a request body is required, please send it to us as `application/json`. | [`ApiErrorException`]($m/Voice/ApiError) |
| 429 | You're sending requests to this endpoint too frequently. Please slow your request rate down and try again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 500 | Something unexpected happened. Please try again. | [`ApiErrorException`]($m/Voice/ApiError) |


# Get Download Call Recording

Downloads the specified recording.

```java
CompletableFuture<ApiResponse<DynamicResponse>> getDownloadCallRecordingAsync(
    final String accountId,
    final String callId,
    final String recordingId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | - |
| `callId` | `String` | Template, Required | - |
| `recordingId` | `String` | Template, Required | - |

## Server

`Server.VOICEDEFAULT`

## Response Type

`DynamicResponse`

## Example Usage

```java
String accountId = "accountId0";
String callId = "callId0";
String recordingId = "recordingId2";

aPIController.getDownloadCallRecordingAsync(accountId, callId, recordingId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Something's not quite right... Your request is invalid. Please fix it before trying again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 401 | Your credentials are invalid. Please use your Bandwidth dashboard credentials to authenticate to the API. | `ApiException` |
| 403 | User unauthorized to perform this action. | [`ApiErrorException`]($m/Voice/ApiError) |
| 404 | The resource specified cannot be found or does not belong to you. | [`ApiErrorException`]($m/Voice/ApiError) |
| 415 | We don't support that media type. If a request body is required, please send it to us as `application/json`. | [`ApiErrorException`]($m/Voice/ApiError) |
| 429 | You're sending requests to this endpoint too frequently. Please slow your request rate down and try again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 500 | Something unexpected happened. Please try again. | [`ApiErrorException`]($m/Voice/ApiError) |


# Delete Recording Media

Deletes the specified recording's media.

```java
CompletableFuture<ApiResponse<Void>> deleteRecordingMediaAsync(
    final String accountId,
    final String callId,
    final String recordingId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | - |
| `callId` | `String` | Template, Required | - |
| `recordingId` | `String` | Template, Required | - |

## Server

`Server.VOICEDEFAULT`

## Response Type

`void`

## Example Usage

```java
String accountId = "accountId0";
String callId = "callId0";
String recordingId = "recordingId2";

aPIController.deleteRecordingMediaAsync(accountId, callId, recordingId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Something's not quite right... Your request is invalid. Please fix it before trying again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 401 | Your credentials are invalid. Please use your Bandwidth dashboard credentials to authenticate to the API. | `ApiException` |
| 403 | User unauthorized to perform this action. | [`ApiErrorException`]($m/Voice/ApiError) |
| 404 | The resource specified cannot be found or does not belong to you. | [`ApiErrorException`]($m/Voice/ApiError) |
| 415 | We don't support that media type. If a request body is required, please send it to us as `application/json`. | [`ApiErrorException`]($m/Voice/ApiError) |
| 429 | You're sending requests to this endpoint too frequently. Please slow your request rate down and try again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 500 | Something unexpected happened. Please try again. | [`ApiErrorException`]($m/Voice/ApiError) |


# Get Call Transcription

Downloads the specified transcription.

```java
CompletableFuture<ApiResponse<TranscriptionResponse>> getCallTranscriptionAsync(
    final String accountId,
    final String callId,
    final String recordingId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | - |
| `callId` | `String` | Template, Required | - |
| `recordingId` | `String` | Template, Required | - |

## Server

`Server.VOICEDEFAULT`

## Response Type

[`TranscriptionResponse`]($m/Voice/TranscriptionResponse)

## Example Usage

```java
String accountId = "accountId0";
String callId = "callId0";
String recordingId = "recordingId2";

aPIController.getCallTranscriptionAsync(accountId, callId, recordingId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Something's not quite right... Your request is invalid. Please fix it before trying again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 401 | Your credentials are invalid. Please use your Bandwidth dashboard credentials to authenticate to the API. | `ApiException` |
| 403 | User unauthorized to perform this action. | [`ApiErrorException`]($m/Voice/ApiError) |
| 404 | The resource specified cannot be found or does not belong to you. | [`ApiErrorException`]($m/Voice/ApiError) |
| 415 | We don't support that media type. If a request body is required, please send it to us as `application/json`. | [`ApiErrorException`]($m/Voice/ApiError) |
| 429 | You're sending requests to this endpoint too frequently. Please slow your request rate down and try again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 500 | Something unexpected happened. Please try again. | [`ApiErrorException`]($m/Voice/ApiError) |


# Create Transcribe Call Recording

Requests that the specified recording be transcribed.

```java
CompletableFuture<ApiResponse<Void>> createTranscribeCallRecordingAsync(
    final String accountId,
    final String callId,
    final String recordingId,
    final TranscribeRecordingRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | - |
| `callId` | `String` | Template, Required | - |
| `recordingId` | `String` | Template, Required | - |
| `body` | [`TranscribeRecordingRequest`]($m/Voice/TranscribeRecordingRequest) | Body, Required | - |

## Server

`Server.VOICEDEFAULT`

## Response Type

`void`

## Example Usage

```java
String accountId = "accountId0";
String callId = "callId0";
String recordingId = "recordingId2";
TranscribeRecordingRequest body = new TranscribeRecordingRequest();

aPIController.createTranscribeCallRecordingAsync(accountId, callId, recordingId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Something's not quite right... Your request is invalid. Please fix it before trying again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 401 | Your credentials are invalid. Please use your Bandwidth dashboard credentials to authenticate to the API. | `ApiException` |
| 403 | User unauthorized to perform this action. | [`ApiErrorException`]($m/Voice/ApiError) |
| 404 | The resource specified cannot be found or does not belong to you. | [`ApiErrorException`]($m/Voice/ApiError) |
| 410 | The media for this recording has been deleted, so we can't transcribe it | [`ApiErrorException`]($m/Voice/ApiError) |
| 415 | We don't support that media type. If a request body is required, please send it to us as `application/json`. | [`ApiErrorException`]($m/Voice/ApiError) |
| 429 | You're sending requests to this endpoint too frequently. Please slow your request rate down and try again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 500 | Something unexpected happened. Please try again. | [`ApiErrorException`]($m/Voice/ApiError) |


# Delete Call Transcription

Deletes the specified recording's transcription.

```java
CompletableFuture<ApiResponse<Void>> deleteCallTranscriptionAsync(
    final String accountId,
    final String callId,
    final String recordingId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | - |
| `callId` | `String` | Template, Required | - |
| `recordingId` | `String` | Template, Required | - |

## Server

`Server.VOICEDEFAULT`

## Response Type

`void`

## Example Usage

```java
String accountId = "accountId0";
String callId = "callId0";
String recordingId = "recordingId2";

aPIController.deleteCallTranscriptionAsync(accountId, callId, recordingId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Something's not quite right... Your request is invalid. Please fix it before trying again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 401 | Your credentials are invalid. Please use your Bandwidth dashboard credentials to authenticate to the API. | `ApiException` |
| 403 | User unauthorized to perform this action. | [`ApiErrorException`]($m/Voice/ApiError) |
| 404 | The resource specified cannot be found or does not belong to you. | [`ApiErrorException`]($m/Voice/ApiError) |
| 415 | We don't support that media type. If a request body is required, please send it to us as `application/json`. | [`ApiErrorException`]($m/Voice/ApiError) |
| 429 | You're sending requests to this endpoint too frequently. Please slow your request rate down and try again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 500 | Something unexpected happened. Please try again. | [`ApiErrorException`]($m/Voice/ApiError) |


# Get Conferences

Returns information about the conferences in the account.

```java
CompletableFuture<ApiResponse<List<ConferenceState>>> getConferencesAsync(
    final String accountId,
    final String name,
    final String minCreatedTime,
    final String maxCreatedTime,
    final Integer pageSize,
    final String pageToken)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | - |
| `name` | `String` | Query, Optional | - |
| `minCreatedTime` | `String` | Query, Optional | - |
| `maxCreatedTime` | `String` | Query, Optional | - |
| `pageSize` | `Integer` | Query, Optional | **Default**: `1000` |
| `pageToken` | `String` | Query, Optional | - |

## Server

`Server.VOICEDEFAULT`

## Response Type

[`List<ConferenceState>`]($m/Voice/ConferenceState)

## Example Usage

```java
String accountId = "accountId0";
Integer pageSize = 1000;

aPIController.getConferencesAsync(accountId, null, null, null, pageSize, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Something's not quite right... Your request is invalid. Please fix it before trying again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 401 | Your credentials are invalid. Please use your Bandwidth dashboard credentials to authenticate to the API. | `ApiException` |
| 403 | User unauthorized to perform this action. | [`ApiErrorException`]($m/Voice/ApiError) |
| 404 | The resource specified cannot be found or does not belong to you. | [`ApiErrorException`]($m/Voice/ApiError) |
| 415 | We don't support that media type. If a request body is required, please send it to us as `application/json`. | [`ApiErrorException`]($m/Voice/ApiError) |
| 429 | You're sending requests to this endpoint too frequently. Please slow your request rate down and try again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 500 | Something unexpected happened. Please try again. | [`ApiErrorException`]($m/Voice/ApiError) |


# Get Conference

Returns information about the specified conference.

```java
CompletableFuture<ApiResponse<ConferenceState>> getConferenceAsync(
    final String accountId,
    final String conferenceId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | - |
| `conferenceId` | `String` | Template, Required | - |

## Server

`Server.VOICEDEFAULT`

## Response Type

[`ConferenceState`]($m/Voice/ConferenceState)

## Example Usage

```java
String accountId = "accountId0";
String conferenceId = "conferenceId0";

aPIController.getConferenceAsync(accountId, conferenceId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Something's not quite right... Your request is invalid. Please fix it before trying again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 401 | Your credentials are invalid. Please use your Bandwidth dashboard credentials to authenticate to the API. | `ApiException` |
| 403 | User unauthorized to perform this action. | [`ApiErrorException`]($m/Voice/ApiError) |
| 404 | The resource specified cannot be found or does not belong to you. | [`ApiErrorException`]($m/Voice/ApiError) |
| 415 | We don't support that media type. If a request body is required, please send it to us as `application/json`. | [`ApiErrorException`]($m/Voice/ApiError) |
| 429 | You're sending requests to this endpoint too frequently. Please slow your request rate down and try again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 500 | Something unexpected happened. Please try again. | [`ApiErrorException`]($m/Voice/ApiError) |


# Modify Conference

Modify the conference state.

```java
CompletableFuture<ApiResponse<Void>> modifyConferenceAsync(
    final String accountId,
    final String conferenceId,
    final ModifyConferenceRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | - |
| `conferenceId` | `String` | Template, Required | - |
| `body` | [`ModifyConferenceRequest`]($m/Voice/ModifyConferenceRequest) | Body, Required | - |

## Server

`Server.VOICEDEFAULT`

## Response Type

`void`

## Example Usage

```java
String accountId = "accountId0";
String conferenceId = "conferenceId0";
ModifyConferenceRequest body = new ModifyConferenceRequest();

aPIController.modifyConferenceAsync(accountId, conferenceId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Something's not quite right... Your request is invalid. Please fix it before trying again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 401 | Your credentials are invalid. Please use your Bandwidth dashboard credentials to authenticate to the API. | `ApiException` |
| 403 | User unauthorized to perform this action. | [`ApiErrorException`]($m/Voice/ApiError) |
| 404 | The resource specified cannot be found or does not belong to you. | [`ApiErrorException`]($m/Voice/ApiError) |
| 415 | We don't support that media type. If a request body is required, please send it to us as `application/json`. | [`ApiErrorException`]($m/Voice/ApiError) |
| 429 | You're sending requests to this endpoint too frequently. Please slow your request rate down and try again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 500 | Something unexpected happened. Please try again. | [`ApiErrorException`]($m/Voice/ApiError) |


# Modify Conference Member

Updates settings for a particular conference member.

```java
CompletableFuture<ApiResponse<Void>> modifyConferenceMemberAsync(
    final String accountId,
    final String conferenceId,
    final String callId,
    final ConferenceMemberState body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | - |
| `conferenceId` | `String` | Template, Required | - |
| `callId` | `String` | Template, Required | - |
| `body` | [`ConferenceMemberState`]($m/Voice/ConferenceMemberState) | Body, Required | - |

## Server

`Server.VOICEDEFAULT`

## Response Type

`void`

## Example Usage

```java
String accountId = "accountId0";
String conferenceId = "conferenceId0";
String callId = "callId0";
ConferenceMemberState body = new ConferenceMemberState();

aPIController.modifyConferenceMemberAsync(accountId, conferenceId, callId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Something's not quite right... Your request is invalid. Please fix it before trying again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 401 | Your credentials are invalid. Please use your Bandwidth dashboard credentials to authenticate to the API. | `ApiException` |
| 403 | User unauthorized to perform this action. | [`ApiErrorException`]($m/Voice/ApiError) |
| 404 | The resource specified cannot be found or does not belong to you. | [`ApiErrorException`]($m/Voice/ApiError) |
| 415 | We don't support that media type. If a request body is required, please send it to us as `application/json`. | [`ApiErrorException`]($m/Voice/ApiError) |
| 429 | You're sending requests to this endpoint too frequently. Please slow your request rate down and try again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 500 | Something unexpected happened. Please try again. | [`ApiErrorException`]($m/Voice/ApiError) |


# Get Conference Member

Returns information about the specified conference member.

```java
CompletableFuture<ApiResponse<ConferenceMemberState>> getConferenceMemberAsync(
    final String accountId,
    final String conferenceId,
    final String memberId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | - |
| `conferenceId` | `String` | Template, Required | - |
| `memberId` | `String` | Template, Required | - |

## Server

`Server.VOICEDEFAULT`

## Response Type

[`ConferenceMemberState`]($m/Voice/ConferenceMemberState)

## Example Usage

```java
String accountId = "accountId0";
String conferenceId = "conferenceId0";
String memberId = "memberId0";

aPIController.getConferenceMemberAsync(accountId, conferenceId, memberId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Something's not quite right... Your request is invalid. Please fix it before trying again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 401 | Your credentials are invalid. Please use your Bandwidth dashboard credentials to authenticate to the API. | `ApiException` |
| 403 | User unauthorized to perform this action. | [`ApiErrorException`]($m/Voice/ApiError) |
| 404 | The resource specified cannot be found or does not belong to you. | [`ApiErrorException`]($m/Voice/ApiError) |
| 415 | We don't support that media type. If a request body is required, please send it to us as `application/json`. | [`ApiErrorException`]($m/Voice/ApiError) |
| 429 | You're sending requests to this endpoint too frequently. Please slow your request rate down and try again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 500 | Something unexpected happened. Please try again. | [`ApiErrorException`]($m/Voice/ApiError) |


# Get Conference Recordings

Returns a (potentially empty) list of metadata for the recordings that took place during the specified conference

```java
CompletableFuture<ApiResponse<List<ConferenceRecordingMetadata>>> getConferenceRecordingsAsync(
    final String accountId,
    final String conferenceId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | - |
| `conferenceId` | `String` | Template, Required | - |

## Server

`Server.VOICEDEFAULT`

## Response Type

[`List<ConferenceRecordingMetadata>`]($m/Voice/ConferenceRecordingMetadata)

## Example Usage

```java
String accountId = "accountId0";
String conferenceId = "conferenceId0";

aPIController.getConferenceRecordingsAsync(accountId, conferenceId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Something's not quite right... Your request is invalid. Please fix it before trying again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 401 | Your credentials are invalid. Please use your Bandwidth dashboard credentials to authenticate to the API. | `ApiException` |
| 403 | User unauthorized to perform this action. | [`ApiErrorException`]($m/Voice/ApiError) |
| 404 | The resource specified cannot be found or does not belong to you. | [`ApiErrorException`]($m/Voice/ApiError) |
| 415 | We don't support that media type. If a request body is required, please send it to us as `application/json`. | [`ApiErrorException`]($m/Voice/ApiError) |
| 429 | You're sending requests to this endpoint too frequently. Please slow your request rate down and try again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 500 | Something unexpected happened. Please try again. | [`ApiErrorException`]($m/Voice/ApiError) |


# Get Conference Recording

Returns metadata for the specified recording.

```java
CompletableFuture<ApiResponse<CallRecordingMetadata>> getConferenceRecordingAsync(
    final String accountId,
    final String conferenceId,
    final String recordingId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | - |
| `conferenceId` | `String` | Template, Required | - |
| `recordingId` | `String` | Template, Required | - |

## Server

`Server.VOICEDEFAULT`

## Response Type

[`CallRecordingMetadata`]($m/Voice/CallRecordingMetadata)

## Example Usage

```java
String accountId = "accountId0";
String conferenceId = "conferenceId0";
String recordingId = "recordingId2";

aPIController.getConferenceRecordingAsync(accountId, conferenceId, recordingId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Something's not quite right... Your request is invalid. Please fix it before trying again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 401 | Your credentials are invalid. Please use your Bandwidth dashboard credentials to authenticate to the API. | `ApiException` |
| 403 | User unauthorized to perform this action. | [`ApiErrorException`]($m/Voice/ApiError) |
| 404 | The resource specified cannot be found or does not belong to you. | [`ApiErrorException`]($m/Voice/ApiError) |
| 415 | We don't support that media type. If a request body is required, please send it to us as `application/json`. | [`ApiErrorException`]($m/Voice/ApiError) |
| 429 | You're sending requests to this endpoint too frequently. Please slow your request rate down and try again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 500 | Something unexpected happened. Please try again. | [`ApiErrorException`]($m/Voice/ApiError) |


# Get Download Conference Recording

Downloads the specified recording.

```java
CompletableFuture<ApiResponse<DynamicResponse>> getDownloadConferenceRecordingAsync(
    final String accountId,
    final String conferenceId,
    final String recordingId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | - |
| `conferenceId` | `String` | Template, Required | - |
| `recordingId` | `String` | Template, Required | - |

## Server

`Server.VOICEDEFAULT`

## Response Type

`DynamicResponse`

## Example Usage

```java
String accountId = "accountId0";
String conferenceId = "conferenceId0";
String recordingId = "recordingId2";

aPIController.getDownloadConferenceRecordingAsync(accountId, conferenceId, recordingId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Something's not quite right... Your request is invalid. Please fix it before trying again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 401 | Your credentials are invalid. Please use your Bandwidth dashboard credentials to authenticate to the API. | `ApiException` |
| 403 | User unauthorized to perform this action. | [`ApiErrorException`]($m/Voice/ApiError) |
| 404 | The resource specified cannot be found or does not belong to you. | [`ApiErrorException`]($m/Voice/ApiError) |
| 415 | We don't support that media type. If a request body is required, please send it to us as `application/json`. | [`ApiErrorException`]($m/Voice/ApiError) |
| 429 | You're sending requests to this endpoint too frequently. Please slow your request rate down and try again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 500 | Something unexpected happened. Please try again. | [`ApiErrorException`]($m/Voice/ApiError) |


# Get Query Call Recordings

Returns a list of metadata for the recordings associated with the specified account. The list can be filtered by the optional from, to, minStartTime, and maxStartTime arguments. The list is capped at 1000 entries and may be empty if no recordings match the specified criteria.

```java
CompletableFuture<ApiResponse<List<CallRecordingMetadata>>> getQueryCallRecordingsAsync(
    final String accountId,
    final String from,
    final String to,
    final String minStartTime,
    final String maxStartTime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | - |
| `from` | `String` | Query, Optional | - |
| `to` | `String` | Query, Optional | - |
| `minStartTime` | `String` | Query, Optional | - |
| `maxStartTime` | `String` | Query, Optional | - |

## Server

`Server.VOICEDEFAULT`

## Response Type

[`List<CallRecordingMetadata>`]($m/Voice/CallRecordingMetadata)

## Example Usage

```java
String accountId = "accountId0";

aPIController.getQueryCallRecordingsAsync(accountId, null, null, null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Something's not quite right... Your request is invalid. Please fix it before trying again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 401 | Your credentials are invalid. Please use your Bandwidth dashboard credentials to authenticate to the API. | `ApiException` |
| 403 | User unauthorized to perform this action. | [`ApiErrorException`]($m/Voice/ApiError) |
| 404 | The resource specified cannot be found or does not belong to you. | [`ApiErrorException`]($m/Voice/ApiError) |
| 415 | We don't support that media type. If a request body is required, please send it to us as `application/json`. | [`ApiErrorException`]($m/Voice/ApiError) |
| 429 | You're sending requests to this endpoint too frequently. Please slow your request rate down and try again. | [`ApiErrorException`]($m/Voice/ApiError) |
| 500 | Something unexpected happened. Please try again. | [`ApiErrorException`]($m/Voice/ApiError) |

