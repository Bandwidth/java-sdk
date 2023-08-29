/**
 * Unit tests for Response Verb Class
 *
 * @throws JAXBException if the test fails
 */

 package com.bandwidth.sdk.model.unit.bxml;

 import com.bandwidth.sdk.model.bxml.Response;
 import com.bandwidth.sdk.model.bxml.Forward;
 import com.bandwidth.sdk.model.bxml.Tag;
 import com.bandwidth.sdk.model.bxml.Pause;
 import com.bandwidth.sdk.model.bxml.SendDtmf;
 import com.bandwidth.sdk.model.DiversionReason;
 
 import jakarta.xml.bind.JAXBContext;
 import jakarta.xml.bind.JAXBException;
 
 import org.junit.Test;
 
 import static org.hamcrest.MatcherAssert.assertThat;
 import static org.hamcrest.Matchers.is;
 import static org.hamcrest.Matchers.contains;
 import static org.hamcrest.Matchers.containsString;;
 public class ResponseVerbTest {
 
     /**
      * Setting up Variables
      */
 
     Response response = new Response().with(new Tag("Test"));
     Tag tag = new Tag("Test Tag Content");
     Response bxml2 = new Response().with(tag);
 
     @Test
     public void toBxmlWorks() throws JAXBException {
         JAXBContext jaxbContext = JAXBContext.newInstance(Response.class);
         Response response = new Response().with(new Tag("Test"));
         Tag tag = new Tag("Test Tag Content");
         Response response2 = new Response().with(tag);
         String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Response><Tag>Test</Tag></Response>";
         String expectedBxml2 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Response><Tag>Test Tag Content</Tag></Response>";
 
         assertThat(response.toBxml(jaxbContext), is(expectedBxml));
         assertThat(response2.toBxml(jaxbContext), is(expectedBxml2));
     };
 
     @Test
     public void withWorks() {
         Pause pause = new Pause(2d);
         Response response = new Response().with(pause);
         assertThat(response.getVerbs(), contains(pause));
     }
 
     @Test
     public void withVerbsWorks() {
         Pause pause = new Pause(2d);
         SendDtmf sendDtmf = new SendDtmf("1");
         Response response = new Response().withVerbs(pause, sendDtmf);
         assertThat(response.getVerbs().get(0), is(pause));
         assertThat(response.getVerbs().get(1), is(sendDtmf));
     }
 };
