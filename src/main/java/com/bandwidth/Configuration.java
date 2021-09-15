/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.bandwidth;

import com.bandwidth.http.client.ReadonlyHttpClientConfiguration;

/**
 * Configuration Interface for the library.
 */
public interface Configuration {

    /**
     * Current API environment.
     * @return a copy of environment
     */
    Environment getEnvironment();

    /**
     * baseUrl value.
     * @return a copy of baseUrl
     */
    String getBaseUrl();

    /**
     * Http Client Configuration instance. 
     * See available [builder methods here](__HttpClientConfiguration.Builder).
     * @return a copy of httpClientConfig
     */
    ReadonlyHttpClientConfiguration getHttpClientConfig();

    /**
     * The timeout to use for making HTTP requests. The timeout to use for making HTTP requests.
     * @return a copy of timeout
     */
    long timeout();

    /**
     * The credentials to use with MessagingBasicAuth.
     * @return messagingBasicAuthCredentials
     */
    MessagingBasicAuthCredentials getMessagingBasicAuthCredentials();

    /**
     * The credentials to use with MultiFactorAuthBasicAuth.
     * @return multiFactorAuthBasicAuthCredentials
     */
    MultiFactorAuthBasicAuthCredentials getMultiFactorAuthBasicAuthCredentials();

    /**
     * The credentials to use with PhoneNumberLookupBasicAuth.
     * @return phoneNumberLookupBasicAuthCredentials
     */
    PhoneNumberLookupBasicAuthCredentials getPhoneNumberLookupBasicAuthCredentials();

    /**
     * The credentials to use with VoiceBasicAuth.
     * @return voiceBasicAuthCredentials
     */
    VoiceBasicAuthCredentials getVoiceBasicAuthCredentials();

    /**
     * The credentials to use with WebRtcBasicAuth.
     * @return webRtcBasicAuthCredentials
     */
    WebRtcBasicAuthCredentials getWebRtcBasicAuthCredentials();

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    String getBaseUri(Server server);

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    String getBaseUri();
}
