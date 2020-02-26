/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bandwidth.voice.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;


/**
 * This is a model class for ApiModifyCallRequest type.
 */
public class ApiModifyCallRequest {
    /**
     * Default constructor
     */
    public ApiModifyCallRequest() {
    }

    /**
     * Initialization constructor.
     * @param redirectUrl
     * @param state
     * @param redirectMethod
     * @param username
     * @param password
     * @param tag
     */
    public ApiModifyCallRequest(
            String redirectUrl,
            State1Enum state,
            RedirectMethodEnum redirectMethod,
            String username,
            String password,
            String tag) {
        this.state = state;
        this.redirectUrl = redirectUrl;
        this.redirectMethod = redirectMethod;
        this.username = username;
        this.password = password;
        this.tag = tag;
    }

    private State1Enum state;
    private String redirectUrl;
    private RedirectMethodEnum redirectMethod;
    private String username;
    private String password;
    private String tag;
    /**
     * Getter for State.
     */
    @JsonGetter("state")
    public State1Enum getState() {
        return this.state;
    }
    /**
     * Setter for State.
     */
    @JsonSetter("state")
    public void setState(State1Enum value) {
        this.state = value;
    }

    /**
     * Getter for RedirectUrl.
     */
    @JsonGetter("redirectUrl")
    public String getRedirectUrl() {
        return this.redirectUrl;
    }
    /**
     * Setter for RedirectUrl.
     */
    @JsonSetter("redirectUrl")
    public void setRedirectUrl(String value) {
        this.redirectUrl = value;
    }

    /**
     * Getter for RedirectMethod.
     */
    @JsonGetter("redirectMethod")
    public RedirectMethodEnum getRedirectMethod() {
        return this.redirectMethod;
    }
    /**
     * Setter for RedirectMethod.
     */
    @JsonSetter("redirectMethod")
    public void setRedirectMethod(RedirectMethodEnum value) {
        this.redirectMethod = value;
    }

    /**
     * Getter for Username.
     */
    @JsonGetter("username")
    public String getUsername() {
        return this.username;
    }
    /**
     * Setter for Username.
     */
    @JsonSetter("username")
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Getter for Password.
     */
    @JsonGetter("password")
    public String getPassword() {
        return this.password;
    }
    /**
     * Setter for Password.
     */
    @JsonSetter("password")
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Getter for Tag.
     */
    @JsonGetter("tag")
    public String getTag() {
        return this.tag;
    }
    /**
     * Setter for Tag.
     */
    @JsonSetter("tag")
    public void setTag(String value) {
        this.tag = value;
    }

 

    /**
     * Builds a new {@link ApiModifyCallRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ApiModifyCallRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(redirectUrl)
            .state(getState())
            .redirectMethod(getRedirectMethod())
            .username(getUsername())
            .password(getPassword())
            .tag(getTag());
            return builder;
    }

    /**
     * Class to build instances of {@link ApiModifyCallRequest}
     */
    public static class Builder {
        private String redirectUrl;
        private State1Enum state;
        private RedirectMethodEnum redirectMethod;
        private String username;
        private String password;
        private String tag;

        /**
         * Initialization constructor
         */
        public Builder() {
            
        }

        /**
         * Initialization constructor
         */
        public Builder(String redirectUrl) {
            this.redirectUrl = redirectUrl;
        }

        /**
         * Setter for redirectUrl
         * @param redirectUrl
         * @return Builder
         */
        public Builder redirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }
        /**
         * Setter for state
         * @param state
         * @return Builder
         */
        public Builder state(State1Enum state) {
            this.state = state;
            return this;
        }
        /**
         * Setter for redirectMethod
         * @param redirectMethod
         * @return Builder
         */
        public Builder redirectMethod(RedirectMethodEnum redirectMethod) {
            this.redirectMethod = redirectMethod;
            return this;
        }
        /**
         * Setter for username
         * @param username
         * @return Builder
         */
        public Builder username(String username) {
            this.username = username;
            return this;
        }
        /**
         * Setter for password
         * @param password
         * @return Builder
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }
        /**
         * Setter for tag
         * @param tag
         * @return Builder
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        /**
         * Builds a new {@link ApiModifyCallRequest} object using the set fields.
         * @return {@link ApiModifyCallRequest}
         */
        public ApiModifyCallRequest build() {
            return new ApiModifyCallRequest(redirectUrl,
                state,
                redirectMethod,
                username,
                password,
                tag);
        }
    }
}
