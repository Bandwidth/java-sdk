package com.bandwidth;

import com.bandwidth.http.response.ApiResponse;
import com.bandwidth.multifactorauth.controllers.MFAController;

import com.bandwidth.multifactorauth.exceptions.ErrorWithRequestException;
import com.bandwidth.multifactorauth.models.*;

import org.junit.*;
import static org.junit.Assert.*;

import static com.bandwidth.TestingEnvironmentVariables.*;

/*
 * Integration tests between the SDK and MFA API
 */
public class MfaApiTests {

    private MFAController controller;

    @Before
    public void initTest(){
        BandwidthClient client = new BandwidthClient.Builder()
                .multiFactorAuthBasicAuthCredentials(USERNAME, PASSWORD)
                .build();

        controller = client.getMultiFactorAuthClient().getMFAController();
    }

    @Test
    public void testMfaMessaging() throws Exception {
        TwoFactorCodeRequestSchema body = new TwoFactorCodeRequestSchema.Builder()
                .to(USER_NUMBER)
                .from(BW_NUMBER)
                .applicationId(MESSAGING_APPLICATION_ID)
                .scope("scope")
                .digits(6)
                .message("Your temporary {NAME} {SCOPE} code is {CODE}")
                .build();

        ApiResponse<TwoFactorMessagingResponse> apiResponse = controller.createMessagingTwoFactor(ACCOUNT_ID, body);
        assertEquals("Response Code is not 200", 200, apiResponse.getStatusCode());

        TwoFactorMessagingResponse response = apiResponse.getResult();
        assertNotNull("MessageID is null", response.getMessageId());
        assertFalse("MessageID is empty", response.getMessageId().isEmpty());
    }

    @Test
    public void testMfaVoice() throws Exception {
        TwoFactorCodeRequestSchema body = new TwoFactorCodeRequestSchema.Builder()
                .to(USER_NUMBER)
                .from(BW_NUMBER)
                .applicationId(VOICE_APPLICATION_ID)
                .scope("scope")
                .digits(6)
                .message("Your temporary {NAME} {SCOPE} code is {CODE}")
                .build();

        ApiResponse<TwoFactorVoiceResponse> apiResponse = controller.createVoiceTwoFactor(ACCOUNT_ID, body);
        assertEquals("Response Code is not 200", 200, apiResponse.getStatusCode());

        TwoFactorVoiceResponse response = apiResponse.getResult();
        assertNotNull("CallID is null", response.getCallId());
        assertFalse("CallID is empty", response.getCallId().isEmpty());
    }

    @Test
    public void testMfaMessagingInvalidPhoneNumber() throws Exception {
        TwoFactorCodeRequestSchema body = new TwoFactorCodeRequestSchema.Builder()
                .to("+1invalid")
                .from(BW_NUMBER)
                .applicationId(MESSAGING_APPLICATION_ID)
                .scope("scope")
                .digits(6)
                .message("Your temporary {NAME} {SCOPE} code is {CODE}")
                .build();

        ErrorWithRequestException e = assertThrows(
                "ErrorWithRequest Exception not thrown",
                ErrorWithRequestException.class,
                ()->controller.createMessagingTwoFactor(ACCOUNT_ID, body)
                );
        assertEquals("Response Code is not 400", 400, e.getResponseCode());
    }

    @Test
    public void testMfaVoiceInvalidPhoneNumber() throws Exception {
        TwoFactorCodeRequestSchema body = new TwoFactorCodeRequestSchema.Builder()
                .to("+1invalid")
                .from(BW_NUMBER)
                .applicationId(VOICE_APPLICATION_ID)
                .scope("scope")
                .digits(6)
                .message("Your temporary {NAME} {SCOPE} code is {CODE}")
                .build();

        ErrorWithRequestException e = assertThrows(
                "ErrorWithRequest Exception not thrown",
                ErrorWithRequestException.class,
                ()->controller.createVoiceTwoFactor(ACCOUNT_ID, body)
                );
        assertEquals("Response Code not 400", 400, e.getResponseCode());
    }

    @Test
    public void testMfaVerify() throws Exception {

        java.util.Random wheelOfPhoneNumbers = new java.util.Random(System.currentTimeMillis());

        TwoFactorVerifyRequestSchema body = new TwoFactorVerifyRequestSchema.Builder()
                .to("+1000" + wheelOfPhoneNumbers.nextInt(10000000))
                .applicationId(VOICE_APPLICATION_ID)
                .scope("scope")
                .code("1234567")
                .expirationTimeInMinutes(3)
                .build();

        ApiResponse<TwoFactorVerifyCodeResponse> apiResponse = controller.createVerifyTwoFactor(ACCOUNT_ID, body);
        assertEquals("Response Code is not 200", 200, apiResponse.getStatusCode());

        TwoFactorVerifyCodeResponse response = apiResponse.getResult();
        assertFalse("Code should be invalid", response.getValid());
    }

    @Test
    public void testMfaVerifyInvalidPhoneNumber() throws Exception {
        TwoFactorVerifyRequestSchema body = new TwoFactorVerifyRequestSchema.Builder()
                .to("+1invalid")
                .applicationId(VOICE_APPLICATION_ID)
                .scope("scope")
                .code("123456")
                .expirationTimeInMinutes(3)
                .build();

        ErrorWithRequestException e = assertThrows(
                "ErrorWithRequest Exception not thrown",
                ErrorWithRequestException.class,
                ()->controller.createVerifyTwoFactor(ACCOUNT_ID, body)
                );
        assertEquals("Response Code not 400", 400, e.getResponseCode());
    }
}
