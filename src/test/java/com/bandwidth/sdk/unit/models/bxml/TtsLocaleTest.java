package com.bandwidth.sdk.unit.models.bxml;

import com.bandwidth.sdk.model.bxml.utils.TtsLocale;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.CoreMatchers.*;

import org.junit.jupiter.api.Test;

public class TtsLocaleTest {

    @Test
    public void resolveEnLocale() {
        assertThat(TtsLocale.resolve("en_US"), is(TtsLocale.EN_US));
    }

    @Test
    public void resolveJaLocale() {
        assertThat(TtsLocale.resolve("ja"), is(TtsLocale.JA));
    }

    @Test
    public void resolveEsLocale() {
        assertThat(TtsLocale.resolve("es_MX"), is(TtsLocale.ES_MX));
    }

    @Test
    public void invalidResolvesToNull() {
        assertThat(TtsLocale.resolve("ha"), is(nullValue()));
    }

    @Test
    public void stringValidation() {
        assertThat(TtsLocale.EN_US.toString(), is("en_US"));
    }
}
