/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bandwidth.messaging.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.bandwidth.*;
import com.bandwidth.controllers.*;
import com.bandwidth.exceptions.*;
import com.bandwidth.http.client.HttpClient;
import com.bandwidth.http.client.HttpContext;
import com.bandwidth.http.Headers;
import com.bandwidth.http.request.HttpRequest;
import com.bandwidth.http.response.ApiResponse;
import com.bandwidth.http.response.HttpResponse;
import com.bandwidth.http.response.HttpStringResponse;
import com.bandwidth.messaging.exceptions.*;
import com.bandwidth.messaging.models.*;

public final class APIController extends BaseController {
    public APIController(Configuration config, HttpClient httpClient, Map<String, AuthManager> authManagers) {
        super(config, httpClient, authManagers);
    }


    /**
     * getMessage
     * @return    Returns the ApiResponse<Void> response from the API call
     */
    public ApiResponse<Void> getMessage() throws ApiException, IOException {
        HttpRequest _request = _buildGetMessageRequest();
        authManagers.get("messaging").apply(_request);

        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleGetMessageResponse(_context);
    }

    /**
     * getMessage
     * @return    Returns the ApiResponse<Void> response from the API call 
     */
    public CompletableFuture<ApiResponse<Void>> getMessageAsync() {
        return makeHttpCallAsync(() -> _buildGetMessageRequest(),
                _req -> authManagers.get("messaging").applyAsync(_req)
                    .thenCompose(_request -> getClientInstance().executeAsStringAsync(_request)),
                _context -> _handleGetMessageResponse(_context));
    }

    /**
     * Builds the HttpRequest object for getMessage
     */
    private HttpRequest _buildGetMessageRequest() {
        //the base uri for api requests
        String _baseUri = config.getBaseUri(Server.MESSAGINGDEFAULT);

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/ping");
        //validate and preprocess url
        String _queryUrl = ApiHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Headers _headers = new Headers();
        _headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        return _request;
    }

    /**
     * Processes the response for getMessage
     * @return An object of type void
     */
    private ApiResponse<Void> _handleGetMessageResponse(HttpContext _context)
            throws ApiException, IOException {
        HttpResponse _response = _context.getResponse();

        //Error handling using HTTP status codes
        int _responseCode = _response.getStatusCode();

        if (_responseCode == 400) {
            throw new GenericClientException("400 Request is malformed or invalid", _context);
        }
        if (_responseCode == 401) {
            throw new PathClientException("401 The specified user does not have access to the account", _context);
        }
        if (_responseCode == 403) {
            throw new PathClientException("403 The user does not have access to this API", _context);
        }
        if (_responseCode == 404) {
            throw new PathClientException("404 Path not found", _context);
        }
        if (_responseCode == 415) {
            throw new GenericClientException("415 The content-type of the request is incorrect", _context);
        }
        if (_responseCode == 429) {
            throw new GenericClientException("429 The rate limit has been reached", _context);
        }
        //handle errors defined at the API level
        validateResponse(_response, _context);

        return new ApiResponse<Void>(_response.getStatusCode(), _response.getHeaders(), null);
    }

    /**
     * listMedia
     * @param    userId    Required parameter: Example: 
     * @param    continuationToken    Optional parameter: Example: 
     * @return    Returns the ApiResponse<List<Media>> response from the API call
     */
    public ApiResponse<List<Media>> listMedia(
            final String userId,
            final String continuationToken
    ) throws ApiException, IOException {
        HttpRequest _request = _buildListMediaRequest(userId, continuationToken);
        authManagers.get("messaging").apply(_request);

        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleListMediaResponse(_context);
    }

    /**
     * listMedia
     * @param    userId    Required parameter: Example: 
     * @param    continuationToken    Optional parameter: Example: 
     * @return    Returns the ApiResponse<List<Media>> response from the API call 
     */
    public CompletableFuture<ApiResponse<List<Media>>> listMediaAsync(
            final String userId,
            final String continuationToken
    ) {
        return makeHttpCallAsync(() -> _buildListMediaRequest(userId, continuationToken),
                _req -> authManagers.get("messaging").applyAsync(_req)
                    .thenCompose(_request -> getClientInstance().executeAsStringAsync(_request)),
                _context -> _handleListMediaResponse(_context));
    }

