package com.bandwidth.sdk.unit.api;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.ApiResponse;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.api.MfaApi;
import com.bandwidth.sdk.auth.HttpBasicAuth;
import com.bandwidth.sdk.model.CodeRequest;
import com.bandwidth.sdk.model.MessagingCodeResponse;
import com.bandwidth.sdk.model.VerifyCodeRequest;
import com.bandwidth.sdk.model.VerifyCodeResponse;
import com.bandwidth.sdk.model.VoiceCodeResponse;

import java.math.BigDecimal;

import static com.bandwidth.sdk.utils.TestingEnvironmentVariables.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;

@SuppressWarnings("null")
public class MfaApiTest {
    private static ApiClient defaultClient = Configuration.getDefaultApiClient();
    private static HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    private static MfaApi api = new MfaApi(defaultClient);

    private static String message = "Your temporary {NAME} {SCOPE} code is {CODE}";
    private static Integer digits = 6;

    @BeforeAll
    public static void setUp() {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);
        api.setCustomBaseUrl("http://127.0.0.1:4010");
    }

    @Test
    public void testGenerateMessagingCode() throws ApiException {
        CodeRequest codeRequest = new CodeRequest()
                .to(USER_NUMBER)
                .from(BW_NUMBER)
                .applicationId(BW_MESSAGING_APPLICATION_ID)
                .message(message)
                .digits(digits);

        ApiResponse<MessagingCodeResponse> response = api.generateMessagingCodeWithHttpInfo(BW_ACCOUNT_ID, codeRequest);

        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData(), instanceOf(MessagingCodeResponse.class));
        assertThat(response.getData().getMessageId().length(), is(29));
    }

    @Test
    public void testGenerateVoiceCode() throws ApiException {
        CodeRequest codeRequest = new CodeRequest()
                .to(USER_NUMBER)
                .from(BW_NUMBER)
                .applicationId(BW_VOICE_APPLICATION_ID)
                .message(message)
                .digits(digits);

        ApiResponse<VoiceCodeResponse> response = api.generateVoiceCodeWithHttpInfo(BW_ACCOUNT_ID, codeRequest);

        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData(), instanceOf(VoiceCodeResponse.class));
        assertThat(response.getData().getCallId().length(), is(47));
    }

    @Test
    public void testVerifyCode() throws ApiException {
        VerifyCodeRequest verifyCodeRequest = new VerifyCodeRequest()
                .to(USER_NUMBER)
                .scope("login")
                .expirationTimeInMinutes(new BigDecimal(3))
                .code("12345");

        ApiResponse<VerifyCodeResponse> response = api.verifyCodeWithHttpInfo(BW_ACCOUNT_ID, verifyCodeRequest);

        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData(), instanceOf(VerifyCodeResponse.class));
        assertThat(response.getData().getValid(), instanceOf(Boolean.class));
    }
}
