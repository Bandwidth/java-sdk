package com.bandwidth.sdk.api;

import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.ApiResponse;
import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.auth.HttpBasicAuth;
import com.bandwidth.sdk.model.Media;
import com.bandwidth.sdk.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.containsString;

import static com.bandwidth.sdk.utils.TestingEnvironmentVariables.*;

@TestMethodOrder(OrderAnnotation.class)
public class MediaApiTest {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    private final MediaApi api = new MediaApi(defaultClient);

    private static String mediaPath = "src/test/java/com/bandwidth/sdk/fixtures/";
    private static String mediaFile = "java_cat.jpeg";
    private static String mediaId;
    private static UUID uuid;
    private static File media = new File(mediaPath + mediaFile);
    private static String contentType = "image/jpeg";
    private static String cacheControl = "no-cache";

    @BeforeAll
    public static void setupBeforeClass() {
        uuid = UUID.randomUUID();
        mediaId = JAVA_VERSION + "_" + RUNNER_OS + "_" + uuid + "_" + mediaFile;
    }

    @Test
    @Order(1)
    public void uploadMedia() throws ApiException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);

        

        // okhttp3.Call call = api.uploadMediaValidateBeforeCall(BW_ACCOUNT_ID, mediaId, media, contentType, cacheControl, null);
        ApiResponse<Void> response = api.uploadMediaWithHttpInfo(BW_ACCOUNT_ID, mediaId, media,
                contentType,
                cacheControl);

        assertThat(response.getStatusCode(), is(204));
        // assertThat(call.request().toString(), containsString(contentType));
    }

    @Test
    @Order(2)
    public void listMedia() throws ApiException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);
        ApiResponse<List<Media>> response = api.listMediaWithHttpInfo(BW_ACCOUNT_ID, null);

        assertThat(response.getStatusCode(), is(200));
    }

    @Test
    @Order(3)
    public void getMedia() throws ApiException, IOException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);

        ApiResponse<File> response = api.getMediaWithHttpInfo(BW_ACCOUNT_ID, mediaId);

        assertThat(response.getStatusCode(), is(200));
        assertThat(FileUtils.readLines(response.getData(), "utf-8"), is(FileUtils.readLines(media, "utf-8")));
    }

    @Test
    @Order(4)
    public void deleteMedia() throws ApiException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);

        ApiResponse<Void> response = api.deleteMediaWithHttpInfo(BW_ACCOUNT_ID, mediaId);
        assertThat(response.getStatusCode(), is(204));
    }
}
