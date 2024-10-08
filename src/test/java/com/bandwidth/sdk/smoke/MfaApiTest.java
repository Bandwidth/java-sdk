package com.bandwidth.sdk.smoke;

import com.bandwidth.sdk.api.MfaApi;
import com.bandwidth.sdk.ApiResponse;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.auth.HttpBasicAuth;
import com.bandwidth.sdk.model.CodeRequest;
import com.bandwidth.sdk.model.MessagingCodeResponse;
import com.bandwidth.sdk.model.VerifyCodeRequest;
import com.bandwidth.sdk.model.VerifyCodeResponse;
import com.bandwidth.sdk.model.VoiceCodeResponse;
import com.bandwidth.sdk.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.Matchers.is;

import static com.bandwidth.sdk.utils.TestingEnvironmentVariables.*;

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
    public void successfulMfaGenerateVoiceCodeRequest() throws ApiException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);

        CodeRequest request = new CodeRequest();
        request.setTo(USER_NUMBER);
        request.setFrom(BW_NUMBER);
        request.setApplicationId(BW_VOICE_APPLICATION_ID);
        request.setScope("scope");
        request.setMessage("Your temporary {NAME} {SCOPE} code is {CODE}");
        request.setDigits(6);
        ApiResponse<VoiceCodeResponse> response = api.generateVoiceCodeWithHttpInfo(BW_ACCOUNT_ID, request);
        assertThat(response.getStatusCode(), is(200));

        assertThat(response.getData(), instanceOf(VoiceCodeResponse.class));
    }

    @Test
    public void successfulMfaVerifyCodeRequest() throws ApiException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);
        BigDecimal expirationTime = new BigDecimal(3);

        // Generate a random TN for the setTo - otherwise we get heavily rate limited
        Long minTn = 1111111111L;
        Long maxTn = 9999999999L;
        Long randomInt = ThreadLocalRandom.current().nextLong(maxTn - minTn) + minTn;

        VerifyCodeRequest request = new VerifyCodeRequest();
        request.setTo("+1" + randomInt.toString());
        request.setScope("2FA");
        request.setExpirationTimeInMinutes(expirationTime);
        request.setCode("123456");

        ApiResponse<VerifyCodeResponse> response = api.verifyCodeWithHttpInfo(BW_ACCOUNT_ID, request);

        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData().getValid(), is(false));
    }

    @Test
    public void badRequest() throws ApiException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);

        CodeRequest badRequest = new CodeRequest();
        badRequest.setTo(USER_NUMBER);
        badRequest.setFrom(BW_NUMBER);
        badRequest.setApplicationId("not_an_application_id");
        badRequest.setScope("scope");
        badRequest.setMessage("Your temporary {NAME} {SCOPE} code is {CODE}");
        badRequest.setDigits(6);

        ApiException messagingException = Assertions.assertThrows(ApiException.class,
                () -> api.generateMessagingCodeWithHttpInfo(BW_ACCOUNT_ID,
                        badRequest));
        assertThat(messagingException.getCode(), is(400));

        ApiException voiceException = Assertions.assertThrows(ApiException.class,
                () -> api.generateVoiceCodeWithHttpInfo(BW_ACCOUNT_ID,
                        badRequest));
        assertThat(voiceException.getCode(), is(400));
    }

    @Test
    public void unauthorizedRequest() throws ApiException {
        Basic.setUsername(null);
        Basic.setPassword(null);

        CodeRequest request = new CodeRequest();
        request.setTo(USER_NUMBER);
        request.setFrom(BW_NUMBER);
        request.setApplicationId(BW_VOICE_APPLICATION_ID);
        request.setScope("scope");
        request.setMessage("Your temporary {NAME} {SCOPE} code is {CODE}");
        request.setDigits(6);

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> api.generateMessagingCodeWithHttpInfo(BW_ACCOUNT_ID,
                        request));
        assertThat(exception.getCode(), is(401));
    }

    @Test
    public void forbiddenRequest() {
        Basic.setUsername(FORBIDDEN_USERNAME);
        Basic.setPassword("bad_password");

        CodeRequest request = new CodeRequest();
        request.setTo(USER_NUMBER);
        request.setFrom(BW_NUMBER);
        request.setApplicationId(BW_MESSAGING_APPLICATION_ID);
        request.setScope("scope");
        request.setMessage("Your temporary {NAME} {SCOPE} code is {CODE}");
        request.setDigits(6);

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> api.generateMessagingCodeWithHttpInfo(BW_ACCOUNT_ID,
                        request));
        assertThat(exception.getCode(), is(403));
    }

}
