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

import com.bandwidth.sdk.model.FileFormatEnum;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

/**
 * Model tests for FileFormatEnum
 */
public class FileFormatEnumTest {
    /**
     * Model tests for FileFormatEnum
     */
    @Test
    public void testFileFormatEnum() {
        assertThat(FileFormatEnum.MP3.toString(), equalTo("mp3"));
        assertThat(FileFormatEnum.WAV.toString(), equalTo("wav"));
    }

}