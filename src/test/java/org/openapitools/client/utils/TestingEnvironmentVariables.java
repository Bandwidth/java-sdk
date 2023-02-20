package org.openapitools.client.utils;

public final class TestingEnvironmentVariables {
    public static final String BW_USERNAME = System.getenv("BW_USERNAME");
    public static final String BW_PASSWORD = System.getenv("BW_PASSWORD");
    public static final String BW_ACCOUNT_ID = System.getenv("BW_ACCOUNT_ID");
    public static final String BW_MESSAGING_APPLICATION_ID = System.getenv("BW_MESSAGING_APPLICATION_ID");
    public static final String BW_VOICE_APPLICATION_ID = System.getenv("BW_VOICE_APPLICATION_ID");
    public static final String BASE_CALLBACK_URL = System.getenv("BASE_CALLBACK_URL");
    public static final String BW_NUMBER_PROVIDER = System.getenv("BW_NUMBER_PROVIDER");
    public static final String BW_NUMBER = System.getenv("BW_NUMBER");
    public static final String VZW_NUMBER = System.getenv("VZW_NUMBER");
    public static final String ATT_NUMBER = System.getenv("ATT_NUMBER");
    public static final String T_MOBILE_NUMBER = System.getenv("T_MOBILE_NUMBER");
    public static final String USER_NUMBER = System.getenv("USER_NUMBER");
    public static final String FORBIDDEN_USERNAME = System.getenv("BW_USERNAME_FORBIDDEN");
    public static final String FORBIDDEN_PASSWORD = System.getenv("BW_PASSWORD_FORBIDDEN");
    public static final String MANTECA_ACTIVE_NUMBER = System.getenv("MANTECA_ACTIVE_NUMBER");
    public static final String MANTECA_IDLE_NUMBER = System.getenv("MANTECA_IDLE_NUMBER");
    public static final String MANTECA_BASE_URL = System.getenv("MANTECA_BASE_URL");
    public static final String MANTECA_STATUS_URL = MANTECA_BASE_URL + "/tests/";
    public static final String MANTECA_APPLICATION_ID = System.getenv("MANTECA_APPLICATION_ID");
    public static final String JAVA_VERSION = System.getenv("JAVA_VERSION");
    public static final String OPERATING_SYSTEM = System.getenv("OPERATING_SYSTEM");
    public static final String DISTRIBUTION = System.getenv("DISTRIBUTION");
    public static final String RUNNER_OS = System.getenv("RUNNER_OS");
    public static final String DISTRIBUTION = System.getenv("DISTRIBUTION");
}
