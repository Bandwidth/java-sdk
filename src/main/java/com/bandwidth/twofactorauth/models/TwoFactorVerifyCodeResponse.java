/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bandwidth.twofactorauth.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;


/**
 * This is a model class for TwoFactorVerifyCodeResponse type.
 */
public class TwoFactorVerifyCodeResponse {
    /**
     * Default constructor
     */
    public TwoFactorVerifyCodeResponse() {
    }

    /**
     * Initialization constructor.
     * @param valid
     */
    public TwoFactorVerifyCodeResponse(
            Boolean valid) {
        this.valid = valid;
    }

    private Boolean valid;
    /**
     * Getter for Valid.
     */
    @JsonGetter("valid")
    public Boolean getValid() {
        return this.valid;
    }
    /**
     * Setter for Valid.
     */
    @JsonSetter("valid")
    public void setValid(Boolean value) {
        this.valid = value;
    }

 

    /**
     * Builds a new {@link TwoFactorVerifyCodeResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TwoFactorVerifyCodeResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
            .valid(getValid());
        return builder;
    }

    /**
     * Class to build instances of {@link TwoFactorVerifyCodeResponse}
     */
    public static class Builder {
        private Boolean valid;



        /**
         * Setter for valid
         * @param valid
         * @return Builder
         */
        public Builder valid(Boolean valid) {
            this.valid = valid;
            return this;
        }

        /**
         * Builds a new {@link TwoFactorVerifyCodeResponse} object using the set fields.
         * @return {@link TwoFactorVerifyCodeResponse}
         */
        public TwoFactorVerifyCodeResponse build() {
            return new TwoFactorVerifyCodeResponse(valid);
        }
    }
}
