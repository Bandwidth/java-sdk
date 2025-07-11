package com.bandwidth.sdk.smoke;

import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.ApiResponse;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.api.MultiChannelApi;
import com.bandwidth.sdk.auth.HttpBasicAuth;
import com.bandwidth.sdk.model.MmsMessageContent;
import com.bandwidth.sdk.model.MultiChannelChannelListObject;
import com.bandwidth.sdk.model.MultiChannelChannelListObjectContent;
import com.bandwidth.sdk.model.MultiChannelMessageChannelEnum;
import com.bandwidth.sdk.model.MultiChannelMessageRequest;
import com.bandwidth.sdk.model.PriorityEnum;
import com.bandwidth.sdk.model.RbmMessageContentText;
import com.bandwidth.sdk.model.SmsMessageContent;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    }

    @Test
    @Disabled
    public void createMultiChannelMessageTest() throws ApiException {
        MultiChannelChannelListObject channelListObject = new MultiChannelChannelListObject()
                .from(BW_NUMBER)
                .applicationId(BW_MESSAGING_APPLICATION_ID)
                .channel(MultiChannelMessageChannelEnum.RBM)
                .content(new MultiChannelChannelListObjectContent(new RbmMessageContentText()
                                .text("Hello World!")));
        MultiChannelMessageRequest multiChannelMessageRequest = new MultiChannelMessageRequest()
                .to(USER_NUMBER)
                .tag("tag")
                .priority(PriorityEnum.HIGH)
                .expiration(OffsetDateTime.now().plusSeconds(60));

        multiChannelMessageRequest.addChannelListItem(channelListObject);

        ApiResponse response =
            api.createMultiChannelMessageWithHttpInfo(BW_ACCOUNT_ID, multiChannelMessageRequest);
        assertThat(response.getStatusCode(), is(202));
    }

}
