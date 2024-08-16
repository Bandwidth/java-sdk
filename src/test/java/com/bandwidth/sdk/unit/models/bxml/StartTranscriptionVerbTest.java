/**
 * 
 * Unit tests for StartTranscription Verb class
 * 
 *
 * @throws JAXBException if the test fails
 */

package com.bandwidth.sdk.unit.models.bxml;

import com.bandwidth.sdk.model.CallDirectionEnum;
import com.bandwidth.sdk.model.bxml.Bxml;
import com.bandwidth.sdk.model.bxml.StartTranscription;
import com.bandwidth.sdk.model.bxml.CustomParam;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

public class StartTranscriptionVerbTest {
        /**
         * Setting up Variables
         */
        CustomParam customParam1 = CustomParam.builder()
                        .name("name1")
                        .value("value1")
                        .build();
        CustomParam customParam2 = CustomParam.builder()
                        .name("name2")
                        .value("value2")
                        .build();
        StartTranscription startTranscription = StartTranscription.builder()
                        .name("test_transcription")
                        .tracks(CallDirectionEnum.INBOUND)
                        .destination("testurl.com")
                        .transcriptionEventUrl("eventurl.com")
                        .transcriptionEventMethod("POST")
                        .username("user")
                        .password("pass")
                        .customParams(List.of(customParam1, customParam2))
                        .build();

        @Test
        public void startTranscriptionVerbWorks() throws JAXBException {
                JAXBContext jaxbContext = JAXBContext.newInstance(Bxml.class);
                String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><StartTranscription name=\"test_transcription\" tracks=\"INBOUND\" destination=\"testurl.com\" transcriptionEventUrl=\"eventurl.com\" transcriptionEventMethod=\"POST\" username=\"user\" password=\"pass\"><CustomParam name=\"name1\" value=\"value1\"/><CustomParam name=\"name2\" value=\"value2\"/></StartTranscription></Bxml>";

                assertThat(new Bxml().with(startTranscription).toBxml(jaxbContext), is(expectedBxml));
        }
};
