# PhoneNumberLookupApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLookup**](PhoneNumberLookupApi.md#createLookup) | **POST** /accounts/{accountId}/tnlookup | Create Lookup |
| [**getLookupStatus**](PhoneNumberLookupApi.md#getLookupStatus) | **GET** /accounts/{accountId}/tnlookup/{requestId} | Get Lookup Request Status |


<a id="createLookup"></a>
# **createLookup**
> CreateLookupResponse createLookup(accountId, lookupRequest)

Create Lookup

Create a Phone Number Lookup Request.

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.PhoneNumberLookupApi;

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

    PhoneNumberLookupApi apiInstance = new PhoneNumberLookupApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    LookupRequest lookupRequest = new LookupRequest(); // LookupRequest | Phone number lookup request.
    try {
      CreateLookupResponse result = apiInstance.createLookup(accountId, lookupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneNumberLookupApi#createLookup");
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
| **lookupRequest** | [**LookupRequest**](LookupRequest.md)| Phone number lookup request. | |

### Return type

[**CreateLookupResponse**](CreateLookupResponse.md)

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
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

<a id="getLookupStatus"></a>
# **getLookupStatus**
> LookupStatus getLookupStatus(accountId, requestId)

Get Lookup Request Status

Get an existing Phone Number Lookup Request.

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.PhoneNumberLookupApi;

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

    PhoneNumberLookupApi apiInstance = new PhoneNumberLookupApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    String requestId = "004223a0-8b17-41b1-bf81-20732adf5590"; // String | The phone number lookup request ID from Bandwidth.
    try {
      LookupStatus result = apiInstance.getLookupStatus(accountId, requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneNumberLookupApi#getLookupStatus");
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
| **requestId** | **String**| The phone number lookup request ID from Bandwidth. | |

### Return type

[**LookupStatus**](LookupStatus.md)

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
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

