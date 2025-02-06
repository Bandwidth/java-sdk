package com.bandwidth.sdk.model.bxml.utils;

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
    @XmlEnumValue("es_US") ES_US("es_US"),
    @XmlEnumValue("fr") FR("fr"),
    @XmlEnumValue("fr_CA") FR_CA("fr_CA"),
    @XmlEnumValue("it") IT("it"),
    @XmlEnumValue("ru") RU("ru"),
    @XmlEnumValue("ja") JA("ja"),
    @XmlEnumValue("arb") ARB("arb"),
    @XmlEnumValue("cmn-CN") CMN_CN("cmn-CN"),
    @XmlEnumValue("en_AU") EN_AU("en_AU"),
    @XmlEnumValue("en_IN") EN_IN("en_IN"),
    @XmlEnumValue("da_DK") DA_DK("da_DK"),
    @XmlEnumValue("ro_RO") RO_RO("ro_RO"),
    @XmlEnumValue("nl_NL") NL_NL("nl_NL"),
    @XmlEnumValue("en_GB") EN_GB("en_GB"),
    @XmlEnumValue("en_GB_WLS") EN_GB_WLS("en_GB_WLS");

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
