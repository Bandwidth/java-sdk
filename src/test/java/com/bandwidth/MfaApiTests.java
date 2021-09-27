package com.bandwidth;

import com.bandwidth.multifactorauth.controllers.MFAController;

import com.bandwidth.multifactorauth.exceptions.ErrorWithRequestException;
import com.bandwidth.multifactorauth.models.TwoFactorCodeRequestSchema;
import com.bandwidth.multifactorauth.models.TwoFactorVerifyCodeResponse;
import com.bandwidth.multifactorauth.models.TwoFactorVerifyRequestSchema;
import com.bandwidth.multifactorauth.models.TwoFactorVoiceResponse;
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

        controller.createMessagingTwoFactor(ACCOUNT_ID, body);
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

        controller.createVoiceTwoFactor(ACCOUNT_ID, body);
    }

    @Test(expected = ErrorWithRequestException.class)
    public void testMfaMessagingInvalidPhoneNumber() throws Exception {
        TwoFactorCodeRequestSchema body = new TwoFactorCodeRequestSchema.Builder()
                .to("+1invalid")
                .from(BW_NUMBER)
                .applicationId(MESSAGING_APPLICATION_ID)
                .scope("scope")
                .digits(6)
                .message("Your temporary {NAME} {SCOPE} code is {CODE}")
                .build();

        controller.createMessagingTwoFactor(ACCOUNT_ID, body);
    }

    @Test(expected = ErrorWithRequestException.class)
    public void testMfaVoiceInvalidPhoneNumber() throws Exception {
        TwoFactorCodeRequestSchema body = new TwoFactorCodeRequestSchema.Builder()
                .to("+1invalid")
                .from(BW_NUMBER)
                .applicationId(VOICE_APPLICATION_ID)
                .scope("scope")
                .digits(6)
                .message("Your temporary {NAME} {SCOPE} code is {CODE}")
                .build();

        controller.createVoiceTwoFactor(ACCOUNT_ID, body);
    }

    @Test
    public void testMfaVerify() throws Exception {

        TwoFactorVerifyRequestSchema body = new TwoFactorVerifyRequestSchema.Builder()
                .to(USER_NUMBER)
                .applicationId(VOICE_APPLICATION_ID)
                .scope("scope")
                .code("1234567")
                .expirationTimeInMinutes(3)
                .build();

        controller.createVerifyTwoFactor(ACCOUNT_ID, body);
    }

    @Test(expected = ErrorWithRequestException.class)
    public void testMfaVerifyInvalidPhoneNumber() throws Exception {
        TwoFactorVerifyRequestSchema body = new TwoFactorVerifyRequestSchema.Builder()
                .to("+1invalid")
                .applicationId(VOICE_APPLICATION_ID)
                .scope("scope")
                .code("123456")
                .expirationTimeInMinutes(3)
                .build();

        controller.createVerifyTwoFactor(ACCOUNT_ID, body);
    }
}
