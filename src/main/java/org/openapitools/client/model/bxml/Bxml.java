/**
 * The root {@code <Bxml>} verb. Other verbs get added to BXML and then the JAXB marshaller using the toBxml() method converts this to valid BXML.
 * 
 */

package org.openapitools.client.model.bxml;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@XmlRootElement(name = "Bxml")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@EqualsAndHashCode
public class Bxml {

    @XmlElements({
            @XmlElement(name = Bridge.TYPE_NAME, type = Bridge.class),
            @XmlElement(name = Conference.TYPE_NAME, type = Conference.class),
            @XmlElement(name = Forward.TYPE_NAME, type = Forward.class),
            @XmlElement(name = Gather.TYPE_NAME, type = Gather.class),
            @XmlElement(name = Hangup.TYPE_NAME, type = Hangup.class),
            @XmlElement(name = Pause.TYPE_NAME, type = Pause.class),
            @XmlElement(name = PauseRecording.TYPE_NAME, type = PauseRecording.class),
            @XmlElement(name = PlayAudio.TYPE_NAME, type = PlayAudio.class),
            @XmlElement(name = Record.TYPE_NAME, type = Record.class),
            @XmlElement(name = Redirect.TYPE_NAME, type = Redirect.class),
            @XmlElement(name = ResumeRecording.TYPE_NAME, type = ResumeRecording.class),
            @XmlElement(name = Ring.TYPE_NAME, type = Ring.class),
            @XmlElement(name = SendDtmf.TYPE_NAME, type = SendDtmf.class),
            @XmlElement(name = SpeakSentence.TYPE_NAME, type = SpeakSentence.class),
            @XmlElement(name = StartRecording.TYPE_NAME, type = StartRecording.class),
            @XmlElement(name = StopRecording.TYPE_NAME, type = StopRecording.class),
            @XmlElement(name = StartGather.TYPE_NAME, type = StartGather.class),
            @XmlElement(name = StopGather.TYPE_NAME, type = StopGather.class),
            @XmlElement(name = Tag.TYPE_NAME, type = Tag.class),
            @XmlElement(name = Transfer.TYPE_NAME, type = Transfer.class),
            @XmlElement(name = StartStream.TYPE_NAME, type = StartStream.class),
            @XmlElement(name = StopStream.TYPE_NAME, type = StopStream.class),
    })

    private List<Verb> verbs = new ArrayList<>();

    public Bxml with(Verb verb) {
        this.verbs.add(verb);
        return this;
    }

    public Bxml withVerbs(Verb... verbs) {
        this.verbs.addAll(Arrays.asList(verbs));
        return this;
    }

    public String toBxml(JAXBContext jaxbContext) {
        OutputStream outputStream = new ByteArrayOutputStream();
        try {
            getMarshaller(jaxbContext).marshal(this, outputStream);
        } catch (JAXBException e) {
            throw new RuntimeException("Error creating BXML marshaller", e);
        }
        return outputStream.toString();
    }

    private Marshaller getMarshaller(JAXBContext context) throws JAXBException {
        return context.createMarshaller();
    }
}