package org.openapitools.client.model.bxml;

import java.util.List;

public class Response extends Root {

    public Response() {
        super("Response");
    }

    public Response(List<Verb> nestedVerbs) {
        super("Response", nestedVerbs);
    }
}