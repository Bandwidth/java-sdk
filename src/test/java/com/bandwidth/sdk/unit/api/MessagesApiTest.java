package com.bandwidth.sdk.unit.api;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.internal.util.collections.Sets;

import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.ApiResponse;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.api.MessagesApi;
import com.bandwidth.sdk.auth.HttpBasicAuth;
import com.bandwidth.sdk.model.ListMessageDirectionEnum;
import com.bandwidth.sdk.model.ListMessageItem;
import com.bandwidth.sdk.model.Message;
import com.bandwidth.sdk.model.MessageDirectionEnum;
import com.bandwidth.sdk.model.MessageRequest;
import com.bandwidth.sdk.model.MessageStatusEnum;
import com.bandwidth.sdk.model.MessageTypeEnum;
import com.bandwidth.sdk.model.MessagesList;
import com.bandwidth.sdk.model.PageInfo;
import com.bandwidth.sdk.model.PriorityEnum;

import static com.bandwidth.sdk.utils.TestingEnvironmentVariables.*;
import static org.hamcrest.MatcherAssert.assertThat;

import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;

@SuppressWarnings("null")
public class MessagesApiTest {
    public static ApiClient defaultClient = Configuration.getDefaultApiClient();
    public static HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    public static MessagesApi api = new MessagesApi(defaultClient);

    private static String messageText = "Java SDK Test Message";
    private static PriorityEnum messagePriority = PriorityEnum.HIGH;
    private static OffsetDateTime expiration = OffsetDateTime.now().plusDays(1);

    @BeforeAll
    public static void setUp() {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);
        api.setCustomBaseUrl("http://127.0.0.1:4010");
    }

    @Test
    public void testCreateMessage() throws ApiException {
        MessageRequest messageRequest = new MessageRequest()
                .applicationId(BW_MESSAGING_APPLICATION_ID)
                .from(BW_NUMBER)
                .to(Sets.newSet(BW_NUMBER))
                .text(messageText)
                .priority(messagePriority)
                .expiration(expiration);

        ApiResponse<Message> response = api.createMessageWithHttpInfo(BW_ACCOUNT_ID, messageRequest);

        assertThat(response.getStatusCode(), is(202));
        assertThat(response.getData(), instanceOf(Message.class));
        assertThat(response.getData().getId().length(), is(29));
        assertThat(response.getData().getOwner().length(), is(12));
        assertThat(response.getData().getApplicationId().length(), is(36));
        assertThat(response.getData().getTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().getSegmentCount(), instanceOf(Integer.class));
        assertThat(response.getData().getDirection(), instanceOf(MessageDirectionEnum.class));
        assertThat(response.getData().getTo(), instanceOf(LinkedHashSet.class));
        assertThat(response.getData().getTo().iterator().next().length(), is(12));
        assertThat(response.getData().getFrom().length(), is(12));
        assertThat(response.getData().getMedia(), instanceOf(LinkedHashSet.class));
        assertThat(response.getData().getMedia().iterator().next(), instanceOf(String.class));
        assertThat(response.getData().getText(), instanceOf(String.class));
        assertThat(response.getData().getTag(), instanceOf(String.class));
        assertThat(response.getData().getPriority(), instanceOf(PriorityEnum.class));
        assertThat(response.getData().getExpiration(), instanceOf(OffsetDateTime.class));
    }

    @Test
    public void testListMessages() throws ApiException {
        ApiResponse<MessagesList> response = api.listMessagesWithHttpInfo(
                BW_ACCOUNT_ID, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null, null);

        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData(), instanceOf(MessagesList.class));
        assertThat(response.getData().getTotalCount(), instanceOf(Integer.class));
        assertThat(response.getData().getPageInfo(), instanceOf(PageInfo.class));
        assertThat(response.getData().getPageInfo().getPrevPage(), instanceOf(String.class));
        assertThat(response.getData().getPageInfo().getNextPage(), instanceOf(String.class));
        assertThat(response.getData().getPageInfo().getPrevPageToken(), instanceOf(String.class));
        assertThat(response.getData().getPageInfo().getNextPageToken(), instanceOf(String.class));
        assertThat(response.getData().getMessages(), instanceOf(List.class));
        assertThat(response.getData().getMessages().get(0), instanceOf(ListMessageItem.class));
        assertThat(response.getData().getMessages().get(0).getMessageId().length(), is(29));
        assertThat(response.getData().getMessages().get(0).getAccountId().length(), is(7));
        assertThat(response.getData().getMessages().get(0).getSourceTn().length(), is(12));
        assertThat(response.getData().getMessages().get(0).getDestinationTn().length(), is(12));
        assertThat(response.getData().getMessages().get(0).getMessageStatus(), instanceOf(MessageStatusEnum.class));
        assertThat(response.getData().getMessages().get(0).getMessageDirection(),
                instanceOf(ListMessageDirectionEnum.class));
        assertThat(response.getData().getMessages().get(0).getMessageType(), instanceOf(MessageTypeEnum.class));
        assertThat(response.getData().getMessages().get(0).getSegmentCount(), instanceOf(Integer.class));
        assertThat(response.getData().getMessages().get(0).getErrorCode(), instanceOf(Integer.class));
        assertThat(response.getData().getMessages().get(0).getReceiveTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().getMessages().get(0).getCarrierName(), instanceOf(String.class));
        assertThat(response.getData().getMessages().get(0).getMessageSize(), instanceOf(Integer.class));
        assertThat(response.getData().getMessages().get(0).getMessageLength(), instanceOf(Integer.class));
        assertThat(response.getData().getMessages().get(0).getAttachmentCount(), instanceOf(Integer.class));
        assertThat(response.getData().getMessages().get(0).getRecipientCount(), instanceOf(Integer.class));
        assertThat(response.getData().getMessages().get(0).getCampaignClass(), instanceOf(String.class));
        assertThat(response.getData().getMessages().get(0).getCampaignId(), instanceOf(String.class));
        assertThat(response.getData().getMessages().get(0).getBwLatency(), instanceOf(Integer.class));
        assertThat(response.getData().getMessages().get(0).getCarrierLatency(), instanceOf(Integer.class));
        assertThat(response.getData().getMessages().get(0).getCallingNumberCountryA3(), instanceOf(String.class));
        assertThat(response.getData().getMessages().get(0).getCalledNumberCountryA3(), instanceOf(String.class));
        assertThat(response.getData().getMessages().get(0).getProduct(), instanceOf(String.class));
        assertThat(response.getData().getMessages().get(0).getLocation(), instanceOf(String.class));
    }
}
