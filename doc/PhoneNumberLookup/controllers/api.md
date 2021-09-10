# API

```java
APIController aPIController = client.getPhoneNumberLookupClient().getAPIController();
```

## Class Name

`APIController`

## Methods

* [Create Lookup Request](/doc/PhoneNumberLookup/controllers/api.md#create-lookup-request)
* [Get Lookup Request Status](/doc/PhoneNumberLookup/controllers/api.md#get-lookup-request-status)


# Create Lookup Request

Create a TN Lookup Order.

```java
CompletableFuture<ApiResponse<OrderResponse>> createLookupRequestAsync(
    final String accountId,
    final OrderRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | The ID of the Bandwidth account that the user belongs to. |
| `body` | [`OrderRequest`]($m/PhoneNumberLookup/OrderRequest) | Body, Required | - |

## Server

`Server.PHONENUMBERLOOKUPDEFAULT`

## Response Type

[`OrderResponse`]($m/PhoneNumberLookup/OrderResponse)

## Example Usage

```java
String accountId = "9998887";
OrderRequest body = new OrderRequest();
body.setTns(new LinkedList<>());
body.getTns().add("19196104420");

aPIController.createLookupRequestAsync(accountId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "requestId": "004223a0-8b17-41b1-bf81-20732adf5590",
  "status": "IN_PROGRESS"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request. Ensure that your request payload is properly formatted and that the telephone numbers used are valid. | [`AccountsTnlookup400ErrorException`]($m/PhoneNumberLookup/Accounts%20Tnlookup%20400%20Error) |
| 401 | Unauthorized. Ensure that you are using the proper credentials for the environment you are accessing, your user has the proper role assigned to it, and that your Bandwidth account is enabled for TN Lookup access. | `ApiException` |
| 415 | Invalid content-type. Ensure that your content-type header is set to application/json. | `ApiException` |
| 429 | Too Many Requests. Reduce the amount of requests that you are sending in order to avoid receiving this status code. | `ApiException` |
| 500 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 501 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 502 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 503 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 504 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 505 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 506 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 507 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 508 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 509 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 510 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 511 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 512 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 513 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 514 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 515 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 516 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 517 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 518 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 519 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 520 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 521 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 522 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 523 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 524 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 525 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 526 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 527 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 528 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 529 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 530 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 531 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 532 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 533 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 534 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 535 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 536 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 537 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 538 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 539 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 540 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 541 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 542 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 543 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 544 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 545 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 546 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 547 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 548 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 549 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 550 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 551 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 552 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 553 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 554 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 555 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 556 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 557 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 558 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 559 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 560 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 561 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 562 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 563 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 564 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 565 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 566 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 567 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 568 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 569 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 570 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 571 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 572 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 573 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 574 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 575 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 576 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 577 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 578 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 579 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 580 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 581 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 582 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 583 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 584 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 585 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 586 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 587 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 588 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 589 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 590 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 591 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 592 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 593 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 594 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 595 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 596 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 597 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 598 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 599 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |


# Get Lookup Request Status

Query an existing TN Lookup Order.

```java
CompletableFuture<ApiResponse<OrderStatus>> getLookupRequestStatusAsync(
    final String accountId,
    final String requestId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | The ID of the Bandwidth account that the user belongs to. |
| `requestId` | `String` | Template, Required | - |

## Server

`Server.PHONENUMBERLOOKUPDEFAULT`

## Response Type

[`OrderStatus`]($m/PhoneNumberLookup/OrderStatus)

## Example Usage

```java
String accountId = "9998887";
String requestId = "requestId2";

aPIController.getLookupRequestStatusAsync(accountId, requestId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "requestId": "004223a0-8b17-41b1-bf81-20732adf5590",
  "status": "IN_PROGRESS"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request. Ensure that you have set the requestId as a URL path parameter. | `ApiException` |
| 401 | Unauthorized. Ensure that you are using the proper credentials for the environment you are accessing, your user has the proper role assigned to it, and that your Bandwidth account is enabled for TN Lookup access. | `ApiException` |
| 404 | RequestId not found. Ensure that the requestId used in the URL path is valid and maps to a previous request that was submitted. | `ApiException` |
| 429 | Too Many Requests. Reduce the amount of requests that you are sending in order to avoid receiving this status code. | `ApiException` |
| 500 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 501 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 502 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 503 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 504 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 505 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 506 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 507 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 508 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 509 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 510 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 511 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 512 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 513 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 514 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 515 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 516 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 517 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 518 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 519 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 520 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 521 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 522 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 523 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 524 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 525 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 526 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 527 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 528 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 529 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 530 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 531 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 532 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 533 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 534 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 535 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 536 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 537 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 538 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 539 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 540 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 541 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 542 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 543 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 544 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 545 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 546 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 547 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 548 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 549 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 550 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 551 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 552 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 553 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 554 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 555 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 556 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 557 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 558 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 559 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 560 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 561 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 562 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 563 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 564 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 565 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 566 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 567 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 568 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 569 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 570 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 571 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 572 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 573 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 574 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 575 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 576 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 577 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 578 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 579 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 580 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 581 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 582 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 583 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 584 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 585 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 586 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 587 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 588 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 589 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 590 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 591 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 592 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 593 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 594 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 595 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 596 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 597 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 598 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |
| 599 | Unexpected error. Please contact Bandwidth Support if your requests are receiving this status code for an extended period of time. | `ApiException` |

