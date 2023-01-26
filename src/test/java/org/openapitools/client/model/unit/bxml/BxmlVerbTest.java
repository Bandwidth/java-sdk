package org.openapitools.client.model.unit.bxml;

import org.openapitools.client.model.bxml.Verb;
import org.openapitools.client.model.bxml.Bxml;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.Matchers.is;


public class BxmlVerbTest {

    /**
     * Setting up Variables
     */
    ArrayList<Verb> nestedVerbs;
    Bxml bxml = new Bxml();
    Bxml bxml2 = new Bxml(Arrays.asList(new Verb("TestVerb1", "test"), new Verb("TestVerb2")));
    Verb verb1 = new Verb("TestVerb1", "test");
    Verb verb2 = new Verb("TestVerb2");
    Verb verb3 = new Verb("TestVerb3");

    /**
     * 
     *
     * Unit tests for Bxml Root Verb Class
     *
     * @throws Exception if the test fails
     */

    @Test
    public void testBxml() throws Exception {
        bxml.addVerb(verb1);
        bxml.addVerb(verb2);
        String expectedBxml = "<?xml version='1.0' encoding='UTF-8'?><Bxml><TestVerb1>test</TestVerb1><TestVerb2/></Bxml>";

        assertThat(bxml.getVerb(0), instanceOf(Verb.class));
        assertThat(bxml.length(), is(2));
        assertThat(bxml.toBxml(), is(expectedBxml));
        assertThat(bxml2.length(), is(2));
        assertThat(bxml2.toBxml(), is(expectedBxml));
    };
};
