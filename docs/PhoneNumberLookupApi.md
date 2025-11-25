# PhoneNumberLookupApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAsyncBulkLookup**](PhoneNumberLookupApi.md#createAsyncBulkLookup) | **POST** /accounts/{accountId}/phoneNumberLookup/bulk | Create Asynchronous Bulk Number Lookup |
| [**createSyncLookup**](PhoneNumberLookupApi.md#createSyncLookup) | **POST** /accounts/{accountId}/phoneNumberLookup | Create Synchronous Number Lookup |
| [**getAsyncBulkLookup**](PhoneNumberLookupApi.md#getAsyncBulkLookup) | **GET** /accounts/{accountId}/phoneNumberLookup/bulk/{requestId} | Get Asynchronous Bulk Number Lookup |


<a id="createAsyncBulkLookup"></a>
# **createAsyncBulkLookup**
> CreateAsyncBulkLookupResponse createAsyncBulkLookup(accountId, asyncLookupRequest)

Create Asynchronous Bulk Number Lookup

Creates an asynchronous bulk phone number lookup request. Maximum of 15,000 telephone numbers per request. Use the [Get Asynchronous Bulk Number Lookup](#tag/Phone-Number-Lookup/operation/getAsyncBulkLookup) endpoint to check the status of the request and view the results.

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
    String accountId = "9900000"; // String | 
    AsyncLookupRequest asyncLookupRequest = new AsyncLookupRequest(); // AsyncLookupRequest | Asynchronous bulk phone number lookup request.
    try {
      CreateAsyncBulkLookupResponse result = apiInstance.createAsyncBulkLookup(accountId, asyncLookupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneNumberLookupApi#createAsyncBulkLookup");
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
| **accountId** | **String**|  | |
| **asyncLookupRequest** | [**AsyncLookupRequest**](AsyncLookupRequest.md)| Asynchronous bulk phone number lookup request. | |

### Return type

[**CreateAsyncBulkLookupResponse**](CreateAsyncBulkLookupResponse.md)

### Authorization

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **0** | Bad Request |  -  |

<a id="createSyncLookup"></a>
# **createSyncLookup**
> CreateSyncLookupResponse createSyncLookup(accountId, syncLookupRequest)

Create Synchronous Number Lookup

Creates a synchronous phone number lookup request. Maximum of 100 telephone numbers per request.

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
    String accountId = "9900000"; // String | 
    SyncLookupRequest syncLookupRequest = new SyncLookupRequest(); // SyncLookupRequest | Synchronous phone number lookup request.
    try {
      CreateSyncLookupResponse result = apiInstance.createSyncLookup(accountId, syncLookupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneNumberLookupApi#createSyncLookup");
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
| **accountId** | **String**|  | |
| **syncLookupRequest** | [**SyncLookupRequest**](SyncLookupRequest.md)| Synchronous phone number lookup request. | |

### Return type

[**CreateSyncLookupResponse**](CreateSyncLookupResponse.md)

### Authorization

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Bad Request |  -  |

<a id="getAsyncBulkLookup"></a>
# **getAsyncBulkLookup**
> GetAsyncBulkLookupResponse getAsyncBulkLookup(accountId, requestId)

Get Asynchronous Bulk Number Lookup

Get an existing [Asynchronous Bulk Number Lookup](#tag/Phone-Number-Lookup/operation/createAsyncBulkLookup). Use this endpoint to check the status of the request and view the results.

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
    String accountId = "9900000"; // String | 
    UUID requestId = UUID.fromString("004223a0-8b17-41b1-bf81-20732adf5590"); // UUID | 
    try {
      GetAsyncBulkLookupResponse result = apiInstance.getAsyncBulkLookup(accountId, requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneNumberLookupApi#getAsyncBulkLookup");
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
| **accountId** | **String**|  | |
| **requestId** | **UUID**|  | |

### Return type

[**GetAsyncBulkLookupResponse**](GetAsyncBulkLookupResponse.md)

### Authorization

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Bad Request |  -  |

