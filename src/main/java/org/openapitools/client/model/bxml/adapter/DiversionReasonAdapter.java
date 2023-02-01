package org.openapitools.client.model.bxml.adapter;

import org.openapitools.client.model.DiversionReason;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class DiversionReasonAdapter extends XmlAdapter<String, DiversionReason> {

    @Override
    public DiversionReason unmarshal(String s) {
        return DiversionReason.resolve(s.trim());
    }

    @Override
    public String marshal(DiversionReason e) {
        return e.getName();
    }
}
