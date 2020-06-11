/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bandwidth;

import com.bandwidth.twofactorauth.controllers.*;
import com.bandwidth.http.client.OkClient;

public final class TwoFactorAuthClient {
    private final BandwidthClient config;

    private APIController client;

    public APIController getAPIController() {
        return client;
    }

    public static void shutdown() {
        OkClient.shutdown();
    }

    public Configuration getConfiguration() {
        return config;
    }

    /**
     * Default constructor 
     */
    public TwoFactorAuthClient(BandwidthClient config) {
        this.config = config;
        client = new APIController(config, config.getHttpClient(), config.getAuthManagers());
    }
}