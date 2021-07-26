/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.bandwidth.voice.models;

import com.bandwidth.internal.OptionalNullable;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * This is a model class for ModifyConferenceRequest type.
 */
public class ModifyConferenceRequest {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private StatusEnum status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private OptionalNullable<String> redirectUrl;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private OptionalNullable<String> redirectFallbackUrl;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private OptionalNullable<RedirectMethodEnum> redirectMethod;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private OptionalNullable<RedirectFallbackMethodEnum> redirectFallbackMethod;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private OptionalNullable<String> username;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private OptionalNullable<String> password;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private OptionalNullable<String> fallbackUsername;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private OptionalNullable<String> fallbackPassword;

    /**
     * Default constructor.
     */
    public ModifyConferenceRequest() {
    }

    /**
     * Initialization constructor.
     * @param  status  StatusEnum value for status.
     * @param  redirectUrl  String value for redirectUrl.
     * @param  redirectFallbackUrl  String value for redirectFallbackUrl.
     * @param  redirectMethod  RedirectMethodEnum value for redirectMethod.
     * @param  redirectFallbackMethod  RedirectFallbackMethodEnum value for redirectFallbackMethod.
     * @param  username  String value for username.
     * @param  password  String value for password.
     * @param  fallbackUsername  String value for fallbackUsername.
     * @param  fallbackPassword  String value for fallbackPassword.
     */
    public ModifyConferenceRequest(
            StatusEnum status,
            String redirectUrl,
            String redirectFallbackUrl,
            RedirectMethodEnum redirectMethod,
            RedirectFallbackMethodEnum redirectFallbackMethod,
            String username,
            String password,
            String fallbackUsername,
            String fallbackPassword) {
        this.status = status;
        this.redirectUrl = OptionalNullable.of(redirectUrl);
        this.redirectFallbackUrl = OptionalNullable.of(redirectFallbackUrl);
        this.redirectMethod = OptionalNullable.of(redirectMethod);
        this.redirectFallbackMethod = OptionalNullable.of(redirectFallbackMethod);
        this.username = OptionalNullable.of(username);
        this.password = OptionalNullable.of(password);
        this.fallbackUsername = OptionalNullable.of(fallbackUsername);
        this.fallbackPassword = OptionalNullable.of(fallbackPassword);
    }

    /**
     * Internal initialization constructor.
     */
    protected ModifyConferenceRequest(StatusEnum status, OptionalNullable<String> redirectUrl,
            OptionalNullable<String> redirectFallbackUrl,
            OptionalNullable<RedirectMethodEnum> redirectMethod,
            OptionalNullable<RedirectFallbackMethodEnum> redirectFallbackMethod,
            OptionalNullable<String> username, OptionalNullable<String> password,
            OptionalNullable<String> fallbackUsername,
            OptionalNullable<String> fallbackPassword) {
        this.status = status;
        this.redirectUrl = redirectUrl;
        this.redirectFallbackUrl = redirectFallbackUrl;
        this.redirectMethod = redirectMethod;
        this.redirectFallbackMethod = redirectFallbackMethod;
        this.username = username;
        this.password = password;
        this.fallbackUsername = fallbackUsername;
        this.fallbackPassword = fallbackPassword;
    }

    /**
     * Getter for Status.
     * @return Returns the StatusEnum
     */
    @JsonGetter("status")
    public StatusEnum getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for StatusEnum
     */
    @JsonSetter("status")
    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    /**
     * Internal Getter for RedirectUrl.
     * @return Returns the Internal String
     */
    @JsonGetter("redirectUrl")
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetRedirectUrl() {
        return this.redirectUrl;
    }

    /**
     * Getter for RedirectUrl.
     * @return Returns the String
     */
    public String getRedirectUrl() {
        return OptionalNullable.getFrom(redirectUrl);
    }

