/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

package com.bandwidth;

import com.bandwidth.http.client.HttpCallback;
import com.bandwidth.http.client.HttpClient;
import com.bandwidth.http.client.HttpClientConfiguration;
import com.bandwidth.http.client.OkClient;
import com.bandwidth.http.client.ReadonlyHttpClientConfiguration;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;

/**
 * Gateway class for the library.
 * This class acts as a factory for Controllers.
 * It holds the state of the SDK.
 */
public final class BandwidthClient implements Configuration {

    /**
     * Private store for clients.
     */
    private MessagingClient messagingClient;
    private TwoFactorAuthClient twoFactorAuthClient;
    private VoiceClient voiceClient;
    private WebRtcClient webRtcClient;

    /**
     * Current API environment.
     */
    private final Environment environment;

    /**
     * baseUrl value.
     */
    private final String baseUrl;

    /**
     * The HTTP Client instance to use for making HTTP requests.
     */
    private final HttpClient httpClient;

    /**
     * The timeout to use for making HTTP requests.
     */
    private final long timeout;

    /**
     * Http Client Configuration instance.
     */
    private final ReadonlyHttpClientConfiguration httpClientConfig;

    /**
     * MessagingBasicAuthManager.
     */
    private MessagingBasicAuthManager messagingBasicAuthManager;

    /**
     * TwoFactorAuthBasicAuthManager.
     */
    private TwoFactorAuthBasicAuthManager twoFactorAuthBasicAuthManager;

    /**
     * VoiceBasicAuthManager.
     */
    private VoiceBasicAuthManager voiceBasicAuthManager;

    /**
     * WebRtcBasicAuthManager.
     */
    private WebRtcBasicAuthManager webRtcBasicAuthManager;

    /**
     * Map of authentication Managers.
     */
    private Map<String, AuthManager> authManagers;

    /**
     * Callback to be called before and after the HTTP call for an endpoint is made.
     */
    private final HttpCallback httpCallback;

    private BandwidthClient(Environment environment, String baseUrl, HttpClient httpClient,
            long timeout, ReadonlyHttpClientConfiguration httpClientConfig,
            String messagingBasicAuthUserName, String messagingBasicAuthPassword,
            String twoFactorAuthBasicAuthUserName, String twoFactorAuthBasicAuthPassword,
            String voiceBasicAuthUserName, String voiceBasicAuthPassword,
            String webRtcBasicAuthUserName, String webRtcBasicAuthPassword,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        this.environment = environment;
        this.baseUrl = baseUrl;
        this.httpClient = httpClient;
        this.timeout = timeout;
        this.httpClientConfig = httpClientConfig;
        this.httpCallback = httpCallback;

        this.authManagers = (authManagers == null) ? new HashMap<>() : new HashMap<>(authManagers);
        if (this.authManagers.containsKey("messaging")) {
            this.messagingBasicAuthManager =
                    (MessagingBasicAuthManager) this.authManagers.get("messaging");
        }

        if (!this.authManagers.containsKey("messaging")
                || !getMessagingBasicAuthCredentials().equals(messagingBasicAuthUserName,
                        messagingBasicAuthPassword)) {
            this.messagingBasicAuthManager = new MessagingBasicAuthManager(
                    messagingBasicAuthUserName, messagingBasicAuthPassword);
            this.authManagers.put("messaging", messagingBasicAuthManager);
        }

        if (this.authManagers.containsKey("twoFactorAuth")) {
            this.twoFactorAuthBasicAuthManager =
                    (TwoFactorAuthBasicAuthManager) this.authManagers.get("twoFactorAuth");
        }

        if (!this.authManagers.containsKey("twoFactorAuth")
                || !getTwoFactorAuthBasicAuthCredentials().equals(twoFactorAuthBasicAuthUserName,
                        twoFactorAuthBasicAuthPassword)) {
            this.twoFactorAuthBasicAuthManager = new TwoFactorAuthBasicAuthManager(
                    twoFactorAuthBasicAuthUserName, twoFactorAuthBasicAuthPassword);
            this.authManagers.put("twoFactorAuth", twoFactorAuthBasicAuthManager);
        }

        if (this.authManagers.containsKey("voice")) {
            this.voiceBasicAuthManager = (VoiceBasicAuthManager) this.authManagers.get("voice");
        }

        if (!this.authManagers.containsKey("voice")
                || !getVoiceBasicAuthCredentials().equals(voiceBasicAuthUserName,
                        voiceBasicAuthPassword)) {
            this.voiceBasicAuthManager = new VoiceBasicAuthManager(voiceBasicAuthUserName,
                    voiceBasicAuthPassword);
            this.authManagers.put("voice", voiceBasicAuthManager);
        }

        if (this.authManagers.containsKey("webRtc")) {
            this.webRtcBasicAuthManager = (WebRtcBasicAuthManager) this.authManagers.get("webRtc");
        }

        if (!this.authManagers.containsKey("webRtc")
                || !getWebRtcBasicAuthCredentials().equals(webRtcBasicAuthUserName,
                        webRtcBasicAuthPassword)) {
            this.webRtcBasicAuthManager = new WebRtcBasicAuthManager(webRtcBasicAuthUserName,
                    webRtcBasicAuthPassword);
            this.authManagers.put("webRtc", webRtcBasicAuthManager);
        }


        messagingClient = new MessagingClient(this);
        twoFactorAuthClient = new TwoFactorAuthClient(this);
        voiceClient = new VoiceClient(this);
        webRtcClient = new WebRtcClient(this);
    }

