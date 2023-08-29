package com.bandwidth.sdk.model.unit.bxml;

import com.bandwidth.sdk.model.bxml.utils.TtsGender;
import com.bandwidth.sdk.model.bxml.utils.TtsLocale;
import com.bandwidth.sdk.model.bxml.utils.TtsVoice;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.CoreMatchers.*;


import org.junit.Test;

public class TtsVoiceTest {

    @Test
    public void resolveOurName1() {
        assertThat(TtsVoice.fromOurName("susan"), is(TtsVoice.SUSAN));
    }
    @Test
    public void resolveOurName() {
        assertThat(TtsVoice.fromOurName("paul"), is(TtsVoice.PAUL));
    }

    @Test
    public void nonsenseResolvesToNull() {
        assertThat(TtsVoice.fromOurName("Blahblah"), is(nullValue()));
    }

    @Test
    public void providerName() {
        assertThat(TtsVoice.SUSAN.getProviderName(), is("Kimberly"));
    }

    void inferFromGenderAndLocale() {
        assertThat(TtsVoice.resolveGenderLocale(TtsGender.FEMALE, TtsLocale.EN_US), is(TtsVoice.SUSAN));
    }

    @Test
    public void inferFromNullLocaleIsNull() {
        assertThat(TtsVoice.resolveGenderLocale(TtsGender.FEMALE, null), is(nullValue()));
    }

    @Test
    public void toStringWorks() {
        assertThat(TtsVoice.SUSAN.toString(), is("susan"));
    }
}
