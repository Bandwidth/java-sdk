package com.bandwidth;

import com.bandwidth.phonenumberlookup.controllers.APIController;

import com.bandwidth.phonenumberlookup.models.OrderRequest;
import com.bandwidth.phonenumberlookup.models.OrderResponse;

import com.bandwidth.phonenumberlookup.models.OrderStatus;
import org.junit.*;
import static org.junit.Assert.*;

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
        assertNotNull("RequestID is null", orderResponse.getRequestId());
        assertFalse("RequestID is empty", orderResponse.getRequestId().isEmpty());
        assertTrue(
                "Status is not a valid value",
                orderResponse.getStatus().equals("COMPLETE") ||
                        orderResponse.getStatus().equals("PARTIAL_COMPLETE") ||
                        orderResponse.getStatus().equals("FAILED")
                );

        OrderStatus statusResponse = controller.getLookupRequestStatus(ACCOUNT_ID, orderResponse.getRequestId()).getResult();
        assertNotNull("RequestID is null", statusResponse.getRequestId());
        assertFalse("RequestId is empty", statusResponse.getRequestId().isEmpty());
        assertTrue(
                "Status is not a valid value",
                statusResponse.getStatus().equals("COMPLETE") ||
                        statusResponse.getStatus().equals("PARTIAL_COMPLETE") ||
                        statusResponse.getStatus().equals("FAILED") ||
                        statusResponse.getStatus().equals("IN_PROGRESS")
                );
    }
}
