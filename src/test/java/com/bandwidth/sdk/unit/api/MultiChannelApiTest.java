package com.bandwidth.sdk.unit.api;

import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.ApiResponse;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.api.MultiChannelApi;
import com.bandwidth.sdk.auth.HttpBasicAuth;
import com.bandwidth.sdk.model.MultiChannelChannelListObject;
import com.bandwidth.sdk.model.MultiChannelChannelListObjectContent;
import com.bandwidth.sdk.model.MultiChannelMessageChannelEnum;
import com.bandwidth.sdk.model.MultiChannelMessageRequest;
import com.bandwidth.sdk.model.PriorityEnum;
import com.bandwidth.sdk.model.SmsMessageContent;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static com.bandwidth.sdk.utils.TestingEnvironmentVariables.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;

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
    @Disabled // skip because prism can't handle a oneOf with differing required fields
    public void createMultiChannelMessageTest() throws ApiException {
        MultiChannelChannelListObject channelListObject = new MultiChannelChannelListObject()
                .from(USER_NUMBER)
                .applicationId(BW_MESSAGING_APPLICATION_ID)
                .channel(MultiChannelMessageChannelEnum.SMS)
                .content(new MultiChannelChannelListObjectContent(new SmsMessageContent()
                        .text("Hello World!")));
        MultiChannelMessageRequest multiChannelMessageRequest = new MultiChannelMessageRequest()
                .to(USER_NUMBER)
                .tag("tag")
                .priority(PriorityEnum.DEFAULT)
                .expiration(OffsetDateTime.now());

        multiChannelMessageRequest.addChannelListItem(channelListObject);

        ApiResponse response =
            api.createMultiChannelMessageWithHttpInfo(BW_ACCOUNT_ID, multiChannelMessageRequest);
        assertThat(response.getStatusCode(), is(205));
    }

}
