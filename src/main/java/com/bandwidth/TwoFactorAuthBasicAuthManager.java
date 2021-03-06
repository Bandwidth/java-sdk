/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

package com.bandwidth;

import com.bandwidth.http.request.HttpRequest;
import java.util.Base64;
import java.util.concurrent.CompletableFuture;

/**
 * Utility class for authorization and token management.
 */
public class TwoFactorAuthBasicAuthManager implements AuthManager, TwoFactorAuthBasicAuthCredentials {

    private String basicAuthUserName;

    private String basicAuthPassword;

    /**
     * Constructor.
     * @param username String value for username.
     * @param password String value for password.
     */
    public TwoFactorAuthBasicAuthManager(String username, String password) {
        this.basicAuthUserName = username;
        this.basicAuthPassword = password;
    }

    /**
     * String value for basicAuthUserName.
     * @return basicAuthUserName
     */
    public String getBasicAuthUserName() {
        return basicAuthUserName;
    }

    /**
     * String value for basicAuthPassword.
     * @return basicAuthPassword
     */
    public String getBasicAuthPassword() {
        return basicAuthPassword;
    }

    /**
     * Checks if provided credentials matched with existing ones.
     * @param basicAuthUserName String value for credentials.
     * @param basicAuthPassword String value for credentials.
     * @return true if credentials matched.
     */
    public boolean equals(String basicAuthUserName, String basicAuthPassword) {
        return basicAuthUserName.equals(getBasicAuthUserName())
                && basicAuthPassword.equals(getBasicAuthPassword());
    }

    /**
     * Converts this TwoFactorAuthBasicAuthManager into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TwoFactorAuthBasicAuthManager [" + "basicAuthUserName=" + basicAuthUserName
                + ", basicAuthPassword=" + basicAuthPassword + "]";
    }

    /**
     * Adds authentication to the given HttpRequest.
     */
    public HttpRequest apply(HttpRequest httpRequest) {
        String authCredentials = basicAuthUserName + ":" + basicAuthPassword;
        httpRequest.getHeaders().add("Authorization", "Basic " + Base64.getEncoder().encodeToString(authCredentials.getBytes()));
        return httpRequest;
    }

    /**
     * Asynchronously adds authentication to the given HttpRequest.
     */
    public CompletableFuture<HttpRequest> applyAsync(HttpRequest httpRequest) {
        String authCredentials = basicAuthUserName + ":" + basicAuthPassword;
        httpRequest.getHeaders().add("Authorization", "Basic " + Base64.getEncoder().encodeToString(authCredentials.getBytes()));
        return CompletableFuture.completedFuture(httpRequest);
    }
}
