package org.openapitools.client.utils;

import java.util.List;

import org.openapitools.client.api.CallsApiTest;
import org.openapitools.client.api.ConferencesApiTest;
import org.openapitools.client.model.CallStateEnum;
import org.openapitools.client.model.UpdateCall;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;

import static org.openapitools.client.utils.TestingEnvironmentVariables.*;

public class CallCleanup {
    /**
     * Ensure that all CallIds inside of the callIdList have been hung up
     *
     * @param callIdList List of Bandwidth call ID's
     */
    public static final void Cleanup(CallsApiTest testClass, List<String> callIdList) throws Exception {
        if (!callIdList.isEmpty()) {
            try {
                testClass.Basic.setUsername(BW_USERNAME);
                testClass.Basic.setPassword(BW_PASSWORD);
                for (int i = 0; i < callIdList.size(); i++) {
                    String callState = testClass.api.getCallState(BW_ACCOUNT_ID, callIdList.get(i)).getState();
                    if (callState != "disconnected") {
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
     * Ensure that all CallIds inside of the callIdList have been hung up
     *
     * @param callIdList List of Bandwidth call ID's
     */
    public static final void Cleanup(ConferencesApiTest testClass, String callId) throws Exception {
        try {
            testClass.Basic.setUsername(BW_USERNAME);
            testClass.Basic.setPassword(BW_PASSWORD);

            String callState = testClass.callsApi.getCallState(BW_ACCOUNT_ID, callId).getState();
            if (callState != "disconnected") {
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