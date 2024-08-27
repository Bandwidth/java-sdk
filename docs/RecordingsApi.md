# RecordingsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteRecording**](RecordingsApi.md#deleteRecording) | **DELETE** /accounts/{accountId}/calls/{callId}/recordings/{recordingId} | Delete Recording |
| [**deleteRecordingMedia**](RecordingsApi.md#deleteRecordingMedia) | **DELETE** /accounts/{accountId}/calls/{callId}/recordings/{recordingId}/media | Delete Recording Media |
| [**deleteRecordingTranscription**](RecordingsApi.md#deleteRecordingTranscription) | **DELETE** /accounts/{accountId}/calls/{callId}/recordings/{recordingId}/transcription | Delete Transcription |
| [**downloadCallRecording**](RecordingsApi.md#downloadCallRecording) | **GET** /accounts/{accountId}/calls/{callId}/recordings/{recordingId}/media | Download Recording |
| [**getCallRecording**](RecordingsApi.md#getCallRecording) | **GET** /accounts/{accountId}/calls/{callId}/recordings/{recordingId} | Get Call Recording |
| [**getRecordingTranscription**](RecordingsApi.md#getRecordingTranscription) | **GET** /accounts/{accountId}/calls/{callId}/recordings/{recordingId}/transcription | Get Transcription |
| [**listAccountCallRecordings**](RecordingsApi.md#listAccountCallRecordings) | **GET** /accounts/{accountId}/recordings | Get Call Recordings |
| [**listCallRecordings**](RecordingsApi.md#listCallRecordings) | **GET** /accounts/{accountId}/calls/{callId}/recordings | List Call Recordings |
| [**transcribeCallRecording**](RecordingsApi.md#transcribeCallRecording) | **POST** /accounts/{accountId}/calls/{callId}/recordings/{recordingId}/transcription | Create Transcription Request |
| [**updateCallRecordingState**](RecordingsApi.md#updateCallRecordingState) | **PUT** /accounts/{accountId}/calls/{callId}/recording | Update Recording |


<a id="deleteRecording"></a>
# **deleteRecording**
> deleteRecording(accountId, callId, recordingId)

Delete Recording

Delete the recording information, media and transcription.  Note: After the deletion is requested and a &#x60;204&#x60; is returned, neither the recording metadata nor the actual media nor its transcription will be accessible anymore. However, the media of the specified recording is not deleted immediately. This deletion process, while transparent and irreversible, can take an additional 24 to 48 hours.

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.RecordingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    RecordingsApi apiInstance = new RecordingsApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    String callId = "c-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | Programmable Voice API Call ID.
    String recordingId = "r-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | Programmable Voice API Recording ID.
    try {
      apiInstance.deleteRecording(accountId, callId, recordingId);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordingsApi#deleteRecording");
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
| **recordingId** | **String**| Programmable Voice API Recording ID. | |

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
| **204** | Recording was deleted. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  * Retry-After - When you should try your request again. <br>  |
| **500** | Internal Server Error |  -  |

<a id="deleteRecordingMedia"></a>
# **deleteRecordingMedia**
> deleteRecordingMedia(accountId, callId, recordingId)

Delete Recording Media

Deletes the specified recording&#39;s media.

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.RecordingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    RecordingsApi apiInstance = new RecordingsApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    String callId = "c-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | Programmable Voice API Call ID.
    String recordingId = "r-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | Programmable Voice API Recording ID.
    try {
      apiInstance.deleteRecordingMedia(accountId, callId, recordingId);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordingsApi#deleteRecordingMedia");
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
| **recordingId** | **String**| Programmable Voice API Recording ID. | |

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
| **204** | The recording media was successfully deleted. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  * Retry-After - When you should try your request again. <br>  |
| **500** | Internal Server Error |  -  |

<a id="deleteRecordingTranscription"></a>
# **deleteRecordingTranscription**
> deleteRecordingTranscription(accountId, callId, recordingId)

Delete Transcription

Deletes the specified recording&#39;s transcription.  Note: After the deletion is requested and a &#x60;204&#x60; is returned, the transcription will not be accessible anymore. However, it is not deleted immediately. This deletion process, while transparent and irreversible, can take an additional 24 to 48 hours.

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.RecordingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    RecordingsApi apiInstance = new RecordingsApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    String callId = "c-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | Programmable Voice API Call ID.
    String recordingId = "r-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | Programmable Voice API Recording ID.
    try {
      apiInstance.deleteRecordingTranscription(accountId, callId, recordingId);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordingsApi#deleteRecordingTranscription");
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
| **recordingId** | **String**| Programmable Voice API Recording ID. | |

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
| **204** | The transcription was successfully deleted. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  * Retry-After - When you should try your request again. <br>  |
| **500** | Internal Server Error |  -  |

<a id="downloadCallRecording"></a>
# **downloadCallRecording**
> File downloadCallRecording(accountId, callId, recordingId)

Download Recording

Downloads the specified recording.

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.RecordingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    RecordingsApi apiInstance = new RecordingsApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    String callId = "c-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | Programmable Voice API Call ID.
    String recordingId = "r-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | Programmable Voice API Recording ID.
    try {
      File result = apiInstance.downloadCallRecording(accountId, callId, recordingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordingsApi#downloadCallRecording");
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
| **recordingId** | **String**| Programmable Voice API Recording ID. | |

### Return type

[**File**](File.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: audio/vnd.wave, audio/mpeg, application/json

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

<a id="getCallRecording"></a>
# **getCallRecording**
> CallRecordingMetadata getCallRecording(accountId, callId, recordingId)

Get Call Recording

Returns metadata for the specified recording.

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.RecordingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    RecordingsApi apiInstance = new RecordingsApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    String callId = "c-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | Programmable Voice API Call ID.
    String recordingId = "r-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | Programmable Voice API Recording ID.
    try {
      CallRecordingMetadata result = apiInstance.getCallRecording(accountId, callId, recordingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordingsApi#getCallRecording");
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
| **recordingId** | **String**| Programmable Voice API Recording ID. | |

### Return type

[**CallRecordingMetadata**](CallRecordingMetadata.md)

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
| **405** | Method Not Allowed |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  * Retry-After - When you should try your request again. <br>  |
| **500** | Internal Server Error |  -  |

<a id="getRecordingTranscription"></a>
# **getRecordingTranscription**
> RecordingTranscriptions getRecordingTranscription(accountId, callId, recordingId)

Get Transcription

Downloads the specified transcription. If the recording was multi-channel, then there will be 2 transcripts. The caller/called party transcript will be the first item while [&#x60;&lt;PlayAudio&gt;&#x60;](/docs/voice/bxml/playAudio) and [&#x60;&lt;SpeakSentence&gt;&#x60;](/docs/voice/bxml/speakSentence) transcript will be the second item. During a [&#x60;&lt;Transfer&gt;&#x60;](/docs/voice/bxml/transfer) the A-leg transcript will be the first item while the B-leg transcript will be the second item.

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.RecordingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    RecordingsApi apiInstance = new RecordingsApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    String callId = "c-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | Programmable Voice API Call ID.
    String recordingId = "r-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | Programmable Voice API Recording ID.
    try {
      RecordingTranscriptions result = apiInstance.getRecordingTranscription(accountId, callId, recordingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordingsApi#getRecordingTranscription");
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
| **recordingId** | **String**| Programmable Voice API Recording ID. | |

### Return type

[**RecordingTranscriptions**](RecordingTranscriptions.md)

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
| **405** | Method Not Allowed |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  * Retry-After - When you should try your request again. <br>  |
| **500** | Internal Server Error |  -  |

<a id="listAccountCallRecordings"></a>
# **listAccountCallRecordings**
> List&lt;CallRecordingMetadata&gt; listAccountCallRecordings(accountId, to, from, minStartTime, maxStartTime)

Get Call Recordings

Returns a list of metadata for the recordings associated with the specified account. The list can be filtered by the optional from, to, minStartTime, and maxStartTime arguments. The list is capped at 1000 entries and may be empty if no recordings match the specified criteria.

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.RecordingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    RecordingsApi apiInstance = new RecordingsApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    String to = "%2b19195551234"; // String | Filter results by the `to` field.
    String from = "%2b19195554321"; // String | Filter results by the `from` field.
    String minStartTime = "2022-06-21T19:13:21Z"; // String | Filter results to recordings which have a `startTime` after or including `minStartTime` (in ISO8601 format).
    String maxStartTime = "2022-06-21T19:13:21Z"; // String | Filter results to recordings which have a `startTime` before `maxStartTime` (in ISO8601 format).
    try {
      List<CallRecordingMetadata> result = apiInstance.listAccountCallRecordings(accountId, to, from, minStartTime, maxStartTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordingsApi#listAccountCallRecordings");
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
| **to** | **String**| Filter results by the &#x60;to&#x60; field. | [optional] |
| **from** | **String**| Filter results by the &#x60;from&#x60; field. | [optional] |
| **minStartTime** | **String**| Filter results to recordings which have a &#x60;startTime&#x60; after or including &#x60;minStartTime&#x60; (in ISO8601 format). | [optional] |
| **maxStartTime** | **String**| Filter results to recordings which have a &#x60;startTime&#x60; before &#x60;maxStartTime&#x60; (in ISO8601 format). | [optional] |

### Return type

[**List&lt;CallRecordingMetadata&gt;**](CallRecordingMetadata.md)

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
| **405** | Method Not Allowed |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  * Retry-After - When you should try your request again. <br>  |
| **500** | Internal Server Error |  -  |

<a id="listCallRecordings"></a>
# **listCallRecordings**
> List&lt;CallRecordingMetadata&gt; listCallRecordings(accountId, callId)

List Call Recordings

Returns a (potentially empty) list of metadata for the recordings that took place during the specified call.

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.RecordingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    RecordingsApi apiInstance = new RecordingsApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    String callId = "c-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | Programmable Voice API Call ID.
    try {
      List<CallRecordingMetadata> result = apiInstance.listCallRecordings(accountId, callId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordingsApi#listCallRecordings");
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

[**List&lt;CallRecordingMetadata&gt;**](CallRecordingMetadata.md)

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
| **405** | Method Not Allowed |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  * Retry-After - When you should try your request again. <br>  |
| **500** | Internal Server Error |  -  |

<a id="transcribeCallRecording"></a>
# **transcribeCallRecording**
> transcribeCallRecording(accountId, callId, recordingId, transcribeRecording)

Create Transcription Request

Generate the transcription for a specific recording. Transcription can succeed only for recordings of length greater than 500 milliseconds and less than 4 hours.

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.RecordingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    RecordingsApi apiInstance = new RecordingsApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    String callId = "c-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | Programmable Voice API Call ID.
    String recordingId = "r-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | Programmable Voice API Recording ID.
    TranscribeRecording transcribeRecording = new TranscribeRecording(); // TranscribeRecording | 
    try {
      apiInstance.transcribeCallRecording(accountId, callId, recordingId, transcribeRecording);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordingsApi#transcribeCallRecording");
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
| **recordingId** | **String**| Programmable Voice API Recording ID. | |
| **transcribeRecording** | [**TranscribeRecording**](TranscribeRecording.md)|  | |

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
| **204** | Transcription was successfully requested. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  * Retry-After - When you should try your request again. <br>  |
| **500** | Internal Server Error |  -  |

<a id="updateCallRecordingState"></a>
# **updateCallRecordingState**
> updateCallRecordingState(accountId, callId, updateCallRecording)

Update Recording

Pause or resume a recording on an active phone call.

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.RecordingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    RecordingsApi apiInstance = new RecordingsApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    String callId = "c-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | Programmable Voice API Call ID.
    UpdateCallRecording updateCallRecording = new UpdateCallRecording(); // UpdateCallRecording | 
    try {
      apiInstance.updateCallRecordingState(accountId, callId, updateCallRecording);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordingsApi#updateCallRecordingState");
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
| **updateCallRecording** | [**UpdateCallRecording**](UpdateCallRecording.md)|  | |

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
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  * Retry-After - When you should try your request again. <br>  |
| **500** | Internal Server Error |  -  |

