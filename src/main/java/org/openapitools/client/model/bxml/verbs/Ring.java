package org.openapitools.client.model.bxml.verbs;

import org.openapitools.client.model.bxml.TerminalVerb;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;

@Data
public class Ring extends TerminalVerb {

    @JacksonXmlProperty(isAttribute = true)
    private String duration;
    @JacksonXmlProperty(isAttribute = true)
    private String answerCall;
    @JsonIgnore
    private String tag;

    public Ring() {
        super("Ring", null);
    }

    public Ring(String duration) {
        super("Ring", null);
        this.duration = duration;
    }

    public Ring(String duration, String answerCall) {
        super("Ring", null);
        this.duration = duration;
        this.answerCall = answerCall;

    }

    @Override
    public String toBxml() throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.writerWithDefaultPrettyPrinter();
        return xmlMapper.writer().withRootName(tag).writeValueAsString(this);
    }
}
