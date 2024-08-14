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

import com.bandwidth.sdk.model.PageInfo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Model tests for PageInfo
 */
public class PageInfoTest {
    private final PageInfo model = new PageInfo()
            .prevPage("prevPage")
            .nextPage("nextPage")
            .prevPageToken("prevPageToken")
            .nextPageToken("nextPageToken");

    /**
     * Model tests for PageInfo
     */
    @Test
    public void testPageInfo() {
        assertThat(model, instanceOf(PageInfo.class));
    }

    /**
     * Test the property 'prevPage'
     */
    @Test
    public void prevPageTest() {
        assertThat(model.getPrevPage(), instanceOf(String.class));
    }

    /**
     * Test the property 'nextPage'
     */
    @Test
    public void nextPageTest() {
        assertThat(model.getNextPage(), instanceOf(String.class));
    }

    /**
     * Test the property 'prevPageToken'
     */
    @Test
    public void prevPageTokenTest() {
        assertThat(model.getPrevPageToken(), instanceOf(String.class));
    }

    /**
     * Test the property 'nextPageToken'
     */
    @Test
    public void nextPageTokenTest() {
        assertThat(model.getNextPageToken(), instanceOf(String.class));
    }

}