
package com.bandwidth.voice.bxml.verbs;

import com.bandwidth.voice.bxml.verbs.adapter.MethodAdapter;
import java.util.Arrays;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * HTTP Method to be used in the verb
 */
@XmlJavaTypeAdapter(MethodAdapter.class)
public enum Method {
    POST("POST"), GET("GET");

    private String name;

    Method(String name) {
        this.name = name;
    }

    /**
     * Translates a String value to a Method if applicable
     */
    public static Method fromValue(String value) {
        return Arrays.stream(Method.values())
                .filter(e -> e.name().equalsIgnoreCase(value))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(String.format("Unsupported HTTP method '%s'", value)));
    }

    @Override
    public String toString() {
        return name;
    }
}
