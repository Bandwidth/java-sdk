/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bandwidth;

import com.bandwidth.http.client.ReadonlyHttpClientConfiguration;

/**
 * Configuration Interface for the library.
 */
public interface Configuration {

    /**
     * Current API environment
     * @return a copy of environment
     */
    Environment getEnvironment();

    /**
     * The timeout to use for making HTTP requests.
     * @return a copy of timeout
     */
    long getTimeout();

    /**
     * Http Client Configuration instance.
     * @return a copy of httpClientConfig
     */
    ReadonlyHttpClientConfiguration getHttpClientConfig();

    /**
     * The credentials to use with basic authentication
     * @return basicAuthCredentials
     */
    MessagingBasicAuthCredentials getMessagingBasicAuthCredentials();

    /**
     * The credentials to use with basic authentication
     * @return basicAuthCredentials
     */
    TwoFactorAuthBasicAuthCredentials getTwoFactorAuthBasicAuthCredentials();

    /**
     * The credentials to use with basic authentication
     * @return basicAuthCredentials
     */
    VoiceBasicAuthCredentials getVoiceBasicAuthCredentials();

    /**
     * The credentials to use with basic authentication
     * @return basicAuthCredentials
     */
    WebRtcBasicAuthCredentials getWebRtcBasicAuthCredentials();

    /**
     * Get base URI by current environment
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    String getBaseUri(Server server);

    /**
     * Get base URI by current environment
     * @return Processed base URI
     */
    String getBaseUri();
}
