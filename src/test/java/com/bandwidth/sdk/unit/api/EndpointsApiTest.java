package com.bandwidth.sdk.unit.api;

import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.ApiResponse;
import com.bandwidth.sdk.api.EndpointsApi;
import com.bandwidth.sdk.model.CreateEndpointResponse;
import com.bandwidth.sdk.model.CreateEndpointResponseData;
import com.bandwidth.sdk.model.CreateWebRtcConnectionRequest;
import com.bandwidth.sdk.model.Endpoint;
import com.bandwidth.sdk.model.EndpointDirectionEnum;
import com.bandwidth.sdk.model.EndpointResponse;
import com.bandwidth.sdk.model.EndpointStatusEnum;
import com.bandwidth.sdk.model.EndpointTypeEnum;
import com.bandwidth.sdk.model.Endpoints;
import com.bandwidth.sdk.model.ListEndpointsResponse;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.util.List;

import static com.bandwidth.sdk.utils.TestingEnvironmentVariables.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

/**
 * API tests for EndpointsApi
 */
@SuppressWarnings("null")
public class EndpointsApiTest {
    private static ApiClient oauthClient = new ApiClient(BW_CLIENT_ID, BW_CLIENT_SECRET, null);
    private static EndpointsApi api = new EndpointsApi(oauthClient);

    @BeforeAll
    public static void setUp() {
        api.setCustomBaseUrl("http://127.0.0.1:4010");
    }

    /**
     * Create Endpoint
     *
     * Creates a new endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createEndpointTest() throws ApiException {
        CreateWebRtcConnectionRequest endpointBody = new CreateWebRtcConnectionRequest()
                .type(EndpointTypeEnum.WEBRTC)
                .direction(EndpointDirectionEnum.BIDIRECTIONAL);

        ApiResponse<CreateEndpointResponse> response = api.createEndpointWithHttpInfo(BW_ACCOUNT_ID, endpointBody);

        assertThat(response.getStatusCode(), is(201));
        assertThat(response.getData(), instanceOf(CreateEndpointResponse.class));
        assertThat(response.getData().getLinks(), instanceOf(List.class));
        assertThat(response.getData().getData(), instanceOf(CreateEndpointResponseData.class));
        assertThat(response.getData().getData().getEndpointId(), instanceOf(String.class));
        assertThat(response.getData().getData().getToken(), instanceOf(String.class));
        assertThat(response.getData().getData().getType(), instanceOf(EndpointTypeEnum.class));
        assertThat(response.getData().getData().getStatus(), instanceOf(EndpointStatusEnum.class));
        assertThat(response.getData().getData().getCreationTimestamp(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().getData().getExpirationTimestamp(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().getErrors(), instanceOf(List.class));
    }

    /**
     * List Endpoints
     *
     * Lists all endpoints for the account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listEndpointsTest() throws ApiException {
        ApiResponse<ListEndpointsResponse> response = api.listEndpointsWithHttpInfo(BW_ACCOUNT_ID, null, null, null, null);

        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData(), instanceOf(ListEndpointsResponse.class));
        assertThat(response.getData().getLinks(), instanceOf(List.class));
        assertThat(response.getData().getData(), instanceOf(List.class));
        assertThat(response.getData().getData().get(0), instanceOf(Endpoints.class));
        assertThat(response.getData().getData().get(0).getEndpointId(), instanceOf(String.class));
        assertThat(response.getData().getData().get(0).getType(), instanceOf(EndpointTypeEnum.class));
        assertThat(response.getData().getData().get(0).getStatus(), instanceOf(EndpointStatusEnum.class));
        assertThat(response.getData().getData().get(0).getCreationTimestamp(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().getData().get(0).getExpirationTimestamp(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().getErrors(), instanceOf(List.class));
    }

    /**
     * Get Endpoint
     *
     * Gets the details of a specific endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEndpointTest() throws ApiException {
        String endpointId = "test-endpoint-id";
        ApiResponse<EndpointResponse> response = api.getEndpointWithHttpInfo(BW_ACCOUNT_ID, endpointId);

        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData(), instanceOf(EndpointResponse.class));
        assertThat(response.getData().getLinks(), instanceOf(List.class));
        assertThat(response.getData().getData(), instanceOf(Endpoint.class));
        assertThat(response.getData().getData().getEndpointId(), instanceOf(String.class));
        assertThat(response.getData().getData().getType(), instanceOf(EndpointTypeEnum.class));
        assertThat(response.getData().getData().getStatus(), instanceOf(EndpointStatusEnum.class));
        assertThat(response.getData().getData().getCreationTimestamp(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().getData().getExpirationTimestamp(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().getErrors(), instanceOf(List.class));
    }

    /**
     * Delete Endpoint
     *
     * Deletes an endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteEndpointTest() throws ApiException {
        String endpointId = "test-endpoint-id";
        ApiResponse<Void> response = api.deleteEndpointWithHttpInfo(BW_ACCOUNT_ID, endpointId);

        assertThat(response.getStatusCode(), is(204));
    }

    /**
     * Update Endpoint BXML
     *
     * Updates the BXML for an endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateEndpointBxmlTest() throws ApiException {
        String endpointId = "test-endpoint-id";
        String bxml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Bxml><SpeakSentence>Hello</SpeakSentence></Bxml>";
        ApiResponse<Void> response = api.updateEndpointBxmlWithHttpInfo(BW_ACCOUNT_ID, endpointId, bxml);

        assertThat(response.getStatusCode(), is(204));
    }
}
