package org.openapitools.client.api;

import org.openapitools.client.ApiResponse;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.auth.HttpBasicAuth;
import org.openapitools.client.model.CodeRequest;
import org.openapitools.client.model.MessagingCodeResponse;
import org.openapitools.client.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.net.URI;

import javax.security.auth.AuthPermission;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.matchesRegex;
import static org.hamcrest.Matchers.contains;

import static org.openapitools.client.utils.TestingEnvironmentVariables.*;

public class MfaApiTest {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    private final MfaApi api = new MfaApi(defaultClient);

    @Test
    public void successfulMfaGenerateMessagingCodeRequest() throws ApiException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);

        CodeRequest request = new CodeRequest();
        request.setTo(USER_NUMBER);
        request.setFrom(BW_NUMBER);
        request.setApplicationId(BW_MESSAGING_APPLICATION_ID);
        request.setScope("scope");
        request.setMessage("Your temporary {NAME} {SCOPE} code is {CODE}");
        request.setDigits(6);
        ApiResponse<MessagingCodeResponse> response = api.generateMessagingCodeWithHttpInfo(BW_ACCOUNT_ID, request);
        assertThat(response.getStatusCode(), is(200));

        assertThat(response.getData(), instanceOf(MessagingCodeResponse.class));
    }

    @Test
    public void successfulMfaGenerateVoiceCodeRequest() {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);
    }

    @Test
    public void successfulMfaVerifyCodeRequest() {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);
    }

    @Test
    public void badRequest() {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);
    }

    @Test
    public void unauthorizedRequest() {
        Basic.setUsername("bad_username");
        Basic.setPassword("bad_password");
    }

    @Test
    public void forbiddenRequest() {
        Basic.setUsername(FORBIDDEN_USERNAME);
        Basic.setPassword(FORBIDDEN_PASSWORD);
    }

}
