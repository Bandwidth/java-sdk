/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bandwidth.controllers;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

import com.bandwidth.AuthManager;
import com.bandwidth.Configuration;
import com.bandwidth.exceptions.ApiException;
import com.bandwidth.http.client.HttpClient;
import com.bandwidth.http.client.HttpContext;
import com.bandwidth.http.request.HttpRequest;
import com.bandwidth.http.response.HttpResponse;
import com.bandwidth.http.response.ApiResponse;

/**
 * Base class for all Controllers.
 */
public abstract class BaseController {

    /**
     * Protected variables to hold an instance of Configuration
     */
    protected final Configuration config;
    protected static final String userAgent = "java-sdk-refs/tags/java2.0.0";


    protected Map<String, AuthManager> authManagers;

    private HttpClient httpClient;
    
    protected BaseController(Configuration config,
            HttpClient httpClient, Map<String, AuthManager> authManagers) {
        this.config = config;
        this.httpClient = httpClient;
        this.authManagers = authManagers;
    }
    
    
    /**
     * Shared instance of the Http client
     * @return The shared instance of the http client 
     */
    public HttpClient getClientInstance() {
        return httpClient;
    }

    /**
     * Validates the response against HTTP errors defined at the API level
     * @param   response    The response recieved
     * @param   context     Context of the request and the recieved response 
     */
    protected void validateResponse(HttpResponse response, HttpContext context) 
            throws ApiException {
        //get response status code to validate
        int responseCode = response.getStatusCode();
        if ((responseCode < 200) || (responseCode > 208)) //[200,208] = HTTP OK
            throw new ApiException("HTTP Response Not OK", context);
    }

    /**
     * RequestSupplier
     */
    protected interface RequestSupplier {
        
        /**
         * Supplies the HttpRequest object
         * @return    An object of type HttpRequest
        */
        HttpRequest supply() throws ApiException, IOException;
    }

    /**
     * RequestExecutor
     */
    protected interface RequestExecutor {

        /**
         * Execute a given HttpRequest to get the response back
         * @param   request    The given HttpRequest to execute
         * @return  CompletableFuture<HttpResponse> after execution
         */
        CompletableFuture<HttpResponse> execute(HttpRequest request);
    }

    /**
     * ResponseHandler
     */
    protected interface ResponseHandler<T> {
        
        /**
         * Handles the response for an endpoint
         * @param   context    HttpContext of the request and the received response
         * @return   An object of type ApiResponse<T>
         */
        ApiResponse<T> handle(HttpContext context) throws ApiException, IOException;
    }
    
    /**
     * Make an asynchronous HTTP endpoint call
     * @param   requestSupplier    An object of RequestSupplier to supply an instance of HttpRequest
     * @param   requestExecutor    An object of RequestExecutor to execute the request & get the response
     * @param   responseHandler    An object of ResponseHandler to handle the endpoint response
     * @return  An object of type CompletableFuture<T>
     */
    public <T> CompletableFuture<ApiResponse<T>> makeHttpCallAsync(RequestSupplier requestSupplier,
            RequestExecutor requestExecutor, ResponseHandler<T> responseHandler) {
        final HttpRequest request;
        try {
            request = requestSupplier.supply();
        } catch (Exception e) {
            CompletableFuture<ApiResponse<T>> futureResponse = new CompletableFuture<>();
            futureResponse.completeExceptionally(e);
            return futureResponse;
        }

        // Invoke request and get response
        return requestExecutor.execute(request).thenApplyAsync(response -> {
            HttpContext context = new HttpContext(request, response);
            try {
                return responseHandler.handle(context);
            } catch (Exception e) {
                throw new CompletionException(e);
            }
        });
    }
}
