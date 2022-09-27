# ParticipantsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createParticipant**](ParticipantsApi.md#createParticipant) | **POST** /accounts/{accountId}/participants | Create Participant |
| [**deleteParticipant**](ParticipantsApi.md#deleteParticipant) | **DELETE** /accounts/{accountId}/participants/{participantId} | Delete Participant |
| [**getParticipant**](ParticipantsApi.md#getParticipant) | **GET** /accounts/{accountId}/participants/{participantId} | Get Participant |


<a name="createParticipant"></a>
# **createParticipant**
> CreateParticipantResponse createParticipant(accountId, createParticipantRequest)

Create Participant

Create a new participant under this account. Participants are idempotent, so relevant parameters must be set in this function if desired.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ParticipantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ParticipantsApi apiInstance = new ParticipantsApi(defaultClient);
    String accountId = "9900000"; // String | Account ID
    CreateParticipantRequest createParticipantRequest = new CreateParticipantRequest(); // CreateParticipantRequest | Create participant request body.
    try {
      CreateParticipantResponse result = apiInstance.createParticipant(accountId, createParticipantRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ParticipantsApi#createParticipant");
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
| **accountId** | **String**| Account ID | |
| **createParticipantRequest** | [**CreateParticipantRequest**](CreateParticipantRequest.md)| Create participant request body. | [optional] |

### Return type

[**CreateParticipantResponse**](CreateParticipantResponse.md)

### Authorization

[Basic](../README.md#Basic)

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
| **500** | Internal Server Error |  -  |

<a name="deleteParticipant"></a>
# **deleteParticipant**
> deleteParticipant(accountId, participantId)

Delete Participant

Delete participant by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ParticipantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ParticipantsApi apiInstance = new ParticipantsApi(defaultClient);
    String accountId = "9900000"; // String | Account ID
    String participantId = "62e0ecb9-0b1b-5115-aae4-4f36123d6bb1"; // String | Participant ID
    try {
      apiInstance.deleteParticipant(accountId, participantId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ParticipantsApi#deleteParticipant");
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
| **accountId** | **String**| Account ID | |
| **participantId** | **String**| Participant ID | |

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic)

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
| **500** | Internal Server Error |  -  |

<a name="getParticipant"></a>
# **getParticipant**
> Participant getParticipant(accountId, participantId)

Get Participant

Get participant by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ParticipantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ParticipantsApi apiInstance = new ParticipantsApi(defaultClient);
    String accountId = "9900000"; // String | Account ID
    String participantId = "62e0ecb9-0b1b-5115-aae4-4f36123d6bb1"; // String | Participant ID
    try {
      Participant result = apiInstance.getParticipant(accountId, participantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ParticipantsApi#getParticipant");
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
| **accountId** | **String**| Account ID | |
| **participantId** | **String**| Participant ID | |

### Return type

[**Participant**](Participant.md)

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
| **500** | Internal Server Error |  -  |

