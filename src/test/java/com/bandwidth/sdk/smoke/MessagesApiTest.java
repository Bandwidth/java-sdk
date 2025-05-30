package com.bandwidth.sdk.smoke;

import com.bandwidth.sdk.api.MessagesApi;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.auth.HttpBasicAuth;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.model.ListMessageDirectionEnum;
import com.bandwidth.sdk.model.ListMessageItem;
import com.bandwidth.sdk.model.Message;
import com.bandwidth.sdk.model.MessageRequest;
import com.bandwidth.sdk.model.MessageStatusEnum;
import com.bandwidth.sdk.model.MessageTypeEnum;
import com.bandwidth.sdk.model.MessagesList;
import com.bandwidth.sdk.model.PriorityEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.time.OffsetDateTime;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.matchesRegex;
import static org.hamcrest.Matchers.contains;

import static com.bandwidth.sdk.utils.TestingEnvironmentVariables.*;

/**
 * API tests for MessagesApi
 */
public class MessagesApiTest {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    private final MessagesApi api = new MessagesApi(defaultClient);

    // Setting up variables
    String accountId = BW_ACCOUNT_ID;
    String messageId = null;
    String sourceTn = null;
    String destinationTn = null;
    MessageStatusEnum messageStatus = null;
    ListMessageDirectionEnum messageDirection = null;
    String carrierName = null;
    MessageTypeEnum messageType = MessageTypeEnum.fromValue("sms");
    Integer errorCode = null;
    String fromDateTime = null;
    String toDateTime = null;
    String campaignId = null;
    String sort = "sourceTn:desc";
    String pageToken = null;
    Integer limit = 50;

    String applicationId = (BW_MESSAGING_APPLICATION_ID);

    public MessageRequest messageRequest = new MessageRequest();

    /**
     * List Messages
     *
     * Returns a list of messages based on query parameters.
     *
     * @throws ApiException if the Api call fails
     */

    @Test
    public void listMessagesTest() throws ApiException {

        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);
        MessagesList response = api.listMessages(accountId, messageId, sourceTn, destinationTn, messageStatus,
                messageDirection, carrierName, messageType, errorCode, fromDateTime, toDateTime, campaignId, sort,
                pageToken,
                limit, false);

        assertThat(response, instanceOf(MessagesList.class));
        assertThat(response.getTotalCount(), greaterThan(0));

        @SuppressWarnings("null")
        ListMessageItem message = response.getMessages().get(0);
        assertThat(message, instanceOf(ListMessageItem.class));
        assertThat(message.getAccountId(), is(System.getenv("BW_ACCOUNT_ID")));
        assertThat(message.getDestinationTn(), matchesRegex("^\\+[1-9]\\d{1,14}$"));
        assertThat(message.getMessageDirection(), instanceOf(ListMessageDirectionEnum.class));
        assertThat(message.getMessageId(), matchesRegex("^.+$"));
        assertThat(message.getMessageStatus(), instanceOf(MessageStatusEnum.class));
        assertThat(message.getMessageType(), instanceOf(MessageTypeEnum.class));
        assertThat(message.getSegmentCount(), greaterThan(0));
    }

    @Test
    public void listMessageBadRequestTest() {

        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);
        String pageToken = "gdEewhcJLQRB5"; // Bad Token

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> api.listMessages(accountId, messageId, sourceTn, destinationTn, messageStatus, messageDirection,
                        carrierName, messageType, errorCode, fromDateTime, toDateTime, campaignId, sort, pageToken,
                        limit, false));
        assertThat(exception.getCode(), is(400));

    }

    @Test
    public void listMessageUnauthorizedTest() {

        Basic.setUsername("bad_username");
        Basic.setPassword("bad_password");

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> api.listMessages(accountId, messageId, sourceTn, destinationTn, messageStatus, messageDirection,
                        carrierName, messageType, errorCode, fromDateTime, toDateTime, campaignId, sort, pageToken,
                        limit, false));
        assertThat(exception.getCode(), is(401));
    }

    /**
     * Create Message
     *
     * Endpoint for sending text messages and picture messages using V2 messaging.
     *
     * @throws ApiException if the Api call fails
     */

    @Test
    public void createMessageTest() throws ApiException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);
        messageRequest.applicationId(applicationId);
        messageRequest.addToItem(USER_NUMBER);
        messageRequest.from(BW_NUMBER);
        messageRequest.text("Sample Text");
        messageRequest.addMediaItem(URI.create("https://cdn2.thecatapi.com/images/MTY3ODIyMQ.jpg"));
        messageRequest.tag("Java Integration Test");
        messageRequest.priority(PriorityEnum.DEFAULT);
        messageRequest.expiration(OffsetDateTime.now().plusSeconds(60));
        Message response = api.createMessage(accountId, messageRequest);

        assertThat(response, instanceOf(Message.class));
        assertThat(response.getFrom(), is(System.getenv("BW_NUMBER")));
        assertThat(response.getTo(), contains(System.getenv("USER_NUMBER")));
        assertThat(response.getApplicationId(), is(System.getenv("BW_MESSAGING_APPLICATION_ID")));
        assertThat(response.getText(), is("Sample Text"));
        assertThat(response.getTag(), is("Java Integration Test"));
        assertThat(response.getMedia(), contains("https://cdn2.thecatapi.com/images/MTY3ODIyMQ.jpg"));
        assertThat(response.getPriority(), instanceOf(PriorityEnum.class));
        assertThat(response.getSegmentCount(), greaterThan(0));
    }

    @Test
    public void createMessageBadRequestTest() {

        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);
        messageRequest.applicationId(null);
        messageRequest.addToItem(USER_NUMBER);
        messageRequest.from(BW_NUMBER);
        messageRequest.text("Sample Text");

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> api.createMessage(accountId, messageRequest));
        assertThat(exception.getCode(), is(400));
    }

    @Test
    public void createMessageUnauthorizedTest() {
        Basic.setUsername("bad_username");
        Basic.setPassword("bad_password");

        messageRequest.applicationId(BW_MESSAGING_APPLICATION_ID);
        messageRequest.addToItem(USER_NUMBER);
        messageRequest.from(BW_NUMBER);
        messageRequest.text("Sample Text");

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> api.createMessage(accountId, messageRequest));
        assertThat(exception.getCode(), is(401));
    }
}
