package org.openapitools.client.model.unit.bxml;

import org.openapitools.client.model.bxml.Verb;
import org.openapitools.client.model.bxml.Response;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.Matchers.is;


public class ResponseVerbTest {

    /**
     * Setting up Variables
     */
    ArrayList<Verb> nestedVerbs;
    Response response = new Response();
    Response response2 = new Response(Arrays.asList(new Verb("TestVerb1", "test"), new Verb("TestVerb2")));
    Verb verb1 = new Verb("TestVerb1", "test");
    Verb verb2 = new Verb("TestVerb2");
    Verb verb3 = new Verb("TestVerb3");

    /**
     * 
     *
     * Unit tests for Response Root Verb Class
     *
     * @throws Exception if the test fails
     */

    @Test
    public void testResponse() throws Exception {
        response.addVerb(verb1);
        response.addVerb(verb2);
        String expectedBxml = "<?xml version='1.0' encoding='UTF-8'?><Response><TestVerb1>test</TestVerb1><TestVerb2/></Response>";

        assertThat(response.getVerb(0), instanceOf(Verb.class));
        assertThat(response.length(), is(2));
        assertThat(response.toBxml(), is(expectedBxml));
        assertThat(response2.length(), is(2));
        assertThat(response2.toBxml(), is(expectedBxml));
    };
};
