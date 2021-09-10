# MFA

```java
MFAController mFAController = client.getMultiFactorAuthClient().getMFAController();
```

## Class Name

`MFAController`

## Methods

* [Create Voice Two Factor](/doc/MultiFactorAuth/controllers/mfa.md#create-voice-two-factor)
* [Create Messaging Two Factor](/doc/MultiFactorAuth/controllers/mfa.md#create-messaging-two-factor)
* [Create Verify Two Factor](/doc/MultiFactorAuth/controllers/mfa.md#create-verify-two-factor)


# Create Voice Two Factor

Multi-Factor authentication with Bandwidth Voice services. Allows for a user to send an MFA code via a phone call.

```java
CompletableFuture<ApiResponse<TwoFactorVoiceResponse>> createVoiceTwoFactorAsync(
    final String accountId,
    final TwoFactorCodeRequestSchema body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | Bandwidth Account ID with Voice service enabled |
| `body` | [`TwoFactorCodeRequestSchema`]($m/MultiFactorAuth/TwoFactorCodeRequestSchema) | Body, Required | - |

## Server

`Server.MULTIFACTORAUTHDEFAULT`

## Response Type

[`TwoFactorVoiceResponse`]($m/MultiFactorAuth/TwoFactorVoiceResponse)

## Example Usage

```java
String accountId = "accountId0";
TwoFactorCodeRequestSchema body = new TwoFactorCodeRequestSchema();
body.setTo("to0");
body.setFrom("from6");
body.setApplicationId("applicationId6");
body.setMessage("message6");
body.setDigits(45.32);

mFAController.createVoiceTwoFactorAsync(accountId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | If there is any issue with values passed in by the user | [`ErrorWithRequestException`]($m/MultiFactorAuth/ErrorWithRequest) |
| 401 | Authentication is either incorrect or not present | [`UnauthorizedRequestException`]($m/MultiFactorAuth/UnauthorizedRequest) |
| 403 | The user is not authorized to access this resource | [`ForbiddenRequestException`]($m/MultiFactorAuth/ForbiddenRequest) |
| 500 | An internal server error occurred | [`ErrorWithRequestException`]($m/MultiFactorAuth/ErrorWithRequest) |


# Create Messaging Two Factor

Multi-Factor authentication with Bandwidth Messaging services. Allows a user to send an MFA code via a text message (SMS).

```java
CompletableFuture<ApiResponse<TwoFactorMessagingResponse>> createMessagingTwoFactorAsync(
    final String accountId,
    final TwoFactorCodeRequestSchema body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | Bandwidth Account ID with Messaging service enabled |
| `body` | [`TwoFactorCodeRequestSchema`]($m/MultiFactorAuth/TwoFactorCodeRequestSchema) | Body, Required | - |

## Server

`Server.MULTIFACTORAUTHDEFAULT`

## Response Type

[`TwoFactorMessagingResponse`]($m/MultiFactorAuth/TwoFactorMessagingResponse)

## Example Usage

```java
String accountId = "accountId0";
TwoFactorCodeRequestSchema body = new TwoFactorCodeRequestSchema();
body.setTo("to0");
body.setFrom("from6");
body.setApplicationId("applicationId6");
body.setMessage("message6");
body.setDigits(45.32);

mFAController.createMessagingTwoFactorAsync(accountId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | If there is any issue with values passed in by the user | [`ErrorWithRequestException`]($m/MultiFactorAuth/ErrorWithRequest) |
| 401 | Authentication is either incorrect or not present | [`UnauthorizedRequestException`]($m/MultiFactorAuth/UnauthorizedRequest) |
| 403 | The user is not authorized to access this resource | [`ForbiddenRequestException`]($m/MultiFactorAuth/ForbiddenRequest) |
| 500 | An internal server error occurred | [`ErrorWithRequestException`]($m/MultiFactorAuth/ErrorWithRequest) |


# Create Verify Two Factor

Allows a user to verify an MFA code.

```java
CompletableFuture<ApiResponse<TwoFactorVerifyCodeResponse>> createVerifyTwoFactorAsync(
    final String accountId,
    final TwoFactorVerifyRequestSchema body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | Bandwidth Account ID with Two-Factor enabled |
| `body` | [`TwoFactorVerifyRequestSchema`]($m/MultiFactorAuth/TwoFactorVerifyRequestSchema) | Body, Required | - |

## Server

`Server.MULTIFACTORAUTHDEFAULT`

## Response Type

[`TwoFactorVerifyCodeResponse`]($m/MultiFactorAuth/TwoFactorVerifyCodeResponse)

## Example Usage

```java
String accountId = "accountId0";
TwoFactorVerifyRequestSchema body = new TwoFactorVerifyRequestSchema();
body.setTo("to0");
body.setApplicationId("applicationId6");
body.setExpirationTimeInMinutes(166.8);
body.setCode("code4");

mFAController.createVerifyTwoFactorAsync(accountId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | If there is any issue with values passed in by the user | [`ErrorWithRequestException`]($m/MultiFactorAuth/ErrorWithRequest) |
| 401 | Authentication is either incorrect or not present | [`UnauthorizedRequestException`]($m/MultiFactorAuth/UnauthorizedRequest) |
| 403 | The user is not authorized to access this resource | [`ForbiddenRequestException`]($m/MultiFactorAuth/ForbiddenRequest) |
| 429 | The user has made too many bad requests and is temporarily locked out | [`ErrorWithRequestException`]($m/MultiFactorAuth/ErrorWithRequest) |
| 500 | An internal server error occurred | [`ErrorWithRequestException`]($m/MultiFactorAuth/ErrorWithRequest) |

