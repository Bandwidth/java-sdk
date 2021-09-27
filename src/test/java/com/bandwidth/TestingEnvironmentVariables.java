package com.bandwidth;

public final class TestingEnvironmentVariables {

    static final String USERNAME = System.getenv("BW_USERNAME");
    static final String PASSWORD = System.getenv("BW_PASSWORD");
    static final String ACCOUNT_ID = System.getenv("BW_ACCOUNT_ID");
    static final String USER_NUMBER = System.getenv("USER_NUMBER");
    static final String BW_NUMBER = System.getenv("BW_NUMBER");
    static final String MESSAGING_APPLICATION_ID = System.getenv("BW_MESSAGING_APPLICATION_ID");
    static final String VOICE_APPLICATION_ID = System.getenv("BW_VOICE_APPLICATION_ID");
    static final String BASE_CALLBACK_URL = System.getenv("BASE_CALLBACK_URL");

    /* This is a utility class that shouldn't be instantiated */
    private TestingEnvironmentVariables(){}
}