    /**
     * Builds the HttpRequest object for listMedia
     */
    private HttpRequest _buildListMediaRequest(
            final String userId,
            final String continuationToken
    ) {
        //the base uri for api requests
        String _baseUri = config.getBaseUri(Server.MESSAGINGDEFAULT);

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/users/{userId}/media");

        //process template parameters
        Map<String, Object> _templateParameters = new HashMap<String, Object>();
        _templateParameters.put("userId", userId);
        ApiHelper.appendUrlWithTemplateParameters(_queryBuilder, _templateParameters, true);
        //validate and preprocess url
        String _queryUrl = ApiHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Headers _headers = new Headers();
        _headers.add("Continuation-Token", continuationToken);
        _headers.add("user-agent", BaseController.userAgent);
        _headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        return _request;
    }

    /**
     * Processes the response for listMedia
     * @return An object of type List<Media>
     */
    private ApiResponse<List<Media>> _handleListMediaResponse(HttpContext _context)
            throws ApiException, IOException {
        HttpResponse _response = _context.getResponse();

        //Error handling using HTTP status codes
        int _responseCode = _response.getStatusCode();

        if (_responseCode == 400) {
            throw new GenericClientException("400 Request is malformed or invalid", _context);
        }
        if (_responseCode == 401) {
            throw new PathClientException("401 The specified user does not have access to the account", _context);
        }
        if (_responseCode == 403) {
            throw new PathClientException("403 The user does not have access to this API", _context);
        }
        if (_responseCode == 404) {
            throw new PathClientException("404 Path not found", _context);
        }
        if (_responseCode == 415) {
            throw new GenericClientException("415 The content-type of the request is incorrect", _context);
        }
        if (_responseCode == 429) {
            throw new GenericClientException("429 The rate limit has been reached", _context);
        }
        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        List<Media> _result = ApiHelper.deserializeArray(_responseBody,
                Media[].class);
        return new ApiResponse<List<Media>>(_response.getStatusCode(), _response.getHeaders(), _result);
    }

