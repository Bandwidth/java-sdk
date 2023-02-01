/**
 * Unit tests for Response Verb Class
 *
 * @throws JAXBException if the test fails
 */

 package org.openapitools.client.model.unit.bxml;

 import org.openapitools.client.model.bxml.Response;
 import org.openapitools.client.model.bxml.Forward;
 import org.openapitools.client.model.bxml.Tag;
 import org.openapitools.client.model.bxml.Pause;
 import org.openapitools.client.model.bxml.SendDtmf;
 import org.openapitools.client.model.DiversionReason;
 
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
 
     public JAXBContext jaxbContext;
 
     @Test
     public void toBxmlWorks() throws JAXBException {
         jaxbContext = JAXBContext.newInstance(Response.class);
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
 
     @Test
     public void toBxmlWithDiversionWorks() throws JAXBException {
         jaxbContext = JAXBContext.newInstance(Response.class);
         String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Response><Forward callTimeout=\"300.0\" diversionTreatment=\"NONE\" diversionReason=\"DO_NOT_DISTURB\"/></Response>";
         Response response = new Response().with(Forward.builder()
                 .diversionReason(DiversionReason.DO_NOT_DISTURB)
                 .build());
         assertThat(response.toBxml(jaxbContext), is(expectedBxml));
     }
 
 };
 