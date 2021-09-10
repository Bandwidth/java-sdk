# API

```java
APIController aPIController = client.getWebRtcClient().getAPIController();
```

## Class Name

`APIController`

## Methods

* [Create Participant](/doc/WebRtc/controllers/api.md#create-participant)
* [Get Participant](/doc/WebRtc/controllers/api.md#get-participant)
* [Delete Participant](/doc/WebRtc/controllers/api.md#delete-participant)
* [Create Session](/doc/WebRtc/controllers/api.md#create-session)
* [Get Session](/doc/WebRtc/controllers/api.md#get-session)
* [Delete Session](/doc/WebRtc/controllers/api.md#delete-session)
* [List Session Participants](/doc/WebRtc/controllers/api.md#list-session-participants)
* [Add Participant to Session](/doc/WebRtc/controllers/api.md#add-participant-to-session)
* [Remove Participant From Session](/doc/WebRtc/controllers/api.md#remove-participant-from-session)
* [Get Participant Subscriptions](/doc/WebRtc/controllers/api.md#get-participant-subscriptions)
* [Update Participant Subscriptions](/doc/WebRtc/controllers/api.md#update-participant-subscriptions)


# Create Participant

Create a new participant under this account.

Participants are idempotent, so relevant parameters must be set in this function if desired.

```java
CompletableFuture<ApiResponse<AccountsParticipantsResponse>> createParticipantAsync(
    final String accountId,
    final Participant body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | Account ID |
| `body` | [`Participant`]($m/WebRtc/Participant) | Body, Optional | Participant parameters |

## Server

`Server.WEBRTCDEFAULT`

## Response Type

[`AccountsParticipantsResponse`]($m/WebRtc/Accounts%20Participants%20Response)

## Example Usage

```java
String accountId = "accountId0";

aPIController.createParticipantAsync(accountId, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | `ApiException` |
| 401 | Unauthorized | `ApiException` |
| 403 | Access Denied | `ApiException` |
| Default | Unexpected Error | [`ErrorException`]($m/WebRtc/Error) |


# Get Participant

Get participant by ID.

```java
CompletableFuture<ApiResponse<Participant>> getParticipantAsync(
    final String accountId,
    final String participantId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | Account ID |
| `participantId` | `String` | Template, Required | Participant ID |

## Server

`Server.WEBRTCDEFAULT`

## Response Type

[`Participant`]($m/WebRtc/Participant)

## Example Usage

```java
String accountId = "accountId0";
String participantId = "participantId0";

aPIController.getParticipantAsync(accountId, participantId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | `ApiException` |
| 403 | Access Denied | `ApiException` |
| 404 | Not Found | `ApiException` |
| Default | Unexpected Error | [`ErrorException`]($m/WebRtc/Error) |


# Delete Participant

Delete participant by ID.

```java
CompletableFuture<ApiResponse<Void>> deleteParticipantAsync(
    final String accountId,
    final String participantId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | Account ID |
| `participantId` | `String` | Template, Required | - |

## Server

`Server.WEBRTCDEFAULT`

## Response Type

`void`

## Example Usage

```java
String accountId = "accountId0";
String participantId = "participantId0";

aPIController.deleteParticipantAsync(accountId, participantId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | `ApiException` |
| 403 | Access Denied | `ApiException` |
| 404 | Not Found | `ApiException` |
| Default | Unexpected Error | [`ErrorException`]($m/WebRtc/Error) |


# Create Session

Create a new session.

Sessions are idempotent, so relevant parameters must be set in this function if desired.

```java
CompletableFuture<ApiResponse<Session>> createSessionAsync(
    final String accountId,
    final Session body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | Account ID |
| `body` | [`Session`]($m/WebRtc/Session) | Body, Optional | Session parameters |

## Server

`Server.WEBRTCDEFAULT`

## Response Type

[`Session`]($m/WebRtc/Session)

## Example Usage

```java
String accountId = "accountId0";

aPIController.createSessionAsync(accountId, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | `ApiException` |
| 401 | Unauthorized | `ApiException` |
| 403 | Access Denied | `ApiException` |
| Default | Unexpected Error | [`ErrorException`]($m/WebRtc/Error) |


# Get Session

Get session by ID.

```java
CompletableFuture<ApiResponse<Session>> getSessionAsync(
    final String accountId,
    final String sessionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | Account ID |
| `sessionId` | `String` | Template, Required | Session ID |

## Server

`Server.WEBRTCDEFAULT`

## Response Type

[`Session`]($m/WebRtc/Session)

## Example Usage

```java
String accountId = "accountId0";
String sessionId = "sessionId8";

aPIController.getSessionAsync(accountId, sessionId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | `ApiException` |
| 403 | Access Denied | `ApiException` |
| 404 | Not Found | `ApiException` |
| Default | Unexpected Error | [`ErrorException`]($m/WebRtc/Error) |


# Delete Session

Delete session by ID.

```java
CompletableFuture<ApiResponse<Void>> deleteSessionAsync(
    final String accountId,
    final String sessionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | Account ID |
| `sessionId` | `String` | Template, Required | Session ID |

## Server

`Server.WEBRTCDEFAULT`

## Response Type

`void`

## Example Usage

```java
String accountId = "accountId0";
String sessionId = "sessionId8";

aPIController.deleteSessionAsync(accountId, sessionId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | `ApiException` |
| 403 | Access Denied | `ApiException` |
| 404 | Not Found | `ApiException` |
| Default | Unexpected Error | [`ErrorException`]($m/WebRtc/Error) |


# List Session Participants

List participants in a session.

```java
CompletableFuture<ApiResponse<List<Participant>>> listSessionParticipantsAsync(
    final String accountId,
    final String sessionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | Account ID |
| `sessionId` | `String` | Template, Required | Session ID |

## Server

`Server.WEBRTCDEFAULT`

## Response Type

[`List<Participant>`]($m/WebRtc/Participant)

## Example Usage

```java
String accountId = "accountId0";
String sessionId = "sessionId8";

aPIController.listSessionParticipantsAsync(accountId, sessionId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | `ApiException` |
| 403 | Access Denied | `ApiException` |
| 404 | Not Found | `ApiException` |
| Default | Unexpected Error | [`ErrorException`]($m/WebRtc/Error) |


# Add Participant to Session

Add a participant to a session.

Subscriptions can optionally be provided as part of this call.

```java
CompletableFuture<ApiResponse<Void>> addParticipantToSessionAsync(
    final String accountId,
    final String sessionId,
    final String participantId,
    final Subscriptions body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | Account ID |
| `sessionId` | `String` | Template, Required | Session ID |
| `participantId` | `String` | Template, Required | Participant ID |
| `body` | [`Subscriptions`]($m/WebRtc/Subscriptions) | Body, Optional | Subscriptions the participant should be created with |

## Server

`Server.WEBRTCDEFAULT`

## Response Type

`void`

## Example Usage

```java
String accountId = "accountId0";
String sessionId = "sessionId8";
String participantId = "participantId0";
Subscriptions body = new Subscriptions();
body.setSessionId("d8886aad-b956-4e1b-b2f4-d7c9f8162772");

aPIController.addParticipantToSessionAsync(accountId, sessionId, participantId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | `ApiException` |
| 403 | Access Denied | `ApiException` |
| 404 | Not Found | `ApiException` |
| Default | Unexpected Error | [`ErrorException`]($m/WebRtc/Error) |


# Remove Participant From Session

Remove a participant from a session.

This will automatically remove any subscriptions the participant has associated with this session.

```java
CompletableFuture<ApiResponse<Void>> removeParticipantFromSessionAsync(
    final String accountId,
    final String sessionId,
    final String participantId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | Account ID |
| `sessionId` | `String` | Template, Required | Session ID |
| `participantId` | `String` | Template, Required | Participant ID |

## Server

`Server.WEBRTCDEFAULT`

## Response Type

`void`

## Example Usage

```java
String accountId = "accountId0";
String sessionId = "sessionId8";
String participantId = "participantId0";

aPIController.removeParticipantFromSessionAsync(accountId, sessionId, participantId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | `ApiException` |
| 403 | Access Denied | `ApiException` |
| 404 | Not Found | `ApiException` |
| Default | Unexpected Error | [`ErrorException`]($m/WebRtc/Error) |


# Get Participant Subscriptions

Get a participant's subscriptions.

```java
CompletableFuture<ApiResponse<Subscriptions>> getParticipantSubscriptionsAsync(
    final String accountId,
    final String sessionId,
    final String participantId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | Account ID |
| `sessionId` | `String` | Template, Required | Session ID |
| `participantId` | `String` | Template, Required | Participant ID |

## Server

`Server.WEBRTCDEFAULT`

## Response Type

[`Subscriptions`]($m/WebRtc/Subscriptions)

## Example Usage

```java
String accountId = "accountId0";
String sessionId = "sessionId8";
String participantId = "participantId0";

aPIController.getParticipantSubscriptionsAsync(accountId, sessionId, participantId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | `ApiException` |
| 403 | Access Denied | `ApiException` |
| 404 | Not Found | `ApiException` |
| Default | Unexpected Error | [`ErrorException`]($m/WebRtc/Error) |


# Update Participant Subscriptions

Update a participant's subscriptions.

This is a full update that will replace the participant's subscriptions. First call `getParticipantSubscriptions` if you need the current subscriptions. Call this function with no `Subscriptions` object to remove all subscriptions.

```java
CompletableFuture<ApiResponse<Void>> updateParticipantSubscriptionsAsync(
    final String accountId,
    final String sessionId,
    final String participantId,
    final Subscriptions body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | Account ID |
| `sessionId` | `String` | Template, Required | Session ID |
| `participantId` | `String` | Template, Required | Participant ID |
| `body` | [`Subscriptions`]($m/WebRtc/Subscriptions) | Body, Optional | Initial state |

## Server

`Server.WEBRTCDEFAULT`

## Response Type

`void`

## Example Usage

```java
String accountId = "accountId0";
String sessionId = "sessionId8";
String participantId = "participantId0";
Subscriptions body = new Subscriptions();
body.setSessionId("d8886aad-b956-4e1b-b2f4-d7c9f8162772");

aPIController.updateParticipantSubscriptionsAsync(accountId, sessionId, participantId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | `ApiException` |
| 401 | Unauthorized | `ApiException` |
| 403 | Access Denied | `ApiException` |
| 404 | Not Found | `ApiException` |
| Default | Unexpected Error | [`ErrorException`]($m/WebRtc/Error) |

