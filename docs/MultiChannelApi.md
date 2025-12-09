# MultiChannelApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMultiChannelMessage**](MultiChannelApi.md#createMultiChannelMessage) | **POST** /users/{accountId}/messages/multiChannel | Create Multi-Channel Message |


<a id="createMultiChannelMessage"></a>
# **createMultiChannelMessage**
> CreateMultiChannelMessageResponse createMultiChannelMessage(accountId, multiChannelMessageRequest)

Create Multi-Channel Message

Endpoint for sending Multi-Channel messages.

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.MultiChannelApi;

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

    MultiChannelApi apiInstance = new MultiChannelApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    MultiChannelMessageRequest multiChannelMessageRequest = new MultiChannelMessageRequest(); // MultiChannelMessageRequest | 
    try {
      CreateMultiChannelMessageResponse result = apiInstance.createMultiChannelMessage(accountId, multiChannelMessageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MultiChannelApi#createMultiChannelMessage");
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
| **multiChannelMessageRequest** | [**MultiChannelMessageRequest**](MultiChannelMessageRequest.md)|  | |

### Return type

[**CreateMultiChannelMessageResponse**](CreateMultiChannelMessageResponse.md)

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
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **406** | Not Acceptable |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

