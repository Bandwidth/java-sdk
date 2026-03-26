package com.bandwidth.sdk.smoke;

import com.bandwidth.sdk.api.EndpointsApi;
import com.bandwidth.sdk.ApiResponse;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.model.CreateWebRtcConnectionRequest;
import com.bandwidth.sdk.model.CreateEndpointResponse;
import com.bandwidth.sdk.model.CreateEndpointResponseData;
import com.bandwidth.sdk.model.EndpointResponse;
import com.bandwidth.sdk.model.Endpoint;
import com.bandwidth.sdk.model.Endpoints;
import com.bandwidth.sdk.model.EndpointDirectionEnum;
import com.bandwidth.sdk.model.EndpointTypeEnum;
import com.bandwidth.sdk.model.EndpointStatusEnum;
import com.bandwidth.sdk.model.ListEndpointsResponse;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Assertions;

import java.time.OffsetDateTime;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.is;

import static com.bandwidth.sdk.utils.TestingEnvironmentVariables.*;

@SuppressWarnings("null")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class EndpointsApiTest {
    private static ApiClient oauthClient = new ApiClient(BW_CLIENT_ID, BW_CLIENT_SECRET, null);
    public final EndpointsApi api = new EndpointsApi(oauthClient);

    private String endpointId;

    @Test
    @Order(1)
    public void createEndpointTest() throws ApiException {
        CreateWebRtcConnectionRequest endpointBody = new CreateWebRtcConnectionRequest()
                .type(EndpointTypeEnum.WEBRTC)
                .direction(EndpointDirectionEnum.BIDIRECTIONAL);

        ApiResponse<CreateEndpointResponse> response = api.createEndpointWithHttpInfo(BW_ACCOUNT_ID, endpointBody);

        assertThat(response.getStatusCode(), is(201));
        assertThat(response.getData(), instanceOf(CreateEndpointResponse.class));
        assertThat(response.getData().getData(), instanceOf(CreateEndpointResponseData.class));
        assertThat(response.getData().getData().getEndpointId(), instanceOf(String.class));
        assertThat(response.getData().getData().getToken(), instanceOf(String.class));
        assertThat(response.getData().getData().getType(), equalTo(EndpointTypeEnum.WEBRTC));
        assertThat(response.getData().getData().getStatus(), instanceOf(EndpointStatusEnum.class));
        assertThat(response.getData().getData().getCreationTimestamp(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().getData().getExpirationTimestamp(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().getErrors(), instanceOf(List.class));

        endpointId = response.getData().getData().getEndpointId();
    }

    @Test
    @Order(2)
    public void listEndpointsTest() throws ApiException {
        ApiResponse<ListEndpointsResponse> response = api.listEndpointsWithHttpInfo(BW_ACCOUNT_ID, null, null, null, null);

        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData(), instanceOf(ListEndpointsResponse.class));
        assertThat(response.getData().getData(), instanceOf(List.class));
        assertThat(response.getData().getErrors(), instanceOf(List.class));

        Endpoints firstEndpoint = response.getData().getData().get(0);
        assertThat(firstEndpoint.getEndpointId(), instanceOf(String.class));
        assertThat(firstEndpoint.getType(), instanceOf(EndpointTypeEnum.class));
        assertThat(firstEndpoint.getStatus(), instanceOf(EndpointStatusEnum.class));
        assertThat(firstEndpoint.getCreationTimestamp(), instanceOf(OffsetDateTime.class));
        assertThat(firstEndpoint.getExpirationTimestamp(), instanceOf(OffsetDateTime.class));
    }

    @Test
    @Order(3)
    public void getEndpointTest() throws ApiException {
        ApiResponse<EndpointResponse> response = api.getEndpointWithHttpInfo(BW_ACCOUNT_ID, endpointId);

        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData(), instanceOf(EndpointResponse.class));
        assertThat(response.getData().getErrors(), instanceOf(List.class));
        assertThat(response.getData().getData(), instanceOf(Endpoint.class));
        assertThat(response.getData().getData().getEndpointId(), equalTo(endpointId));
        assertThat(response.getData().getData().getType(), equalTo(EndpointTypeEnum.WEBRTC));
        assertThat(response.getData().getData().getStatus(), instanceOf(EndpointStatusEnum.class));
        assertThat(response.getData().getData().getCreationTimestamp(), instanceOf(OffsetDateTime.class));
        assertThat(response.getData().getData().getExpirationTimestamp(), instanceOf(OffsetDateTime.class));
    }

    @Test
    @Order(4)
    public void deleteEndpointTest() throws ApiException {
        ApiResponse<Void> response = api.deleteEndpointWithHttpInfo(BW_ACCOUNT_ID, endpointId);

        assertThat(response.getStatusCode(), is(204));
    }

    @Test
    public void shouldThrow401UnauthorizedWithInvalidCredentials() {
        ApiClient badOauthClient = new ApiClient("invalid-client-id", "invalid-client-secret", null);
        EndpointsApi endpointsApiBad = new EndpointsApi(badOauthClient);

        Assertions.assertThrows(ApiException.class,
                () -> endpointsApiBad.listEndpointsWithHttpInfo(BW_ACCOUNT_ID, null, null, null, null));
    }

    @Test
    public void shouldThrow404NotFoundWithInvalidAccount() throws ApiException {
        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> api.listEndpointsWithHttpInfo("invalid-account-id", null, null, null, null));

        assertThat(exception.getCode(), is(404));
    }

    @Test
    public void shouldThrow404NotFoundForNonExistentEndpoint() throws ApiException {
        ApiException exception = Assertions.assertThrows(ApiException.class,
                () -> api.getEndpointWithHttpInfo(BW_ACCOUNT_ID, "does-not-exist"));

        assertThat(exception.getCode(), is(404));
    }
}