    /**
     * Setter for RedirectUrl.
     * @param redirectUrl Value for String
     */
    @JsonSetter("redirectUrl")
    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = OptionalNullable.of(redirectUrl);
    }

    /**
     * UnSetter for RedirectUrl.
     */
    public void unsetRedirectUrl() {
        redirectUrl = null;
    }

    /**
     * Internal Getter for RedirectFallbackUrl.
     * @return Returns the Internal String
     */
    @JsonGetter("redirectFallbackUrl")
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetRedirectFallbackUrl() {
        return this.redirectFallbackUrl;
    }

    /**
     * Getter for RedirectFallbackUrl.
     * @return Returns the String
     */
    public String getRedirectFallbackUrl() {
        return OptionalNullable.getFrom(redirectFallbackUrl);
    }

    /**
     * Setter for RedirectFallbackUrl.
     * @param redirectFallbackUrl Value for String
     */
    @JsonSetter("redirectFallbackUrl")
    public void setRedirectFallbackUrl(String redirectFallbackUrl) {
        this.redirectFallbackUrl = OptionalNullable.of(redirectFallbackUrl);
    }

    /**
     * UnSetter for RedirectFallbackUrl.
     */
    public void unsetRedirectFallbackUrl() {
        redirectFallbackUrl = null;
    }

    /**
     * Internal Getter for RedirectMethod.
     * @return Returns the Internal RedirectMethodEnum
     */
    @JsonGetter("redirectMethod")
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<RedirectMethodEnum> internalGetRedirectMethod() {
        return this.redirectMethod;
    }

    /**
     * Getter for RedirectMethod.
     * @return Returns the RedirectMethodEnum
     */
    public RedirectMethodEnum getRedirectMethod() {
        return OptionalNullable.getFrom(redirectMethod);
    }

    /**
     * Setter for RedirectMethod.
     * @param redirectMethod Value for RedirectMethodEnum
     */
    @JsonSetter("redirectMethod")
    public void setRedirectMethod(RedirectMethodEnum redirectMethod) {
        this.redirectMethod = OptionalNullable.of(redirectMethod);
    }

    /**
     * UnSetter for RedirectMethod.
     */
    public void unsetRedirectMethod() {
        redirectMethod = null;
    }

    /**
     * Internal Getter for RedirectFallbackMethod.
     * @return Returns the Internal RedirectFallbackMethodEnum
     */
    @JsonGetter("redirectFallbackMethod")
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<RedirectFallbackMethodEnum> internalGetRedirectFallbackMethod() {
        return this.redirectFallbackMethod;
    }

    /**
     * Getter for RedirectFallbackMethod.
     * @return Returns the RedirectFallbackMethodEnum
     */
    public RedirectFallbackMethodEnum getRedirectFallbackMethod() {
        return OptionalNullable.getFrom(redirectFallbackMethod);
    }

    /**
     * Setter for RedirectFallbackMethod.
     * @param redirectFallbackMethod Value for RedirectFallbackMethodEnum
     */
    @JsonSetter("redirectFallbackMethod")
    public void setRedirectFallbackMethod(RedirectFallbackMethodEnum redirectFallbackMethod) {
        this.redirectFallbackMethod = OptionalNullable.of(redirectFallbackMethod);
    }

    /**
     * UnSetter for RedirectFallbackMethod.
     */
    public void unsetRedirectFallbackMethod() {
        redirectFallbackMethod = null;
    }

    /**
     * Internal Getter for Username.
     * @return Returns the Internal String
     */
    @JsonGetter("username")
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetUsername() {
        return this.username;
    }

    /**
     * Getter for Username.
     * @return Returns the String
     */
    public String getUsername() {
        return OptionalNullable.getFrom(username);
    }

    /**
     * Setter for Username.
     * @param username Value for String
     */
    @JsonSetter("username")
    public void setUsername(String username) {
        this.username = OptionalNullable.of(username);
    }

    /**
     * UnSetter for Username.
     */
    public void unsetUsername() {
        username = null;
    }

    /**
     * Internal Getter for Password.
     * @return Returns the Internal String
     */
    @JsonGetter("password")
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPassword() {
        return this.password;
    }

    /**
     * Getter for Password.
     * @return Returns the String
     */
    public String getPassword() {
        return OptionalNullable.getFrom(password);
    }

    /**
     * Setter for Password.
     * @param password Value for String
     */
    @JsonSetter("password")
    public void setPassword(String password) {
        this.password = OptionalNullable.of(password);
    }

    /**
     * UnSetter for Password.
     */
    public void unsetPassword() {
        password = null;
    }

    /**
     * Internal Getter for FallbackUsername.
     * @return Returns the Internal String
     */
    @JsonGetter("fallbackUsername")
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetFallbackUsername() {
        return this.fallbackUsername;
    }

    /**
     * Getter for FallbackUsername.
     * @return Returns the String
     */
    public String getFallbackUsername() {
        return OptionalNullable.getFrom(fallbackUsername);
    }

    /**
     * Setter for FallbackUsername.
     * @param fallbackUsername Value for String
     */
    @JsonSetter("fallbackUsername")
    public void setFallbackUsername(String fallbackUsername) {
        this.fallbackUsername = OptionalNullable.of(fallbackUsername);
    }

    /**
     * UnSetter for FallbackUsername.
     */
    public void unsetFallbackUsername() {
        fallbackUsername = null;
    }

    /**
     * Internal Getter for FallbackPassword.
     * @return Returns the Internal String
     */
    @JsonGetter("fallbackPassword")
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetFallbackPassword() {
        return this.fallbackPassword;
    }

    /**
     * Getter for FallbackPassword.
     * @return Returns the String
     */
    public String getFallbackPassword() {
        return OptionalNullable.getFrom(fallbackPassword);
    }

    /**
     * Setter for FallbackPassword.
     * @param fallbackPassword Value for String
     */
    @JsonSetter("fallbackPassword")
    public void setFallbackPassword(String fallbackPassword) {
        this.fallbackPassword = OptionalNullable.of(fallbackPassword);
    }

    /**
     * UnSetter for FallbackPassword.
     */
    public void unsetFallbackPassword() {
        fallbackPassword = null;
    }

    /**
     * Converts this ModifyConferenceRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ModifyConferenceRequest [" + "status=" + status + ", redirectUrl=" + redirectUrl
                + ", redirectFallbackUrl=" + redirectFallbackUrl + ", redirectMethod="
                + redirectMethod + ", redirectFallbackMethod=" + redirectFallbackMethod
                + ", username=" + username + ", password=" + password + ", fallbackUsername="
                + fallbackUsername + ", fallbackPassword=" + fallbackPassword + "]";
    }

    /**
     * Builds a new {@link ModifyConferenceRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ModifyConferenceRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .status(getStatus());
        builder.redirectUrl = internalGetRedirectUrl();
        builder.redirectFallbackUrl = internalGetRedirectFallbackUrl();
        builder.redirectMethod = internalGetRedirectMethod();
        builder.redirectFallbackMethod = internalGetRedirectFallbackMethod();
        builder.username = internalGetUsername();
        builder.password = internalGetPassword();
        builder.fallbackUsername = internalGetFallbackUsername();
        builder.fallbackPassword = internalGetFallbackPassword();
        return builder;
    }

    /**
     * Class to build instances of {@link ModifyConferenceRequest}.
     */
    public static class Builder {
        private StatusEnum status;
        private OptionalNullable<String> redirectUrl;
        private OptionalNullable<String> redirectFallbackUrl;
        private OptionalNullable<RedirectMethodEnum> redirectMethod;
        private OptionalNullable<RedirectFallbackMethodEnum> redirectFallbackMethod;
        private OptionalNullable<String> username;
        private OptionalNullable<String> password;
        private OptionalNullable<String> fallbackUsername;
        private OptionalNullable<String> fallbackPassword;



        /**
         * Setter for status.
         * @param  status  StatusEnum value for status.
         * @return Builder
         */
        public Builder status(StatusEnum status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for redirectUrl.
         * @param  redirectUrl  String value for redirectUrl.
         * @return Builder
         */
        public Builder redirectUrl(String redirectUrl) {
            this.redirectUrl = OptionalNullable.of(redirectUrl);
            return this;
        }

        /**
         * UnSetter for redirectUrl.
         * @return Builder
         */
        public Builder unsetRedirectUrl() {
            redirectUrl = null;
            return this;
        }

        /**
         * Setter for redirectFallbackUrl.
         * @param  redirectFallbackUrl  String value for redirectFallbackUrl.
         * @return Builder
         */
        public Builder redirectFallbackUrl(String redirectFallbackUrl) {
            this.redirectFallbackUrl = OptionalNullable.of(redirectFallbackUrl);
            return this;
        }

        /**
         * UnSetter for redirectFallbackUrl.
         * @return Builder
         */
        public Builder unsetRedirectFallbackUrl() {
            redirectFallbackUrl = null;
            return this;
        }

        /**
         * Setter for redirectMethod.
         * @param  redirectMethod  RedirectMethodEnum value for redirectMethod.
         * @return Builder
         */
        public Builder redirectMethod(RedirectMethodEnum redirectMethod) {
            this.redirectMethod = OptionalNullable.of(redirectMethod);
            return this;
        }

        /**
         * UnSetter for redirectMethod.
         * @return Builder
         */
        public Builder unsetRedirectMethod() {
            redirectMethod = null;
            return this;
        }

        /**
         * Setter for redirectFallbackMethod.
         * @param  redirectFallbackMethod  RedirectFallbackMethodEnum value for
         *         redirectFallbackMethod.
         * @return Builder
         */
        public Builder redirectFallbackMethod(RedirectFallbackMethodEnum redirectFallbackMethod) {
            this.redirectFallbackMethod = OptionalNullable.of(redirectFallbackMethod);
            return this;
        }

        /**
         * UnSetter for redirectFallbackMethod.
         * @return Builder
         */
        public Builder unsetRedirectFallbackMethod() {
            redirectFallbackMethod = null;
            return this;
        }

        /**
         * Setter for username.
         * @param  username  String value for username.
         * @return Builder
         */
        public Builder username(String username) {
            this.username = OptionalNullable.of(username);
            return this;
        }

        /**
         * UnSetter for username.
         * @return Builder
         */
        public Builder unsetUsername() {
            username = null;
            return this;
        }

        /**
         * Setter for password.
         * @param  password  String value for password.
         * @return Builder
         */
        public Builder password(String password) {
            this.password = OptionalNullable.of(password);
            return this;
        }

        /**
         * UnSetter for password.
         * @return Builder
         */
        public Builder unsetPassword() {
            password = null;
            return this;
        }

        /**
         * Setter for fallbackUsername.
         * @param  fallbackUsername  String value for fallbackUsername.
         * @return Builder
         */
        public Builder fallbackUsername(String fallbackUsername) {
            this.fallbackUsername = OptionalNullable.of(fallbackUsername);
            return this;
        }

        /**
         * UnSetter for fallbackUsername.
         * @return Builder
         */
        public Builder unsetFallbackUsername() {
            fallbackUsername = null;
            return this;
        }

        /**
         * Setter for fallbackPassword.
         * @param  fallbackPassword  String value for fallbackPassword.
         * @return Builder
         */
        public Builder fallbackPassword(String fallbackPassword) {
            this.fallbackPassword = OptionalNullable.of(fallbackPassword);
            return this;
        }

        /**
         * UnSetter for fallbackPassword.
         * @return Builder
         */
        public Builder unsetFallbackPassword() {
            fallbackPassword = null;
            return this;
        }

        /**
         * Builds a new {@link ModifyConferenceRequest} object using the set fields.
         * @return {@link ModifyConferenceRequest}
         */
        public ModifyConferenceRequest build() {
            return new ModifyConferenceRequest(status, redirectUrl, redirectFallbackUrl,
                    redirectMethod, redirectFallbackMethod, username, password, fallbackUsername,
                    fallbackPassword);
        }
    }
}
