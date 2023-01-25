package org.openapitools.client.model.unit.bxml;

import org.openapitools.client.model.bxml.Root;
import org.openapitools.client.model.bxml.TerminalVerb;
import org.openapitools.client.model.bxml.Verb;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.Matchers.is;


public class TestBaseClasses {

    /**
     * Setting up Variables
     */
    ArrayList<Verb> nestedVerbs;
    Root root = new Root("TestRoot");
    Root root2 = new Root("TestRoot2", Arrays.asList(new Verb("TestVerb1", "test"), new Verb("TestVerb2")));
    Verb verb1 = new Verb("TestVerb1", "test");
    Verb verb2 = new Verb("TestVerb2");
    Verb verb3 = new Verb("TestVerb3");
    TerminalVerb terminalVerb = new TerminalVerb("TestTerminalVerb", "Terminal-Content");

    /**
     * 
     *
     * Unit tests for Root and Verb base classes
     *
     * @throws Exception if the test fails
     */

    @Test
    public void testRoot() throws Exception {
        root.addVerb(verb1);
        root.addVerb(verb2);
        String expectedBxml = "<?xml version='1.0' encoding='UTF-8'?><TestRoot><TestVerb1>test</TestVerb1><TestVerb2/></TestRoot>";
        String expectedBxml2 = "<?xml version='1.0' encoding='UTF-8'?><TestRoot2><TestVerb1>test</TestVerb1><TestVerb2/></TestRoot2>";

        assertThat(root.getVerb(0), instanceOf(Verb.class));
        assertThat(root.length(), is(2));
        assertThat(root.toBxml(), is(expectedBxml));
        assertThat(root2.length(), is(2));
        assertThat(root2.toBxml(), is(expectedBxml2));
    };

    @Test
    public void testSingleVerbSerialization() throws Exception {
        String expectedBxml = "<TestVerb3/>";


        assertThat(verb3, instanceOf(Verb.class));
        assertThat(verb3.length(), is(0));
        assertThat(verb3.toBxml(), is(expectedBxml));
    };

    @Test
    public void testAddingVerbsAndSerialization() throws Exception {
        verb3.addVerb(verb2);
        verb3.addVerb(verb1);
        String expectedBxml = "<TestVerb3><TestVerb2/><TestVerb1>test</TestVerb1></TestVerb3>";

        assertThat(verb3.getVerb(0), instanceOf(Verb.class));
        assertThat(verb3.length(), is(2));
        assertThat(verb3.toBxml(), is(expectedBxml));
    };

    @Test
    public void testAddingNestedVerbsSerialization() throws Exception {
        verb2.addVerb(verb1);
        verb3.addVerb(verb2);
        String expectedBxml = "<TestVerb3><TestVerb2><TestVerb1>test</TestVerb1></TestVerb2></TestVerb3>";

        assertThat(verb3.getVerb(0), instanceOf(Verb.class));
        assertThat(verb3.length(), is(1));
        assertThat(verb3.toBxml(), is(expectedBxml));
    };

    @Test
    public void testTerminalVerbSerialization() throws Exception {
        String expectedBxml = "<TestTerminalVerb>Terminal-Content</TestTerminalVerb>";

        assertThat(terminalVerb, instanceOf(TerminalVerb.class));
        assertThat(terminalVerb.length(), is(0));
        assertThat(terminalVerb.toBxml(), is(expectedBxml));
    };

    @Test
    public void testAddingVerbsToTerminalVerb() throws UnsupportedOperationException {
        TerminalVerb terminalVerb = new TerminalVerb("TestTerminalVerb");
        UnsupportedOperationException exception = Assertions.assertThrows(UnsupportedOperationException.class, () -> terminalVerb.addVerb(verb1));
        assertThat(exception, instanceOf(UnsupportedOperationException.class));
    };
};
