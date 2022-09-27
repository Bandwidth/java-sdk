# PhoneNumberLookupApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLookup**](PhoneNumberLookupApi.md#createLookup) | **POST** /accounts/{accountId}/tnlookup | Create Lookup |
| [**getLookupStatus**](PhoneNumberLookupApi.md#getLookupStatus) | **GET** /accounts/{accountId}/tnlookup/{requestId} | Get Lookup Request Status |


<a name="createLookup"></a>
# **createLookup**
> CreateLookupResponse createLookup(accountId, lookupRequest)

Create Lookup

Create a Phone Number Lookup Request.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PhoneNumberLookupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    PhoneNumberLookupApi apiInstance = new PhoneNumberLookupApi(defaultClient);
    String accountId = "9900000"; // String | The ID of the Bandwidth account that the user belongs to.
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
| **accountId** | **String**| The ID of the Bandwidth account that the user belongs to. | |
| **lookupRequest** | [**LookupRequest**](LookupRequest.md)| Phone number lookup request. | |

### Return type

[**CreateLookupResponse**](CreateLookupResponse.md)

### Authorization

[Basic](../README.md#Basic)

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

<a name="getLookupStatus"></a>
# **getLookupStatus**
> LookupStatus getLookupStatus(accountId, requestId)

Get Lookup Request Status

Get an existing Phone Number Lookup Request.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PhoneNumberLookupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    PhoneNumberLookupApi apiInstance = new PhoneNumberLookupApi(defaultClient);
    String accountId = "9900000"; // String | The ID of the Bandwidth account that the user belongs to.
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
| **accountId** | **String**| The ID of the Bandwidth account that the user belongs to. | |
| **requestId** | **String**| The phone number lookup request ID from Bandwidth. | |

### Return type

[**LookupStatus**](LookupStatus.md)

### Authorization

[Basic](../README.md#Basic)

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

