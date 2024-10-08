/**
 * 
 * Unit tests for Gather Verb class
 * 
 *
 * @throws JAXBException if the test fails
 */

package com.bandwidth.sdk.unit.models.bxml;

import com.bandwidth.sdk.model.bxml.Bxml;
import com.bandwidth.sdk.model.bxml.Gather;
import com.bandwidth.sdk.model.bxml.SpeakSentence;
import com.bandwidth.sdk.model.bxml.PlayAudio;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

public class GatherVerbTest {
        /**
         * Setting up Variables
         */
        SpeakSentence speakSentence = new SpeakSentence(
                        "Hello. Your number is <say-as interpret-as=\"telephone\">asdf</say-as>, lets play a game. What is 10 + 3. Press the pound key when finished.");
        PlayAudio playAudio = PlayAudio.builder()
                        .audioUri("test.com")
                        .build();
        Gather gather = Gather.builder()
                        .gatherUrl("test.com")
                        .gatherMethod("POST")
                        .gatherFallbackUrl("fallback-test.com")
                        .gatherFallbackMethod("GET")
                        .username("user")
                        .password("pass")
                        .fallbackUsername("user")
                        .fallbackPassword("pass")
                        .tag("tag")
                        .terminatingDigits("2")
                        .maxDigits(5)
                        .interDigitTimeout(1d)
                        .firstDigitTimeout(3d)
                        .repeatCount(2)
                        .children(List.of(playAudio, speakSentence))
                        .build();

        @Test
        public void gatherVerbWorks() throws JAXBException {
                JAXBContext jaxbContext = JAXBContext.newInstance(Bxml.class);
                String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><Gather gatherUrl=\"test.com\" gatherFallbackUrl=\"fallback-test.com\" gatherMethod=\"POST\" gatherFallbackMethod=\"GET\" username=\"user\" password=\"pass\" fallbackUsername=\"user\" fallbackPassword=\"pass\" tag=\"tag\" terminatingDigits=\"2\" maxDigits=\"5\" firstDigitTimeout=\"3.0\" interDigitTimeout=\"1.0\" repeatCount=\"2\"><PlayAudio>test.com</PlayAudio><SpeakSentence gender=\"female\" locale=\"en_US\">Hello. Your number is &lt;say-as interpret-as=\"telephone\"&gt;asdf&lt;/say-as&gt;, lets play a game. What is 10 + 3. Press the pound key when finished.</SpeakSentence></Gather></Bxml>";

                assertThat(new Bxml().with(gather).toBxml(jaxbContext), is(expectedBxml));
        }
};
