package org.openapitools.client.model.unit.bxml;

import org.openapitools.client.model.bxml.Verb;
import org.openapitools.client.model.bxml.verbs.Hangup;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.Matchers.is;


public class HangupVerbTest {

    /**
     * Setting up Variables
     */

    Hangup hangupVerb = new Hangup();
    Verb verb = new Verb("TestVerb", "test");

    /**
     * 
     *
     * Unit tests for Hangup Verb class
     *
     * @throws Exception if the test fails
     */

    @Test
    public void testHangupVerbSerialization() throws Exception {
        String expectedBxml = "<Hangup/>";

        assertThat(hangupVerb, instanceOf(Hangup.class));
        assertThat(hangupVerb.toBxml(), is(expectedBxml));
    };

    @Test
    public void testAddingVerbsToHangup() throws UnsupportedOperationException {
        UnsupportedOperationException exception = Assertions.assertThrows(UnsupportedOperationException.class, () -> hangupVerb.addVerb(verb));
        assertThat(exception, instanceOf(UnsupportedOperationException.class));
    };
};
