/*
 * Bandwidth
 * Bandwidth's Communication APIs
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: letstalk@bandwidth.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.bandwidth.sdk.unit.models;

import org.junit.jupiter.api.Test;

import com.bandwidth.sdk.model.CallTranscriptionDetectedLanguageEnum;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

/**
 * Model tests for CallTranscriptionDetectedLanguageEnum
 */
public class CallTranscriptionDetectedLanguageEnumTest {
    /**
     * Model tests for CallTranscriptionDetectedLanguageEnum
     */
    @Test
    public void testCallTranscriptionDetectedLanguageEnum() {
        assertThat(CallTranscriptionDetectedLanguageEnum.EN_US.toString(), equalTo("en-US"));
        assertThat(CallTranscriptionDetectedLanguageEnum.ES_US.toString(), equalTo("es-US"));
        assertThat(CallTranscriptionDetectedLanguageEnum.FR_FR.toString(), equalTo("fr-FR"));
    }

}
