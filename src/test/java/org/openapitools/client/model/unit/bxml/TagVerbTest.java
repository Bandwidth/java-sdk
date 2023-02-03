/**
 * 
 * Unit tests for Tag Verb class
 *
 * @throws JAXBException if the test fails
 */

 package org.openapitools.client.model.unit.bxml;

 import org.openapitools.client.model.bxml.Bxml;
 import org.openapitools.client.model.bxml.Tag;
 
 import jakarta.xml.bind.JAXBContext;
 import jakarta.xml.bind.JAXBException;
 
 import org.junit.Test;
 
 import static org.hamcrest.MatcherAssert.assertThat;
 import static org.hamcrest.Matchers.is;
 public class TagVerbTest {
 
     @Test
     public void tagVerbWorks() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Bxml.class);
        String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><Tag>Tag Test Content</Tag></Bxml>";

        assertThat(new Bxml().with(new Tag("Tag Test Content")).toBxml(jaxbContext), is(expectedBxml));
     };
 };
 