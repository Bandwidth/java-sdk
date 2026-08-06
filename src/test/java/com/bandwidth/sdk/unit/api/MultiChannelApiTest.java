package com.bandwidth.sdk.unit.api;

import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.ApiResponse;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.api.MultiChannelApi;
import com.bandwidth.sdk.auth.HttpBasicAuth;
import com.bandwidth.sdk.model.CreateMultiChannelMessageResponse;
import com.bandwidth.sdk.model.MessageDirectionEnum;
import com.bandwidth.sdk.model.MultiChannelChannelListRequestObject;
import com.bandwidth.sdk.model.MultiChannelChannelListResponseObject;
import com.bandwidth.sdk.model.MultiChannelChannelListSMSObject;
import com.bandwidth.sdk.model.MultiChannelMessageChannelEnum;
import com.bandwidth.sdk.model.MultiChannelMessageRequest;
import com.bandwidth.sdk.model.MultiChannelMessageResponseData;
import com.bandwidth.sdk.model.PriorityEnum;

import com.bandwidth.sdk.model.SmsMessageContent;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static com.bandwidth.sdk.utils.TestingEnvironmentVariables.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;

@SuppressWarnings("null")
public class MultiChannelApiTest {
    private static ApiClient defaultClient = Configuration.getDefaultApiClient();
    private static HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    private static MultiChannelApi api = new MultiChannelApi(defaultClient);

    @BeforeAll
    public static void setUp() {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);
        api.setCustomBaseUrl("http://127.0.0.1:4010");
    }

    @Test
    public void createMultiChannelMessageTest() throws ApiException {
        MultiChannelChannelListRequestObject channelListSMSObject = new MultiChannelChannelListRequestObject(
                new MultiChannelChannelListSMSObject()
                        .from(BW_NUMBER)
                        .applicationId(BW_MESSAGING_APPLICATION_ID)
                        .channel(MultiChannelMessageChannelEnum.SMS)
                        .content(new SmsMessageContent().text("Hello World!"))
        );
        MultiChannelMessageRequest smsRequest = new MultiChannelMessageRequest()
                .to(USER_NUMBER)
                .tag("tag")
                .priority(PriorityEnum.HIGH)
                .expiration(OffsetDateTime.now().plusSeconds(60))
                .channelList(Arrays.asList(channelListSMSObject));

        ApiResponse<CreateMultiChannelMessageResponse> response
                = api.createMultiChannelMessageWithHttpInfo(BW_ACCOUNT_ID, smsRequest);

        assertThat(response.getStatusCode(), is(202));
        assertThat(response.getData(), instanceOf(CreateMultiChannelMessageResponse.class));
        assertThat(response.getData().getLinks(), instanceOf(List.class));
        assertThat(response.getData().getData(), instanceOf(MultiChannelMessageResponseData.class));
        assertThat(response.getData().getData().getId(), instanceOf(String.class));
        assertThat(response.getData().getData().getTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().getData().getDirection(), instanceOf(MessageDirectionEnum.class));
        assertThat(response.getData().getData().getTo(), instanceOf(Set.class));
        assertThat(response.getData().getData().getTag(), instanceOf(String.class));
        assertThat(response.getData().getData().getPriority(), instanceOf(PriorityEnum.class));
        assertThat(response.getData().getData().getExpiration(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().getData().getChannelList(), instanceOf(List.class));
        assertThat(response.getData().getData().getChannelList().get(0), instanceOf(MultiChannelChannelListResponseObject.class));
    }

}
