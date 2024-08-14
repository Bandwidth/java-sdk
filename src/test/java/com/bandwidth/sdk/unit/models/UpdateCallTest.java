/*
 * Bandwidth
 * Bandwidth's Communication APIs
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: letstalk@bandwidth.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.bandwidth.sdk.unit.models;

import org.junit.jupiter.api.Test;

import java.net.URI;
import com.bandwidth.sdk.model.UpdateCall;
import com.bandwidth.sdk.model.CallStateEnum;
import com.bandwidth.sdk.model.RedirectMethodEnum;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Model tests for UpdateCall
 */
public class UpdateCallTest {
    private final UpdateCall model = new UpdateCall()
            .state(CallStateEnum.COMPLETED)
            .redirectUrl(URI.create("http://example.com"))
            .redirectMethod(RedirectMethodEnum.GET)
            .username("username")
            .password("password")
            .redirectFallbackUrl(URI.create("http://example.com"))
            .redirectFallbackMethod(RedirectMethodEnum.GET)
            .fallbackUsername("fallbackUsername")
            .fallbackPassword("fallbackPassword")
            .tag("tag");

    /**
     * Model tests for UpdateCall
     */
    @Test
    public void testUpdateCall() {
        assertThat(model, instanceOf(UpdateCall.class));
    }

    /**
     * Test the property 'state'
     */
    @Test
    public void stateTest() {
        assertThat(model.getState(), instanceOf(CallStateEnum.class));
    }

    /**
     * Test the property 'redirectUrl'
     */
    @Test
    public void redirectUrlTest() {
        assertThat(model.getRedirectUrl(), instanceOf(URI.class));
    }

    /**
     * Test the property 'redirectMethod'
     */
    @Test
    public void redirectMethodTest() {
        assertThat(model.getRedirectMethod(), instanceOf(RedirectMethodEnum.class));
    }

    /**
     * Test the property 'username'
     */
    @Test
    public void usernameTest() {
        assertThat(model.getUsername(), instanceOf(String.class));
    }

    /**
     * Test the property 'password'
     */
    @Test
    public void passwordTest() {
        assertThat(model.getPassword(), instanceOf(String.class));
    }

    /**
     * Test the property 'redirectFallbackUrl'
     */
    @Test
    public void redirectFallbackUrlTest() {
        assertThat(model.getRedirectFallbackUrl(), instanceOf(URI.class));
    }

    /**
     * Test the property 'redirectFallbackMethod'
     */
    @Test
    public void redirectFallbackMethodTest() {
        assertThat(model.getRedirectFallbackMethod(), instanceOf(RedirectMethodEnum.class));
    }

    /**
     * Test the property 'fallbackUsername'
     */
    @Test
    public void fallbackUsernameTest() {
        assertThat(model.getFallbackUsername(), instanceOf(String.class));
    }

    /**
     * Test the property 'fallbackPassword'
     */
    @Test
    public void fallbackPasswordTest() {
        assertThat(model.getFallbackPassword(), instanceOf(String.class));
    }

    /**
     * Test the property 'tag'
     */
    @Test
    public void tagTest() {
        assertThat(model.getTag(), instanceOf(String.class));
    }

}