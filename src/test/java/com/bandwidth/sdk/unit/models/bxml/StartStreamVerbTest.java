/**
 * 
 * Unit tests for StartStream Verb class
 * 
 *
 * @throws JAXBException if the test fails
 */

package com.bandwidth.sdk.unit.models.bxml;

import com.bandwidth.sdk.model.CallDirectionEnum;
import com.bandwidth.sdk.model.bxml.Bxml;
import com.bandwidth.sdk.model.bxml.StartStream;
import com.bandwidth.sdk.model.bxml.StreamParam;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

public class StartStreamVerbTest {
        /**
         * Setting up Variables
         */
        StreamParam streamParam1 = StreamParam.builder()
                        .name("name1")
                        .value("value1")
                        .build();
        StreamParam streamParam2 = StreamParam.builder()
                        .name("name2")
                        .value("value2")
                        .build();
        StartStream startStream = StartStream.builder()
                        .name("stream1")
                        .mode("unidirectional")
                        .tracks(CallDirectionEnum.INBOUND)
                        .destination("testurl.com")
                        .streamEventUrl("eventurl.com")
                        .streamEventMethod("POST")
                        .username("user")
                        .password("pass")
                        .streamParams(List.of(streamParam1, streamParam2))
                        .build();

        @Test
        public void startStreamVerbWorks() throws JAXBException {
                JAXBContext jaxbContext = JAXBContext.newInstance(Bxml.class);
                String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><StartStream name=\"stream1\" mode=\"unidirectional\" tracks=\"INBOUND\" destination=\"testurl.com\" streamEventUrl=\"eventurl.com\" streamEventMethod=\"POST\" username=\"user\" password=\"pass\"><StreamParam name=\"name1\" value=\"value1\"/><StreamParam name=\"name2\" value=\"value2\"/></StartStream></Bxml>";

                assertThat(new Bxml().with(startStream).toBxml(jaxbContext), is(expectedBxml));
        }
};
