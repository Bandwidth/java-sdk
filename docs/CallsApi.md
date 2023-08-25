# CallsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCall**](CallsApi.md#createCall) | **POST** /accounts/{accountId}/calls | Create Call |
| [**getCallState**](CallsApi.md#getCallState) | **GET** /accounts/{accountId}/calls/{callId} | Get Call State Information |
| [**updateCall**](CallsApi.md#updateCall) | **POST** /accounts/{accountId}/calls/{callId} | Update Call |
| [**updateCallBxml**](CallsApi.md#updateCallBxml) | **PUT** /accounts/{accountId}/calls/{callId}/bxml | Update Call BXML |


<a id="createCall"></a>
# **createCall**
> CreateCallResponse createCall(accountId, createCall)

Create Call

Creates an outbound phone call.  All calls are initially queued. Your outbound calls will initiated at a specific dequeueing rate, enabling your application to \&quot;fire and forget\&quot; when creating calls. Queued calls may not be modified until they are dequeued and placed, but may be removed from your queue on demand.  &lt;b&gt;Please note:&lt;/b&gt; Calls submitted to your queue will be placed approximately in order, but exact ordering is not guaranteed.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CallsApi;

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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountId** | **String**| Your Bandwidth Account ID. | |
| **createCall** | [**CreateCall**](CreateCall.md)| JSON object containing information to create an outbound call | |

### Return type

[**CreateCallResponse**](CreateCallResponse.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Call Successfully Created |  * Location - The URL for further interactions with this call <br>  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  * Retry-After - When you should try your request again. <br>  |
| **500** | Internal Server Error |  -  |

<a id="getCallState"></a>
# **getCallState**
> CallState getCallState(accountId, callId)

Get Call State Information

Retrieve the current state of a specific call. This information is near-realtime, so it may take a few minutes for your call to be accessible using this endpoint.  **Note**: Call information is kept for 7 days after the calls are hung up. If you attempt to retrieve information for a call that is older than 7 days, you will get an HTTP 404 response.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CallsApi;

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
    String callId = "c-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | Programmable Voice API Call ID.
    try {
      CallState result = apiInstance.getCallState(accountId, callId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallsApi#getCallState");
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
| **callId** | **String**| Programmable Voice API Call ID. | |

### Return type

[**CallState**](CallState.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Call found |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  * Retry-After - When you should try your request again. <br>  |
| **500** | Internal Server Error |  -  |

<a id="updateCall"></a>
# **updateCall**
> updateCall(accountId, callId, updateCall)

Update Call

Interrupts and redirects a call to a different URL that should return a BXML document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CallsApi;

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
    String callId = "c-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | Programmable Voice API Call ID.
    UpdateCall updateCall = new UpdateCall(); // UpdateCall | JSON object containing information to redirect an existing call to a new BXML document
    try {
      apiInstance.updateCall(accountId, callId, updateCall);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallsApi#updateCall");
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
| **callId** | **String**| Programmable Voice API Call ID. | |
| **updateCall** | [**UpdateCall**](UpdateCall.md)| JSON object containing information to redirect an existing call to a new BXML document | |

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Call was successfully modified. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **409** | Conflict |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  * Retry-After - When you should try your request again. <br>  |
| **500** | Internal Server Error |  -  |

<a id="updateCallBxml"></a>
# **updateCallBxml**
> updateCallBxml(accountId, callId, body)

Update Call BXML

Interrupts and replaces an active call&#39;s BXML document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CallsApi;

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
    String callId = "c-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | Programmable Voice API Call ID.
    String body = <?xml version=\"1.0\" encoding=\"UTF-8\"?>
<Bxml>
  <SpeakSentence>This is a test sentence.</SpeakSentence>
</Bxml>; // String | 
    try {
      apiInstance.updateCallBxml(accountId, callId, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallsApi#updateCallBxml");
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
| **callId** | **String**| Programmable Voice API Call ID. | |
| **body** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Call BXML was successfully replaced. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **409** | Conflict |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  * Retry-After - When you should try your request again. <br>  |
| **500** | Internal Server Error |  -  |

