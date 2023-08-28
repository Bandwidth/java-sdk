/*
 * Bandwidth
 * Bandwidth's Communication APIs
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: letstalk@bandwidth.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.CreateMessageRequestError;
import org.openapitools.client.model.ListMessageDirectionEnum;
import org.openapitools.client.model.Message;
import org.openapitools.client.model.MessageRequest;
import org.openapitools.client.model.MessageStatusEnum;
import org.openapitools.client.model.MessageTypeEnum;
import org.openapitools.client.model.MessagesList;
import org.openapitools.client.model.MessagingRequestError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessagesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MessagesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MessagesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for createMessage
     * @param accountId Your Bandwidth Account ID. (required)
     * @param messageRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createMessageCall(String accountId, MessageRequest messageRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] { "https://messaging.bandwidth.com/api/v2" };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = messageRequest;

        // create path and map variables
        String localVarPath = "/users/{accountId}/messages"
            .replace("{" + "accountId" + "}", localVarApiClient.escapeString(accountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Basic" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createMessageValidateBeforeCall(String accountId, MessageRequest messageRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling createMessage(Async)");
        }

        // verify the required parameter 'messageRequest' is set
        if (messageRequest == null) {
            throw new ApiException("Missing the required parameter 'messageRequest' when calling createMessage(Async)");
        }

        return createMessageCall(accountId, messageRequest, _callback);

    }

    /**
     * Create Message
     * Endpoint for sending text messages and picture messages using V2 messaging.
     * @param accountId Your Bandwidth Account ID. (required)
     * @param messageRequest  (required)
     * @return Message
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public Message createMessage(String accountId, MessageRequest messageRequest) throws ApiException {
        ApiResponse<Message> localVarResp = createMessageWithHttpInfo(accountId, messageRequest);
        return localVarResp.getData();
    }

    /**
     * Create Message
     * Endpoint for sending text messages and picture messages using V2 messaging.
     * @param accountId Your Bandwidth Account ID. (required)
     * @param messageRequest  (required)
     * @return ApiResponse&lt;Message&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Message> createMessageWithHttpInfo(String accountId, MessageRequest messageRequest) throws ApiException {
        okhttp3.Call localVarCall = createMessageValidateBeforeCall(accountId, messageRequest, null);
        Type localVarReturnType = new TypeToken<Message>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Message (asynchronously)
     * Endpoint for sending text messages and picture messages using V2 messaging.
     * @param accountId Your Bandwidth Account ID. (required)
     * @param messageRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createMessageAsync(String accountId, MessageRequest messageRequest, final ApiCallback<Message> _callback) throws ApiException {

        okhttp3.Call localVarCall = createMessageValidateBeforeCall(accountId, messageRequest, _callback);
        Type localVarReturnType = new TypeToken<Message>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listMessages
     * @param accountId Your Bandwidth Account ID. (required)
     * @param messageId The ID of the message to search for. Special characters need to be encoded using URL encoding. Message IDs could come in different formats, e.g., 9e0df4ca-b18d-40d7-a59f-82fcdf5ae8e6 and 1589228074636lm4k2je7j7jklbn2 are valid message ID formats. Note that you must include at least one query parameter. (optional)
     * @param sourceTn The phone number that sent the message. Accepted values are: a single full phone number a comma separated list of full phone numbers (maximum of 10) or a single partial phone number (minimum of 5 characters e.g. &#39;%2B1919&#39;). (optional)
     * @param destinationTn The phone number that received the message. Accepted values are: a single full phone number a comma separated list of full phone numbers (maximum of 10) or a single partial phone number (minimum of 5 characters e.g. &#39;%2B1919&#39;). (optional)
     * @param messageStatus The status of the message. One of RECEIVED QUEUED SENDING SENT FAILED DELIVERED ACCEPTED UNDELIVERED. (optional)
     * @param messageDirection The direction of the message. One of INBOUND OUTBOUND. (optional)
     * @param carrierName The name of the carrier used for this message. Possible values include but are not limited to Verizon and TMobile. Special characters need to be encoded using URL encoding (i.e. AT&amp;T should be passed as AT%26T). (optional)
     * @param messageType The type of message. Either sms or mms. (optional)
     * @param errorCode The error code of the message. (optional)
     * @param fromDateTime The start of the date range to search in ISO 8601 format. Uses the message receive time. The date range to search in is currently 14 days. (optional)
     * @param toDateTime The end of the date range to search in ISO 8601 format. Uses the message receive time. The date range to search in is currently 14 days. (optional)
     * @param campaignId The campaign ID of the message. (optional)
     * @param sort The field and direction to sort by combined with a colon. Direction is either asc or desc. (optional)
     * @param pageToken A base64 encoded value used for pagination of results. (optional)
     * @param limit The maximum records requested in search result. Default 100. The sum of limit and after cannot be more than 10000. (optional)
     * @param limitTotalCount When set to true, the response&#39;s totalCount field will have a maximum value of 10,000. When set to false, or excluded, this will give an accurate totalCount of all messages that match the provided filters. If you are experiencing latency, try using this parameter to limit your results. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listMessagesCall(String accountId, String messageId, String sourceTn, String destinationTn, MessageStatusEnum messageStatus, ListMessageDirectionEnum messageDirection, String carrierName, MessageTypeEnum messageType, Integer errorCode, String fromDateTime, String toDateTime, String campaignId, String sort, String pageToken, Integer limit, Boolean limitTotalCount, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] { "https://messaging.bandwidth.com/api/v2" };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{accountId}/messages"
            .replace("{" + "accountId" + "}", localVarApiClient.escapeString(accountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (messageId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("messageId", messageId));
        }

        if (sourceTn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sourceTn", sourceTn));
        }

        if (destinationTn != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("destinationTn", destinationTn));
        }

        if (messageStatus != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("messageStatus", messageStatus));
        }

        if (messageDirection != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("messageDirection", messageDirection));
        }

        if (carrierName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("carrierName", carrierName));
        }

        if (messageType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("messageType", messageType));
        }

        if (errorCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("errorCode", errorCode));
        }

        if (fromDateTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fromDateTime", fromDateTime));
        }

        if (toDateTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("toDateTime", toDateTime));
        }

        if (campaignId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("campaignId", campaignId));
        }

        if (sort != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort", sort));
        }

        if (pageToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageToken", pageToken));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (limitTotalCount != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limitTotalCount", limitTotalCount));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Basic" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listMessagesValidateBeforeCall(String accountId, String messageId, String sourceTn, String destinationTn, MessageStatusEnum messageStatus, ListMessageDirectionEnum messageDirection, String carrierName, MessageTypeEnum messageType, Integer errorCode, String fromDateTime, String toDateTime, String campaignId, String sort, String pageToken, Integer limit, Boolean limitTotalCount, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling listMessages(Async)");
        }

        return listMessagesCall(accountId, messageId, sourceTn, destinationTn, messageStatus, messageDirection, carrierName, messageType, errorCode, fromDateTime, toDateTime, campaignId, sort, pageToken, limit, limitTotalCount, _callback);

    }

    /**
     * List Messages
     * Returns a list of messages based on query parameters.
     * @param accountId Your Bandwidth Account ID. (required)
     * @param messageId The ID of the message to search for. Special characters need to be encoded using URL encoding. Message IDs could come in different formats, e.g., 9e0df4ca-b18d-40d7-a59f-82fcdf5ae8e6 and 1589228074636lm4k2je7j7jklbn2 are valid message ID formats. Note that you must include at least one query parameter. (optional)
     * @param sourceTn The phone number that sent the message. Accepted values are: a single full phone number a comma separated list of full phone numbers (maximum of 10) or a single partial phone number (minimum of 5 characters e.g. &#39;%2B1919&#39;). (optional)
     * @param destinationTn The phone number that received the message. Accepted values are: a single full phone number a comma separated list of full phone numbers (maximum of 10) or a single partial phone number (minimum of 5 characters e.g. &#39;%2B1919&#39;). (optional)
     * @param messageStatus The status of the message. One of RECEIVED QUEUED SENDING SENT FAILED DELIVERED ACCEPTED UNDELIVERED. (optional)
     * @param messageDirection The direction of the message. One of INBOUND OUTBOUND. (optional)
     * @param carrierName The name of the carrier used for this message. Possible values include but are not limited to Verizon and TMobile. Special characters need to be encoded using URL encoding (i.e. AT&amp;T should be passed as AT%26T). (optional)
     * @param messageType The type of message. Either sms or mms. (optional)
     * @param errorCode The error code of the message. (optional)
     * @param fromDateTime The start of the date range to search in ISO 8601 format. Uses the message receive time. The date range to search in is currently 14 days. (optional)
     * @param toDateTime The end of the date range to search in ISO 8601 format. Uses the message receive time. The date range to search in is currently 14 days. (optional)
     * @param campaignId The campaign ID of the message. (optional)
     * @param sort The field and direction to sort by combined with a colon. Direction is either asc or desc. (optional)
     * @param pageToken A base64 encoded value used for pagination of results. (optional)
     * @param limit The maximum records requested in search result. Default 100. The sum of limit and after cannot be more than 10000. (optional)
     * @param limitTotalCount When set to true, the response&#39;s totalCount field will have a maximum value of 10,000. When set to false, or excluded, this will give an accurate totalCount of all messages that match the provided filters. If you are experiencing latency, try using this parameter to limit your results. (optional)
     * @return MessagesList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public MessagesList listMessages(String accountId, String messageId, String sourceTn, String destinationTn, MessageStatusEnum messageStatus, ListMessageDirectionEnum messageDirection, String carrierName, MessageTypeEnum messageType, Integer errorCode, String fromDateTime, String toDateTime, String campaignId, String sort, String pageToken, Integer limit, Boolean limitTotalCount) throws ApiException {
        ApiResponse<MessagesList> localVarResp = listMessagesWithHttpInfo(accountId, messageId, sourceTn, destinationTn, messageStatus, messageDirection, carrierName, messageType, errorCode, fromDateTime, toDateTime, campaignId, sort, pageToken, limit, limitTotalCount);
        return localVarResp.getData();
    }

    /**
     * List Messages
     * Returns a list of messages based on query parameters.
     * @param accountId Your Bandwidth Account ID. (required)
     * @param messageId The ID of the message to search for. Special characters need to be encoded using URL encoding. Message IDs could come in different formats, e.g., 9e0df4ca-b18d-40d7-a59f-82fcdf5ae8e6 and 1589228074636lm4k2je7j7jklbn2 are valid message ID formats. Note that you must include at least one query parameter. (optional)
     * @param sourceTn The phone number that sent the message. Accepted values are: a single full phone number a comma separated list of full phone numbers (maximum of 10) or a single partial phone number (minimum of 5 characters e.g. &#39;%2B1919&#39;). (optional)
     * @param destinationTn The phone number that received the message. Accepted values are: a single full phone number a comma separated list of full phone numbers (maximum of 10) or a single partial phone number (minimum of 5 characters e.g. &#39;%2B1919&#39;). (optional)
     * @param messageStatus The status of the message. One of RECEIVED QUEUED SENDING SENT FAILED DELIVERED ACCEPTED UNDELIVERED. (optional)
     * @param messageDirection The direction of the message. One of INBOUND OUTBOUND. (optional)
     * @param carrierName The name of the carrier used for this message. Possible values include but are not limited to Verizon and TMobile. Special characters need to be encoded using URL encoding (i.e. AT&amp;T should be passed as AT%26T). (optional)
     * @param messageType The type of message. Either sms or mms. (optional)
     * @param errorCode The error code of the message. (optional)
     * @param fromDateTime The start of the date range to search in ISO 8601 format. Uses the message receive time. The date range to search in is currently 14 days. (optional)
     * @param toDateTime The end of the date range to search in ISO 8601 format. Uses the message receive time. The date range to search in is currently 14 days. (optional)
     * @param campaignId The campaign ID of the message. (optional)
     * @param sort The field and direction to sort by combined with a colon. Direction is either asc or desc. (optional)
     * @param pageToken A base64 encoded value used for pagination of results. (optional)
     * @param limit The maximum records requested in search result. Default 100. The sum of limit and after cannot be more than 10000. (optional)
     * @param limitTotalCount When set to true, the response&#39;s totalCount field will have a maximum value of 10,000. When set to false, or excluded, this will give an accurate totalCount of all messages that match the provided filters. If you are experiencing latency, try using this parameter to limit your results. (optional)
     * @return ApiResponse&lt;MessagesList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MessagesList> listMessagesWithHttpInfo(String accountId, String messageId, String sourceTn, String destinationTn, MessageStatusEnum messageStatus, ListMessageDirectionEnum messageDirection, String carrierName, MessageTypeEnum messageType, Integer errorCode, String fromDateTime, String toDateTime, String campaignId, String sort, String pageToken, Integer limit, Boolean limitTotalCount) throws ApiException {
        okhttp3.Call localVarCall = listMessagesValidateBeforeCall(accountId, messageId, sourceTn, destinationTn, messageStatus, messageDirection, carrierName, messageType, errorCode, fromDateTime, toDateTime, campaignId, sort, pageToken, limit, limitTotalCount, null);
        Type localVarReturnType = new TypeToken<MessagesList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Messages (asynchronously)
     * Returns a list of messages based on query parameters.
     * @param accountId Your Bandwidth Account ID. (required)
     * @param messageId The ID of the message to search for. Special characters need to be encoded using URL encoding. Message IDs could come in different formats, e.g., 9e0df4ca-b18d-40d7-a59f-82fcdf5ae8e6 and 1589228074636lm4k2je7j7jklbn2 are valid message ID formats. Note that you must include at least one query parameter. (optional)
     * @param sourceTn The phone number that sent the message. Accepted values are: a single full phone number a comma separated list of full phone numbers (maximum of 10) or a single partial phone number (minimum of 5 characters e.g. &#39;%2B1919&#39;). (optional)
     * @param destinationTn The phone number that received the message. Accepted values are: a single full phone number a comma separated list of full phone numbers (maximum of 10) or a single partial phone number (minimum of 5 characters e.g. &#39;%2B1919&#39;). (optional)
     * @param messageStatus The status of the message. One of RECEIVED QUEUED SENDING SENT FAILED DELIVERED ACCEPTED UNDELIVERED. (optional)
     * @param messageDirection The direction of the message. One of INBOUND OUTBOUND. (optional)
     * @param carrierName The name of the carrier used for this message. Possible values include but are not limited to Verizon and TMobile. Special characters need to be encoded using URL encoding (i.e. AT&amp;T should be passed as AT%26T). (optional)
     * @param messageType The type of message. Either sms or mms. (optional)
     * @param errorCode The error code of the message. (optional)
     * @param fromDateTime The start of the date range to search in ISO 8601 format. Uses the message receive time. The date range to search in is currently 14 days. (optional)
     * @param toDateTime The end of the date range to search in ISO 8601 format. Uses the message receive time. The date range to search in is currently 14 days. (optional)
     * @param campaignId The campaign ID of the message. (optional)
     * @param sort The field and direction to sort by combined with a colon. Direction is either asc or desc. (optional)
     * @param pageToken A base64 encoded value used for pagination of results. (optional)
     * @param limit The maximum records requested in search result. Default 100. The sum of limit and after cannot be more than 10000. (optional)
     * @param limitTotalCount When set to true, the response&#39;s totalCount field will have a maximum value of 10,000. When set to false, or excluded, this will give an accurate totalCount of all messages that match the provided filters. If you are experiencing latency, try using this parameter to limit your results. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listMessagesAsync(String accountId, String messageId, String sourceTn, String destinationTn, MessageStatusEnum messageStatus, ListMessageDirectionEnum messageDirection, String carrierName, MessageTypeEnum messageType, Integer errorCode, String fromDateTime, String toDateTime, String campaignId, String sort, String pageToken, Integer limit, Boolean limitTotalCount, final ApiCallback<MessagesList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listMessagesValidateBeforeCall(accountId, messageId, sourceTn, destinationTn, messageStatus, messageDirection, carrierName, messageType, errorCode, fromDateTime, toDateTime, campaignId, sort, pageToken, limit, limitTotalCount, _callback);
        Type localVarReturnType = new TypeToken<MessagesList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
