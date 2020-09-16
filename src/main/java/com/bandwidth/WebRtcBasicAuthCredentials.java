/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bandwidth;

/**
 * Interface for defining the behavior of Basic Authentication.
 */
public interface WebRtcBasicAuthCredentials {

    /**
     * @return basicAuthUserName
     */
    String getBasicAuthUserName();

    /**
     * @return basicAuthPassword
     */
    String getBasicAuthPassword();

    /**
     * @return true if credentials matched.
     */
    boolean equals(String basicAuthUserName, String basicAuthPassword);
}