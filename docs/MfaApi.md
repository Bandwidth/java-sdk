# MfaApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateMessagingCode**](MfaApi.md#generateMessagingCode) | **POST** /accounts/{accountId}/code/messaging | Messaging Authentication Code |
| [**generateVoiceCode**](MfaApi.md#generateVoiceCode) | **POST** /accounts/{accountId}/code/voice | Voice Authentication Code |
| [**verifyCode**](MfaApi.md#verifyCode) | **POST** /accounts/{accountId}/code/verify | Verify Authentication Code |


<a name="generateMessagingCode"></a>
# **generateMessagingCode**
> MessagingCodeResponse generateMessagingCode(accountId, codeRequest)

Messaging Authentication Code

Send an MFA code via text message (SMS).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MfaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    MfaApi apiInstance = new MfaApi(defaultClient);
    String accountId = "accountId_example"; // String | Bandwidth Account ID with Voice service enabled.
    CodeRequest codeRequest = new CodeRequest(); // CodeRequest | MFA code request body.
    try {
      MessagingCodeResponse result = apiInstance.generateMessagingCode(accountId, codeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MfaApi#generateMessagingCode");
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
| **accountId** | **String**| Bandwidth Account ID with Voice service enabled. | |
| **codeRequest** | [**CodeRequest**](CodeRequest.md)| MFA code request body. | |

### Return type

[**MessagingCodeResponse**](MessagingCodeResponse.md)

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

<a name="generateVoiceCode"></a>
# **generateVoiceCode**
> VoiceCodeResponse generateVoiceCode(accountId, codeRequest)

Voice Authentication Code

Send an MFA Code via a phone call.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MfaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    MfaApi apiInstance = new MfaApi(defaultClient);
    String accountId = "accountId_example"; // String | Bandwidth Account ID with Voice service enabled.
    CodeRequest codeRequest = new CodeRequest(); // CodeRequest | MFA code request body.
    try {
      VoiceCodeResponse result = apiInstance.generateVoiceCode(accountId, codeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MfaApi#generateVoiceCode");
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
| **accountId** | **String**| Bandwidth Account ID with Voice service enabled. | |
| **codeRequest** | [**CodeRequest**](CodeRequest.md)| MFA code request body. | |

### Return type

[**VoiceCodeResponse**](VoiceCodeResponse.md)

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

<a name="verifyCode"></a>
# **verifyCode**
> VerifyCodeResponse verifyCode(accountId, verifyCodeRequest)

Verify Authentication Code

Verify a previously sent MFA code.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MfaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    MfaApi apiInstance = new MfaApi(defaultClient);
    String accountId = "accountId_example"; // String | Bandwidth Account ID with Voice service enabled.
    VerifyCodeRequest verifyCodeRequest = new VerifyCodeRequest(); // VerifyCodeRequest | MFA code verify request body.
    try {
      VerifyCodeResponse result = apiInstance.verifyCode(accountId, verifyCodeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MfaApi#verifyCode");
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
| **accountId** | **String**| Bandwidth Account ID with Voice service enabled. | |
| **verifyCodeRequest** | [**VerifyCodeRequest**](VerifyCodeRequest.md)| MFA code verify request body. | |

### Return type

[**VerifyCodeResponse**](VerifyCodeResponse.md)

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
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

