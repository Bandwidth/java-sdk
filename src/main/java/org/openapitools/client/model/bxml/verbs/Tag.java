package org.openapitools.client.model.bxml.verbs;

import org.openapitools.client.model.bxml.TerminalVerb;
import org.openapitools.client.model.bxml.Root;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class Tag extends TerminalVerb {

    @JacksonXmlText()
    private String content;

    public Tag() {
        super("Tag");
    }

    public Tag(String content) {
        super("Tag");
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }
}
