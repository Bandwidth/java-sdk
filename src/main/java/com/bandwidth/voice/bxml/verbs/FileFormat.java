
package com.bandwidth.voice.bxml.verbs;

import com.bandwidth.voice.bxml.verbs.adapter.FileFormatAdapter;
import java.util.Arrays;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * File format that AudioProducer can handle
 */
@XmlJavaTypeAdapter(FileFormatAdapter.class)
public enum FileFormat {
    MP3("mp3"), WAV("wav");

    private final String name;

    FileFormat(String name) {
        this.name = name;
    }

    /**
     * Converts a string value to an  FileFormat Enum
     */
    public static FileFormat fromValue(String value) {
        return Arrays.asList(FileFormat.values()).stream().filter(e -> e.name().equalsIgnoreCase(value)).findFirst()
                .orElseThrow(() -> new IllegalArgumentException(String.format("Unsupported file format '%s'", value)));
    }

    @Override
    public String toString() {
        return name;
    }
}
