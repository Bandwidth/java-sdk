/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bandwidth.messaging.controllers;

import java.io.InputStream;
import java.io.IOException;
import java.util.AbstractMap.SimpleEntry;
import java.util.concurrent.CompletableFuture;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.bandwidth.ApiHelper;
import com.bandwidth.AuthManager;
import com.bandwidth.Configuration;
import com.bandwidth.controllers.BaseController;
import com.bandwidth.exceptions.ApiException;
import com.bandwidth.http.client.HttpClient;
import com.bandwidth.http.client.HttpContext;
import com.bandwidth.http.Headers;
import com.bandwidth.http.request.HttpRequest;
import com.bandwidth.http.response.ApiResponse;
import com.bandwidth.http.response.HttpResponse;
import com.bandwidth.http.response.HttpStringResponse;
import com.bandwidth.messaging.exceptions.MessagingException;
import com.bandwidth.messaging.models.BandwidthMessage;
import com.bandwidth.messaging.models.Media;
import com.bandwidth.messaging.models.MessageRequest;
import com.bandwidth.Server;
import com.bandwidth.utilities.FileWrapper;

/**
 * This class lists all the endpoints of the groups.
 */
public final class APIController extends BaseController {

    /**
     * Initializes the controller.
     * @param config
     * @param httpClient
     * @param authManagers
     */
    public APIController(Configuration config, HttpClient httpClient, Map<String, AuthManager> authManagers) {
        super(config, httpClient, authManagers);
    }


    /**
     * listMedia
     * @param    userId    Required parameter: Example: 
     * @param    continuationToken    Optional parameter: Example: 
     * @return    Returns the ApiResponse<List<Media>> response from the API call
     */
    public ApiResponse<List<Media>> listMedia(
            final String userId,
            final String continuationToken) throws ApiException, IOException {
        HttpRequest request = buildListMediaRequest(userId, continuationToken);
        authManagers.get("messaging").apply(request);

        HttpResponse response = getClientInstance().executeAsString(request);
        HttpContext context = new HttpContext(request, response);

        return handleListMediaResponse(context);
    }

    /**
     * listMedia
     * @param    userId    Required parameter: Example: 
     * @param    continuationToken    Optional parameter: Example: 
     * @return    Returns the ApiResponse<List<Media>> response from the API call 
     */
    public CompletableFuture<ApiResponse<List<Media>>> listMediaAsync(
            final String userId,
            final String continuationToken) {
        return makeHttpCallAsync(() -> buildListMediaRequest(userId, continuationToken),
                req -> authManagers.get("messaging").applyAsync(req)
                    .thenCompose(request -> getClientInstance().executeAsStringAsync(request)),
                context -> handleListMediaResponse(context));
    }

