/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

package com.bandwidth;

import com.bandwidth.voice.controllers.*;
import com.bandwidth.http.client.OkClient;

public final class VoiceClient {
    private final BandwidthClient config;

    /**
     * Private store for controllers.
     */
    private APIController client;

    /**
     * Default constructor.
     */
    public VoiceClient(BandwidthClient config) {
        this.config = config;
        client = new APIController(config, config.getHttpClient(), config.getAuthManagers());
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