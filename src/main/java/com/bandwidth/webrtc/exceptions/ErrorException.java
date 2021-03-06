/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

package com.bandwidth.webrtc.exceptions;

import com.bandwidth.exceptions.ApiException;
import com.bandwidth.http.client.HttpContext;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ErrorException type.
 */
public class ErrorException
        extends ApiException {
    private static final long serialVersionUID = 6300991168895097478L;
    private int code;
    private String message;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The http context of the API exception
     */
    public ErrorException(String reason, HttpContext context) {
        super(reason, context);
    }


    /**
     * Getter for Code.
     * @return Returns the int
     */
    @JsonGetter("code")
    public int getCode() {
        return this.code;
    }

    /**
     * Setter for Code.
     * @param code Value for int
     */
    @JsonSetter("code")
    private void setCode(int code) {
        this.code = code;
    }

    /**
     * Getter for Message.
     * @return Returns the String
     */
    @JsonGetter("message")
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for Message.
     * @param message Value for String
     */
    @JsonSetter("message")
    private void setMessage(String message) {
        this.message = message;
    }
}
