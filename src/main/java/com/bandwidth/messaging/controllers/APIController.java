/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.bandwidth.messaging.controllers;

import com.bandwidth.ApiHelper;
import com.bandwidth.AuthManager;
import com.bandwidth.Configuration;
import com.bandwidth.Server;
import com.bandwidth.controllers.BaseController;
import com.bandwidth.exceptions.ApiException;
import com.bandwidth.http.Headers;
import com.bandwidth.http.client.HttpCallback;
import com.bandwidth.http.client.HttpClient;
import com.bandwidth.http.client.HttpContext;
import com.bandwidth.http.request.HttpRequest;
import com.bandwidth.http.response.ApiResponse;
import com.bandwidth.http.response.HttpResponse;
import com.bandwidth.http.response.HttpStringResponse;
import com.bandwidth.messaging.exceptions.MessagingException;
import com.bandwidth.messaging.models.BandwidthMessage;
import com.bandwidth.messaging.models.BandwidthMessagesList;
import com.bandwidth.messaging.models.Media;
import com.bandwidth.messaging.models.MessageRequest;
import com.bandwidth.utilities.FileWrapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.io.InputStream;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * This class lists all the endpoints of the groups.
 */
public final class APIController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public APIController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers) {
        super(config, httpClient, authManagers);
    }

    /**
     * Initializes the controller with HTTPCallback.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     * @param httpCallback    Callback to be called before and after the HTTP call.
     */
    public APIController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * Gets a list of your media files. No query parameters are supported.
     * @param  accountId  Required parameter: User's account ID
     * @param  continuationToken  Optional parameter: Continuation token used to retrieve subsequent
     *         media.
     * @return    Returns the List of Media wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<List<Media>> listMedia(
            final String accountId,
            final String continuationToken) throws ApiException, IOException {
        HttpRequest request = buildListMediaRequest(accountId, continuationToken);
        authManagers.get("messaging").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleListMediaResponse(context);
    }

    /**
     * Gets a list of your media files. No query parameters are supported.
     * @param  accountId  Required parameter: User's account ID
     * @param  continuationToken  Optional parameter: Continuation token used to retrieve subsequent
     *         media.
     * @return    Returns the List of Media wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<List<Media>>> listMediaAsync(
            final String accountId,
            final String continuationToken) {
        return makeHttpCallAsync(() -> buildListMediaRequest(accountId, continuationToken),
            req -> authManagers.get("messaging").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleListMediaResponse(context));
    }

    /**
     * Builds the HttpRequest object for listMedia.
     */
    private HttpRequest buildListMediaRequest(
            final String accountId,
            final String continuationToken) {
        //the base uri for api requests
        String baseUri = config.getBaseUri(Server.MESSAGINGDEFAULT);

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/users/{accountId}/media");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("accountId",
                new SimpleEntry<Object, Boolean>(accountId, false));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Continuation-Token", continuationToken);
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for listMedia.
     * @return An object of type List of Media
     */
    private ApiResponse<List<Media>> handleListMediaResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 400) {
            throw new MessagingException("400 Request is malformed or invalid", context);
        }
        if (responseCode == 401) {
            throw new MessagingException(
                    "401 The specified user does not have access to the account", context);
        }
        if (responseCode == 403) {
            throw new MessagingException("403 The user does not have access to this API", context);
        }
        if (responseCode == 404) {
            throw new MessagingException("404 Path not found", context);
        }
        if (responseCode == 415) {
            throw new MessagingException("415 The content-type of the request is incorrect",
                    context);
        }
        if (responseCode == 429) {
            throw new MessagingException("429 The rate limit has been reached", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        List<Media> result = ApiHelper.deserializeArray(responseBody,
                Media[].class);
        return new ApiResponse<List<Media>>(response.getStatusCode(), response.getHeaders(), result);
    }

    /**
     * Downloads a media file you previously uploaded.
     * @param  accountId  Required parameter: User's account ID
     * @param  mediaId  Required parameter: Media ID to retrieve
     * @return    Returns the InputStream wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<InputStream> getMedia(
            final String accountId,
            final String mediaId) throws ApiException, IOException {
        HttpRequest request = buildGetMediaRequest(accountId, mediaId);
        authManagers.get("messaging").apply(request);

        HttpResponse response = getClientInstance().execute(request, true);
        HttpContext context = new HttpContext(request, response);

        return handleGetMediaResponse(context);
    }

    /**
     * Downloads a media file you previously uploaded.
     * @param  accountId  Required parameter: User's account ID
     * @param  mediaId  Required parameter: Media ID to retrieve
     * @return    Returns the InputStream wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<InputStream>> getMediaAsync(
            final String accountId,
            final String mediaId) {
        return makeHttpCallAsync(() -> buildGetMediaRequest(accountId, mediaId),
            req -> authManagers.get("messaging").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, true)),
            context -> handleGetMediaResponse(context));
    }

    /**
     * Builds the HttpRequest object for getMedia.
     */
    private HttpRequest buildGetMediaRequest(
            final String accountId,
            final String mediaId) {
        //the base uri for api requests
        String baseUri = config.getBaseUri(Server.MESSAGINGDEFAULT);

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/users/{accountId}/media/{mediaId}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("accountId",
                new SimpleEntry<Object, Boolean>(accountId, false));
        templateParameters.put("mediaId",
                new SimpleEntry<Object, Boolean>(mediaId, false));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for getMedia.
     * @return An object of type InputStream
     */
    private ApiResponse<InputStream> handleGetMediaResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 400) {
            throw new MessagingException("400 Request is malformed or invalid", context);
        }
        if (responseCode == 401) {
            throw new MessagingException(
                    "401 The specified user does not have access to the account", context);
        }
        if (responseCode == 403) {
            throw new MessagingException("403 The user does not have access to this API", context);
        }
        if (responseCode == 404) {
            throw new MessagingException("404 Path not found", context);
        }
        if (responseCode == 415) {
            throw new MessagingException("415 The content-type of the request is incorrect",
                    context);
        }
        if (responseCode == 429) {
            throw new MessagingException("429 The rate limit has been reached", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        InputStream result = response.getRawBody();
        return new ApiResponse<InputStream>(response.getStatusCode(), response.getHeaders(), result);
    }

    /**
     * Uploads a file the normal HTTP way. You may add headers to the request in order to provide
     * some control to your media-file.
     * @param  accountId  Required parameter: User's account ID
     * @param  mediaId  Required parameter: The user supplied custom media ID
     * @param  body  Required parameter: Example:
     * @param  contentType  Optional parameter: The media type of the entity-body
     * @param  cacheControl  Optional parameter: General-header field is used to specify directives
     *         that MUST be obeyed by all caching mechanisms along the request/response chain.
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Void> uploadMedia(
            final String accountId,
            final String mediaId,
            final FileWrapper body,
            final String contentType,
            final String cacheControl) throws ApiException, IOException {
        HttpRequest request = buildUploadMediaRequest(accountId, mediaId, body, contentType,
                cacheControl);
        authManagers.get("messaging").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleUploadMediaResponse(context);
    }

    /**
     * Uploads a file the normal HTTP way. You may add headers to the request in order to provide
     * some control to your media-file.
     * @param  accountId  Required parameter: User's account ID
     * @param  mediaId  Required parameter: The user supplied custom media ID
     * @param  body  Required parameter: Example:
     * @param  contentType  Optional parameter: The media type of the entity-body
     * @param  cacheControl  Optional parameter: General-header field is used to specify directives
     *         that MUST be obeyed by all caching mechanisms along the request/response chain.
     * @return    Returns the Void wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Void>> uploadMediaAsync(
            final String accountId,
            final String mediaId,
            final FileWrapper body,
            final String contentType,
            final String cacheControl) {
        return makeHttpCallAsync(() -> buildUploadMediaRequest(accountId, mediaId, body,
                contentType, cacheControl),
            req -> authManagers.get("messaging").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleUploadMediaResponse(context));
    }

    /**
     * Builds the HttpRequest object for uploadMedia.
     */
    private HttpRequest buildUploadMediaRequest(
            final String accountId,
            final String mediaId,
            final FileWrapper body,
            final String contentType,
            final String cacheControl) {
        //the base uri for api requests
        String baseUri = config.getBaseUri(Server.MESSAGINGDEFAULT);

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/users/{accountId}/media/{mediaId}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("accountId",
                new SimpleEntry<Object, Boolean>(accountId, false));
        templateParameters.put("mediaId",
                new SimpleEntry<Object, Boolean>(mediaId, false));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type",
                (contentType != null) ? contentType : "application/octet-stream");
        headers.add("Cache-Control", cacheControl);
        headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().putBody(queryBuilder, headers, null, body);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for uploadMedia.
     * @return An object of type void
     */
    private ApiResponse<Void> handleUploadMediaResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 400) {
            throw new MessagingException("400 Request is malformed or invalid", context);
        }
        if (responseCode == 401) {
            throw new MessagingException(
                    "401 The specified user does not have access to the account", context);
        }
        if (responseCode == 403) {
            throw new MessagingException("403 The user does not have access to this API", context);
        }
        if (responseCode == 404) {
            throw new MessagingException("404 Path not found", context);
        }
        if (responseCode == 415) {
            throw new MessagingException("415 The content-type of the request is incorrect",
                    context);
        }
        if (responseCode == 429) {
            throw new MessagingException("429 The rate limit has been reached", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        return new ApiResponse<Void>(response.getStatusCode(), response.getHeaders(), null);
    }

    /**
     * Deletes a media file from Bandwidth API server. Make sure you don't have any application
     * scripts still using the media before you delete. If you accidentally delete a media file, you
     * can immediately upload a new file with the same name.
     * @param  accountId  Required parameter: User's account ID
     * @param  mediaId  Required parameter: The media ID to delete
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Void> deleteMedia(
            final String accountId,
            final String mediaId) throws ApiException, IOException {
        HttpRequest request = buildDeleteMediaRequest(accountId, mediaId);
        authManagers.get("messaging").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleDeleteMediaResponse(context);
    }

    /**
     * Deletes a media file from Bandwidth API server. Make sure you don't have any application
     * scripts still using the media before you delete. If you accidentally delete a media file, you
     * can immediately upload a new file with the same name.
     * @param  accountId  Required parameter: User's account ID
     * @param  mediaId  Required parameter: The media ID to delete
     * @return    Returns the Void wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Void>> deleteMediaAsync(
            final String accountId,
            final String mediaId) {
        return makeHttpCallAsync(() -> buildDeleteMediaRequest(accountId, mediaId),
            req -> authManagers.get("messaging").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleDeleteMediaResponse(context));
    }

    /**
     * Builds the HttpRequest object for deleteMedia.
     */
    private HttpRequest buildDeleteMediaRequest(
            final String accountId,
            final String mediaId) {
        //the base uri for api requests
        String baseUri = config.getBaseUri(Server.MESSAGINGDEFAULT);

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/users/{accountId}/media/{mediaId}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("accountId",
                new SimpleEntry<Object, Boolean>(accountId, false));
        templateParameters.put("mediaId",
                new SimpleEntry<Object, Boolean>(mediaId, false));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().delete(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for deleteMedia.
     * @return An object of type void
     */
    private ApiResponse<Void> handleDeleteMediaResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 400) {
            throw new MessagingException("400 Request is malformed or invalid", context);
        }
        if (responseCode == 401) {
            throw new MessagingException(
                    "401 The specified user does not have access to the account", context);
        }
        if (responseCode == 403) {
            throw new MessagingException("403 The user does not have access to this API", context);
        }
        if (responseCode == 404) {
            throw new MessagingException("404 Path not found", context);
        }
        if (responseCode == 415) {
            throw new MessagingException("415 The content-type of the request is incorrect",
                    context);
        }
        if (responseCode == 429) {
            throw new MessagingException("429 The rate limit has been reached", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        return new ApiResponse<Void>(response.getStatusCode(), response.getHeaders(), null);
    }

    /**
     * Gets a list of messages based on query parameters.
     * @param  accountId  Required parameter: User's account ID
     * @param  messageId  Optional parameter: The ID of the message to search for. Special
     *         characters need to be encoded using URL encoding
     * @param  sourceTn  Optional parameter: The phone number that sent the message
     * @param  destinationTn  Optional parameter: The phone number that received the message
     * @param  messageStatus  Optional parameter: The status of the message. One of RECEIVED,
     *         QUEUED, SENDING, SENT, FAILED, DELIVERED, ACCEPTED, UNDELIVERED
     * @param  errorCode  Optional parameter: The error code of the message
     * @param  fromDateTime  Optional parameter: The start of the date range to search in ISO 8601
     *         format. Uses the message receive time. The date range to search in is currently 14
     *         days.
     * @param  toDateTime  Optional parameter: The end of the date range to search in ISO 8601
     *         format. Uses the message receive time. The date range to search in is currently 14
     *         days.
     * @param  pageToken  Optional parameter: A base64 encoded value used for pagination of results
     * @param  limit  Optional parameter: The maximum records requested in search result. Default
     *         100. The sum of limit and after cannot be more than 10000
     * @return    Returns the BandwidthMessagesList wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<BandwidthMessagesList> getMessages(
            final String accountId,
            final String messageId,
            final String sourceTn,
            final String destinationTn,
            final String messageStatus,
            final Integer errorCode,
            final String fromDateTime,
            final String toDateTime,
            final String pageToken,
            final Integer limit) throws ApiException, IOException {
        HttpRequest request = buildGetMessagesRequest(accountId, messageId, sourceTn, destinationTn,
                messageStatus, errorCode, fromDateTime, toDateTime, pageToken, limit);
        authManagers.get("messaging").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetMessagesResponse(context);
    }

    /**
     * Gets a list of messages based on query parameters.
     * @param  accountId  Required parameter: User's account ID
     * @param  messageId  Optional parameter: The ID of the message to search for. Special
     *         characters need to be encoded using URL encoding
     * @param  sourceTn  Optional parameter: The phone number that sent the message
     * @param  destinationTn  Optional parameter: The phone number that received the message
     * @param  messageStatus  Optional parameter: The status of the message. One of RECEIVED,
     *         QUEUED, SENDING, SENT, FAILED, DELIVERED, ACCEPTED, UNDELIVERED
     * @param  errorCode  Optional parameter: The error code of the message
     * @param  fromDateTime  Optional parameter: The start of the date range to search in ISO 8601
     *         format. Uses the message receive time. The date range to search in is currently 14
     *         days.
     * @param  toDateTime  Optional parameter: The end of the date range to search in ISO 8601
     *         format. Uses the message receive time. The date range to search in is currently 14
     *         days.
     * @param  pageToken  Optional parameter: A base64 encoded value used for pagination of results
     * @param  limit  Optional parameter: The maximum records requested in search result. Default
     *         100. The sum of limit and after cannot be more than 10000
     * @return    Returns the BandwidthMessagesList wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<BandwidthMessagesList>> getMessagesAsync(
            final String accountId,
            final String messageId,
            final String sourceTn,
            final String destinationTn,
            final String messageStatus,
            final Integer errorCode,
            final String fromDateTime,
            final String toDateTime,
            final String pageToken,
            final Integer limit) {
        return makeHttpCallAsync(() -> buildGetMessagesRequest(accountId, messageId, sourceTn,
                destinationTn, messageStatus, errorCode, fromDateTime, toDateTime, pageToken,
                limit),
            req -> authManagers.get("messaging").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleGetMessagesResponse(context));
    }

    /**
     * Builds the HttpRequest object for getMessages.
     */
    private HttpRequest buildGetMessagesRequest(
            final String accountId,
            final String messageId,
            final String sourceTn,
            final String destinationTn,
            final String messageStatus,
            final Integer errorCode,
            final String fromDateTime,
            final String toDateTime,
            final String pageToken,
            final Integer limit) {
        //the base uri for api requests
        String baseUri = config.getBaseUri(Server.MESSAGINGDEFAULT);

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/users/{accountId}/messages");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("accountId",
                new SimpleEntry<Object, Boolean>(accountId, false));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("messageId", messageId);
        queryParameters.put("sourceTn", sourceTn);
        queryParameters.put("destinationTn", destinationTn);
        queryParameters.put("messageStatus", messageStatus);
        queryParameters.put("errorCode", errorCode);
        queryParameters.put("fromDateTime", fromDateTime);
        queryParameters.put("toDateTime", toDateTime);
        queryParameters.put("pageToken", pageToken);
        queryParameters.put("limit", limit);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, queryParameters,
                null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for getMessages.
     * @return An object of type BandwidthMessagesList
     */
    private ApiResponse<BandwidthMessagesList> handleGetMessagesResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 400) {
            throw new MessagingException("400 Request is malformed or invalid", context);
        }
        if (responseCode == 401) {
            throw new MessagingException(
                    "401 The specified user does not have access to the account", context);
        }
        if (responseCode == 403) {
            throw new MessagingException("403 The user does not have access to this API", context);
        }
        if (responseCode == 404) {
            throw new MessagingException("404 Path not found", context);
        }
        if (responseCode == 415) {
            throw new MessagingException("415 The content-type of the request is incorrect",
                    context);
        }
        if (responseCode == 429) {
            throw new MessagingException("429 The rate limit has been reached", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        BandwidthMessagesList result = ApiHelper.deserialize(responseBody,
                BandwidthMessagesList.class);

        return new ApiResponse<BandwidthMessagesList>(response.getStatusCode(), response.getHeaders(), result);
    }

    /**
     * Endpoint for sending text messages and picture messages using V2 messaging.
     * @param  accountId  Required parameter: User's account ID
     * @param  body  Required parameter: Example:
     * @return    Returns the BandwidthMessage wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<BandwidthMessage> createMessage(
            final String accountId,
            final MessageRequest body) throws ApiException, IOException {
        HttpRequest request = buildCreateMessageRequest(accountId, body);
        authManagers.get("messaging").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleCreateMessageResponse(context);
    }

    /**
     * Endpoint for sending text messages and picture messages using V2 messaging.
     * @param  accountId  Required parameter: User's account ID
     * @param  body  Required parameter: Example:
     * @return    Returns the BandwidthMessage wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<BandwidthMessage>> createMessageAsync(
            final String accountId,
            final MessageRequest body) {
        return makeHttpCallAsync(() -> buildCreateMessageRequest(accountId, body),
            req -> authManagers.get("messaging").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleCreateMessageResponse(context));
    }

    /**
     * Builds the HttpRequest object for createMessage.
     */
    private HttpRequest buildCreateMessageRequest(
            final String accountId,
            final MessageRequest body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri(Server.MESSAGINGDEFAULT);

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/users/{accountId}/messages");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("accountId",
                new SimpleEntry<Object, Boolean>(accountId, false));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");
        headers.add("content-type", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for createMessage.
     * @return An object of type BandwidthMessage
     */
    private ApiResponse<BandwidthMessage> handleCreateMessageResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 400) {
            throw new MessagingException("400 Request is malformed or invalid", context);
        }
        if (responseCode == 401) {
            throw new MessagingException(
                    "401 The specified user does not have access to the account", context);
        }
        if (responseCode == 403) {
            throw new MessagingException("403 The user does not have access to this API", context);
        }
        if (responseCode == 404) {
            throw new MessagingException("404 Path not found", context);
        }
        if (responseCode == 415) {
            throw new MessagingException("415 The content-type of the request is incorrect",
                    context);
        }
        if (responseCode == 429) {
            throw new MessagingException("429 The rate limit has been reached", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        BandwidthMessage result = ApiHelper.deserialize(responseBody,
                BandwidthMessage.class);

        return new ApiResponse<BandwidthMessage>(response.getStatusCode(), response.getHeaders(), result);
    }

}
