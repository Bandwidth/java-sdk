/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

package com.bandwidth;

/**
 * Interface for defining the behavior of Basic Authentication.
 */
public interface MessagingBasicAuthCredentials {

    /**
     * String value for basicAuthUserName.
     * @return basicAuthUserName
     */
    String getBasicAuthUserName();

    /**
     * String value for basicAuthPassword.
     * @return basicAuthPassword
     */
    String getBasicAuthPassword();

    /**
     * Checks if provided credentials matched with existing ones.
     * @param basicAuthUserName String value for credentials.
     * @param basicAuthPassword String value for credentials.
     * @return true if credentials matched.
     */
    boolean equals(String basicAuthUserName, String basicAuthPassword);
}