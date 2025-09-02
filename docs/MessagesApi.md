# MessagesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMessage**](MessagesApi.md#createMessage) | **POST** /users/{accountId}/messages | Create Message |
| [**listMessages**](MessagesApi.md#listMessages) | **GET** /users/{accountId}/messages | List Messages |


<a id="createMessage"></a>
# **createMessage**
> Message createMessage(accountId, messageRequest)

Create Message

Endpoint for sending text messages and picture messages using V2 messaging.

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    MessageRequest messageRequest = new MessageRequest(); // MessageRequest | 
    try {
      Message result = apiInstance.createMessage(accountId, messageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#createMessage");
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
| **messageRequest** | [**MessageRequest**](MessageRequest.md)|  | |

### Return type

[**Message**](Message.md)

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
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **406** | Not Acceptable |  -  |
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

<a id="listMessages"></a>
# **listMessages**
> MessagesList listMessages(accountId, messageId, sourceTn, destinationTn, messageStatus, messageDirection, carrierName, messageType, errorCode, fromDateTime, toDateTime, campaignId, fromBwLatency, bwQueued, product, location, carrierQueued, fromCarrierLatency, callingNumberCountryA3, calledNumberCountryA3, fromSegmentCount, toSegmentCount, fromMessageSize, toMessageSize, sort, pageToken, limit, limitTotalCount)

List Messages

Returns a list of messages based on query parameters.

### Example
```java
// Import classes:
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.auth.*;
import com.bandwidth.sdk.models.*;
import com.bandwidth.sdk.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String accountId = "9900000"; // String | Your Bandwidth Account ID.
    String messageId = "9e0df4ca-b18d-40d7-a59f-82fcdf5ae8e6"; // String | The ID of the message to search for. Special characters need to be encoded using URL encoding. Message IDs could come in different formats, e.g., 9e0df4ca-b18d-40d7-a59f-82fcdf5ae8e6 and 1589228074636lm4k2je7j7jklbn2 are valid message ID formats. Note that you must include at least one query parameter.
    String sourceTn = "%2B15554443333"; // String | The phone number that sent the message. Accepted values are: a single full phone number a comma separated list of full phone numbers (maximum of 10) or a single partial phone number (minimum of 5 characters e.g. '%2B1919').
    String destinationTn = "%2B15554443333"; // String | The phone number that received the message. Accepted values are: a single full phone number a comma separated list of full phone numbers (maximum of 10) or a single partial phone number (minimum of 5 characters e.g. '%2B1919').
    MessageStatusEnum messageStatus = MessageStatusEnum.fromValue("RECEIVED"); // MessageStatusEnum | The status of the message. One of RECEIVED QUEUED SENDING SENT FAILED DELIVERED ACCEPTED UNDELIVERED.
    ListMessageDirectionEnum messageDirection = ListMessageDirectionEnum.fromValue("INBOUND"); // ListMessageDirectionEnum | The direction of the message. One of INBOUND OUTBOUND.
    String carrierName = "Verizon"; // String | The name of the carrier used for this message. Possible values include but are not limited to Verizon and TMobile. Special characters need to be encoded using URL encoding (i.e. AT&T should be passed as AT%26T).
    MessageTypeEnum messageType = MessageTypeEnum.fromValue("sms"); // MessageTypeEnum | The type of message. Either sms or mms.
    Integer errorCode = 9902; // Integer | The error code of the message.
    String fromDateTime = "2022-09-14T18:20:16.000Z"; // String | The start of the date range to search in ISO 8601 format. Uses the message receive time. The date range to search in is currently 14 days.
    String toDateTime = "2022-09-14T18:20:16.000Z"; // String | The end of the date range to search in ISO 8601 format. Uses the message receive time. The date range to search in is currently 14 days.
    String campaignId = "CJEUMDK"; // String | The campaign ID of the message.
    Integer fromBwLatency = 5; // Integer | The minimum Bandwidth latency of the message in seconds. Only available for accounts with the Advanced Quality Metrics feature enabled.
    Boolean bwQueued = true; // Boolean | A boolean value indicating whether the message is queued in the Bandwidth network.
    ProductTypeEnum product = ProductTypeEnum.fromValue("LOCAL_A2P"); // ProductTypeEnum | Messaging product associated with the message.
    String location = "123ABC"; // String | Location Id associated with the message.
    Boolean carrierQueued = true; // Boolean | A boolean value indicating whether the message is queued in the carrier network. Only available for OUTBOUND messages from accounts with the Advanced Quality Metrics feature enabled.
    Integer fromCarrierLatency = 50; // Integer | The minimum carrier latency of the message in seconds. Only available for OUTBOUND messages from accounts with the Advanced Quality Metrics feature enabled.
    String callingNumberCountryA3 = "USA"; // String | Calling number country in A3 format.
    String calledNumberCountryA3 = "USA"; // String | Called number country in A3 format.
    Integer fromSegmentCount = 1; // Integer | Segment count (start range).
    Integer toSegmentCount = 3; // Integer | Segment count (end range).
    Integer fromMessageSize = 100; // Integer | Message size (start range).
    Integer toMessageSize = 120; // Integer | Message size (end range).
    String sort = "sourceTn:desc"; // String | The field and direction to sort by combined with a colon. Direction is either asc or desc.
    String pageToken = "gdEewhcJLQRB5"; // String | A base64 encoded value used for pagination of results.
    Integer limit = 50; // Integer | The maximum records requested in search result. Default 100. The sum of limit and after cannot be more than 10000.
    Boolean limitTotalCount = true; // Boolean | When set to true, the response's totalCount field will have a maximum value of 10,000. When set to false, or excluded, this will give an accurate totalCount of all messages that match the provided filters. If you are experiencing latency, try using this parameter to limit your results.
    try {
      MessagesList result = apiInstance.listMessages(accountId, messageId, sourceTn, destinationTn, messageStatus, messageDirection, carrierName, messageType, errorCode, fromDateTime, toDateTime, campaignId, fromBwLatency, bwQueued, product, location, carrierQueued, fromCarrierLatency, callingNumberCountryA3, calledNumberCountryA3, fromSegmentCount, toSegmentCount, fromMessageSize, toMessageSize, sort, pageToken, limit, limitTotalCount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#listMessages");
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
| **messageId** | **String**| The ID of the message to search for. Special characters need to be encoded using URL encoding. Message IDs could come in different formats, e.g., 9e0df4ca-b18d-40d7-a59f-82fcdf5ae8e6 and 1589228074636lm4k2je7j7jklbn2 are valid message ID formats. Note that you must include at least one query parameter. | [optional] |
| **sourceTn** | **String**| The phone number that sent the message. Accepted values are: a single full phone number a comma separated list of full phone numbers (maximum of 10) or a single partial phone number (minimum of 5 characters e.g. &#39;%2B1919&#39;). | [optional] |
| **destinationTn** | **String**| The phone number that received the message. Accepted values are: a single full phone number a comma separated list of full phone numbers (maximum of 10) or a single partial phone number (minimum of 5 characters e.g. &#39;%2B1919&#39;). | [optional] |
| **messageStatus** | [**MessageStatusEnum**](.md)| The status of the message. One of RECEIVED QUEUED SENDING SENT FAILED DELIVERED ACCEPTED UNDELIVERED. | [optional] [enum: RECEIVED, QUEUED, SENDING, SENT, FAILED, DELIVERED, ACCEPTED, UNDELIVERED] |
| **messageDirection** | [**ListMessageDirectionEnum**](.md)| The direction of the message. One of INBOUND OUTBOUND. | [optional] [enum: INBOUND, OUTBOUND] |
| **carrierName** | **String**| The name of the carrier used for this message. Possible values include but are not limited to Verizon and TMobile. Special characters need to be encoded using URL encoding (i.e. AT&amp;T should be passed as AT%26T). | [optional] |
| **messageType** | [**MessageTypeEnum**](.md)| The type of message. Either sms or mms. | [optional] [enum: sms, mms, rcs] |
| **errorCode** | **Integer**| The error code of the message. | [optional] |
| **fromDateTime** | **String**| The start of the date range to search in ISO 8601 format. Uses the message receive time. The date range to search in is currently 14 days. | [optional] |
| **toDateTime** | **String**| The end of the date range to search in ISO 8601 format. Uses the message receive time. The date range to search in is currently 14 days. | [optional] |
| **campaignId** | **String**| The campaign ID of the message. | [optional] |
| **fromBwLatency** | **Integer**| The minimum Bandwidth latency of the message in seconds. Only available for accounts with the Advanced Quality Metrics feature enabled. | [optional] |
| **bwQueued** | **Boolean**| A boolean value indicating whether the message is queued in the Bandwidth network. | [optional] |
| **product** | [**ProductTypeEnum**](.md)| Messaging product associated with the message. | [optional] [enum: LOCAL_A2P, P2P, SHORT_CODE_REACH, TOLL_FREE, HOSTED_SHORT_CODE, ALPHA_NUMERIC, RBM_MEDIA, RBM_RICH, RBM_CONVERSATIONAL] |
| **location** | **String**| Location Id associated with the message. | [optional] |
| **carrierQueued** | **Boolean**| A boolean value indicating whether the message is queued in the carrier network. Only available for OUTBOUND messages from accounts with the Advanced Quality Metrics feature enabled. | [optional] |
| **fromCarrierLatency** | **Integer**| The minimum carrier latency of the message in seconds. Only available for OUTBOUND messages from accounts with the Advanced Quality Metrics feature enabled. | [optional] |
| **callingNumberCountryA3** | **String**| Calling number country in A3 format. | [optional] |
| **calledNumberCountryA3** | **String**| Called number country in A3 format. | [optional] |
| **fromSegmentCount** | **Integer**| Segment count (start range). | [optional] |
| **toSegmentCount** | **Integer**| Segment count (end range). | [optional] |
| **fromMessageSize** | **Integer**| Message size (start range). | [optional] |
| **toMessageSize** | **Integer**| Message size (end range). | [optional] |
| **sort** | **String**| The field and direction to sort by combined with a colon. Direction is either asc or desc. | [optional] |
| **pageToken** | **String**| A base64 encoded value used for pagination of results. | [optional] |
| **limit** | **Integer**| The maximum records requested in search result. Default 100. The sum of limit and after cannot be more than 10000. | [optional] |
| **limitTotalCount** | **Boolean**| When set to true, the response&#39;s totalCount field will have a maximum value of 10,000. When set to false, or excluded, this will give an accurate totalCount of all messages that match the provided filters. If you are experiencing latency, try using this parameter to limit your results. | [optional] |

### Return type

[**MessagesList**](MessagesList.md)

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
| **415** | Unsupported Media Type |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

