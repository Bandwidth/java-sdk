/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

package com.bandwidth;

import com.bandwidth.http.client.HttpCallback;
import com.bandwidth.http.client.OkClient;
import com.bandwidth.voice.controllers.*;

public final class VoiceClient {
    private final BandwidthClient config;

    /**
     * Private store for controllers.
     */
    private APIController client;

    /**
     * Default constructor.
     */
    public VoiceClient(BandwidthClient config, HttpCallback httpCallback) {
        this.config = config;
        client = new APIController(config, config.getHttpClient(), config.getAuthManagers(),
                httpCallback);
    }

    public static void shutdown() {
        OkClient.shutdown();
    }

    public APIController getAPIController() {
        return client;
    }

    public Configuration getConfiguration() {
        return config;
    }
}