# TranscriptionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteRealTimeTranscription**](TranscriptionsApi.md#deleteRealTimeTranscription) | **DELETE** /accounts/{accountId}/calls/{callId}/transcriptions/{transcriptionId} | Delete Real-time Transcription |
| [**getRealTimeTranscription**](TranscriptionsApi.md#getRealTimeTranscription) | **GET** /accounts/{accountId}/calls/{callId}/transcriptions/{transcriptionId} | Get Real-time Transcription |
| [**listRealTimeTranscriptions**](TranscriptionsApi.md#listRealTimeTranscriptions) | **GET** /accounts/{accountId}/calls/{callId}/transcriptions | List Real-time Transcriptions |


<a id="deleteRealTimeTranscription"></a>
# **deleteRealTimeTranscription**
> deleteRealTimeTranscription(accountId, callId, transcriptionId)

Delete Real-time Transcription

Delete the specified transcription that was created on this call via [startTranscription](/docs/voice/bxml/startTranscription).  Note: After the deletion is requested and a &#x60;200&#x60; is returned, the transcription will not be accessible anymore. However, it is not deleted immediately. This deletion process, while transparent and irreversible, can take an additional 24 to 48 hours.

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.TranscriptionsApi;

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

    TranscriptionsApi apiInstance = new TranscriptionsApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    String callId = "c-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | Programmable Voice API Call ID.
    String transcriptionId = "t-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | Programmable Voice API Transcription ID.
    try {
      apiInstance.deleteRealTimeTranscription(accountId, callId, transcriptionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranscriptionsApi#deleteRealTimeTranscription");
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
| **transcriptionId** | **String**| Programmable Voice API Transcription ID. | |

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
| **200** | No Content |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  * Retry-After - When you should try your request again. <br>  |
| **500** | Internal Server Error |  -  |

<a id="getRealTimeTranscription"></a>
# **getRealTimeTranscription**
> CallTranscriptionResponse getRealTimeTranscription(accountId, callId, transcriptionId)

Get Real-time Transcription

Retrieve the specified transcription that was created on this call via [startTranscription](/docs/voice/bxml/startTranscription).

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.TranscriptionsApi;

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

    TranscriptionsApi apiInstance = new TranscriptionsApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    String callId = "c-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | Programmable Voice API Call ID.
    String transcriptionId = "t-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | Programmable Voice API Transcription ID.
    try {
      CallTranscriptionResponse result = apiInstance.getRealTimeTranscription(accountId, callId, transcriptionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranscriptionsApi#getRealTimeTranscription");
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
| **transcriptionId** | **String**| Programmable Voice API Transcription ID. | |

### Return type

[**CallTranscriptionResponse**](CallTranscriptionResponse.md)

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
| **429** | Too Many Requests |  * Retry-After - When you should try your request again. <br>  |
| **500** | Internal Server Error |  -  |

<a id="listRealTimeTranscriptions"></a>
# **listRealTimeTranscriptions**
> List&lt;CallTranscriptionMetadata&gt; listRealTimeTranscriptions(accountId, callId)

List Real-time Transcriptions

List the transcriptions created on this call via [startTranscription](/docs/voice/bxml/startTranscription).

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.TranscriptionsApi;

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

    TranscriptionsApi apiInstance = new TranscriptionsApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    String callId = "c-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | Programmable Voice API Call ID.
    try {
      List<CallTranscriptionMetadata> result = apiInstance.listRealTimeTranscriptions(accountId, callId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranscriptionsApi#listRealTimeTranscriptions");
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

[**List&lt;CallTranscriptionMetadata&gt;**](CallTranscriptionMetadata.md)

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
| **429** | Too Many Requests |  * Retry-After - When you should try your request again. <br>  |
| **500** | Internal Server Error |  -  |

