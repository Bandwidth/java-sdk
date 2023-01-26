package org.openapitools.client.model.bxml.verbs;

import org.openapitools.client.model.bxml.TerminalVerb;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;

@Data
public class Pause extends TerminalVerb {

    @JacksonXmlProperty(isAttribute = true)
    private String duration;
    @JsonIgnore
    private String tag;

    public Pause() {
        super("Pause", null);
    }

    public Pause(String duration) {
        super("Pause", null);
        this.duration = duration;
    }

    @Override
    public String toBxml() throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.writerWithDefaultPrettyPrinter();
        return xmlMapper.writer().withRootName(tag).writeValueAsString(this);
    }
}
