package org.openapitools.client.model.bxml;

import com.fasterxml.jackson.annotation.JsonSubTypes;

@JsonSubTypes({
        @JsonSubTypes.Type(value = Record.class, name = Record.TYPE_NAME),
        @JsonSubTypes.Type(value = StartRecording.class, name = StartRecording.TYPE_NAME),
})
public interface TranscriptionProducer extends Verb {
    Boolean getTranscribe();

    String getTranscriptionAvailableUrl();

    String getTranscriptionAvailableMethod();
}
