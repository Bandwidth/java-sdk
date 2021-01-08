/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

package com.bandwidth.http.response;

import com.bandwidth.http.Headers;

public class ApiResponse<T> {

    /**
     * Private store for properties.
     */
    int statusCode;
    Headers headers;
    T result;
    
    /**
     * HTTP Status code of the api response.
     * @return Int status code
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * Headers of the http response.
     * @return Headers
     */
    public Headers getHeaders() {
        return headers;
    }

    /**
     * The deserialized result of the api response.
     * @return result of type T
     */
    public T getResult() {
        return result;
    }

    /**
     * Initialization constructor.
     * @param statusCode The HTTP Status code of the api response
     * @param headers    The Headers of the http response
     * @param result     The wrapped response of type T
     */
    public ApiResponse(int statusCode, Headers headers, T result) {
        this.statusCode = statusCode;
        this.headers = headers;
        this.result = result;
    }

}
