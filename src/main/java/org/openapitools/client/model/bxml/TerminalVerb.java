package org.openapitools.client.model.bxml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import lombok.Data;

@Data
public class TerminalVerb extends Verb {
    
    public TerminalVerb() {
        super();
    }

    public TerminalVerb(String tag, String content) {
        super(tag, content, null);

    }

    public TerminalVerb(String tag) {
        super();
    }

    @Override
    public void addVerb(Verb verb) {
        throw new UnsupportedOperationException("Adding verbs is not supported by this verb");
    }

    @Override
    public String toBxml() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.writerWithDefaultPrettyPrinter();
        return xmlMapper.writer().withRootName(tag).writeValueAsString(this.content);
    }
}
