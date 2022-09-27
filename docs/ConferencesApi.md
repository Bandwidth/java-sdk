# ConferencesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadConferenceRecording**](ConferencesApi.md#downloadConferenceRecording) | **GET** /accounts/{accountId}/conferences/{conferenceId}/recordings/{recordingId}/media | Download Conference Recording |
| [**getConference**](ConferencesApi.md#getConference) | **GET** /accounts/{accountId}/conferences/{conferenceId} | Get Conference Information |
| [**getConferenceMember**](ConferencesApi.md#getConferenceMember) | **GET** /accounts/{accountId}/conferences/{conferenceId}/members/{memberId} | Get Conference Member |
| [**getConferenceRecording**](ConferencesApi.md#getConferenceRecording) | **GET** /accounts/{accountId}/conferences/{conferenceId}/recordings/{recordingId} | Get Conference Recording Information |
| [**listConferenceRecordings**](ConferencesApi.md#listConferenceRecordings) | **GET** /accounts/{accountId}/conferences/{conferenceId}/recordings | Get Conference Recordings |
| [**listConferences**](ConferencesApi.md#listConferences) | **GET** /accounts/{accountId}/conferences | Get Conferences |
| [**updateConference**](ConferencesApi.md#updateConference) | **POST** /accounts/{accountId}/conferences/{conferenceId} | Update Conference |
| [**updateConferenceBxml**](ConferencesApi.md#updateConferenceBxml) | **PUT** /accounts/{accountId}/conferences/{conferenceId}/bxml | Update Conference BXML |
| [**updateConferenceMember**](ConferencesApi.md#updateConferenceMember) | **PUT** /accounts/{accountId}/conferences/{conferenceId}/members/{memberId} | Update Conference Member |


<a name="downloadConferenceRecording"></a>
# **downloadConferenceRecording**
> File downloadConferenceRecording(accountId, conferenceId, recordingId)

Download Conference Recording

Downloads the specified recording file.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConferencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ConferencesApi apiInstance = new ConferencesApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID
    String conferenceId = "conf-fe23a767-a75a5b77-20c5-4cca-b581-cbbf0776eca9"; // String | Programmable Voice API Conference ID
    String recordingId = "r-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | Programmable Voice API Recording ID
    try {
      File result = apiInstance.downloadConferenceRecording(accountId, conferenceId, recordingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConferencesApi#downloadConferenceRecording");
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
| **accountId** | **String**| Your Bandwidth Account ID | |
| **conferenceId** | **String**| Programmable Voice API Conference ID | |
| **recordingId** | **String**| Programmable Voice API Recording ID | |

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
| **200** | Media found |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  * Retry-After - When you should try your request again <br>  |
| **500** | Internal Server Error |  -  |

<a name="getConference"></a>
# **getConference**
> Conference getConference(accountId, conferenceId)

Get Conference Information

Returns information about the specified conference.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConferencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ConferencesApi apiInstance = new ConferencesApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID
    String conferenceId = "conf-fe23a767-a75a5b77-20c5-4cca-b581-cbbf0776eca9"; // String | Programmable Voice API Conference ID
    try {
      Conference result = apiInstance.getConference(accountId, conferenceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConferencesApi#getConference");
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
| **accountId** | **String**| Your Bandwidth Account ID | |
| **conferenceId** | **String**| Programmable Voice API Conference ID | |

### Return type

[**Conference**](Conference.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Conferences retrieved successfully |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  * Retry-After - When you should try your request again <br>  |
| **500** | Internal Server Error |  -  |

<a name="getConferenceMember"></a>
# **getConferenceMember**
> ConferenceMember getConferenceMember(accountId, conferenceId, memberId)

Get Conference Member

Returns information about the specified conference member.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConferencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ConferencesApi apiInstance = new ConferencesApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID
    String conferenceId = "conf-fe23a767-a75a5b77-20c5-4cca-b581-cbbf0776eca9"; // String | Programmable Voice API Conference ID
    String memberId = "c-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | Programmable Voice API Conference Member ID
    try {
      ConferenceMember result = apiInstance.getConferenceMember(accountId, conferenceId, memberId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConferencesApi#getConferenceMember");
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
| **accountId** | **String**| Your Bandwidth Account ID | |
| **conferenceId** | **String**| Programmable Voice API Conference ID | |
| **memberId** | **String**| Programmable Voice API Conference Member ID | |

### Return type

[**ConferenceMember**](ConferenceMember.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Conference member found |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  * Retry-After - When you should try your request again <br>  |
| **500** | Internal Server Error |  -  |

<a name="getConferenceRecording"></a>
# **getConferenceRecording**
> ConferenceRecordingMetadata getConferenceRecording(accountId, conferenceId, recordingId)

Get Conference Recording Information

Returns metadata for the specified recording.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConferencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ConferencesApi apiInstance = new ConferencesApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID
    String conferenceId = "conf-fe23a767-a75a5b77-20c5-4cca-b581-cbbf0776eca9"; // String | Programmable Voice API Conference ID
    String recordingId = "r-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | Programmable Voice API Recording ID
    try {
      ConferenceRecordingMetadata result = apiInstance.getConferenceRecording(accountId, conferenceId, recordingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConferencesApi#getConferenceRecording");
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
| **accountId** | **String**| Your Bandwidth Account ID | |
| **conferenceId** | **String**| Programmable Voice API Conference ID | |
| **recordingId** | **String**| Programmable Voice API Recording ID | |

### Return type

[**ConferenceRecordingMetadata**](ConferenceRecordingMetadata.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Conference recording found |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  * Retry-After - When you should try your request again <br>  |
| **500** | Internal Server Error |  -  |

<a name="listConferenceRecordings"></a>
# **listConferenceRecordings**
> List&lt;ConferenceRecordingMetadata&gt; listConferenceRecordings(accountId, conferenceId)

Get Conference Recordings

Returns a (potentially empty) list of metadata for the recordings that took place during the specified conference.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConferencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ConferencesApi apiInstance = new ConferencesApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID
    String conferenceId = "conf-fe23a767-a75a5b77-20c5-4cca-b581-cbbf0776eca9"; // String | Programmable Voice API Conference ID
    try {
      List<ConferenceRecordingMetadata> result = apiInstance.listConferenceRecordings(accountId, conferenceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConferencesApi#listConferenceRecordings");
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
| **accountId** | **String**| Your Bandwidth Account ID | |
| **conferenceId** | **String**| Programmable Voice API Conference ID | |

### Return type

[**List&lt;ConferenceRecordingMetadata&gt;**](ConferenceRecordingMetadata.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Conference recordings retrieved successfully |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  * Retry-After - When you should try your request again <br>  |
| **500** | Internal Server Error |  -  |

<a name="listConferences"></a>
# **listConferences**
> List&lt;Conference&gt; listConferences(accountId, name, minCreatedTime, maxCreatedTime, pageSize, pageToken)

Get Conferences

Returns a max of 1000 conferences, sorted by &#x60;createdTime&#x60; from oldest to newest.  **NOTE:** If the number of conferences in the account is bigger than &#x60;pageSize&#x60;, a &#x60;Link&#x60; header (with format &#x60;&lt;{url}&gt;; rel&#x3D;\&quot;next\&quot;&#x60;) will be returned in the response. The url can be used to retrieve the next page of conference records.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConferencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ConferencesApi apiInstance = new ConferencesApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID
    String name = "my-custom-name"; // String | Filter results by the `name` field.
    String minCreatedTime = "2022-06-21T19:13:21Z"; // String | Filter results to conferences which have a `createdTime` after or at `minCreatedTime` (in ISO8601 format).
    String maxCreatedTime = "2022-06-21T19:13:21Z"; // String | Filter results to conferences which have a `createdTime` before or at `maxCreatedTime` (in ISO8601 format).
    Integer pageSize = 1000; // Integer | Specifies the max number of conferences that will be returned.
    String pageToken = "pageToken_example"; // String | Not intended for explicit use. To use pagination, follow the links in the `Link` header of the response, as indicated in the endpoint description.
    try {
      List<Conference> result = apiInstance.listConferences(accountId, name, minCreatedTime, maxCreatedTime, pageSize, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConferencesApi#listConferences");
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
| **accountId** | **String**| Your Bandwidth Account ID | |
| **name** | **String**| Filter results by the &#x60;name&#x60; field. | [optional] |
| **minCreatedTime** | **String**| Filter results to conferences which have a &#x60;createdTime&#x60; after or at &#x60;minCreatedTime&#x60; (in ISO8601 format). | [optional] |
| **maxCreatedTime** | **String**| Filter results to conferences which have a &#x60;createdTime&#x60; before or at &#x60;maxCreatedTime&#x60; (in ISO8601 format). | [optional] |
| **pageSize** | **Integer**| Specifies the max number of conferences that will be returned. | [optional] [default to 1000] |
| **pageToken** | **String**| Not intended for explicit use. To use pagination, follow the links in the &#x60;Link&#x60; header of the response, as indicated in the endpoint description. | [optional] |

### Return type

[**List&lt;Conference&gt;**](Conference.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Conferences retrieved successfully |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  * Retry-After - When you should try your request again <br>  |
| **500** | Internal Server Error |  -  |

<a name="updateConference"></a>
# **updateConference**
> updateConference(accountId, conferenceId, updateConference)

Update Conference

Update the conference state.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConferencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ConferencesApi apiInstance = new ConferencesApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID
    String conferenceId = "conf-fe23a767-a75a5b77-20c5-4cca-b581-cbbf0776eca9"; // String | Programmable Voice API Conference ID
    UpdateConference updateConference = new UpdateConference(); // UpdateConference | 
    try {
      apiInstance.updateConference(accountId, conferenceId, updateConference);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConferencesApi#updateConference");
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
| **accountId** | **String**| Your Bandwidth Account ID | |
| **conferenceId** | **String**| Programmable Voice API Conference ID | |
| **updateConference** | [**UpdateConference**](UpdateConference.md)|  | |

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
| **204** | Conference successfully modified |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  * Retry-After - When you should try your request again <br>  |
| **500** | Internal Server Error |  -  |

<a name="updateConferenceBxml"></a>
# **updateConferenceBxml**
> updateConferenceBxml(accountId, conferenceId, body)

Update Conference BXML

Update the conference BXML document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConferencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ConferencesApi apiInstance = new ConferencesApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID
    String conferenceId = "conf-fe23a767-a75a5b77-20c5-4cca-b581-cbbf0776eca9"; // String | Programmable Voice API Conference ID
    String body = <?xml version="1.0" encoding="UTF-8"?>
<Bxml>
    <StopRecording/>
</Bxml>; // String | 
    try {
      apiInstance.updateConferenceBxml(accountId, conferenceId, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConferencesApi#updateConferenceBxml");
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
| **accountId** | **String**| Your Bandwidth Account ID | |
| **conferenceId** | **String**| Programmable Voice API Conference ID | |
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
| **204** | Conference successfully modified |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  * Retry-After - When you should try your request again <br>  |
| **500** | Internal Server Error |  -  |

<a name="updateConferenceMember"></a>
# **updateConferenceMember**
> updateConferenceMember(accountId, conferenceId, memberId, updateConferenceMember)

Update Conference Member

Updates settings for a particular conference member.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConferencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    ConferencesApi apiInstance = new ConferencesApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID
    String conferenceId = "conf-fe23a767-a75a5b77-20c5-4cca-b581-cbbf0776eca9"; // String | Programmable Voice API Conference ID
    String memberId = "c-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85"; // String | Programmable Voice API Conference Member ID
    UpdateConferenceMember updateConferenceMember = new UpdateConferenceMember(); // UpdateConferenceMember | 
    try {
      apiInstance.updateConferenceMember(accountId, conferenceId, memberId, updateConferenceMember);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConferencesApi#updateConferenceMember");
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
| **accountId** | **String**| Your Bandwidth Account ID | |
| **conferenceId** | **String**| Programmable Voice API Conference ID | |
| **memberId** | **String**| Programmable Voice API Conference Member ID | |
| **updateConferenceMember** | [**UpdateConferenceMember**](UpdateConferenceMember.md)|  | |

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
| **204** | Conference member successfully modified |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  * Retry-After - When you should try your request again <br>  |
| **500** | Internal Server Error |  -  |

