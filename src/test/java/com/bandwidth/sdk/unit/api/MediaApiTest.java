package com.bandwidth.sdk.unit.api;

import com.bandwidth.sdk.ApiClient;
import com.bandwidth.sdk.ApiException;
import com.bandwidth.sdk.ApiResponse;
import com.bandwidth.sdk.Configuration;
import com.bandwidth.sdk.api.MediaApi;
import com.bandwidth.sdk.auth.HttpBasicAuth;
import com.bandwidth.sdk.model.Media;

import static com.bandwidth.sdk.utils.TestingEnvironmentVariables.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;

import java.io.File;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MediaApiTest {
    private static ApiClient defaultClient = Configuration.getDefaultApiClient();
    private static HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    private static MediaApi api = new MediaApi(defaultClient);

    private static File mediaData = new File("src/test/java/com/bandwidth/sdk/fixtures/java_cat.jpeg");
    private static String mediaName = "java_binary_media";

    @BeforeAll
    public static void setUp() {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);
        api.setCustomBaseUrl("http://127.0.0.1:4010");
    }

    @Test
    @Disabled // Can't set the correct Content-Type and Accept headers for Prism
    public void testUploadMedia() throws ApiException {
        ApiResponse<Void> response = api.uploadMediaWithHttpInfo(BW_ACCOUNT_ID, mediaName, mediaData, "image/jpeg",
                "no-cache");

        assertThat(response.getStatusCode(), is(204));
    }

    @Test
    public void testListMedia() throws ApiException {
        ApiResponse<List<Media>> response = api.listMediaWithHttpInfo(BW_ACCOUNT_ID, null);

        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData().get(0), instanceOf(Media.class));
        assertThat(response.getData().get(0).getContent(), instanceOf(String.class));
        assertThat(response.getData().get(0).getContentLength(), instanceOf(Integer.class));
        assertThat(response.getData().get(0).getMediaName(), instanceOf(String.class));
    }

    @Test
    @Disabled // Can't set the correct Accept header for Prism
    public void testGetMedia() throws ApiException {
        ApiResponse<File> response = api.getMediaWithHttpInfo(BW_ACCOUNT_ID, mediaName);

        assertThat(response.getStatusCode(), is(200));
        assertThat(response.getData(), instanceOf(File.class));
    }

    @Test
    public void testDeleteMedia() throws ApiException {
        ApiResponse<Void> response = api.deleteMediaWithHttpInfo(BW_ACCOUNT_ID, mediaName);

        assertThat(response.getStatusCode(), is(204));
    }
}