    /**
     * Shutdown the underlying HttpClient instance.
     */
    public static void shutdown() {
        OkClient.shutdown();
    }

    /**
     * Provides access to messagingClient Client.
     * @return Returns the MessagingClient instance
     */
    public MessagingClient getMessagingClient() {
        return messagingClient;
    }

    /**
     * Provides access to twoFactorAuthClient Client.
     * @return Returns the TwoFactorAuthClient instance
     */
    public TwoFactorAuthClient getTwoFactorAuthClient() {
        return twoFactorAuthClient;
    }

    /**
     * Provides access to voiceClient Client.
     * @return Returns the VoiceClient instance
     */
    public VoiceClient getVoiceClient() {
        return voiceClient;
    }

    /**
     * Provides access to webRtcClient Client.
     * @return Returns the WebRtcClient instance
     */
    public WebRtcClient getWebRtcClient() {
        return webRtcClient;
    }

    /**
     * Current API environment.
     * @return environment
     */
    public Environment getEnvironment() {
        return environment;
    }

    /**
     * baseUrl value.
     * @return baseUrl
     */
    public String getBaseUrl() {
        return baseUrl;
    }

    /**
     * The HTTP Client instance to use for making HTTP requests.
     * @return httpClient
     */
    public HttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * The timeout to use for making HTTP requests.
     * @return timeout
     */
    public long getTimeout() {
        return timeout;
    }

    /**
     * Http Client Configuration instance.
     * @return httpClientConfig
     */
    public ReadonlyHttpClientConfiguration getHttpClientConfig() {
        return httpClientConfig;
    }

    /**
     * The credentials to use with MessagingBasicAuth.
     * @return messagingBasicAuthCredentials
     */
    public MessagingBasicAuthCredentials getMessagingBasicAuthCredentials() {
        return messagingBasicAuthManager;
    }

    /**
     * The credentials to use with TwoFactorAuthBasicAuth.
     * @return twoFactorAuthBasicAuthCredentials
     */
    public TwoFactorAuthBasicAuthCredentials getTwoFactorAuthBasicAuthCredentials() {
        return twoFactorAuthBasicAuthManager;
    }

    /**
     * The credentials to use with VoiceBasicAuth.
     * @return voiceBasicAuthCredentials
     */
    public VoiceBasicAuthCredentials getVoiceBasicAuthCredentials() {
        return voiceBasicAuthManager;
    }

    /**
     * The credentials to use with WebRtcBasicAuth.
     * @return webRtcBasicAuthCredentials
     */
    public WebRtcBasicAuthCredentials getWebRtcBasicAuthCredentials() {
        return webRtcBasicAuthManager;
    }

    /**
     * The list of auth managers.
     * @return authManagers
     */
    public Map<String, AuthManager> getAuthManagers() {
        return authManagers;
    }

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(Server server) {
        Map<String, SimpleEntry<Object, Boolean>> parameters = new HashMap<>();
        parameters.put("base_url",
                new SimpleEntry<Object, Boolean>(this.baseUrl, false));
        StringBuilder baseUrl = new StringBuilder(environmentMapper(environment, server));
        ApiHelper.appendUrlWithTemplateParameters(baseUrl, parameters);
        return baseUrl.toString();
    }

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    public String getBaseUri() {
        return getBaseUri(Server.ENUM_DEFAULT);
    }

