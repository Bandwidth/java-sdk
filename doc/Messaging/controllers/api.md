# API

```java
APIController aPIController = client.getMessagingClient().getAPIController();
```

## Class Name

`APIController`

## Methods

* [List Media](/doc/Messaging/controllers/api.md#list-media)
* [Get Media](/doc/Messaging/controllers/api.md#get-media)
* [Upload Media](/doc/Messaging/controllers/api.md#upload-media)
* [Delete Media](/doc/Messaging/controllers/api.md#delete-media)
* [Get Messages](/doc/Messaging/controllers/api.md#get-messages)
* [Create Message](/doc/Messaging/controllers/api.md#create-message)


# List Media

Gets a list of your media files. No query parameters are supported.

```java
CompletableFuture<ApiResponse<List<Media>>> listMediaAsync(
    final String accountId,
    final String continuationToken)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | User's account ID |
| `continuationToken` | `String` | Header, Optional | Continuation token used to retrieve subsequent media. |

## Server

`Server.MESSAGINGDEFAULT`

## Response Type

[`List<Media>`]($m/Messaging/Media)

## Example Usage

```java
String accountId = "900000";
String continuationToken = "12345";

aPIController.listMediaAsync(accountId, continuationToken).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | 400 Request is malformed or invalid | [`MessagingException`]($m/Messaging/MessagingException) |
| 401 | 401 The specified user does not have access to the account | [`MessagingException`]($m/Messaging/MessagingException) |
| 403 | 403 The user does not have access to this API | [`MessagingException`]($m/Messaging/MessagingException) |
| 404 | 404 Path not found | [`MessagingException`]($m/Messaging/MessagingException) |
| 415 | 415 The content-type of the request is incorrect | [`MessagingException`]($m/Messaging/MessagingException) |
| 429 | 429 The rate limit has been reached | [`MessagingException`]($m/Messaging/MessagingException) |


# Get Media

Downloads a media file you previously uploaded.

```java
CompletableFuture<ApiResponse<InputStream>> getMediaAsync(
    final String accountId,
    final String mediaId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | User's account ID |
| `mediaId` | `String` | Template, Required | Media ID to retrieve<br>**Constraints**: *Pattern*: `.+` |

## Server

`Server.MESSAGINGDEFAULT`

## Response Type

`InputStream`

## Example Usage

```java
String accountId = "900000";
String mediaId = "0a610655-ba58";

aPIController.getMediaAsync(accountId, mediaId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | 400 Request is malformed or invalid | [`MessagingException`]($m/Messaging/MessagingException) |
| 401 | 401 The specified user does not have access to the account | [`MessagingException`]($m/Messaging/MessagingException) |
| 403 | 403 The user does not have access to this API | [`MessagingException`]($m/Messaging/MessagingException) |
| 404 | 404 Path not found | [`MessagingException`]($m/Messaging/MessagingException) |
| 415 | 415 The content-type of the request is incorrect | [`MessagingException`]($m/Messaging/MessagingException) |
| 429 | 429 The rate limit has been reached | [`MessagingException`]($m/Messaging/MessagingException) |


# Upload Media

Uploads a file the normal HTTP way. You may add headers to the request in order to provide some control to your media-file.

```java
CompletableFuture<ApiResponse<Void>> uploadMediaAsync(
    final String accountId,
    final String mediaId,
    final FileWrapper body,
    final String contentType,
    final String cacheControl)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | User's account ID |
| `mediaId` | `String` | Template, Required | The user supplied custom media ID<br>**Constraints**: *Pattern*: `.+` |
| `body` | `FileWrapper` | Body, Required | - |
| `contentType` | `String` | Header, Optional | The media type of the entity-body<br>**Default**: `"application/octet-stream"` |
| `cacheControl` | `String` | Header, Optional | General-header field is used to specify directives that MUST be obeyed by all caching mechanisms along the request/response chain. |

## Server

`Server.MESSAGINGDEFAULT`

## Response Type

`void`

## Example Usage

```java
String accountId = "900000";
String mediaId = "my-media-id";
FileWrapper body = new FileWrapper(new File("dummy_file"), "optional-content-type");
String contentType = "audio/wav";
String cacheControl = "no-cache";

aPIController.uploadMediaAsync(accountId, mediaId, body, contentType, cacheControl).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | 400 Request is malformed or invalid | [`MessagingException`]($m/Messaging/MessagingException) |
| 401 | 401 The specified user does not have access to the account | [`MessagingException`]($m/Messaging/MessagingException) |
| 403 | 403 The user does not have access to this API | [`MessagingException`]($m/Messaging/MessagingException) |
| 404 | 404 Path not found | [`MessagingException`]($m/Messaging/MessagingException) |
| 415 | 415 The content-type of the request is incorrect | [`MessagingException`]($m/Messaging/MessagingException) |
| 429 | 429 The rate limit has been reached | [`MessagingException`]($m/Messaging/MessagingException) |


# Delete Media

Deletes a media file from Bandwidth API server. Make sure you don't have any application scripts still using the media before you delete. If you accidentally delete a media file, you can immediately upload a new file with the same name.

```java
CompletableFuture<ApiResponse<Void>> deleteMediaAsync(
    final String accountId,
    final String mediaId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | User's account ID |
| `mediaId` | `String` | Template, Required | The media ID to delete<br>**Constraints**: *Pattern*: `.+` |

## Server

`Server.MESSAGINGDEFAULT`

## Response Type

`void`

## Example Usage

```java
String accountId = "900000";
String mediaId = "tjdla-4562ld";

aPIController.deleteMediaAsync(accountId, mediaId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | 400 Request is malformed or invalid | [`MessagingException`]($m/Messaging/MessagingException) |
| 401 | 401 The specified user does not have access to the account | [`MessagingException`]($m/Messaging/MessagingException) |
| 403 | 403 The user does not have access to this API | [`MessagingException`]($m/Messaging/MessagingException) |
| 404 | 404 Path not found | [`MessagingException`]($m/Messaging/MessagingException) |
| 415 | 415 The content-type of the request is incorrect | [`MessagingException`]($m/Messaging/MessagingException) |
| 429 | 429 The rate limit has been reached | [`MessagingException`]($m/Messaging/MessagingException) |


# Get Messages

Gets a list of messages based on query parameters.

```java
CompletableFuture<ApiResponse<BandwidthMessagesList>> getMessagesAsync(
    final String accountId,
    final String messageId,
    final String sourceTn,
    final String destinationTn,
    final String messageStatus,
    final Integer errorCode,
    final String fromDateTime,
    final String toDateTime,
    final String pageToken,
    final Integer limit)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | User's account ID |
| `messageId` | `String` | Query, Optional | The ID of the message to search for. Special characters need to be encoded using URL encoding |
| `sourceTn` | `String` | Query, Optional | The phone number that sent the message |
| `destinationTn` | `String` | Query, Optional | The phone number that received the message |
| `messageStatus` | `String` | Query, Optional | The status of the message. One of RECEIVED, QUEUED, SENDING, SENT, FAILED, DELIVERED, ACCEPTED, UNDELIVERED |
| `errorCode` | `Integer` | Query, Optional | The error code of the message |
| `fromDateTime` | `String` | Query, Optional | The start of the date range to search in ISO 8601 format. Uses the message receive time. The date range to search in is currently 14 days. |
| `toDateTime` | `String` | Query, Optional | The end of the date range to search in ISO 8601 format. Uses the message receive time. The date range to search in is currently 14 days. |
| `pageToken` | `String` | Query, Optional | A base64 encoded value used for pagination of results |
| `limit` | `Integer` | Query, Optional | The maximum records requested in search result. Default 100. The sum of limit and after cannot be more than 10000 |

## Server

`Server.MESSAGINGDEFAULT`

## Response Type

[`BandwidthMessagesList`]($m/Messaging/BandwidthMessagesList)

## Example Usage

```java
String accountId = "900000";
String messageId = "9e0df4ca-b18d-40d7-a59f-82fcdf5ae8e6";
String sourceTn = "%2B15554443333";
String destinationTn = "%2B15554443333";
String messageStatus = "RECEIVED";
Integer errorCode = 9902;
String fromDateTime = "2016-09-14T18:20:16.000Z";
String toDateTime = "2016-09-14T18:20:16.000Z";
String pageToken = "gdEewhcJLQRB5";
Integer limit = 50;

aPIController.getMessagesAsync(accountId, messageId, sourceTn, destinationTn, messageStatus, errorCode, fromDateTime, toDateTime, pageToken, limit).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | 400 Request is malformed or invalid | [`MessagingException`]($m/Messaging/MessagingException) |
| 401 | 401 The specified user does not have access to the account | [`MessagingException`]($m/Messaging/MessagingException) |
| 403 | 403 The user does not have access to this API | [`MessagingException`]($m/Messaging/MessagingException) |
| 404 | 404 Path not found | [`MessagingException`]($m/Messaging/MessagingException) |
| 415 | 415 The content-type of the request is incorrect | [`MessagingException`]($m/Messaging/MessagingException) |
| 429 | 429 The rate limit has been reached | [`MessagingException`]($m/Messaging/MessagingException) |


# Create Message

Endpoint for sending text messages and picture messages using V2 messaging.

```java
CompletableFuture<ApiResponse<BandwidthMessage>> createMessageAsync(
    final String accountId,
    final MessageRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | User's account ID |
| `body` | [`MessageRequest`]($m/Messaging/MessageRequest) | Body, Required | - |

## Server

`Server.MESSAGINGDEFAULT`

## Response Type

[`BandwidthMessage`]($m/Messaging/BandwidthMessage)

## Example Usage

```java
String accountId = "900000";
MessageRequest body = new MessageRequest();
body.setApplicationId("93de2206-9669-4e07-948d-329f4b722ee2");
body.setTo(new LinkedList<>());
body.getTo().add("+15554443333");
body.getTo().add("+15552223333");
body.setFrom("+15551113333");

aPIController.createMessageAsync(accountId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | 400 Request is malformed or invalid | [`MessagingException`]($m/Messaging/MessagingException) |
| 401 | 401 The specified user does not have access to the account | [`MessagingException`]($m/Messaging/MessagingException) |
| 403 | 403 The user does not have access to this API | [`MessagingException`]($m/Messaging/MessagingException) |
| 404 | 404 Path not found | [`MessagingException`]($m/Messaging/MessagingException) |
| 415 | 415 The content-type of the request is incorrect | [`MessagingException`]($m/Messaging/MessagingException) |
| 429 | 429 The rate limit has been reached | [`MessagingException`]($m/Messaging/MessagingException) |