    /**
     * getMedia
     * @param    userId    Required parameter: Example: 
     * @param    mediaId    Required parameter: Example: 
     * @return    Returns the ApiResponse<InputStream> response from the API call
     */
    public ApiResponse<InputStream> getMedia(
            final String userId,
            final String mediaId
    ) throws ApiException, IOException {
        HttpRequest _request = _buildGetMediaRequest(userId, mediaId);
        authManagers.get("messaging").apply(_request);

        HttpResponse _response = getClientInstance().executeAsBinary(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleGetMediaResponse(_context);
    }

    /**
     * getMedia
     * @param    userId    Required parameter: Example: 
     * @param    mediaId    Required parameter: Example: 
     * @return    Returns the ApiResponse<InputStream> response from the API call 
     */
    public CompletableFuture<ApiResponse<InputStream>> getMediaAsync(
            final String userId,
            final String mediaId
    ) {
        return makeHttpCallAsync(() -> _buildGetMediaRequest(userId, mediaId),
                _req -> authManagers.get("messaging").applyAsync(_req)
                    .thenCompose(_request -> getClientInstance().executeAsStringAsync(_request)),
                _context -> _handleGetMediaResponse(_context));
    }

    /**
     * Builds the HttpRequest object for getMedia
     */
    private HttpRequest _buildGetMediaRequest(
            final String userId,
            final String mediaId
    ) {
        //the base uri for api requests
        String _baseUri = config.getBaseUri(Server.MESSAGINGDEFAULT);

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/users/{userId}/media/{mediaId}");

        //process template parameters
        Map<String, Object> _templateParameters = new HashMap<String, Object>();
        _templateParameters.put("userId", userId);
        _templateParameters.put("mediaId", mediaId);
        ApiHelper.appendUrlWithTemplateParameters(_queryBuilder, _templateParameters, true);
        //validate and preprocess url
        String _queryUrl = ApiHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Headers _headers = new Headers();
        _headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        return _request;
    }

    /**
     * Processes the response for getMedia
     * @return An object of type InputStream
     */
    private ApiResponse<InputStream> _handleGetMediaResponse(HttpContext _context)
            throws ApiException, IOException {
        HttpResponse _response = _context.getResponse();

        //Error handling using HTTP status codes
        int _responseCode = _response.getStatusCode();

        if (_responseCode == 400) {
            throw new GenericClientException("400 Request is malformed or invalid", _context);
        }
        if (_responseCode == 401) {
            throw new PathClientException("401 The specified user does not have access to the account", _context);
        }
        if (_responseCode == 403) {
            throw new PathClientException("403 The user does not have access to this API", _context);
        }
        if (_responseCode == 404) {
            throw new PathClientException("404 Path not found", _context);
        }
        if (_responseCode == 415) {
            throw new GenericClientException("415 The content-type of the request is incorrect", _context);
        }
        if (_responseCode == 429) {
            throw new GenericClientException("429 The rate limit has been reached", _context);
        }
        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        InputStream _result = _response.getRawBody();
        return new ApiResponse<InputStream>(_response.getStatusCode(), _response.getHeaders(), _result);
    }

    /**
     * uploadMedia
     * @param    userId    Required parameter: Example: 
     * @param    mediaId    Required parameter: Example: 
     * @param    contentLength    Required parameter: Example: 
     * @param    body    Required parameter: Example: 
     * @param    contentType    Optional parameter: Example: 
     * @param    cacheControl    Optional parameter: Example: 
     * @return    Returns the ApiResponse<Void> response from the API call
     */
    public ApiResponse<Void> uploadMedia(
            final String userId,
            final String mediaId,
            final long contentLength,
            final String body,
            final String contentType,
            final String cacheControl
    ) throws ApiException, IOException {
        HttpRequest _request = _buildUploadMediaRequest(userId, mediaId, contentLength, body, contentType, cacheControl);
        authManagers.get("messaging").apply(_request);

        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleUploadMediaResponse(_context);
    }

    /**
     * uploadMedia
     * @param    userId    Required parameter: Example: 
     * @param    mediaId    Required parameter: Example: 
     * @param    contentLength    Required parameter: Example: 
     * @param    body    Required parameter: Example: 
     * @param    contentType    Optional parameter: Example: 
     * @param    cacheControl    Optional parameter: Example: 
     * @return    Returns the ApiResponse<Void> response from the API call 
     */
    public CompletableFuture<ApiResponse<Void>> uploadMediaAsync(
            final String userId,
            final String mediaId,
            final long contentLength,
            final String body,
            final String contentType,
            final String cacheControl
    ) {
        return makeHttpCallAsync(() -> _buildUploadMediaRequest(userId, mediaId, contentLength, body, contentType, cacheControl),
                _req -> authManagers.get("messaging").applyAsync(_req)
                    .thenCompose(_request -> getClientInstance().executeAsStringAsync(_request)),
                _context -> _handleUploadMediaResponse(_context));
    }

    /**
     * Builds the HttpRequest object for uploadMedia
     */
    private HttpRequest _buildUploadMediaRequest(
            final String userId,
            final String mediaId,
            final long contentLength,
            final String body,
            final String contentType,
            final String cacheControl
    ) {
        //the base uri for api requests
        String _baseUri = config.getBaseUri(Server.MESSAGINGDEFAULT);

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/users/{userId}/media/{mediaId}");

        //process template parameters
        Map<String, Object> _templateParameters = new HashMap<String, Object>();
        _templateParameters.put("userId", userId);
        _templateParameters.put("mediaId", mediaId);
        ApiHelper.appendUrlWithTemplateParameters(_queryBuilder, _templateParameters, true);
        //validate and preprocess url
        String _queryUrl = ApiHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Headers _headers = new Headers();
        _headers.add("Content-Length", Long.toString(contentLength));
        _headers.add("Content-Type", contentType);
        _headers.add("Cache-Control", cacheControl);
        _headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        String _bodyJson = body;
        HttpRequest _request = getClientInstance().putBody(_queryUrl, _headers, _bodyJson);

        return _request;
    }

    /**
     * Processes the response for uploadMedia
     * @return An object of type void
     */
    private ApiResponse<Void> _handleUploadMediaResponse(HttpContext _context)
            throws ApiException, IOException {
        HttpResponse _response = _context.getResponse();

        //Error handling using HTTP status codes
        int _responseCode = _response.getStatusCode();

        if (_responseCode == 400) {
            throw new GenericClientException("400 Request is malformed or invalid", _context);
        }
        if (_responseCode == 401) {
            throw new PathClientException("401 The specified user does not have access to the account", _context);
        }
        if (_responseCode == 403) {
            throw new PathClientException("403 The user does not have access to this API", _context);
        }
        if (_responseCode == 404) {
            throw new PathClientException("404 Path not found", _context);
        }
        if (_responseCode == 415) {
            throw new GenericClientException("415 The content-type of the request is incorrect", _context);
        }
        if (_responseCode == 429) {
            throw new GenericClientException("429 The rate limit has been reached", _context);
        }
        //handle errors defined at the API level
        validateResponse(_response, _context);

        return new ApiResponse<Void>(_response.getStatusCode(), _response.getHeaders(), null);
    }

    /**
     * deleteMedia
     * @param    userId    Required parameter: Example: 
     * @param    mediaId    Required parameter: Example: 
     * @return    Returns the ApiResponse<Void> response from the API call
     */
    public ApiResponse<Void> deleteMedia(
            final String userId,
            final String mediaId
    ) throws ApiException, IOException {
        HttpRequest _request = _buildDeleteMediaRequest(userId, mediaId);
        authManagers.get("messaging").apply(_request);

        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleDeleteMediaResponse(_context);
    }

    /**
     * deleteMedia
     * @param    userId    Required parameter: Example: 
     * @param    mediaId    Required parameter: Example: 
     * @return    Returns the ApiResponse<Void> response from the API call 
     */
    public CompletableFuture<ApiResponse<Void>> deleteMediaAsync(
            final String userId,
            final String mediaId
    ) {
        return makeHttpCallAsync(() -> _buildDeleteMediaRequest(userId, mediaId),
                _req -> authManagers.get("messaging").applyAsync(_req)
                    .thenCompose(_request -> getClientInstance().executeAsStringAsync(_request)),
                _context -> _handleDeleteMediaResponse(_context));
    }

    /**
     * Builds the HttpRequest object for deleteMedia
     */
    private HttpRequest _buildDeleteMediaRequest(
            final String userId,
            final String mediaId
    ) {
        //the base uri for api requests
        String _baseUri = config.getBaseUri(Server.MESSAGINGDEFAULT);

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/users/{userId}/media/{mediaId}");

        //process template parameters
        Map<String, Object> _templateParameters = new HashMap<String, Object>();
        _templateParameters.put("userId", userId);
        _templateParameters.put("mediaId", mediaId);
        ApiHelper.appendUrlWithTemplateParameters(_queryBuilder, _templateParameters, true);
        //validate and preprocess url
        String _queryUrl = ApiHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Headers _headers = new Headers();
        _headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().delete(_queryUrl, _headers, null);

        return _request;
    }

    /**
     * Processes the response for deleteMedia
     * @return An object of type void
     */
    private ApiResponse<Void> _handleDeleteMediaResponse(HttpContext _context)
            throws ApiException, IOException {
        HttpResponse _response = _context.getResponse();

        //Error handling using HTTP status codes
        int _responseCode = _response.getStatusCode();

        if (_responseCode == 400) {
            throw new GenericClientException("400 Request is malformed or invalid", _context);
        }
        if (_responseCode == 401) {
            throw new PathClientException("401 The specified user does not have access to the account", _context);
        }
        if (_responseCode == 403) {
            throw new PathClientException("403 The user does not have access to this API", _context);
        }
        if (_responseCode == 404) {
            throw new PathClientException("404 Path not found", _context);
        }
        if (_responseCode == 415) {
            throw new GenericClientException("415 The content-type of the request is incorrect", _context);
        }
        if (_responseCode == 429) {
            throw new GenericClientException("429 The rate limit has been reached", _context);
        }
        //handle errors defined at the API level
        validateResponse(_response, _context);

        return new ApiResponse<Void>(_response.getStatusCode(), _response.getHeaders(), null);
    }

    /**
     * createMessage
     * @param    userId    Required parameter: Example: 
     * @param    body    Optional parameter: Example: 
     * @return    Returns the ApiResponse<BandwidthMessage> response from the API call
     */
    public ApiResponse<BandwidthMessage> createMessage(
            final String userId,
            final MessageRequest body
    ) throws ApiException, IOException {
        HttpRequest _request = _buildCreateMessageRequest(userId, body);
        authManagers.get("messaging").apply(_request);

        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleCreateMessageResponse(_context);
    }

    /**
     * createMessage
     * @param    userId    Required parameter: Example: 
     * @param    body    Optional parameter: Example: 
     * @return    Returns the ApiResponse<BandwidthMessage> response from the API call 
     */
    public CompletableFuture<ApiResponse<BandwidthMessage>> createMessageAsync(
            final String userId,
            final MessageRequest body
    ) {
        return makeHttpCallAsync(() -> _buildCreateMessageRequest(userId, body),
                _req -> authManagers.get("messaging").applyAsync(_req)
                    .thenCompose(_request -> getClientInstance().executeAsStringAsync(_request)),
                _context -> _handleCreateMessageResponse(_context));
    }

    /**
     * Builds the HttpRequest object for createMessage
     */
    private HttpRequest _buildCreateMessageRequest(
            final String userId,
            final MessageRequest body
    ) throws JsonProcessingException {
        //the base uri for api requests
        String _baseUri = config.getBaseUri(Server.MESSAGINGDEFAULT);

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/users/{userId}/messages");

        //process template parameters
        Map<String, Object> _templateParameters = new HashMap<String, Object>();
        _templateParameters.put("userId", userId);
        ApiHelper.appendUrlWithTemplateParameters(_queryBuilder, _templateParameters, true);
        //validate and preprocess url
        String _queryUrl = ApiHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Headers _headers = new Headers();
        _headers.add("user-agent", BaseController.userAgent);
        _headers.add("accept", "application/json");
        _headers.add("content-type", "application/json");

        //prepare and invoke the API call request to fetch the response
        String _bodyJson = ApiHelper.serialize(body);
        HttpRequest _request = getClientInstance().postBody(_queryUrl, _headers, _bodyJson);

        return _request;
    }

    /**
     * Processes the response for createMessage
     * @return An object of type BandwidthMessage
     */
    private ApiResponse<BandwidthMessage> _handleCreateMessageResponse(HttpContext _context)
            throws ApiException, IOException {
        HttpResponse _response = _context.getResponse();

        //Error handling using HTTP status codes
        int _responseCode = _response.getStatusCode();

        if (_responseCode == 400) {
            throw new GenericClientException("400 Request is malformed or invalid", _context);
        }
        if (_responseCode == 401) {
            throw new PathClientException("401 The specified user does not have access to the account", _context);
        }
        if (_responseCode == 403) {
            throw new PathClientException("403 The user does not have access to this API", _context);
        }
        if (_responseCode == 404) {
            throw new PathClientException("404 Path not found", _context);
        }
        if (_responseCode == 415) {
            throw new GenericClientException("415 The content-type of the request is incorrect", _context);
        }
        if (_responseCode == 429) {
            throw new GenericClientException("429 The rate limit has been reached", _context);
        }
        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        BandwidthMessage _result = ApiHelper.deserialize(_responseBody,
                BandwidthMessage.class);

        return new ApiResponse<BandwidthMessage>(_response.getStatusCode(), _response.getHeaders(), _result);
    }

}