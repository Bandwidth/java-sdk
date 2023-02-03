package org.openapitools.client.model.bxml;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * A marker interface for BXML verbs that process audio output. The class annotations describe how
 * Jackson should serialize and deserialize verbs.
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = PlayAudio.class, name = PlayAudio.TYPE_NAME),
        @JsonSubTypes.Type(value = SpeakSentence.class, name = SpeakSentence.TYPE_NAME),
})
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "name")
public interface AudioProducer extends Verb {
}
