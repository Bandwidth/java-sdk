package com.bandwidth.sdk.smoke;

import com.bandwidth.sdk.api.EndpointsApi;
import com.bandwidth.sdk.ApiResponse;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.model.CreateWebRtcConnectionRequest;
import com.bandwidth.sdk.model.CreateEndpointResponse;
import com.bandwidth.sdk.model.EndpointResponse;
import com.bandwidth.sdk.model.Endpoints;
import com.bandwidth.sdk.model.EndpointDirectionEnum;
import com.bandwidth.sdk.model.EndpointTypeEnum;
import com.bandwidth.sdk.model.ListEndpointsResponse;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Assertions;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.beans.HasPropertyWithValue.hasProperty;

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
    public void shouldCreateNewEndpoint() throws ApiException {
        CreateWebRtcConnectionRequest endpointBody = new CreateWebRtcConnectionRequest();
        endpointBody.setType(EndpointTypeEnum.WEBRTC);
        endpointBody.setDirection(EndpointDirectionEnum.BIDIRECTIONAL);

        ApiResponse<CreateEndpointResponse> response = api.createEndpointWithHttpInfo(BW_ACCOUNT_ID, endpointBody);

        assertThat(response.getStatusCode(), is(201));
        assertThat(response.getData(), notNullValue());
        assertThat(response.getData().getData(), notNullValue());
        assertThat(response.getData().getData(), hasProperty("endpointId", is(instanceOf(String.class))));
        assertThat(response.getData().getData(), hasProperty("token", is(instanceOf(String.class))));
        assertThat(response.getData().getData(), hasProperty("type", is(EndpointTypeEnum.WEBRTC)));
        assertThat(response.getData().getData(), hasProperty("status", notNullValue()));
        assertThat(response.getData().getData(), hasProperty("creationTimestamp", notNullValue()));
        assertThat(response.getData().getData(), hasProperty("expirationTimestamp", notNullValue()));
        assertThat(response.getData().getErrors(), instanceOf(List.class));
        assertThat(response.getData().getErrors(), hasSize(0));

        endpointId = response.getData().getData().getEndpointId();
    }

    @Test
    @Order(2)
    public void shouldListEndpointsForAccount() throws ApiException {
        ApiResponse<ListEndpointsResponse> response = api.listEndpointsWithHttpInfo(BW_ACCOUNT_ID, null, null, null, null);

        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData(), notNullValue());
        assertThat(response.getData().getData(), instanceOf(List.class));
        assertThat(response.getData().getPage(), notNullValue());
        assertThat(response.getData().getPage().getTotalElements(), notNullValue());
        assertThat(response.getData().getErrors(), instanceOf(List.class));

        Endpoints createdEndpoint = response.getData().getData().stream()
                .filter(item -> item.getEndpointId().equals(endpointId))
                .findFirst()
                .orElse(null);

        assertThat(createdEndpoint, notNullValue());
        assertThat(createdEndpoint, hasProperty("type", is(EndpointTypeEnum.WEBRTC)));
        assertThat(createdEndpoint, hasProperty("status", notNullValue()));
        assertThat(createdEndpoint, hasProperty("creationTimestamp", notNullValue()));
        assertThat(createdEndpoint, hasProperty("expirationTimestamp", notNullValue()));
    }

    @Test
    @Order(3)
    public void shouldListEndpointsFilteredByType() throws ApiException {
        ApiResponse<ListEndpointsResponse> response = api.listEndpointsWithHttpInfo(BW_ACCOUNT_ID, EndpointTypeEnum.WEBRTC, null, null, null);

        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData().getData(), instanceOf(List.class));
        assertThat(response.getData().getErrors(), instanceOf(List.class));

        if (response.getData().getData().size() > 0) {
            boolean allWebRtc = response.getData().getData().stream()
                    .allMatch(item -> item.getType() == EndpointTypeEnum.WEBRTC);
            assertThat(allWebRtc, is(true));
        }
    }

    @Test
    @Order(4)
    public void shouldRetrieveDetailsOfSpecificEndpoint() throws ApiException {
        ApiResponse<EndpointResponse> response = api.getEndpointWithHttpInfo(BW_ACCOUNT_ID, endpointId);

        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData(), notNullValue());
        assertThat(response.getData().getErrors(), instanceOf(List.class));
        assertThat(response.getData().getErrors(), hasSize(0));
        assertThat(response.getData().getData(), notNullValue());
        assertThat(response.getData().getData(), hasProperty("endpointId", is(endpointId)));
        assertThat(response.getData().getData(), hasProperty("type", is(EndpointTypeEnum.WEBRTC)));
        assertThat(response.getData().getData(), hasProperty("status", notNullValue()));
        assertThat(response.getData().getData(), hasProperty("creationTimestamp", notNullValue()));
        assertThat(response.getData().getData(), hasProperty("expirationTimestamp", notNullValue()));
    }

    @Test
    @Order(5)
    public void shouldDeleteEndpoint() throws ApiException {
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