    /**
     * Builds the HttpRequest object for listMedia
     */
    private HttpRequest buildListMediaRequest(
            final String userId,
            final String continuationToken) {
        //the base uri for api requests
        String baseUri = config.getBaseUri(Server.MESSAGINGDEFAULT);

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri + "/users/{userId}/media");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("userId", new SimpleEntry<Object, Boolean>(userId, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Continuation-Token", continuationToken);
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        return request;
    }

    /**
     * Processes the response for listMedia
     * @return An object of type List<Media>
     */
    private ApiResponse<List<Media>> handleListMediaResponse(HttpContext context)
            throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 400) {
            throw new MessagingException("400 Request is malformed or invalid", context);
        }
        if (responseCode == 401) {
            throw new MessagingException("401 The specified user does not have access to the account", context);
        }
        if (responseCode == 403) {
            throw new MessagingException("403 The user does not have access to this API", context);
        }
        if (responseCode == 404) {
            throw new MessagingException("404 Path not found", context);
        }
        if (responseCode == 415) {
            throw new MessagingException("415 The content-type of the request is incorrect", context);
        }
        if (responseCode == 429) {
            throw new MessagingException("429 The rate limit has been reached", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse)response).getBody();
        List<Media> result = ApiHelper.deserializeArray(responseBody,
                Media[].class);
        return new ApiResponse<List<Media>>(response.getStatusCode(), response.getHeaders(), result);
    }

    /**
     * getMedia
     * @param    userId    Required parameter: Example: 
     * @param    mediaId    Required parameter: Example: 
     * @return    Returns the ApiResponse<InputStream> response from the API call
     */
    public ApiResponse<InputStream> getMedia(
            final String userId,
            final String mediaId) throws ApiException, IOException {
        HttpRequest request = buildGetMediaRequest(userId, mediaId);
        authManagers.get("messaging").apply(request);

        HttpResponse response = getClientInstance().executeAsBinary(request);
        HttpContext context = new HttpContext(request, response);

        return handleGetMediaResponse(context);
    }

    /**
     * getMedia
     * @param    userId    Required parameter: Example: 
     * @param    mediaId    Required parameter: Example: 
     * @return    Returns the ApiResponse<InputStream> response from the API call 
     */
    public CompletableFuture<ApiResponse<InputStream>> getMediaAsync(
            final String userId,
            final String mediaId) {
        return makeHttpCallAsync(() -> buildGetMediaRequest(userId, mediaId),
                req -> authManagers.get("messaging").applyAsync(req)
                    .thenCompose(request -> getClientInstance().executeAsStringAsync(request)),
                context -> handleGetMediaResponse(context));
    }

    /**
     * Builds the HttpRequest object for getMedia
     */
    private HttpRequest buildGetMediaRequest(
            final String userId,
            final String mediaId) {
        //the base uri for api requests
        String baseUri = config.getBaseUri(Server.MESSAGINGDEFAULT);

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri + "/users/{userId}/media/{mediaId}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("userId", new SimpleEntry<Object, Boolean>(userId, true));
        templateParameters.put("mediaId", new SimpleEntry<Object, Boolean>(mediaId, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        return request;
    }

    /**
     * Processes the response for getMedia
     * @return An object of type InputStream
     */
    private ApiResponse<InputStream> handleGetMediaResponse(HttpContext context)
            throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 400) {
            throw new MessagingException("400 Request is malformed or invalid", context);
        }
        if (responseCode == 401) {
            throw new MessagingException("401 The specified user does not have access to the account", context);
        }
        if (responseCode == 403) {
            throw new MessagingException("403 The user does not have access to this API", context);
        }
        if (responseCode == 404) {
            throw new MessagingException("404 Path not found", context);
        }
        if (responseCode == 415) {
            throw new MessagingException("415 The content-type of the request is incorrect", context);
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
     * uploadMedia
     * @param    userId    Required parameter: Example: 
     * @param    mediaId    Required parameter: Example: 
     * @param    contentLength    Required parameter: Example: 
     * @param    body    Required parameter: Example: 
     * @param    contentType    Optional parameter: Example: application/octet-stream
     * @param    cacheControl    Optional parameter: Example: 
     */
    public ApiResponse<Void> uploadMedia(
            final String userId,
            final String mediaId,
            final long contentLength,
            final FileWrapper body,
            final String contentType,
            final String cacheControl) throws ApiException, IOException {
        HttpRequest request = buildUploadMediaRequest(userId, mediaId, contentLength, body, contentType, cacheControl);
        authManagers.get("messaging").apply(request);

        HttpResponse response = getClientInstance().executeAsString(request);
        HttpContext context = new HttpContext(request, response);

        return handleUploadMediaResponse(context);
    }

    /**
     * uploadMedia
     * @param    userId    Required parameter: Example: 
     * @param    mediaId    Required parameter: Example: 
     * @param    contentLength    Required parameter: Example: 
     * @param    body    Required parameter: Example: 
     * @param    contentType    Optional parameter: Example: application/octet-stream
     * @param    cacheControl    Optional parameter: Example: 
     * @return    Returns the ApiResponse<Void> response from the API call 
     */
    public CompletableFuture<ApiResponse<Void>> uploadMediaAsync(
            final String userId,
            final String mediaId,
            final long contentLength,
            final FileWrapper body,
            final String contentType,
            final String cacheControl) {
        return makeHttpCallAsync(() -> buildUploadMediaRequest(userId, mediaId, contentLength, body, contentType, cacheControl),
                req -> authManagers.get("messaging").applyAsync(req)
                    .thenCompose(request -> getClientInstance().executeAsStringAsync(request)),
                context -> handleUploadMediaResponse(context));
    }

    /**
     * Builds the HttpRequest object for uploadMedia
     */
    private HttpRequest buildUploadMediaRequest(
            final String userId,
            final String mediaId,
            final long contentLength,
            final FileWrapper body,
            final String contentType,
            final String cacheControl) {
        //the base uri for api requests
        String baseUri = config.getBaseUri(Server.MESSAGINGDEFAULT);

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri + "/users/{userId}/media/{mediaId}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("userId", new SimpleEntry<Object, Boolean>(userId, true));
        templateParameters.put("mediaId", new SimpleEntry<Object, Boolean>(mediaId, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Length", String.valueOf(contentLength));
        headers.add("Content-Type", (contentType != null) ? contentType : "application/octet-stream");
        headers.add("Cache-Control", cacheControl);
        headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().putBody(queryBuilder, headers, null, body);

        return request;
    }

    /**
     * Processes the response for uploadMedia
     * @return An object of type void
     */
    private ApiResponse<Void> handleUploadMediaResponse(HttpContext context)
            throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 400) {
            throw new MessagingException("400 Request is malformed or invalid", context);
        }
        if (responseCode == 401) {
            throw new MessagingException("401 The specified user does not have access to the account", context);
        }
        if (responseCode == 403) {
            throw new MessagingException("403 The user does not have access to this API", context);
        }
        if (responseCode == 404) {
            throw new MessagingException("404 Path not found", context);
        }
        if (responseCode == 415) {
            throw new MessagingException("415 The content-type of the request is incorrect", context);
        }
        if (responseCode == 429) {
            throw new MessagingException("429 The rate limit has been reached", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        return new ApiResponse<Void>(response.getStatusCode(), response.getHeaders(), null);
    }

    /**
     * deleteMedia
     * @param    userId    Required parameter: Example: 
     * @param    mediaId    Required parameter: Example: 
     */
    public ApiResponse<Void> deleteMedia(
            final String userId,
            final String mediaId) throws ApiException, IOException {
        HttpRequest request = buildDeleteMediaRequest(userId, mediaId);
        authManagers.get("messaging").apply(request);

        HttpResponse response = getClientInstance().executeAsString(request);
        HttpContext context = new HttpContext(request, response);

        return handleDeleteMediaResponse(context);
    }

    /**
     * deleteMedia
     * @param    userId    Required parameter: Example: 
     * @param    mediaId    Required parameter: Example: 
     * @return    Returns the ApiResponse<Void> response from the API call 
     */
    public CompletableFuture<ApiResponse<Void>> deleteMediaAsync(
            final String userId,
            final String mediaId) {
        return makeHttpCallAsync(() -> buildDeleteMediaRequest(userId, mediaId),
                req -> authManagers.get("messaging").applyAsync(req)
                    .thenCompose(request -> getClientInstance().executeAsStringAsync(request)),
                context -> handleDeleteMediaResponse(context));
    }

    /**
     * Builds the HttpRequest object for deleteMedia
     */
    private HttpRequest buildDeleteMediaRequest(
            final String userId,
            final String mediaId) {
        //the base uri for api requests
        String baseUri = config.getBaseUri(Server.MESSAGINGDEFAULT);

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri + "/users/{userId}/media/{mediaId}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("userId", new SimpleEntry<Object, Boolean>(userId, true));
        templateParameters.put("mediaId", new SimpleEntry<Object, Boolean>(mediaId, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().delete(queryBuilder, headers, null, null);

        return request;
    }

    /**
     * Processes the response for deleteMedia
     * @return An object of type void
     */
    private ApiResponse<Void> handleDeleteMediaResponse(HttpContext context)
            throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 400) {
            throw new MessagingException("400 Request is malformed or invalid", context);
        }
        if (responseCode == 401) {
            throw new MessagingException("401 The specified user does not have access to the account", context);
        }
        if (responseCode == 403) {
            throw new MessagingException("403 The user does not have access to this API", context);
        }
        if (responseCode == 404) {
            throw new MessagingException("404 Path not found", context);
        }
        if (responseCode == 415) {
            throw new MessagingException("415 The content-type of the request is incorrect", context);
        }
        if (responseCode == 429) {
            throw new MessagingException("429 The rate limit has been reached", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        return new ApiResponse<Void>(response.getStatusCode(), response.getHeaders(), null);
    }

    /**
     * createMessage
     * @param    userId    Required parameter: Example: 
     * @param    body    Optional parameter: Example: 
     * @return    Returns the ApiResponse<BandwidthMessage> response from the API call
     */
    public ApiResponse<BandwidthMessage> createMessage(
            final String userId,
            final MessageRequest body) throws ApiException, IOException {
        HttpRequest request = buildCreateMessageRequest(userId, body);
        authManagers.get("messaging").apply(request);

        HttpResponse response = getClientInstance().executeAsString(request);
        HttpContext context = new HttpContext(request, response);

        return handleCreateMessageResponse(context);
    }

    /**
     * createMessage
     * @param    userId    Required parameter: Example: 
     * @param    body    Optional parameter: Example: 
     * @return    Returns the ApiResponse<BandwidthMessage> response from the API call 
     */
    public CompletableFuture<ApiResponse<BandwidthMessage>> createMessageAsync(
            final String userId,
            final MessageRequest body) {
        return makeHttpCallAsync(() -> buildCreateMessageRequest(userId, body),
                req -> authManagers.get("messaging").applyAsync(req)
                    .thenCompose(request -> getClientInstance().executeAsStringAsync(request)),
                context -> handleCreateMessageResponse(context));
    }

    /**
     * Builds the HttpRequest object for createMessage
     */
    private HttpRequest buildCreateMessageRequest(
            final String userId,
            final MessageRequest body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri(Server.MESSAGINGDEFAULT);

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri + "/users/{userId}/messages");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("userId", new SimpleEntry<Object, Boolean>(userId, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");
        headers.add("content-type", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        return request;
    }

    /**
     * Processes the response for createMessage
     * @return An object of type BandwidthMessage
     */
    private ApiResponse<BandwidthMessage> handleCreateMessageResponse(HttpContext context)
            throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 400) {
            throw new MessagingException("400 Request is malformed or invalid", context);
        }
        if (responseCode == 401) {
            throw new MessagingException("401 The specified user does not have access to the account", context);
        }
        if (responseCode == 403) {
            throw new MessagingException("403 The user does not have access to this API", context);
        }
        if (responseCode == 404) {
            throw new MessagingException("404 Path not found", context);
        }
        if (responseCode == 415) {
            throw new MessagingException("415 The content-type of the request is incorrect", context);
        }
        if (responseCode == 429) {
            throw new MessagingException("429 The rate limit has been reached", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse)response).getBody();
        BandwidthMessage result = ApiHelper.deserialize(responseBody,
                BandwidthMessage.class);

        return new ApiResponse<BandwidthMessage>(response.getStatusCode(), response.getHeaders(), result);
    }

}