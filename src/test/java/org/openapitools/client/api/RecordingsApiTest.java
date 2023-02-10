package org.openapitools.client.api;

import org.openapitools.client.ApiResponse;
import org.openapitools.client.ApiClient;
import org.openapitools.client.auth.HttpBasicAuth;
import org.openapitools.client.Configuration;
import org.openapitools.client.model.CreateCall;
import org.openapitools.client.model.CreateCallResponse;

import com.google.gson.Gson;

import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.openapitools.client.utils.TestingEnvironmentVariables.*;
import static org.openapitools.client.utils.CallCleanup.Cleanup;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RecordingsApiTest {
    public ApiClient defaultClient = Configuration.getDefaultApiClient();
    public HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    public final CallsApi callsApi = new CallsApi(defaultClient);
    public final RecordingsApi recordingsApi = new RecordingsApi(defaultClient);

    private static final OkHttpClient mantecaClient = new OkHttpClient();
    public static final MediaType jsonMediaType = MediaType.get("application/json; charset=utf-8");

    private static URI answerUrl;
    private String callId;
    private static int TEST_SLEEP = 3;
    private static int TEST_SLEEP_LONG = 10;
    private static int MAX_RETRIES = 40;

    @BeforeAll
    public static void setUpBeforeClass() throws URISyntaxException {
        answerUrl = new URI(MANTECA_BASE_URL + "/bxml/joinConferencePause");
        // conferenceRedirectUrl = new URI(MANTECA_BASE_URL + "/bxml/pause");
    }

    @AfterAll
    public void tearDownAfterClass() throws Exception {
        TimeUnit.SECONDS.sleep(TEST_SLEEP);
        Cleanup(this, this.callId);
    }
}
