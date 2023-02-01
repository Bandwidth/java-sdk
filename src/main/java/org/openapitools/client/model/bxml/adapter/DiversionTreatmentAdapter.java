package org.openapitools.client.model.bxml.adapter;

import org.openapitools.client.model.DiversionTreatment;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class DiversionTreatmentAdapter extends XmlAdapter<String, DiversionTreatment> {

    @Override
    public DiversionTreatment unmarshal(String s) {
        return DiversionTreatment.resolve(s.trim());
    }

    @Override
    public String marshal(DiversionTreatment e) {
        return e.getName();
    }
}
