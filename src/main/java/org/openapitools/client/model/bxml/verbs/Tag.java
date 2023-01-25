package org.openapitools.client.model.bxml.verbs;

import org.openapitools.client.model.bxml.TerminalVerb;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Tag extends TerminalVerb {

    public Tag() {
        super();
    }

    public Tag(String content) {
        super("Tag",content);
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toBxml() throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.writerWithDefaultPrettyPrinter();
        return xmlMapper.writer().withRootName(tag).writeValueAsString(this.content);
    }
}
