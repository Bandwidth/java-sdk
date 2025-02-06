package com.bandwidth.sdk.model.bxml.utils;

import static com.bandwidth.sdk.model.bxml.utils.TtsGender.FEMALE;
import static com.bandwidth.sdk.model.bxml.utils.TtsGender.MALE;
import static com.bandwidth.sdk.model.bxml.utils.TtsLocale.ARB;
import static com.bandwidth.sdk.model.bxml.utils.TtsLocale.CMN_CN;
import static com.bandwidth.sdk.model.bxml.utils.TtsLocale.DA_DK;
import static com.bandwidth.sdk.model.bxml.utils.TtsLocale.DE;
import static com.bandwidth.sdk.model.bxml.utils.TtsLocale.EN_AU;
import static com.bandwidth.sdk.model.bxml.utils.TtsLocale.EN_GB;
import static com.bandwidth.sdk.model.bxml.utils.TtsLocale.EN_GB_WLS;
import static com.bandwidth.sdk.model.bxml.utils.TtsLocale.EN_IN;
import static com.bandwidth.sdk.model.bxml.utils.TtsLocale.EN_UK;
import static com.bandwidth.sdk.model.bxml.utils.TtsLocale.EN_US;
import static com.bandwidth.sdk.model.bxml.utils.TtsLocale.ES;
import static com.bandwidth.sdk.model.bxml.utils.TtsLocale.ES_MX;
import static com.bandwidth.sdk.model.bxml.utils.TtsLocale.ES_US;
import static com.bandwidth.sdk.model.bxml.utils.TtsLocale.FR;
import static com.bandwidth.sdk.model.bxml.utils.TtsLocale.FR_CA;
import static com.bandwidth.sdk.model.bxml.utils.TtsLocale.IT;
import static com.bandwidth.sdk.model.bxml.utils.TtsLocale.JA;
import static com.bandwidth.sdk.model.bxml.utils.TtsLocale.NL_NL;
import static com.bandwidth.sdk.model.bxml.utils.TtsLocale.RO_RO;
import static com.bandwidth.sdk.model.bxml.utils.TtsLocale.RU;

import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.xml.bind.annotation.XmlEnumValue;

public enum TtsVoice {

    // The enum declaration order is the order in which the enums are searched by EnumFinder
    // This establishes priority, as voices with the same locale and gender that are higher on the list
    // are reached and returned first when searching with resolveGenderLocale()

