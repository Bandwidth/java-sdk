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
import org.mockito.internal.util.collections.Sets;

import java.net.URI;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.time.OffsetDateTime;
import com.bandwidth.sdk.model.MessageDeliveredCallbackMessage;
import com.bandwidth.sdk.model.PriorityEnum;
import com.bandwidth.sdk.model.MessageDirectionEnum;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Model tests for MessageDeliveredCallbackMessage
 */
public class MessageDeliveredCallbackMessageTest {
    private final MessageDeliveredCallbackMessage model = new MessageDeliveredCallbackMessage()
            .id("id")
            .owner("owner")
            .applicationId("applicationId")
            .time(OffsetDateTime.now())
            .segmentCount(0)
            .direction(MessageDirectionEnum.IN)
            .to(Sets.newSet("to"))
            .from("from")
            .text("text")
            .tag("tag")
            .media(new ArrayList<URI>(Arrays.asList(URI.create("http://example.com"))))
            .priority(PriorityEnum.HIGH);

    /**
     * Model tests for MessageDeliveredCallbackMessage
     */
    @Test
    public void testMessageDeliveredCallbackMessage() {
        assertThat(model, instanceOf(MessageDeliveredCallbackMessage.class));
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        assertThat(model.getId(), instanceOf(String.class));
    }

    /**
     * Test the property 'owner'
     */
    @Test
    public void ownerTest() {
        assertThat(model.getOwner(), instanceOf(String.class));
    }

    /**
     * Test the property 'applicationId'
     */
    @Test
    public void applicationIdTest() {
        assertThat(model.getApplicationId(), instanceOf(String.class));
    }

    /**
     * Test the property 'time'
     */
    @Test
    public void timeTest() {
        assertThat(model.getTime(), instanceOf(OffsetDateTime.class));
    }

    /**
     * Test the property 'segmentCount'
     */
    @Test
    public void segmentCountTest() {
        assertThat(model.getSegmentCount(), instanceOf(Integer.class));
    }

    /**
     * Test the property 'direction'
     */
    @Test
    public void directionTest() {
        assertThat(model.getDirection(), instanceOf(MessageDirectionEnum.class));
    }

    /**
     * Test the property 'to'
     */
    @Test
    public void toTest() {
        assertThat(model.getTo(), instanceOf(LinkedHashSet.class));
    }

    /**
     * Test the property 'from'
     */
    @Test
    public void fromTest() {
        assertThat(model.getFrom(), instanceOf(String.class));
    }

    /**
     * Test the property 'text'
     */
    @Test
    public void textTest() {
        assertThat(model.getText(), instanceOf(String.class));
    }

    /**
     * Test the property 'tag'
     */
    @Test
    public void tagTest() {
        assertThat(model.getTag(), instanceOf(String.class));
    }

    /**
     * Test the property 'media'
     */
    @Test
    public void mediaTest() {
        assertThat(model.getMedia(), instanceOf(List.class));
    }

    /**
     * Test the property 'priority'
     */
    @Test
    public void priorityTest() {
        assertThat(model.getPriority(), instanceOf(PriorityEnum.class));
    }

}
