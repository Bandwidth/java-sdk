# SessionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addParticipantToSession**](SessionsApi.md#addParticipantToSession) | **PUT** /accounts/{accountId}/sessions/{sessionId}/participants/{participantId} | Add Participant to Session |
| [**createSession**](SessionsApi.md#createSession) | **POST** /accounts/{accountId}/sessions | Create Session |
| [**deleteSession**](SessionsApi.md#deleteSession) | **DELETE** /accounts/{accountId}/sessions/{sessionId} | Delete Session |
| [**getParticipantSubscriptions**](SessionsApi.md#getParticipantSubscriptions) | **GET** /accounts/{accountId}/sessions/{sessionId}/participants/{participantId}/subscriptions | Get Participant Subscriptions |
| [**getSession**](SessionsApi.md#getSession) | **GET** /accounts/{accountId}/sessions/{sessionId} | Get Session |
| [**listSessionParticipants**](SessionsApi.md#listSessionParticipants) | **GET** /accounts/{accountId}/sessions/{sessionId}/participants | List Participants in Session |
| [**removeParticipantFromSession**](SessionsApi.md#removeParticipantFromSession) | **DELETE** /accounts/{accountId}/sessions/{sessionId}/participants/{participantId} | Remove Participant from Session |
| [**updateParticipantSubscriptions**](SessionsApi.md#updateParticipantSubscriptions) | **PUT** /accounts/{accountId}/sessions/{sessionId}/participants/{participantId}/subscriptions | Update Participant Subscriptions |


<a name="addParticipantToSession"></a>
# **addParticipantToSession**
> addParticipantToSession(accountId, sessionId, participantId, subscriptions)

Add Participant to Session

Add a participant to a session.  Subscriptions can optionally be provided as part of this call. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SessionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    SessionsApi apiInstance = new SessionsApi(defaultClient);
    String accountId = "9900000"; // String | Account ID
    String sessionId = "cb5054ee-a69b-41ac-9ab2-04d6370826b4"; // String | Session ID
    String participantId = "62e0ecb9-0b1b-5115-aae4-4f36123d6bb1"; // String | Participant ID
    Subscriptions subscriptions = new Subscriptions(); // Subscriptions | The Body describes an optional set of subscriptions to apply to the participant.  Calling this endpoint with no/empty body will only add the participant to the session, and will not subscribe the Participant to any media.  The request body for this endpoint is OPTIONAL and provided as a convenience to avoid additional calls to the Update Participant Subscriptions endpoint. --- If a body is provided it will result in direct control over what Participants are subscribed to.    - if the participants Array is provided and not empty, that list of Participants will be subscribed To   - if the participants Array is missing or empty, and the sessionId is provided, the participant will be subscribed to the session, including all subsequent changes to the membership of the session   - if the sessionId and the participant Array are both missing or empty, no subscriptions will be created
    try {
      apiInstance.addParticipantToSession(accountId, sessionId, participantId, subscriptions);
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionsApi#addParticipantToSession");
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
| **sessionId** | **String**| Session ID | |
| **participantId** | **String**| Participant ID | |
| **subscriptions** | [**Subscriptions**](Subscriptions.md)| The Body describes an optional set of subscriptions to apply to the participant.  Calling this endpoint with no/empty body will only add the participant to the session, and will not subscribe the Participant to any media.  The request body for this endpoint is OPTIONAL and provided as a convenience to avoid additional calls to the Update Participant Subscriptions endpoint. --- If a body is provided it will result in direct control over what Participants are subscribed to.    - if the participants Array is provided and not empty, that list of Participants will be subscribed To   - if the participants Array is missing or empty, and the sessionId is provided, the participant will be subscribed to the session, including all subsequent changes to the membership of the session   - if the sessionId and the participant Array are both missing or empty, no subscriptions will be created | [optional] |

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
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **500** | Internal Server Error |  -  |

<a name="createSession"></a>
# **createSession**
> Session createSession(accountId, session)

Create Session

Create a new session. Sessions are idempotent, so relevant parameters must be set in this function if desired.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SessionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    SessionsApi apiInstance = new SessionsApi(defaultClient);
    String accountId = "9900000"; // String | Account ID
    Session session = new Session(); // Session | Create session request body.
    try {
      Session result = apiInstance.createSession(accountId, session);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionsApi#createSession");
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
| **session** | [**Session**](Session.md)| Create session request body. | [optional] |

### Return type

[**Session**](Session.md)

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

<a name="deleteSession"></a>
# **deleteSession**
> deleteSession(accountId, sessionId)

Delete Session

Delete session by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SessionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    SessionsApi apiInstance = new SessionsApi(defaultClient);
    String accountId = "9900000"; // String | Account ID
    String sessionId = "cb5054ee-a69b-41ac-9ab2-04d6370826b4"; // String | Session ID
    try {
      apiInstance.deleteSession(accountId, sessionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionsApi#deleteSession");
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
| **sessionId** | **String**| Session ID | |

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

<a name="getParticipantSubscriptions"></a>
# **getParticipantSubscriptions**
> Subscriptions getParticipantSubscriptions(accountId, sessionId, participantId)

Get Participant Subscriptions

Get a participant&#39;s subscriptions.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SessionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    SessionsApi apiInstance = new SessionsApi(defaultClient);
    String accountId = "9900000"; // String | Account ID
    String sessionId = "cb5054ee-a69b-41ac-9ab2-04d6370826b4"; // String | Session ID
    String participantId = "62e0ecb9-0b1b-5115-aae4-4f36123d6bb1"; // String | Participant ID
    try {
      Subscriptions result = apiInstance.getParticipantSubscriptions(accountId, sessionId, participantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionsApi#getParticipantSubscriptions");
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
| **sessionId** | **String**| Session ID | |
| **participantId** | **String**| Participant ID | |

### Return type

[**Subscriptions**](Subscriptions.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a name="getSession"></a>
# **getSession**
> Session getSession(accountId, sessionId)

Get Session

Get session by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SessionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    SessionsApi apiInstance = new SessionsApi(defaultClient);
    String accountId = "9900000"; // String | Account ID
    String sessionId = "cb5054ee-a69b-41ac-9ab2-04d6370826b4"; // String | Session ID
    try {
      Session result = apiInstance.getSession(accountId, sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionsApi#getSession");
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
| **sessionId** | **String**| Session ID | |

### Return type

[**Session**](Session.md)

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

<a name="listSessionParticipants"></a>
# **listSessionParticipants**
> List&lt;Participant&gt; listSessionParticipants(accountId, sessionId)

List Participants in Session

List participants in a session.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SessionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    SessionsApi apiInstance = new SessionsApi(defaultClient);
    String accountId = "9900000"; // String | Account ID
    String sessionId = "cb5054ee-a69b-41ac-9ab2-04d6370826b4"; // String | Session ID
    try {
      List<Participant> result = apiInstance.listSessionParticipants(accountId, sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionsApi#listSessionParticipants");
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
| **sessionId** | **String**| Session ID | |

### Return type

[**List&lt;Participant&gt;**](Participant.md)

### Authorization

[Basic](../README.md#Basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a name="removeParticipantFromSession"></a>
# **removeParticipantFromSession**
> removeParticipantFromSession(accountId, sessionId, participantId)

Remove Participant from Session

Remove a participant from a session. This will automatically remove any subscriptions the participant has associated with this session.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SessionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    SessionsApi apiInstance = new SessionsApi(defaultClient);
    String accountId = "9900000"; // String | Account ID
    String sessionId = "cb5054ee-a69b-41ac-9ab2-04d6370826b4"; // String | Session ID
    String participantId = "62e0ecb9-0b1b-5115-aae4-4f36123d6bb1"; // String | Participant ID
    try {
      apiInstance.removeParticipantFromSession(accountId, sessionId, participantId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionsApi#removeParticipantFromSession");
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
| **sessionId** | **String**| Session ID | |
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

<a name="updateParticipantSubscriptions"></a>
# **updateParticipantSubscriptions**
> updateParticipantSubscriptions(accountId, sessionId, participantId, subscriptions)

Update Participant Subscriptions

Update a participant&#39;s subscriptions. This is a full update that will replace the participant&#39;s subscriptions. It allows subscription to the entire Session, a subset list of Participants in that Session, or specific media streams on any of the listed Participants. First call &#x60;getParticipantSubscriptions&#x60; if you need the current subscriptions. Calling this API with no &#x60;Subscriptions&#x60; object to remove all subscriptions.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SessionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    SessionsApi apiInstance = new SessionsApi(defaultClient);
    String accountId = "9900000"; // String | Account ID
    String sessionId = "cb5054ee-a69b-41ac-9ab2-04d6370826b4"; // String | Session ID
    String participantId = "62e0ecb9-0b1b-5115-aae4-4f36123d6bb1"; // String | Participant ID
    Subscriptions subscriptions = new Subscriptions(); // Subscriptions | The body describes the desired subscriptions for the Participant. --- If a body is provided it will result in direct control over what Participants are subscribed to.    - if the participants Array is provided and not empty, that list of Participants will be subscribed To   - if the participants Array is missing or empty, and the sessionId is provided, the participant will be subscribed to the session, including all subsequent changes to the membership of the session   - if the sessionId and the participant Array are both missing or empty, no subscriptions will be created
    try {
      apiInstance.updateParticipantSubscriptions(accountId, sessionId, participantId, subscriptions);
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionsApi#updateParticipantSubscriptions");
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
| **sessionId** | **String**| Session ID | |
| **participantId** | **String**| Participant ID | |
| **subscriptions** | [**Subscriptions**](Subscriptions.md)| The body describes the desired subscriptions for the Participant. --- If a body is provided it will result in direct control over what Participants are subscribed to.    - if the participants Array is provided and not empty, that list of Participants will be subscribed To   - if the participants Array is missing or empty, and the sessionId is provided, the participant will be subscribed to the session, including all subsequent changes to the membership of the session   - if the sessionId and the participant Array are both missing or empty, no subscriptions will be created | [optional] |

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
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

