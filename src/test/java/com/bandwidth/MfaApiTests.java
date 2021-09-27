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
        TwoFactorCodeRequestSchema body = new TwoFactorCodeRequestSchema();
        body.setTo(USER_NUMBER);
        body.setFrom(BW_NUMBER);
        body.setApplicationId(MESSAGING_APPLICATION_ID);
        body.setScope("scope");
        body.setDigits(6);
        body.setMessage("Your temporary {NAME} {SCOPE} code is {CODE}");

        controller.createMessagingTwoFactor(ACCOUNT_ID, body);
    }

    @Test
    public void testMfaVoice() throws Exception {
        TwoFactorCodeRequestSchema body = new TwoFactorCodeRequestSchema();
        body.setTo(USER_NUMBER);
        body.setFrom(BW_NUMBER);
        body.setApplicationId(VOICE_APPLICATION_ID);
        body.setScope("scope");
        body.setDigits(6);
        body.setMessage("Your temporary {NAME} {SCOPE} code is {CODE}");

        controller.createVoiceTwoFactor(ACCOUNT_ID, body);
    }

    @Test(expected = ErrorWithRequestException.class)
    public void testMfaMessagingInvalidPhoneNumber() throws Exception {
        TwoFactorCodeRequestSchema body = new TwoFactorCodeRequestSchema();
        body.setTo("+1invalid");
        body.setFrom(BW_NUMBER);
        body.setApplicationId(MESSAGING_APPLICATION_ID);
        body.setScope("scope");
        body.setDigits(6);
        body.setMessage("Your temporary {NAME} {SCOPE} code is {CODE}");

        controller.createMessagingTwoFactor(ACCOUNT_ID, body);
    }

    @Test(expected = ErrorWithRequestException.class)
    public void testMfaVoiceInvalidPhoneNumber() throws Exception {
        TwoFactorCodeRequestSchema body = new TwoFactorCodeRequestSchema();
        body.setTo("+1invalid");
        body.setFrom(BW_NUMBER);
        body.setApplicationId(VOICE_APPLICATION_ID);
        body.setScope("scope");
        body.setDigits(6);
        body.setMessage("Your temporary {NAME} {SCOPE} code is {CODE}");

        controller.createVoiceTwoFactor(ACCOUNT_ID, body);
    }

    @Test
    public void testMfaVerify() throws Exception {

        TwoFactorVerifyRequestSchema body = new TwoFactorVerifyRequestSchema();
        body.setTo(USER_NUMBER);
        body.setApplicationId(VOICE_APPLICATION_ID);
        body.setScope("scope");
        body.setCode("1234567");
        body.setExpirationTimeInMinutes(3);

        controller.createVerifyTwoFactor(ACCOUNT_ID, body);
    }

    @Test(expected = ErrorWithRequestException.class)
    public void testMfaVerifyInvalidPhoneNumber() throws Exception {
        TwoFactorVerifyRequestSchema body = new TwoFactorVerifyRequestSchema();
        body.setTo("+1invalid");
        body.setApplicationId(VOICE_APPLICATION_ID);
        body.setScope("scope");
        body.setCode("123456");
        body.setExpirationTimeInMinutes(3);

        controller.createVerifyTwoFactor(ACCOUNT_ID, body);
    }
}
