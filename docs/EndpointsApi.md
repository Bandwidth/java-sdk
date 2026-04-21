# EndpointsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEndpoint**](EndpointsApi.md#createEndpoint) | **POST** /accounts/{accountId}/endpoints | Create Endpoint |
| [**deleteEndpoint**](EndpointsApi.md#deleteEndpoint) | **DELETE** /accounts/{accountId}/endpoints/{endpointId} | Delete Endpoint |
| [**getEndpoint**](EndpointsApi.md#getEndpoint) | **GET** /accounts/{accountId}/endpoints/{endpointId} | Get Endpoint |
| [**listEndpoints**](EndpointsApi.md#listEndpoints) | **GET** /accounts/{accountId}/endpoints | List Endpoints |
| [**updateEndpointBxml**](EndpointsApi.md#updateEndpointBxml) | **PUT** /accounts/{accountId}/endpoints/{endpointId}/bxml | Update Endpoint BXML |


<a id="createEndpoint"></a>
# **createEndpoint**
> CreateEndpointResponse createEndpoint(accountId, body)

Create Endpoint

Creates a new Endpoint for the specified account.

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.EndpointsApi;

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

    EndpointsApi apiInstance = new EndpointsApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    CreateWebRtcConnectionRequest body = new CreateWebRtcConnectionRequest(); // CreateWebRtcConnectionRequest | 
    try {
      CreateEndpointResponse result = apiInstance.createEndpoint(accountId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointsApi#createEndpoint");
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
| **body** | **CreateWebRtcConnectionRequest**|  | |

### Return type

[**CreateEndpointResponse**](CreateEndpointResponse.md)

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
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Service Unavailable |  -  |

<a id="deleteEndpoint"></a>
# **deleteEndpoint**
> deleteEndpoint(accountId, endpointId)

Delete Endpoint

Deletes the specified endpoint. If the endpoint is actively streaming media, the media stream will be terminated.

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.EndpointsApi;

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

    EndpointsApi apiInstance = new EndpointsApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    String endpointId = "e-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | BRTC Endpoint ID.
    try {
      apiInstance.deleteEndpoint(accountId, endpointId);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointsApi#deleteEndpoint");
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
| **endpointId** | **String**| BRTC Endpoint ID. | |

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
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Service Unavailable |  -  |

<a id="getEndpoint"></a>
# **getEndpoint**
> EndpointResponse getEndpoint(accountId, endpointId)

Get Endpoint

Returns information about the specified endpoint.

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.EndpointsApi;

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

    EndpointsApi apiInstance = new EndpointsApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    String endpointId = "e-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | BRTC Endpoint ID.
    try {
      EndpointResponse result = apiInstance.getEndpoint(accountId, endpointId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointsApi#getEndpoint");
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
| **endpointId** | **String**| BRTC Endpoint ID. | |

### Return type

[**EndpointResponse**](EndpointResponse.md)

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
| **405** | Method Not Allowed |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Service Unavailable |  -  |

<a id="listEndpoints"></a>
# **listEndpoints**
> ListEndpointsResponse listEndpoints(accountId, type, status, afterCursor, limit)

List Endpoints

Returns a list of endpoints associated with the specified account.

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.EndpointsApi;

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

    EndpointsApi apiInstance = new EndpointsApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    EndpointTypeEnum type = EndpointTypeEnum.fromValue("WEBRTC"); // EndpointTypeEnum | The type of endpoint.
    EndpointStatusEnum status = EndpointStatusEnum.fromValue("CONNECTED"); // EndpointStatusEnum | The status of the endpoint.
    String afterCursor = "TWF5IHRoZSBmb3JjZSBiZSB3aXRoIHlvdQ=="; // String | The cursor to use for pagination. This is the value of the `next` link in the previous response.
    Integer limit = 100; // Integer | The maximum number of endpoints to return in the response.
    try {
      ListEndpointsResponse result = apiInstance.listEndpoints(accountId, type, status, afterCursor, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointsApi#listEndpoints");
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
| **type** | [**EndpointTypeEnum**](.md)| The type of endpoint. | [optional] [enum: WEBRTC] |
| **status** | [**EndpointStatusEnum**](.md)| The status of the endpoint. | [optional] [enum: CONNECTED, DISCONNECTED] |
| **afterCursor** | **String**| The cursor to use for pagination. This is the value of the &#x60;next&#x60; link in the previous response. | [optional] |
| **limit** | **Integer**| The maximum number of endpoints to return in the response. | [optional] [default to 100] |

### Return type

[**ListEndpointsResponse**](ListEndpointsResponse.md)

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
| **405** | Method Not Allowed |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Service Unavailable |  -  |

<a id="updateEndpointBxml"></a>
# **updateEndpointBxml**
> updateEndpointBxml(accountId, endpointId, body)

Update Endpoint BXML

Updates the BXML for the specified endpoint.

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.EndpointsApi;

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

    EndpointsApi apiInstance = new EndpointsApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    String endpointId = "e-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | BRTC Endpoint ID.
    String body = "body_example"; // String | 
    try {
      apiInstance.updateEndpointBxml(accountId, endpointId, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointsApi#updateEndpointBxml");
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
| **endpointId** | **String**| BRTC Endpoint ID. | |
| **body** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Service Unavailable |  -  |

