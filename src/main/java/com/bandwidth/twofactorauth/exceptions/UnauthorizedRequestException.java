/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

package com.bandwidth.twofactorauth.exceptions;

import com.bandwidth.exceptions.ApiException;
import com.bandwidth.http.client.HttpContext;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for UnauthorizedRequestException type.
 */
public class UnauthorizedRequestException
        extends ApiException {
    private static final long serialVersionUID = -43402636942119755L;
    private String message;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The http context of the API exception
     */
    public UnauthorizedRequestException(String reason, HttpContext context) {
        super(reason, context);
    }


    /**
     * Getter for Message.
     * The message containing the reason behind the request being unauthorized
     * @return   Returns the String
     */
    @JsonGetter("message")
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for Message.
     * The message containing the reason behind the request being unauthorized
     * @param   value   Value for String
     */
    @JsonSetter("message")
    private void setMessage(String value) {
        this.message = value;
    }
}