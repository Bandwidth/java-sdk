package com.bandwidth;

import com.bandwidth.phonenumberlookup.controllers.APIController;

import com.bandwidth.phonenumberlookup.models.OrderRequest;
import com.bandwidth.phonenumberlookup.models.OrderResponse;

import org.junit.*;

import java.util.Collections;

import static com.bandwidth.TestingEnvironmentVariables.*;

public class TnLookupApiTests {

    private APIController controller;

    @Before
    public void initTest(){
        BandwidthClient client = new BandwidthClient.Builder()
                .phoneNumberLookupBasicAuthCredentials(USERNAME, PASSWORD)
                .build();

        controller = client.getPhoneNumberLookupClient().getAPIController();
    }

    @Test
    public void testPhoneNumberLookup() throws Exception {
        OrderRequest body = new OrderRequest.Builder()
                .tns(Collections.singletonList(USER_NUMBER))
                .build();

        OrderResponse orderResponse = controller.createLookupRequest(ACCOUNT_ID, body).getResult();

        controller.getLookupRequestStatus(ACCOUNT_ID, orderResponse.getRequestId());
    }
}
