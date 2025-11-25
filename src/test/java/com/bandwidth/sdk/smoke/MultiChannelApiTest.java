package com.bandwidth.sdk.smoke;

import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.ApiResponse;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.api.MultiChannelApi;
import com.bandwidth.sdk.auth.HttpBasicAuth;
import com.bandwidth.sdk.model.MultiChannelMessageRequest;
import com.bandwidth.sdk.model.MultiChannelMessageResponseData;
import com.bandwidth.sdk.model.MultiChannelChannelListRequestObject;
import com.bandwidth.sdk.model.MultiChannelChannelListResponseObject;
import com.bandwidth.sdk.model.MultiChannelMessageChannelEnum;
import com.bandwidth.sdk.model.MultiChannelChannelListSMSObject;
import com.bandwidth.sdk.model.MultiChannelChannelListSMSResponseObject;
import com.bandwidth.sdk.model.MultiChannelChannelListMMSObject;
import com.bandwidth.sdk.model.MultiChannelChannelListMMSResponseObject;
import com.bandwidth.sdk.model.MultiChannelChannelListRBMObject;
import com.bandwidth.sdk.model.MultiChannelChannelListRBMObjectAllOfContent;
import com.bandwidth.sdk.model.MultiChannelChannelListRBMResponseObject;
import com.bandwidth.sdk.model.CreateMultiChannelMessageResponse;
import com.bandwidth.sdk.model.MessageDirectionEnum;
import com.bandwidth.sdk.model.MmsMessageContent;
import com.bandwidth.sdk.model.MmsMessageContentFile;
import com.bandwidth.sdk.model.MultiChannelAction;
import com.bandwidth.sdk.model.RbmMessageContentText;
import com.bandwidth.sdk.model.SmsMessageContent;
import com.bandwidth.sdk.model.PriorityEnum;
import com.bandwidth.sdk.model.RbmActionDial;
import com.bandwidth.sdk.model.RbmActionTypeEnum;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static com.bandwidth.sdk.utils.TestingEnvironmentVariables.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.CoreMatchers.equalTo;
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
    }

    @Test
    public void createMultiChannelSMSMessageTest() throws ApiException {
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
        assertThat(response.getData().getData().getDirection(), equalTo(MessageDirectionEnum.OUT));
        assertThat(response.getData().getData().getTo(), instanceOf(Set.class));
        assertThat(response.getData().getData().getTo(), contains(USER_NUMBER));
        assertThat(response.getData().getData().getTag(), instanceOf(String.class));
        assertThat(response.getData().getData().getPriority(), instanceOf(PriorityEnum.class));
        assertThat(response.getData().getData().getPriority(), equalTo(PriorityEnum.HIGH));
        assertThat(response.getData().getData().getExpiration(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().getData().getChannelList(), instanceOf(List.class));
        assertThat(response.getData().getData().getChannelList().get(0), instanceOf(MultiChannelChannelListResponseObject.class));
        assertThat(response.getData().getData().getChannelList().get(0).getActualInstance(), instanceOf(MultiChannelChannelListSMSResponseObject.class));
        MultiChannelChannelListSMSResponseObject channelListObject
                = response.getData().getData().getChannelList().get(0).getMultiChannelChannelListSMSResponseObject();
        assertThat(channelListObject.getFrom(), equalTo(BW_NUMBER));
        assertThat(channelListObject.getApplicationId(), equalTo(BW_MESSAGING_APPLICATION_ID));
        assertThat(channelListObject.getChannel(), instanceOf(MultiChannelMessageChannelEnum.class));
        assertThat(channelListObject.getChannel(), equalTo(MultiChannelMessageChannelEnum.SMS));
        assertThat(channelListObject.getContent(), instanceOf(SmsMessageContent.class));
        assertThat(channelListObject.getContent().getText(), instanceOf(String.class));
        assertThat(channelListObject.getOwner(), equalTo(BW_NUMBER));
    }

    @Test
    public void createMultiChannelMMSMessageTest() throws ApiException {
        MultiChannelChannelListRequestObject channelListMMSObject = new MultiChannelChannelListRequestObject(
                new MultiChannelChannelListMMSObject()
                        .from(BW_NUMBER)
                        .applicationId(BW_MESSAGING_APPLICATION_ID)
                        .channel(MultiChannelMessageChannelEnum.MMS)
                        .content(new MmsMessageContent()
                                .media(Arrays.asList(new MmsMessageContentFile()
                                        .fileUrl(URI.create("https://www.example.com/image.png"))
                                ))
                                .text("Hello World!")
                        )
        );

        MultiChannelMessageRequest mmsRequest = new MultiChannelMessageRequest()
                .to(USER_NUMBER)
                .tag("tag")
                .priority(PriorityEnum.HIGH)
                .expiration(OffsetDateTime.now().plusSeconds(60))
                .channelList(Arrays.asList(channelListMMSObject));

        ApiResponse<CreateMultiChannelMessageResponse> response
                = api.createMultiChannelMessageWithHttpInfo(BW_ACCOUNT_ID, mmsRequest);

        assertThat(response.getStatusCode(), is(202));
        assertThat(response.getData(), instanceOf(CreateMultiChannelMessageResponse.class));
        assertThat(response.getData().getLinks(), instanceOf(List.class));
        assertThat(response.getData().getData(), instanceOf(MultiChannelMessageResponseData.class));
        assertThat(response.getData().getData().getId(), instanceOf(String.class));
        assertThat(response.getData().getData().getTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().getData().getDirection(), instanceOf(MessageDirectionEnum.class));
        assertThat(response.getData().getData().getDirection(), equalTo(MessageDirectionEnum.OUT));
        assertThat(response.getData().getData().getTo(), instanceOf(Set.class));
        assertThat(response.getData().getData().getTo(), contains(USER_NUMBER));
        assertThat(response.getData().getData().getTag(), instanceOf(String.class));
        assertThat(response.getData().getData().getPriority(), instanceOf(PriorityEnum.class));
        assertThat(response.getData().getData().getPriority(), equalTo(PriorityEnum.HIGH));
        assertThat(response.getData().getData().getExpiration(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().getData().getChannelList(), instanceOf(List.class));
        assertThat(response.getData().getData().getChannelList().get(0), instanceOf(MultiChannelChannelListResponseObject.class));
        assertThat(response.getData().getData().getChannelList().get(0).getActualInstance(), instanceOf(MultiChannelChannelListMMSResponseObject.class));
        MultiChannelChannelListMMSResponseObject channelListObject
                = response.getData().getData().getChannelList().get(0).getMultiChannelChannelListMMSResponseObject();
        assertThat(channelListObject.getFrom(), equalTo(BW_NUMBER));
        assertThat(channelListObject.getApplicationId(), equalTo(BW_MESSAGING_APPLICATION_ID));
        assertThat(channelListObject.getChannel(), instanceOf(MultiChannelMessageChannelEnum.class));
        assertThat(channelListObject.getChannel(), equalTo(MultiChannelMessageChannelEnum.MMS));
        assertThat(channelListObject.getContent(), instanceOf(MmsMessageContent.class));
        assertThat(channelListObject.getContent().getText(), instanceOf(String.class));
        assertThat(channelListObject.getContent().getMedia(), instanceOf(List.class));
        assertThat(channelListObject.getContent().getMedia().get(0), instanceOf(MmsMessageContentFile.class));
        assertThat(channelListObject.getContent().getMedia().get(0).getFileUrl(), instanceOf(URI.class));
        assertThat(channelListObject.getOwner(), equalTo(BW_NUMBER));
    }

    @Test
    public void createMultiChannelRBMMessageTest() throws ApiException {
        MultiChannelChannelListRequestObject channelListRBMObject = new MultiChannelChannelListRequestObject(
                new MultiChannelChannelListRBMObject()
                        .from(BW_NUMBER)
                        .applicationId(BW_MESSAGING_APPLICATION_ID)
                        .channel(MultiChannelMessageChannelEnum.RBM)
                        .content(new MultiChannelChannelListRBMObjectAllOfContent(
                                new RbmMessageContentText()
                                        .text("Hello World!")
                                        .suggestions(Arrays.asList(
                                                new MultiChannelAction(new RbmActionDial()
                                                        .type(RbmActionTypeEnum.DIAL_PHONE)
                                                        .text("Call Us")
                                                        .postbackData(new byte[]{1, 2, 3})
                                                        .phoneNumber(BW_NUMBER)
                                                )
                                        ))
                        )
                )
        );

        MultiChannelMessageRequest rbmRequest = new MultiChannelMessageRequest()
                .to(USER_NUMBER)
                .tag("tag")
                .priority(PriorityEnum.HIGH)
                .expiration(OffsetDateTime.now().plusSeconds(60))
                .channelList(Arrays.asList(channelListRBMObject));

        ApiResponse<CreateMultiChannelMessageResponse> response
                = api.createMultiChannelMessageWithHttpInfo(BW_ACCOUNT_ID, rbmRequest);
        
        assertThat(response.getStatusCode(), is(202));
        assertThat(response.getData(), instanceOf(CreateMultiChannelMessageResponse.class));
        assertThat(response.getData().getLinks(), instanceOf(List.class));
        assertThat(response.getData().getData(), instanceOf(MultiChannelMessageResponseData.class));
        assertThat(response.getData().getData().getId(), instanceOf(String.class));
        assertThat(response.getData().getData().getTime(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().getData().getDirection(), instanceOf(MessageDirectionEnum.class));
        assertThat(response.getData().getData().getDirection(), equalTo(MessageDirectionEnum.OUT));
        assertThat(response.getData().getData().getTo(), instanceOf(Set.class));
        assertThat(response.getData().getData().getTo(), contains(USER_NUMBER));
        assertThat(response.getData().getData().getTag(), instanceOf(String.class));
        assertThat(response.getData().getData().getPriority(), instanceOf(PriorityEnum.class));
        assertThat(response.getData().getData().getPriority(), equalTo(PriorityEnum.HIGH));
        assertThat(response.getData().getData().getExpiration(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().getData().getChannelList(), instanceOf(List.class));
        assertThat(response.getData().getData().getChannelList().get(0), instanceOf(MultiChannelChannelListResponseObject.class));
        assertThat(response.getData().getData().getChannelList().get(0).getActualInstance(), instanceOf(MultiChannelChannelListRBMResponseObject.class));
        MultiChannelChannelListRBMResponseObject channelListObject
                = response.getData().getData().getChannelList().get(0).getMultiChannelChannelListRBMResponseObject();
        assertThat(channelListObject.getFrom(), equalTo(BW_NUMBER));
        assertThat(channelListObject.getApplicationId(), equalTo(BW_MESSAGING_APPLICATION_ID));
        assertThat(channelListObject.getChannel(), instanceOf(MultiChannelMessageChannelEnum.class));
        assertThat(channelListObject.getChannel(), equalTo(MultiChannelMessageChannelEnum.RBM));
        assertThat(channelListObject.getContent(), instanceOf(MultiChannelChannelListRBMObjectAllOfContent.class));
        assertThat(channelListObject.getContent().getActualInstance(), instanceOf(RbmMessageContentText.class));
        RbmMessageContentText rbmContent = channelListObject.getContent().getRbmMessageContentText();
        assertThat(rbmContent.getText(), instanceOf(String.class));
        assertThat(rbmContent.getSuggestions(), instanceOf(List.class));
        assertThat(rbmContent.getSuggestions().get(0), instanceOf(MultiChannelAction.class));
        assertThat(rbmContent.getSuggestions().get(0).getActualInstance(), instanceOf(RbmActionDial.class));
        RbmActionDial rbmActionDial = rbmContent.getSuggestions().get(0).getRbmActionDial();
        assertThat(rbmActionDial.getType(), instanceOf(RbmActionTypeEnum.class));
        assertThat(rbmActionDial.getType(), equalTo(RbmActionTypeEnum.DIAL_PHONE));
        assertThat(rbmActionDial.getText(), instanceOf(String.class));
        assertThat(rbmActionDial.getPostbackData(), instanceOf(byte[].class));
        assertThat(rbmActionDial.getPhoneNumber(), instanceOf(String.class));
        assertThat(channelListObject.getOwner(), equalTo(BW_NUMBER));
    }

}
