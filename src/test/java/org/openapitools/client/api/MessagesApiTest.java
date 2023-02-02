/*
 * Bandwidth
 * Bandwidth's Communication APIs
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: letstalk@bandwidth.com
 *
 */

package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.auth.HttpBasicAuth;
import org.openapitools.client.Configuration;
import org.openapitools.client.model.ListMessageDirectionEnum;
import org.openapitools.client.model.ListMessageItem;
import org.openapitools.client.model.Message;
import org.openapitools.client.model.MessageRequest;
import org.openapitools.client.model.MessageStatusEnum;
import org.openapitools.client.model.MessageTypeEnum;
import org.openapitools.client.model.MessagesList;
import org.openapitools.client.model.PriorityEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.net.URI;

import javax.security.auth.AuthPermission;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.matchesRegex;
import static org.hamcrest.Matchers.contains;

import static org.openapitools.client.utils.TestingEnvironmentVariables.*;

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
                messageDirection, carrierName, messageType, errorCode, fromDateTime, toDateTime, sort, pageToken,
                limit);

        assertThat(response, instanceOf(MessagesList.class));
        assertThat(response.getTotalCount(), greaterThan(0));
        assertThat(response.getMessages().get(0), instanceOf(ListMessageItem.class));
        assertThat(response.getMessages().get(0).getAccountId(), is(System.getenv("BW_ACCOUNT_ID")));
        assertThat(response.getMessages().get(0).getDestinationTn(), matchesRegex("^\\+[1-9]\\d{1,14}$"));
        assertThat(response.getMessages().get(0).getMessageDirection(), instanceOf(ListMessageDirectionEnum.class));
        assertThat(response.getMessages().get(0).getMessageId(), matchesRegex("^.+$"));
        assertThat(response.getMessages().get(0).getMessageStatus(), instanceOf(MessageStatusEnum.class));
        assertThat(response.getMessages().get(0).getMessageType(), instanceOf(MessageTypeEnum.class));
        assertThat(response.getMessages().get(0).getSegmentCount(), greaterThan(0));
    }

    @Test
    public void listMessageBadRequestTest() {

        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);
        String pageToken = "gdEewhcJLQRB5"; // Bad Token

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> api.listMessages(accountId, messageId, sourceTn, destinationTn, messageStatus, messageDirection,
                        carrierName, messageType, errorCode, fromDateTime, toDateTime, sort, pageToken, limit));
        assertThat(exception.getCode(), is(400));

    }

    @Test
    public void listMessageUnauthorizedTest() {

        Basic.setUsername("user");
        Basic.setPassword("pass");

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> api.listMessages(accountId, messageId, sourceTn, destinationTn, messageStatus, messageDirection,
                        carrierName, messageType, errorCode, fromDateTime, toDateTime, sort, pageToken, limit));
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

        Basic.setUsername("user");
        Basic.setPassword("pass");
        messageRequest.applicationId(BW_MESSAGING_APPLICATION_ID);
        messageRequest.addToItem(USER_NUMBER);
        messageRequest.from(BW_NUMBER);
        messageRequest.text("Sample Text");

        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> api.createMessage(accountId, messageRequest));
        assertThat(exception.getCode(), is(401));
    }
}