    /**
     * Base URLs by environment and server aliases.
     * @param environment Environment for which to get the base URI
     * @param server Server for which to get the base URI
     * @return base URL
     */
    private static String environmentMapper(Environment environment, Server server) {
        if (environment.equals(Environment.PRODUCTION)) {
            if (server.equals(Server.ENUM_DEFAULT)) {
                return "api.bandwidth.com";
            }
            if (server.equals(Server.MESSAGINGDEFAULT)) {
                return "https://messaging.bandwidth.com/api/v2";
            }
            if (server.equals(Server.TWOFACTORAUTHDEFAULT)) {
                return "https://mfa.bandwidth.com/api/v1";
            }
            if (server.equals(Server.VOICEDEFAULT)) {
                return "https://voice.bandwidth.com";
            }
            if (server.equals(Server.WEBRTCDEFAULT)) {
                return "https://api.webrtc.bandwidth.com/v1";
            }
        }
        if (environment.equals(Environment.CUSTOM)) {
            if (server.equals(Server.ENUM_DEFAULT)) {
                return "{base_url}";
            }
            if (server.equals(Server.MESSAGINGDEFAULT)) {
                return "{base_url}";
            }
            if (server.equals(Server.TWOFACTORAUTHDEFAULT)) {
                return "{base_url}";
            }
            if (server.equals(Server.VOICEDEFAULT)) {
                return "{base_url}";
            }
            if (server.equals(Server.WEBRTCDEFAULT)) {
                return "{base_url}";
            }
        }
        return "api.bandwidth.com";
    }

