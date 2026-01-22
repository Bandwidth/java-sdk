package com.bandwidth.sdk.unit.api;

import org.junit.jupiter.api.Test;

import okhttp3.OkHttpClient;
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.JSON;
import com.bandwidth.sdk.auth.Authentication;
import com.bandwidth.sdk.auth.HttpBasicAuth;
import com.bandwidth.sdk.auth.RetryingOAuth;

import java.util.Map;

import static com.bandwidth.sdk.utils.TestingEnvironmentVariables.*;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.sameInstance;
import static org.hamcrest.Matchers.not;

public class ApiClientTest {

    @Test
    public void testHttpClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttpClient httpClient = builder.build();

        ApiClient defaultOauthClient = new ApiClient(BW_CLIENT_ID, BW_CLIENT_SECRET, null);   
        ApiClient customOauthClient = new ApiClient(BW_CLIENT_ID, BW_CLIENT_SECRET, null, httpClient);

        assertThat(defaultOauthClient.getHttpClient(), instanceOf(OkHttpClient.class));
        assertThat(customOauthClient.getHttpClient(), instanceOf(OkHttpClient.class));
        assertThat(defaultOauthClient.getHttpClient(), not(sameInstance(customOauthClient.getHttpClient())));
        assertThat(customOauthClient.getHttpClient(), sameInstance(httpClient));
    }

    @Test
    public void testAuthentications() {
        ApiClient basicClient = new ApiClient();
        Map<String, Authentication> authentications = basicClient.getAuthentications();

        ApiClient oauthClient = new ApiClient(BW_CLIENT_ID, BW_CLIENT_SECRET, null);
        Map<String, Authentication> oauthAuthentications = oauthClient.getAuthentications();
        
        assertThat(authentications, notNullValue());
        assertThat(authentications, hasKey("Basic"));
        assertThat(basicClient.getAuthentication("Basic"), instanceOf(HttpBasicAuth.class));

        assertThat(oauthAuthentications, notNullValue());
        assertThat(oauthAuthentications, hasKey("OAuth2"));
        assertThat(oauthClient.getAuthentication("OAuth2"), instanceOf(RetryingOAuth.class));
    }

    @Test
    public void testBasePathConfiguration() {
        ApiClient client = new ApiClient();
        String defaultBasePath = client.getBasePath();
        assertThat(defaultBasePath, instanceOf(String.class));
        
        String customBasePath = "https://api.example.com";
        client.setBasePath(customBasePath);
        assertThat(customBasePath, equalTo(client.getBasePath()));
    }

    @Test
    public void testJsonGetter() {
        ApiClient client = new ApiClient();
        JSON json = client.getJSON();
        
        assertThat(json, notNullValue());
        assertThat(json, instanceOf(JSON.class));
    }
}
