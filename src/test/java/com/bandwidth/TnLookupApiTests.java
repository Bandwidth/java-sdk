package com.bandwidth;

import com.bandwidth.http.response.ApiResponse;
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

        ApiResponse<OrderResponse> orderApiResponse = controller.createLookupRequest(ACCOUNT_ID, body);
        assertEquals("Response Code is not 202", 202, orderApiResponse.getStatusCode());

        OrderResponse orderResponse = orderApiResponse.getResult();
        assertNotNull("RequestID is null", orderResponse.getRequestId());
        assertFalse("RequestID is empty", orderResponse.getRequestId().isEmpty());
        assertEquals("Request ID is not 36 characters", 36, orderResponse.getRequestId().length());
        assertTrue(
                "Status is not a valid value",
                orderResponse.getStatus().equals("COMPLETE") ||
                        orderResponse.getStatus().equals("PARTIAL_COMPLETE") ||
                        orderResponse.getStatus().equals("FAILED")
                );

        ApiResponse<OrderStatus> statusApiResponse = controller.getLookupRequestStatus(ACCOUNT_ID, orderResponse.getRequestId());
        assertEquals("Response Code is not 200", 200, statusApiResponse.getStatusCode());

        OrderStatus statusResponse = statusApiResponse.getResult();
        assertNotNull("RequestID is null", statusResponse.getRequestId());
        assertFalse("RequestId is empty", statusResponse.getRequestId().isEmpty());
        assertEquals("Request ID is not 36 characters", 36, statusResponse.getRequestId().length());
        assertTrue(
                "Status is not a valid value",
                statusResponse.getStatus().equals("COMPLETE") ||
                        statusResponse.getStatus().equals("PARTIAL_COMPLETE") ||
                        statusResponse.getStatus().equals("FAILED") ||
                        statusResponse.getStatus().equals("IN_PROGRESS")
                );
    }
}