    /**
     * Converts this BandwidthClient into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BandwidthClient [" + "environment=" + environment + ", baseUrl=" + baseUrl
                + ", httpClientConfig=" + httpClientConfig + ", authManagers=" + authManagers + "]";
    }

    /**
     * Builds a new {@link BandwidthClient.Builder} object.
     * Creates the instance with the state of the current client.
     * @return a new {@link BandwidthClient.Builder} object
     */
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.environment = getEnvironment();
        builder.baseUrl = getBaseUrl();
        builder.httpClient = getHttpClient();
        builder.timeout = getTimeout();
        builder.messagingBasicAuthUserName =
                getMessagingBasicAuthCredentials().getBasicAuthUserName();
        builder.messagingBasicAuthPassword =
                getMessagingBasicAuthCredentials().getBasicAuthPassword();
        builder.twoFactorAuthBasicAuthUserName =
                getTwoFactorAuthBasicAuthCredentials().getBasicAuthUserName();
        builder.twoFactorAuthBasicAuthPassword =
                getTwoFactorAuthBasicAuthCredentials().getBasicAuthPassword();
        builder.voiceBasicAuthUserName = getVoiceBasicAuthCredentials().getBasicAuthUserName();
        builder.voiceBasicAuthPassword = getVoiceBasicAuthCredentials().getBasicAuthPassword();
        builder.webRtcBasicAuthUserName = getWebRtcBasicAuthCredentials().getBasicAuthUserName();
        builder.webRtcBasicAuthPassword = getWebRtcBasicAuthCredentials().getBasicAuthPassword();
        builder.authManagers = authManagers;
        builder.httpCallback = httpCallback;
        builder.setHttpClientConfig(httpClientConfig);
        return builder;
    }

    /**
     * Class to build instances of {@link BandwidthClient}.
     */
    public static class Builder {
        private Environment environment = Environment.PRODUCTION;
        private String baseUrl = "https://www.example.com";
        private HttpClient httpClient;
        private long timeout = 0;
        private String messagingBasicAuthUserName = "TODO: Replace";
        private String messagingBasicAuthPassword = "TODO: Replace";
        private String twoFactorAuthBasicAuthUserName = "TODO: Replace";
        private String twoFactorAuthBasicAuthPassword = "TODO: Replace";
        private String voiceBasicAuthUserName = "TODO: Replace";
        private String voiceBasicAuthPassword = "TODO: Replace";
        private String webRtcBasicAuthUserName = "TODO: Replace";
        private String webRtcBasicAuthPassword = "TODO: Replace";
        private Map<String, AuthManager> authManagers = null;
        private HttpCallback httpCallback = null;
        private HttpClientConfiguration httpClientConfig;

        /**
         * Credentials setter for MessagingBasicAuth.
         * @param basicAuthUserName String value for messagingBasicAuthUserName.
         * @param basicAuthPassword String value for messagingBasicAuthPassword.
         * @return Builder
         */
        public Builder messagingBasicAuthCredentials(String basicAuthUserName,
                String basicAuthPassword) {
            if (basicAuthUserName == null) {
                throw new NullPointerException("BasicAuthUserName cannot be null.");
            }
            if (basicAuthPassword == null) {
                throw new NullPointerException("BasicAuthPassword cannot be null.");
            }
            this.messagingBasicAuthUserName = basicAuthUserName;
            this.messagingBasicAuthPassword = basicAuthPassword;
            return this;
        }

        /**
         * Credentials setter for TwoFactorAuthBasicAuth.
         * @param basicAuthUserName String value for twoFactorAuthBasicAuthUserName.
         * @param basicAuthPassword String value for twoFactorAuthBasicAuthPassword.
         * @return Builder
         */
        public Builder twoFactorAuthBasicAuthCredentials(String basicAuthUserName,
                String basicAuthPassword) {
            if (basicAuthUserName == null) {
                throw new NullPointerException("BasicAuthUserName cannot be null.");
            }
            if (basicAuthPassword == null) {
                throw new NullPointerException("BasicAuthPassword cannot be null.");
            }
            this.twoFactorAuthBasicAuthUserName = basicAuthUserName;
            this.twoFactorAuthBasicAuthPassword = basicAuthPassword;
            return this;
        }

        /**
         * Credentials setter for VoiceBasicAuth.
         * @param basicAuthUserName String value for voiceBasicAuthUserName.
         * @param basicAuthPassword String value for voiceBasicAuthPassword.
         * @return Builder
         */
        public Builder voiceBasicAuthCredentials(String basicAuthUserName,
                String basicAuthPassword) {
            if (basicAuthUserName == null) {
                throw new NullPointerException("BasicAuthUserName cannot be null.");
            }
            if (basicAuthPassword == null) {
                throw new NullPointerException("BasicAuthPassword cannot be null.");
            }
            this.voiceBasicAuthUserName = basicAuthUserName;
            this.voiceBasicAuthPassword = basicAuthPassword;
            return this;
        }

        /**
         * Credentials setter for WebRtcBasicAuth.
         * @param basicAuthUserName String value for webRtcBasicAuthUserName.
         * @param basicAuthPassword String value for webRtcBasicAuthPassword.
         * @return Builder
         */
        public Builder webRtcBasicAuthCredentials(String basicAuthUserName,
                String basicAuthPassword) {
            if (basicAuthUserName == null) {
                throw new NullPointerException("BasicAuthUserName cannot be null.");
            }
            if (basicAuthPassword == null) {
                throw new NullPointerException("BasicAuthPassword cannot be null.");
            }
            this.webRtcBasicAuthUserName = basicAuthUserName;
            this.webRtcBasicAuthPassword = basicAuthPassword;
            return this;
        }

        /**
         * Current API environment.
         * @param environment The environment for client.
         * @return Builder
         */
        public Builder environment(Environment environment) {
            this.environment = environment;
            return this;
        }

        /**
         * baseUrl value.
         * @param baseUrl The baseUrl for client.
         * @return Builder
         */
        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        /**
         * The timeout to use for making HTTP requests.
         * @param timeout must be greater then 0.
         * @return Builder
         */
        public Builder timeout(long timeout) {
            if (timeout > 0) {
                this.timeout = timeout;
            }
            return this;
        }

        /**
         * HttpCallback.
         * @param httpCallback Callback to be called before and after the HTTP call.
         * @return Builder
         */
        public Builder httpCallback(HttpCallback httpCallback) {
            this.httpCallback = httpCallback;
            return this;
        }


        private void setHttpClientConfig(ReadonlyHttpClientConfiguration httpClientConfig) {
            this.timeout = httpClientConfig.getTimeout();
        }

        /**
         * Builds a new BandwidthClient object using the set fields.
         * @return BandwidthClient
         */
        public BandwidthClient build() {
            httpClientConfig = new HttpClientConfiguration();
            httpClientConfig.setTimeout(timeout);
            httpClient = new OkClient(httpClientConfig);

            return new BandwidthClient(environment, baseUrl, httpClient, timeout, httpClientConfig,
                    messagingBasicAuthUserName, messagingBasicAuthPassword,
                    twoFactorAuthBasicAuthUserName, twoFactorAuthBasicAuthPassword,
                    voiceBasicAuthUserName, voiceBasicAuthPassword, webRtcBasicAuthUserName,
                    webRtcBasicAuthPassword, authManagers, httpCallback);
        }
    }
}