
package com.bandwidth.voice.bxml.verbs;

import lombok.Builder;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

@Builder
@XmlRootElement(name = Bxml.TYPE_NAME)
public class Bxml {
    public static final String TYPE_NAME = "Bxml";

    private static JAXBContext jaxbContext;

    @XmlElements({
            @XmlElement(name = Gather.TYPE_NAME, type = Gather.class),
            @XmlElement(name = Hangup.TYPE_NAME, type = Hangup.class),
            @XmlElement(name = Redirect.TYPE_NAME, type = Redirect.class),
            @XmlElement(name = PlayAudio.TYPE_NAME, type = PlayAudio.class),
            @XmlElement(name = SpeakSentence.TYPE_NAME, type = SpeakSentence.class),
            @XmlElement(name = Transfer.TYPE_NAME, type = Transfer.class),
            @XmlElement(name = Pause.TYPE_NAME, type = Pause.class),
            @XmlElement(name = Forward.TYPE_NAME, type = Forward.class),
            @XmlElement(name = SendDtmf.TYPE_NAME, type = SendDtmf.class),
            @XmlElement(name = Record.TYPE_NAME, type = Record.class),
            @XmlElement(name = StartRecording.TYPE_NAME, type = StartRecording.class),
            @XmlElement(name = StopRecording.TYPE_NAME, type = StopRecording.class),
            @XmlElement(name = PauseRecording.TYPE_NAME, type = PauseRecording.class),
            @XmlElement(name = ResumeRecording.TYPE_NAME, type = ResumeRecording.class),
            @XmlElement(name = Conference.TYPE_NAME, type = Conference.class),
            @XmlElement(name = Bridge.TYPE_NAME, type = Bridge.class),
            @XmlElement(name = Ring.TYPE_NAME, type = Ring.class),
            @XmlElement(name = StartGather.TYPE_NAME, type = StartGather.class),
            @XmlElement(name = StopGather.TYPE_NAME, type = StopGather.class),
            @XmlElement(name = Tag.TYPE_NAME, type = Tag.class),
            @XmlElement(name = SipUri.TYPE_NAME, type = SipUri.class),            
            @XmlElement(name = StartStream.TYPE_NAME, type = StartStream.class),            
            @XmlElement(name = StopStream.TYPE_NAME, type = StopStream.class),            
      	@XmlElement(name = StreamParam.TYPE_NAME, type = StreamParam.class),            
            @XmlElement(name = StartTranscription.TYPE_NAME, type = StartTranscription.class),            
            @XmlElement(name = StopTranscription.TYPE_NAME, type = StopTranscription.class),            
            @XmlElement(name = CustomParam.TYPE_NAME, type = CustomParam.class),            

    })
    private final List<Verb> verbs = new ArrayList<>();

    private static final Pattern XML_PATTERN = Pattern.compile("&lt;([a-zA-Z//].*?)&gt;");

    private static final Pattern SPEAK_SENTENCE_PATTERN = Pattern.compile("<SpeakSentence.*?>(.*?)<\\/SpeakSentence>");



    public Bxml(){
    }




    /**
     * Returns list of verbs in this Bxml
     */
    public List<Verb> getVerbs() {
        return verbs;
    }

    /**
     * Adds a Verb to the list of Verbs in this Bxml
     */
    public Bxml add(Verb verb) {
        this.verbs.add(verb);
        return this;
    }

    /**
     * Adds Verbs to the list of Verbs in this Bxml
     */
    public Bxml addAll(Verb... verbs) {
        this.verbs.addAll(Arrays.asList(verbs));
        return this;
    }

    /**
     * Convert this Bxml and its verbs into their corresponding XML and get the result as a String
     *
     */
    public String toBXML() {
        OutputStream outputStream = new ByteArrayOutputStream();
        try {
            getMarshaller().marshal(this, outputStream);
        } catch (JAXBException e) {
            throw new RuntimeException("Error creating BXML marshaller", e);
        }

        Matcher matcherSpeakSentence = SPEAK_SENTENCE_PATTERN.matcher(outputStream.toString());

        StringBuffer sb = new StringBuffer();

        while(matcherSpeakSentence.find()){
            Matcher matcher = XML_PATTERN.matcher(matcherSpeakSentence.group());
            String replaced = matcher.replaceAll("<$1>").replaceAll("\\?", "\\?");
            matcherSpeakSentence.appendReplacement(sb, replaced);
        }

        matcherSpeakSentence.appendTail(sb);

        return sb.toString();


    }

    private Marshaller getMarshaller() {
        try {
            // This isn't thread-unsafe, it's just expensive to create. So no locking necessary.
            if (jaxbContext == null) {
                jaxbContext = JAXBContext.newInstance(Bxml.class);
            }
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty("com.sun.xml.bind.xmlHeaders", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);

            return marshaller;
        } catch (JAXBException e) {
            throw new RuntimeException("Error creating JAXB context for BXML serialization", e);
        }
    }
}
