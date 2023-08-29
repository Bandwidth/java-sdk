package com.bandwidth.sdk.model.unit.bxml;

import com.bandwidth.sdk.model.bxml.utils.TtsGender;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class TtsGenderTest {

    @Test
    public void resolveMaleGender() {
        assertThat(TtsGender.resolve("male"), is(TtsGender.MALE));
    }

    @Test
    public void resolveFemaleGender() {
        assertThat(TtsGender.resolve("female"), is(TtsGender.FEMALE));
    }

    @Test
    public void nonsenseResolvesToNull() {
        assertThat(TtsGender.resolve("asdf"), is(nullValue()));
    }

    @Test
    public void stringValidation() {
        assertThat(TtsGender.FEMALE.toString(), is("female"));

    }
}
