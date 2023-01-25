package org.openapitools.client.model.unit.bxml;

import org.openapitools.client.model.bxml.Verb;
import org.openapitools.client.model.bxml.verbs.Tag;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.Matchers.is;


public class TagVerbTest {

    /**
     * Setting up Variables
     */

    Tag tagVerb = new Tag("Tag Test Content");
    Verb verb = new Verb("TestVerb", "test");

    /**
     * 
     *
     * Unit tests for Tag Verb class
     *
     * @throws Exception if the test fails
     */

    @Test
    public void testTagVerbSerialization() throws Exception {
        String expectedBxml = "<Tag>Tag Test Content</Tag>";

        assertThat(tagVerb, instanceOf(Tag.class));
        assertThat(tagVerb.toBxml(), is(expectedBxml));
    };

    @Test
    public void testAddingVerbsToTerminalVerb() throws UnsupportedOperationException {
        UnsupportedOperationException exception = Assertions.assertThrows(UnsupportedOperationException.class, () -> tagVerb.addVerb(verb));
        assertThat(exception, instanceOf(UnsupportedOperationException.class));
    };
};
