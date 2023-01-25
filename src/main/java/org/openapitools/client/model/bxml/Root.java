package org.openapitools.client.model.bxml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Root {
    private String tag;
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Verb> nestedVerbs;

    public Root(String tag, List<Verb> nestedVerbs) {
        this.tag = tag;
        this.nestedVerbs = (nestedVerbs == null) ? new ArrayList<>() : nestedVerbs;
    }

    public Root(String tag) {
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
        xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
        xmlMapper.writerWithDefaultPrettyPrinter();
        addVerbsToBxml(root);
        return xmlMapper.writer().withRootName(tag).writeValueAsString(root);
    }

    private void addVerbsToBxml(ObjectNode root) {
        if (this.nestedVerbs != null) {
            for (Verb verb : this.nestedVerbs) {
                if (verb.getNestedVerbs() != null && !verb.getNestedVerbs().isEmpty() && verb.getContent() != null) {
                    ObjectNode child = root.putObject(verb.getTag());
                    child.put(verb.getTag(), verb.getContent());
                    verb.addVerbsToBxml(child);
                }
                else if (verb.getNestedVerbs() != null && !verb.getNestedVerbs().isEmpty()) {
                    ObjectNode child = root.putObject(verb.getTag());
                    verb.addVerbsToBxml(child);
                } 
                else {
                    root.put(verb.getTag(), verb.getContent());
                }
            }
        }
}
}
