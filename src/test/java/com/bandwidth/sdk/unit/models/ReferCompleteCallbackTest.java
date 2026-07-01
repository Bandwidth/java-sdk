package com.bandwidth.sdk.unit.models;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.time.OffsetDateTime;
import com.bandwidth.sdk.model.ReferCompleteCallback;
import com.bandwidth.sdk.model.ReferCallStatusEnum;
import com.bandwidth.sdk.model.CallDirectionEnum;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Model tests for ReferCompleteCallback
 */
public class ReferCompleteCallbackTest {

    // Successful REFER — referSipResponseCode=202, notifySipResponseCode=200
    private final ReferCompleteCallback successModel = new ReferCompleteCallback()
            .eventType("referComplete")
            .eventTime(OffsetDateTime.now())
            .accountId("9900000")
            .applicationId("04e88489-df02-4e34-a0ee-27a91849555f")
            .from("+15555555555")
            .to("+15555555556")
            .direction(CallDirectionEnum.INBOUND)
            .callId("c-15ac29a2-1331029c-2cb0-4a07-b215-b22865662d85")
            .callUrl(URI.create("https://voice.bandwidth.com/api/v2/accounts/9900000/calls/c-15ac29a2"))
            .startTime(OffsetDateTime.now())
            .answerTime(OffsetDateTime.now())
            .tag("exampleTag")
            .referCallStatus(ReferCallStatusEnum.SUCCESS)
            .referSipResponseCode(202)
            .notifySipResponseCode(200);

    // REFER rejected by caller's endpoint — referSipResponseCode=405, no notifySipResponseCode
    private final ReferCompleteCallback rejectedModel = new ReferCompleteCallback()
            .eventType("referComplete")
            .referCallStatus(ReferCallStatusEnum.FAILURE)
            .referSipResponseCode(405);

    // Destination unreachable — referSipResponseCode=202, notifySipResponseCode=404
    private final ReferCompleteCallback unreachableModel = new ReferCompleteCallback()
            .eventType("referComplete")
            .referCallStatus(ReferCallStatusEnum.FAILURE)
            .referSipResponseCode(202)
            .notifySipResponseCode(404);

    // NOTIFY timeout — referSipResponseCode=202, no notifySipResponseCode
    private final ReferCompleteCallback timeoutModel = new ReferCompleteCallback()
            .eventType("referComplete")
            .referCallStatus(ReferCallStatusEnum.FAILURE)
            .referSipResponseCode(202);

    @Test
    public void testReferCompleteCallbackSuccess() {
        assertThat(successModel, instanceOf(ReferCompleteCallback.class));
    }

    @Test
    public void referCallStatusSuccessTest() {
        assertThat(successModel.getReferCallStatus(), instanceOf(ReferCallStatusEnum.class));
    }

    @Test
    public void referSipResponseCodeSuccessTest() {
        assertThat(successModel.getReferSipResponseCode(), instanceOf(Integer.class));
    }

    @Test
    public void notifySipResponseCodeSuccessTest() {
        assertThat(successModel.getNotifySipResponseCode(), instanceOf(Integer.class));
    }

    @Test
    public void testReferCompleteCallbackRejected() {
        assertThat(rejectedModel, instanceOf(ReferCompleteCallback.class));
    }

    @Test
    public void testReferCompleteCallbackUnreachable() {
        assertThat(unreachableModel, instanceOf(ReferCompleteCallback.class));
    }

    @Test
    public void testReferCompleteCallbackTimeout() {
        assertThat(timeoutModel, instanceOf(ReferCompleteCallback.class));
    }

    @Test
    public void eventTypeTest() {
        assertThat(successModel.getEventType(), instanceOf(String.class));
    }

    @Test
    public void directionTest() {
        assertThat(successModel.getDirection(), instanceOf(CallDirectionEnum.class));
    }

    @Test
    public void callUrlTest() {
        assertThat(successModel.getCallUrl(), instanceOf(URI.class));
    }

    @Test
    public void startTimeTest() {
        assertThat(successModel.getStartTime(), instanceOf(OffsetDateTime.class));
    }

    @Test
    public void answerTimeTest() {
        assertThat(successModel.getAnswerTime(), instanceOf(OffsetDateTime.class));
    }

    @Test
    public void tagTest() {
        assertThat(successModel.getTag(), instanceOf(String.class));
    }
}