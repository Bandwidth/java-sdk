/*
 * MessagingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bandwidth.messaging.controllers;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.bandwidth.messaging.models.*;
import com.bandwidth.messaging.exceptions.*;
import com.bandwidth.messaging.APIHelper;
import com.bandwidth.messaging.Configuration;
import com.bandwidth.messaging.testing.TestHelper;
import com.bandwidth.messaging.controllers.APIController;

import com.fasterxml.jackson.core.type.TypeReference;

public class APIControllerTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static APIController controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getClient();
    }

    /**
     * Tear down test class
     * @throws IOException
     */
    @AfterClass
    public static void tearDownClass() throws IOException {
        controller = null;
    }

    /**
     * getMessage
     * @throws Throwable
     */
    @Test
    public void testTestGetMessage() throws Throwable {

        // Set callback and perform API call
        controller.setHttpCallBack(httpResponse);
        try {
        controller.getMessage();
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

    }

}