    @XmlEnumValue("susan") SUSAN(EN_US, FEMALE, "susan", "Kimberly"),
    @XmlEnumValue("paul") PAUL(EN_US, MALE, "paul", "Matthew"),
    @XmlEnumValue("julie") JULIE(EN_US, FEMALE, "julie", "Joanna"),
    @XmlEnumValue("kate") KATE(EN_US, FEMALE, "kate", "Kendra"),
    @XmlEnumValue("ruth") RUTH(EN_US, FEMALE, "ruth", "Ruth"),
    @XmlEnumValue("bridget") BRIDGET(EN_UK, FEMALE, "bridget", "Amy"),
    @XmlEnumValue("katrin") KATRIN(DE, FEMALE, "katrin", "Marlene"),
    @XmlEnumValue("esperanza") ESPERANZA(ES, FEMALE, "esperanza", "Conchita"),
    @XmlEnumValue("violeta") VIOLETA(ES, FEMALE, "violeta", "Lucia"),
    @XmlEnumValue("rosa") ROSA(ES_MX, FEMALE, "rosa", "Mia"),
    @XmlEnumValue("lupe") LUPE(ES_US, FEMALE, "lupe", "Lupe"),
    @XmlEnumValue("jolie") JOLIE(FR, FEMALE, "jolie", "Celine"),
    @XmlEnumValue("gabrielle") GABRIELLE(FR_CA, FEMALE, "gabrielle", "Gabriel"),
    @XmlEnumValue("paola") PAOLA(IT, FEMALE, "paola", "Carla"),
    @XmlEnumValue("nadiya") NADIYA(RU, FEMALE, "nadiya", "Tatyana"),
    @XmlEnumValue("masako") MASAKO(JA, FEMALE, "masako", "Mizuki"),
    @XmlEnumValue("zeina") ZEINA(ARB, FEMALE, "zeina", "Zeina"),
    @XmlEnumValue("zhiyu") ZHIYU(CMN_CN, FEMALE, "zhiyu", "Zhiyu"),
    @XmlEnumValue("dave") DAVE(EN_US, MALE, "dave", "Matthew"),
    @XmlEnumValue("stephen") STEPHEN(EN_US, MALE, "stephen", "Stephen"),
    @XmlEnumValue("simon") SIMON(EN_UK, MALE, "simon", "Brian"),
    @XmlEnumValue("stefan") STEFAN(DE, MALE, "stefan", "Hans"),
    @XmlEnumValue("jorge") JORGE(ES, MALE, "jorge", "Enrique"),
    @XmlEnumValue("pedro") PEDRO(ES_US, MALE, "pedro", "Pedro"),
    @XmlEnumValue("bernard") BERNARD(FR, MALE, "bernard", "Mathieu"),
    @XmlEnumValue("liam") LIAM(FR_CA, MALE, "liam", "Liam"),
    @XmlEnumValue("luca") LUCA(IT, MALE, "luca", "Giorgio"),
    @XmlEnumValue("anatoli") ANATOLI(RU, MALE, "anatoli", "Maxim"),
    @XmlEnumValue("kenji") KENJI(JA, MALE, "kenji", "Takumi"),
    @XmlEnumValue("salli") SALLI(EN_US, FEMALE, "salli", "Salli"),
    @XmlEnumValue("salli_enh") SALLI_ENH(EN_US, FEMALE, "salli_enh", "Salli"),
    @XmlEnumValue("chantal") CHANTAL(FR_CA, FEMALE, "chantal", "Chantal"),
    @XmlEnumValue("miguel") MIGUEL(ES_US, MALE, "miguel", "Miguel"),
    @XmlEnumValue("joey") JOEY(EN_US, MALE, "joey", "Joey"),
    @XmlEnumValue("joey_enh") JOEY_ENH(EN_US, MALE, "joey_enh", "Joey"),
    @XmlEnumValue("penelope") PENELOPE(ES_US, FEMALE, "penelope", "Penelope"),
    @XmlEnumValue("russell") RUSSELL(EN_AU, MALE, "russell", "Russell"),
    @XmlEnumValue("emma") EMMA(EN_GB, FEMALE, "emma", "Emma"),
    @XmlEnumValue("emma_enh") EMMA_ENH(EN_GB, FEMALE, "emma_enh", "Emma"),
    @XmlEnumValue("nicole") NICOLE(EN_AU, FEMALE, "nicole", "Nicole"),
    @XmlEnumValue("raveena") RAVEENA(EN_IN, FEMALE, "raveena", "Raveena"),
    @XmlEnumValue("mads") MADS(DA_DK, MALE, "mads", "Mads"),
    @XmlEnumValue("justin") JUSTIN(EN_US, MALE, "justin", "Justin"),
    @XmlEnumValue("ivy") IVY(EN_US, FEMALE, "ivy", "Ivy"),
    @XmlEnumValue("ivy_enh") IVY_ENH(EN_US, FEMALE, "ivy_enh", "Ivy"),
    @XmlEnumValue("carmen") CARMEN(RO_RO, FEMALE, "carmen", "Carmen"),
    @XmlEnumValue("naja") NAJA(DA_DK, FEMALE, "naja", "Naja"),
    @XmlEnumValue("ruben") RUBEN(NL_NL, MALE, "ruben", "Ruben"),
    @XmlEnumValue("geraint") GERAINT(EN_GB_WLS, MALE, "geraint", "Geraint");


    private final TtsLocale locale;
    private final TtsGender gender;

    /**
     * What we present this voice as to our customers.
     */
    private final String ourName;

    /**
     * What our TTS provider calls this voice.
     */
    private final String providerName;

    TtsVoice(TtsLocale locale, TtsGender gender, String ourName, String providerName) {
        this.locale = locale;
        this.gender = gender;
        this.ourName = ourName;
        this.providerName = providerName;
    }

    public String getProviderName() {
        return providerName;
    }

    @JsonCreator
    public static TtsVoice fromOurName(String ourName) {
        return EnumFinder.of(TtsVoice.class).find(e -> e.ourName.equals(ourName));
    }

    public static TtsVoice resolveGenderLocale(TtsGender gender, TtsLocale locale) {
        TtsVoice voice = EnumFinder.of(TtsVoice.class)
                .find(e -> e.locale == locale && e.gender == gender);
                if (null == voice) {
                    return EnumFinder.of(TtsVoice.class)
                            .find(e -> e.locale == locale);
                }
                return voice;
    }

    @Override
    public String toString() {
        return this.ourName;
    }
}
