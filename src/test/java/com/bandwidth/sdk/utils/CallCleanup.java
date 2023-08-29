package com.bandwidth.sdk.utils;

import java.util.List;
import java.util.concurrent.TimeUnit;

import com.bandwidth.sdk.api.CallsApiTest;
import com.bandwidth.sdk.api.ConferencesApiTest;
import com.bandwidth.sdk.api.RecordingsApiTest;
import com.bandwidth.sdk.model.CallStateEnum;
import com.bandwidth.sdk.model.UpdateCall;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.ApiResponse;

import static com.bandwidth.sdk.utils.TestingEnvironmentVariables.*;

public class CallCleanup {
    private static int TEST_SLEEP = 5;

    /**
     * Ensure that all CallIds inside of the callIdList have been hung up
     *
     * @param callIdList List of Bandwidth call ID's
     */
    public static final void Cleanup(CallsApiTest testClass, List<String> callIdList) throws Exception {
        TimeUnit.SECONDS.sleep(TEST_SLEEP);

        if (!callIdList.isEmpty()) {
            try {
                testClass.Basic.setUsername(BW_USERNAME);
                testClass.Basic.setPassword(BW_PASSWORD);
                for (int i = 0; i < callIdList.size(); i++) {
                    String callState = testClass.api.getCallState(BW_ACCOUNT_ID, callIdList.get(i).toString())
                            .getState();
                    if (!callState.equalsIgnoreCase("disconnected")) {
                        UpdateCall updateCallBody = new UpdateCall();
                        updateCallBody.setState(CallStateEnum.COMPLETED);
                        ApiResponse<Void> response = testClass.api.updateCallWithHttpInfo(BW_ACCOUNT_ID,
                                callIdList.get(i),
                                updateCallBody);
                    }
                }
            } catch (ApiException e) {
                System.out.println("API Error: " + e.toString());
                throw new Exception("Failed to terminate all calls: [" + callIdList.toString() + "]");
            }
        }
    }

    /**
     * Ensure that the call has been hung up
     *
     * @param callId Bandwidth call ID
     */
    public static final void Cleanup(ConferencesApiTest testClass, String callId) throws Exception {
        TimeUnit.SECONDS.sleep(TEST_SLEEP);

        try {
            testClass.Basic.setUsername(BW_USERNAME);
            testClass.Basic.setPassword(BW_PASSWORD);

            String callState = testClass.callsApi.getCallState(BW_ACCOUNT_ID, callId).getState();
            if (!callState.equalsIgnoreCase("disconnected")) {
                UpdateCall updateCallBody = new UpdateCall();
                updateCallBody.setState(CallStateEnum.COMPLETED);
                ApiResponse<Void> response = testClass.callsApi.updateCallWithHttpInfo(BW_ACCOUNT_ID,
                        callId,
                        updateCallBody);
            }
        } catch (ApiException e) {
            System.out.println("API Error: " + e.toString());
            throw new Exception("Failed to terminate all calls: [" + callId + "]");
        }
    }

    public static final void Cleanup(RecordingsApiTest testClass, String callId) throws Exception {
        TimeUnit.SECONDS.sleep(TEST_SLEEP);

        try {
            testClass.Basic.setUsername(BW_USERNAME);
            testClass.Basic.setPassword(BW_PASSWORD);

            String callState = testClass.callsApi.getCallState(BW_ACCOUNT_ID, callId).getState();
            if (!callState.equalsIgnoreCase("disconnected")) {
                UpdateCall updateCallBody = new UpdateCall();
                updateCallBody.setState(CallStateEnum.COMPLETED);
                ApiResponse<Void> response = testClass.callsApi.updateCallWithHttpInfo(BW_ACCOUNT_ID,
                        callId,
                        updateCallBody);
            }
        } catch (ApiException e) {
            System.out.println("API Error: " + e.toString());
            throw new Exception("Failed to terminate all calls: [" + callId + "]");
        }
    }
}
