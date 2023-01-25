package org.openapitools.client.model.bxml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class Verb   {
    protected String tag;
    @JacksonXmlText
    protected String content;
    @JacksonXmlElementWrapper(useWrapping = false)
    protected List<Verb> nestedVerbs;

    public Verb() {
    }

    public Verb(String tag, String content, List<Verb> nestedVerbs) {
        this.tag = tag;
        this.content = content;
        this.nestedVerbs = (nestedVerbs == null) ? new ArrayList<>() : nestedVerbs;
    }

    public Verb(String tag, String content) {
        this.tag = tag;
        this.content = content;
        this.nestedVerbs = new ArrayList<>();
    }

    public Verb(String tag) {
        this.tag = tag;
        this.nestedVerbs = new ArrayList<>();
    }

    public int length() {
        return nestedVerbs.size();
    }

    public Verb getVerb(int position) {
        return nestedVerbs.get(position);
    }

    public void addVerb(Verb verb) {
        nestedVerbs.add(verb);
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Verb> getNestedVerbs() {
        return nestedVerbs;
    }

    public void setNestedVerbs(List<Verb> nestedVerbs) {
        this.nestedVerbs = nestedVerbs;
    }

    public String toBxml() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode root = mapper.createObjectNode();
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.writerWithDefaultPrettyPrinter();
        addVerbsToBxml(root);
        return xmlMapper.writer().withRootName(tag).writeValueAsString(root);
    }

    public void addVerbsToBxml(ObjectNode root) {
        if (this.nestedVerbs != null) {
            for (Verb verb : this.nestedVerbs) {
                if (verb.nestedVerbs != null && !verb.nestedVerbs.isEmpty() && verb.content != null) {
                    ObjectNode child = root.putObject(verb.tag);
                    child.put(verb.tag, verb.content);
                    verb.addVerbsToBxml(child);
                }
                else if (verb.nestedVerbs != null && !verb.nestedVerbs.isEmpty()) {
                    ObjectNode child = root.putObject(verb.tag);
                    verb.addVerbsToBxml(child);
                } 
                else {
                    root.put(verb.tag, verb.content);
                }
            }
        }
    }
}
