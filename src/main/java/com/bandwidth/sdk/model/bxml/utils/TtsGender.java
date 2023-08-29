package com.bandwidth.sdk.model.bxml.utils;

import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;

@XmlEnum
public enum TtsGender {
    @XmlEnumValue("female") FEMALE("female"),
    @XmlEnumValue("male") MALE("male");

    private final String genderString;

    TtsGender(String genderString) {
        this.genderString = genderString;
    }

    @JsonCreator
    public static TtsGender resolve(String gender) {
        return EnumFinder.of(TtsGender.class).find(g -> g.genderString.equals(gender));
    }

    public String toString() {
        return genderString;
    }
}
