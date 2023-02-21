# MediaApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteMedia**](MediaApi.md#deleteMedia) | **DELETE** /users/{accountId}/media/{mediaId} | Delete Media |
| [**getMedia**](MediaApi.md#getMedia) | **GET** /users/{accountId}/media/{mediaId} | Get Media |
| [**listMedia**](MediaApi.md#listMedia) | **GET** /users/{accountId}/media | List Media |
| [**uploadMedia**](MediaApi.md#uploadMedia) | **PUT** /users/{accountId}/media/{mediaId} | Upload Media |


<a name="deleteMedia"></a>
# **deleteMedia**
> deleteMedia(accountId, mediaId)

Delete Media

Deletes a media file from Bandwidth API server. Make sure you don&#39;t have any application scripts still using the media before you delete.  If you accidentally delete a media file you can immediately upload a new file with the same name.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MediaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    MediaApi apiInstance = new MediaApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    String mediaId = "14762070468292kw2fuqty55yp2b2/0/bw.png"; // String | Media ID to retrieve.
    try {
      apiInstance.deleteMedia(accountId, mediaId);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaApi#deleteMedia");
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
| **mediaId** | **String**| Media ID to retrieve. | |

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
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

<a name="getMedia"></a>
# **getMedia**
> File getMedia(accountId, mediaId)

Get Media

Downloads a media file you previously uploaded.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MediaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    MediaApi apiInstance = new MediaApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    String mediaId = "14762070468292kw2fuqty55yp2b2/0/bw.png"; // String | Media ID to retrieve.
    try {
      File result = apiInstance.getMedia(accountId, mediaId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaApi#getMedia");
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
| **mediaId** | **String**| Media ID to retrieve. | |

### Return type

[**File**](File.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

<a name="listMedia"></a>
# **listMedia**
> List&lt;Media&gt; listMedia(accountId, continuationToken)

List Media

Gets a list of your media files. No query parameters are supported.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MediaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    MediaApi apiInstance = new MediaApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    String continuationToken = "1XEi2tsFtLo1JbtLwETnM1ZJ+PqAa8w6ENvC5QKvwyrCDYII663Gy5M4s40owR1tjkuWUif6qbWvFtQJR5/ipqbUnfAqL254LKNlPy6tATCzioKSuHuOqgzloDkSwRtX0LtcL2otHS69hK343m+SjdL+vlj71tT39"; // String | Continuation token used to retrieve subsequent media.
    try {
      List<Media> result = apiInstance.listMedia(accountId, continuationToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaApi#listMedia");
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
| **continuationToken** | **String**| Continuation token used to retrieve subsequent media. | [optional] |

### Return type

[**List&lt;Media&gt;**](Media.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Continuation-Token - Continuation token used to retrieve subsequent media. <br>  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

<a name="uploadMedia"></a>
# **uploadMedia**
> uploadMedia(accountId, mediaId, body, contentType, cacheControl)

Upload Media

Upload a file. You may add headers to the request in order to provide some control to your media file.  If a file is uploaded with the same name as a file that already exists under this account, the previous file will be overwritten.  A list of supported media types can be found [here](https://support.bandwidth.com/hc/en-us/articles/360014128994-What-MMS-file-types-are-supported-).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MediaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    MediaApi apiInstance = new MediaApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    String mediaId = "14762070468292kw2fuqty55yp2b2/0/bw.png"; // String | Media ID to retrieve.
    File body = new File("/path/to/file"); // File | 
    String contentType = "audio/wav"; // String | The media type of the entity-body.
    String cacheControl = "no-cache"; // String | General-header field is used to specify directives that MUST be obeyed by all caching mechanisms along the request/response chain.
    try {
      apiInstance.uploadMedia(accountId, mediaId, body, contentType, cacheControl);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaApi#uploadMedia");
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
| **mediaId** | **String**| Media ID to retrieve. | |
| **body** | **File**|  | |
| **contentType** | **String**| The media type of the entity-body. | [optional] |
| **cacheControl** | **String**| General-header field is used to specify directives that MUST be obeyed by all caching mechanisms along the request/response chain. | [optional] |

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: application/json, application/ogg, application/pdf, application/rtf, application/zip, application/x-tar, application/xml, application/gzip, application/x-bzip2, application/x-gzip, application/smil, application/javascript, audio/mp4, audio/mpeg, audio/ogg, audio/flac, audio/webm, audio/wav, audio/amr, audio/3gpp, image/bmp, image/gif, image/jpeg, image/pjpeg, image/png, image/svg+xml, image/tiff, image/webp, image/x-icon, text/css, text/csv, text/calendar, text/plain, text/javascript, text/vcard, text/vnd.wap.wml, text/xml, video/avi, video/mp4, video/mpeg, video/ogg, video/quicktime, video/webm, video/x-ms-wmv
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

