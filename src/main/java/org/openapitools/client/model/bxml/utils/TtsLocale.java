package org.openapitools.client.model.bxml.utils;

import com.fasterxml.jackson.annotation.JsonCreator;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;

@XmlEnum
public enum TtsLocale {
    @XmlEnumValue("en_US") EN_US("en_US"),
    @XmlEnumValue("en_UK") EN_UK("en_UK"),
    @XmlEnumValue("de") DE("de"),
    @XmlEnumValue("es") ES("es"),
    @XmlEnumValue("es_MX") ES_MX("es_MX"),
    @XmlEnumValue("fr") FR("fr"),
    @XmlEnumValue("it") IT("it"),
    @XmlEnumValue("ru") RU("ru"),
    @XmlEnumValue("ja") JA("ja");

    private final String locale;

    TtsLocale(String locale) {
        this.locale = locale;
    }

    @JsonCreator
    public static TtsLocale resolve(String localeString) {
        return EnumFinder.of(TtsLocale.class)
                .find(loc -> loc.locale.equals(localeString));
    }

    public String toString() {
        return locale;
    }
}
