package org.openapitools.client.model.unit.bxml;

import org.openapitools.client.model.bxml.Verb;
import org.openapitools.client.model.bxml.verbs.Ring;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.Matchers.is;


public class RingVerbTest {

    /**
     * Setting up Variables
     */

    Ring ringVerb = new Ring("10", "false");
    Verb verb = new Verb("TestVerb", "test");

    /**
     * 
     *
     * Unit tests for Ring Verb class
     *
     * @throws Exception if the test fails
     */

    @Test
    public void testRingVerbSerialization() throws Exception {
        String expectedBxml = "<Ring duration=\"10\" answerCall=\"false\"/>";
        System.out.println(expectedBxml);
        System.out.println(ringVerb.toBxml());

        assertThat(ringVerb, instanceOf(Ring.class));
        assertThat(ringVerb.toBxml(), is(expectedBxml));
    };

    @Test
    public void testAddingVerbsToRingVerb() throws UnsupportedOperationException {
        UnsupportedOperationException exception = Assertions.assertThrows(UnsupportedOperationException.class, () -> ringVerb.addVerb(verb));
        assertThat(exception, instanceOf(UnsupportedOperationException.class));
    };
};
