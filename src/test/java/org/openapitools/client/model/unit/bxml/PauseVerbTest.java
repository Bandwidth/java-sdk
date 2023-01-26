package org.openapitools.client.model.unit.bxml;

import org.openapitools.client.model.bxml.Verb;
import org.openapitools.client.model.bxml.verbs.Pause;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.Matchers.is;


public class PauseVerbTest {

    /**
     * Setting up Variables
     */

    Pause pause = new Pause("10");
    Pause pause2 = new Pause();
    Verb verb = new Verb("TestVerb", "test");

    /**
     * 
     *
     * Unit tests for Pause Verb class
     *
     * @throws Exception if the test fails
     */

    @Test
    public void testPauseVerbSerialization() throws Exception {
        String expectedBxml = "<Pause duration=\"10\"/>";
        pause2.setDuration("10");

        assertThat(pause, instanceOf(Pause.class));
        assertThat(pause.toBxml(), is(expectedBxml));
        assertThat(pause2, instanceOf(Pause.class));
        assertThat(pause2.toBxml(), is(expectedBxml));
    };

    @Test
    public void testAddingVerbsToRingVerb() throws UnsupportedOperationException {
        UnsupportedOperationException exception = Assertions.assertThrows(UnsupportedOperationException.class, () -> pause.addVerb(verb));
        assertThat(exception, instanceOf(UnsupportedOperationException.class));
    };
};
