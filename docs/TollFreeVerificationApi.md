# TollFreeVerificationApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWebhookSubscription**](TollFreeVerificationApi.md#createWebhookSubscription) | **POST** /accounts/{accountId}/tollFreeVerification/webhooks/subscriptions | Create Webhook Subscription |
| [**deleteVerificationRequest**](TollFreeVerificationApi.md#deleteVerificationRequest) | **DELETE** /accounts/{accountId}/phoneNumbers/{phoneNumber}/tollFreeVerification | Delete a Toll-Free Verification Submission |
| [**deleteWebhookSubscription**](TollFreeVerificationApi.md#deleteWebhookSubscription) | **DELETE** /accounts/{accountId}/tollFreeVerification/webhooks/subscriptions/{id} | Delete Webhook Subscription |
| [**getTollFreeVerificationStatus**](TollFreeVerificationApi.md#getTollFreeVerificationStatus) | **GET** /accounts/{accountId}/phoneNumbers/{phoneNumber}/tollFreeVerification | Get Toll-Free Verification Status |
| [**listTollFreeUseCases**](TollFreeVerificationApi.md#listTollFreeUseCases) | **GET** /tollFreeVerification/useCases | List Toll-Free Use Cases |
| [**listWebhookSubscriptions**](TollFreeVerificationApi.md#listWebhookSubscriptions) | **GET** /accounts/{accountId}/tollFreeVerification/webhooks/subscriptions | List Webhook Subscriptions |
| [**requestTollFreeVerification**](TollFreeVerificationApi.md#requestTollFreeVerification) | **POST** /accounts/{accountId}/tollFreeVerification | Request Toll-Free Verification |
| [**updateTollFreeVerificationRequest**](TollFreeVerificationApi.md#updateTollFreeVerificationRequest) | **PUT** /accounts/{accountId}/phoneNumbers/{phoneNumber}/tollFreeVerification | Update Toll-Free Verification Request |
| [**updateWebhookSubscription**](TollFreeVerificationApi.md#updateWebhookSubscription) | **PUT** /accounts/{accountId}/tollFreeVerification/webhooks/subscriptions/{id} | Update Webhook Subscription |


<a id="createWebhookSubscription"></a>
# **createWebhookSubscription**
> WebhookSubscription createWebhookSubscription(accountId, webhookSubscriptionRequestSchema)

Create Webhook Subscription

Create a new webhook subscription (this webhook will be called for every update on every submission). In addition to a &#x60;callbackUrl&#x60;, this subscription can provide optional HTTP basic authentication credentials (a username and a password). The returned subscription object will contain an ID that can be used to modify or delete the subscription at a later time.

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.TollFreeVerificationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    TollFreeVerificationApi apiInstance = new TollFreeVerificationApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    WebhookSubscriptionRequestSchema webhookSubscriptionRequestSchema = new WebhookSubscriptionRequestSchema(); // WebhookSubscriptionRequestSchema | Information about a webhook that Bandwidth should send upon the completion of event customer is trying to subscribe to.
    try {
      WebhookSubscription result = apiInstance.createWebhookSubscription(accountId, webhookSubscriptionRequestSchema);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TollFreeVerificationApi#createWebhookSubscription");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| Your Bandwidth Account ID. | |
| **webhookSubscriptionRequestSchema** | [**WebhookSubscriptionRequestSchema**](WebhookSubscriptionRequestSchema.md)| Information about a webhook that Bandwidth should send upon the completion of event customer is trying to subscribe to. | |

### Return type

[**WebhookSubscription**](WebhookSubscription.md)

### Authorization

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Cannot find the requested resource. |  -  |
| **405** | Method Not Allowed |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a id="deleteVerificationRequest"></a>
# **deleteVerificationRequest**
> deleteVerificationRequest(accountId, phoneNumber)

Delete a Toll-Free Verification Submission

Delete a toll-free verification submission for a toll-free number.

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.TollFreeVerificationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    TollFreeVerificationApi apiInstance = new TollFreeVerificationApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    String phoneNumber = "+18885555555"; // String | Valid Toll-Free telephone number in E.164 format.
    try {
      apiInstance.deleteVerificationRequest(accountId, phoneNumber);
    } catch (ApiException e) {
      System.err.println("Exception when calling TollFreeVerificationApi#deleteVerificationRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| Your Bandwidth Account ID. | |
| **phoneNumber** | **String**| Valid Toll-Free telephone number in E.164 format. | |

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Cannot find the requested resource. |  -  |
| **405** | Method Not Allowed |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a id="deleteWebhookSubscription"></a>
# **deleteWebhookSubscription**
> deleteWebhookSubscription(accountId, id)

Delete Webhook Subscription

Delete a webhook subscription by ID.

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.TollFreeVerificationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    TollFreeVerificationApi apiInstance = new TollFreeVerificationApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    String id = "7bt57JcsVYJrN9K1OcV1Nu"; // String | Webhook subscription ID
    try {
      apiInstance.deleteWebhookSubscription(accountId, id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TollFreeVerificationApi#deleteWebhookSubscription");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| Your Bandwidth Account ID. | |
| **id** | **String**| Webhook subscription ID | |

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Cannot find the requested resource. |  -  |
| **405** | Method Not Allowed |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a id="getTollFreeVerificationStatus"></a>
# **getTollFreeVerificationStatus**
> TfvStatus getTollFreeVerificationStatus(accountId, phoneNumber)

Get Toll-Free Verification Status

Gets the verification status for a phone number that is provisioned to your account. Submission information will be appended to the response if it is available.

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.TollFreeVerificationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    TollFreeVerificationApi apiInstance = new TollFreeVerificationApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    String phoneNumber = "+18885555555"; // String | Valid Toll-Free telephone number in E.164 format.
    try {
      TfvStatus result = apiInstance.getTollFreeVerificationStatus(accountId, phoneNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TollFreeVerificationApi#getTollFreeVerificationStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| Your Bandwidth Account ID. | |
| **phoneNumber** | **String**| Valid Toll-Free telephone number in E.164 format. | |

### Return type

[**TfvStatus**](TfvStatus.md)

### Authorization

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Cannot find the requested resource. |  -  |
| **405** | Method Not Allowed |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a id="listTollFreeUseCases"></a>
# **listTollFreeUseCases**
> List&lt;String&gt; listTollFreeUseCases()

List Toll-Free Use Cases

Lists valid toll-free use cases.

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.TollFreeVerificationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    TollFreeVerificationApi apiInstance = new TollFreeVerificationApi(defaultClient);
    try {
      List<String> result = apiInstance.listTollFreeUseCases();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TollFreeVerificationApi#listTollFreeUseCases");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Cannot find the requested resource. |  -  |
| **405** | Method Not Allowed |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a id="listWebhookSubscriptions"></a>
# **listWebhookSubscriptions**
> WebhookSubscriptionsListBody listWebhookSubscriptions(accountId)

List Webhook Subscriptions

Lists all webhook subscriptions that are registered to receive status updates for the toll-free verification requests submitted under this account (password will not be returned through this API If &#x60;basicAuthentication&#x60; is defined, the &#x60;password&#x60; property of that object will be null).

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.TollFreeVerificationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    TollFreeVerificationApi apiInstance = new TollFreeVerificationApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    try {
      WebhookSubscriptionsListBody result = apiInstance.listWebhookSubscriptions(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TollFreeVerificationApi#listWebhookSubscriptions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| Your Bandwidth Account ID. | |

### Return type

[**WebhookSubscriptionsListBody**](WebhookSubscriptionsListBody.md)

### Authorization

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **405** | Method Not Allowed |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a id="requestTollFreeVerification"></a>
# **requestTollFreeVerification**
> requestTollFreeVerification(accountId, verificationRequest)

Request Toll-Free Verification

Submit a request for verification of a toll-free phone number.

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.TollFreeVerificationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    TollFreeVerificationApi apiInstance = new TollFreeVerificationApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    VerificationRequest verificationRequest = new VerificationRequest(); // VerificationRequest | Request for verification of a toll-free phone number.
    try {
      apiInstance.requestTollFreeVerification(accountId, verificationRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling TollFreeVerificationApi#requestTollFreeVerification");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| Your Bandwidth Account ID. | |
| **verificationRequest** | [**VerificationRequest**](VerificationRequest.md)| Request for verification of a toll-free phone number. | |

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **405** | Method Not Allowed |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a id="updateTollFreeVerificationRequest"></a>
# **updateTollFreeVerificationRequest**
> updateTollFreeVerificationRequest(accountId, phoneNumber, tfvSubmissionWrapper)

Update Toll-Free Verification Request

Updates a toll-free verification request. Submissions are only eligible for resubmission for 7 days within being processed and if resubmission is allowed (resubmitAllowed field is true).

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.TollFreeVerificationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    TollFreeVerificationApi apiInstance = new TollFreeVerificationApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    String phoneNumber = "+18885555555"; // String | Valid Toll-Free telephone number in E.164 format.
    TfvSubmissionWrapper tfvSubmissionWrapper = new TfvSubmissionWrapper(); // TfvSubmissionWrapper | Update a request for verification of a toll-free phone number.
    try {
      apiInstance.updateTollFreeVerificationRequest(accountId, phoneNumber, tfvSubmissionWrapper);
    } catch (ApiException e) {
      System.err.println("Exception when calling TollFreeVerificationApi#updateTollFreeVerificationRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| Your Bandwidth Account ID. | |
| **phoneNumber** | **String**| Valid Toll-Free telephone number in E.164 format. | |
| **tfvSubmissionWrapper** | [**TfvSubmissionWrapper**](TfvSubmissionWrapper.md)| Update a request for verification of a toll-free phone number. | |

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **405** | Method Not Allowed |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a id="updateWebhookSubscription"></a>
# **updateWebhookSubscription**
> WebhookSubscription updateWebhookSubscription(accountId, id, webhookSubscriptionRequestSchema)

Update Webhook Subscription

Update an existing webhook subscription (&#x60;callbackUrl&#x60; and &#x60;basicAuthentication&#x60; can be updated).

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.TollFreeVerificationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    TollFreeVerificationApi apiInstance = new TollFreeVerificationApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    String id = "7bt57JcsVYJrN9K1OcV1Nu"; // String | Webhook subscription ID
    WebhookSubscriptionRequestSchema webhookSubscriptionRequestSchema = new WebhookSubscriptionRequestSchema(); // WebhookSubscriptionRequestSchema | Information about a webhook that Bandwidth should send upon the completion of event customer is trying to subscribe to.
    try {
      WebhookSubscription result = apiInstance.updateWebhookSubscription(accountId, id, webhookSubscriptionRequestSchema);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TollFreeVerificationApi#updateWebhookSubscription");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| Your Bandwidth Account ID. | |
| **id** | **String**| Webhook subscription ID | |
| **webhookSubscriptionRequestSchema** | [**WebhookSubscriptionRequestSchema**](WebhookSubscriptionRequestSchema.md)| Information about a webhook that Bandwidth should send upon the completion of event customer is trying to subscribe to. | |

### Return type

[**WebhookSubscription**](WebhookSubscription.md)

### Authorization

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Cannot find the requested resource. |  -  |
| **405** | Method Not Allowed |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

