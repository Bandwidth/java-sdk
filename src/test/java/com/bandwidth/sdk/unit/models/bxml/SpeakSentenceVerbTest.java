/**
 * 
 * Unit tests for SpeakSentence Verb class
 * 
 *
 * @throws JAXBException if the test fails
 */

package com.bandwidth.sdk.model.unit.bxml;

import com.bandwidth.sdk.model.bxml.Bxml;
import com.bandwidth.sdk.model.bxml.SpeakSentence;
import com.bandwidth.sdk.model.bxml.utils.TtsGender;
import com.bandwidth.sdk.model.bxml.utils.TtsLocale;


import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
 
import org.junit.Test;
 
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

public class SpeakSentenceVerbTest {
    /**
    * Setting up Variables
    */
    String sentence = "Hello. Your number is <say-as interpret-as=\"telephone\">asdf</say-as>, lets play a game. What is 10 + 3. Press the pound key when finished.";

    SpeakSentence speakSentence = new SpeakSentence().builder()
                                                    .innerTags(List.of(sentence))
                                                    .locale(TtsLocale.EN_UK)
                                                    .gender(TtsGender.FEMALE)
                                                    .build();


    @Test
    public void speakSentenceVerbWorks() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Bxml.class);
        String expectedBxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Bxml><SpeakSentence gender=\"female\" locale=\"en_UK\">Hello. Your number is &lt;say-as interpret-as=\"telephone\"&gt;asdf&lt;/say-as&gt;, lets play a game. What is 10 + 3. Press the pound key when finished.</SpeakSentence></Bxml>";

        assertThat(new Bxml().with(speakSentence).toBxml(jaxbContext), is(expectedBxml));
    }
};
