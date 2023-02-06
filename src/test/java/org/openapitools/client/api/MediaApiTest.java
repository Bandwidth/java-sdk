package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.ApiClient;
import org.openapitools.client.auth.HttpBasicAuth;
import org.openapitools.client.model.Media;
import org.openapitools.client.Configuration;
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

import static org.openapitools.client.utils.TestingEnvironmentVariables.*;

@TestMethodOrder(OrderAnnotation.class)
public class MediaApiTest {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    private final MediaApi api = new MediaApi(defaultClient);

    private String mediaPath = "src/test/java/org/openapitools/client/fixtures/";
    private String mediaFile = "java_cat.jpeg";
    private static UUID uuid;
    private String mediaId = JAVA_VERSION + "_" + RUNNER_OS + "_" + uuid + "_" + mediaFile;
    private File media = new File(mediaPath + mediaFile);
    private String content_type = "image/jpeg";
    private String cache_control = "no-cache";

    @BeforeAll
    public static void setupBeforeClass() {
        uuid = UUID.randomUUID();
    }

    @Test
    @Order(1)
    public void uploadMedia() throws ApiException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);

        ApiResponse<Void> response = api.uploadMediaWithHttpInfo(BW_ACCOUNT_ID, this.mediaId, this.media,
                this.content_type,
                this.cache_control);

        assertThat(response.getStatusCode(), is(204));
        System.out.println(this.mediaId);
    }

    @Test
    @Order(2)
    public void listMedia() throws ApiException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);
        ApiResponse<List<Media>> response = api.listMediaWithHttpInfo(BW_ACCOUNT_ID, null);

        assertThat(response.getStatusCode(), is(200));
        System.out.println(this.mediaId);

    }

    @Test
    @Order(3)
    public void getMedia() throws ApiException, IOException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);
        System.out.println(this.mediaId);

        ApiResponse<File> response = api.getMediaWithHttpInfo(BW_ACCOUNT_ID, this.mediaId);

        assertThat(response.getStatusCode(), is(200));
        assertThat(FileUtils.readLines(response.getData(), "utf-8"), is(FileUtils.readLines(this.media, "utf-8")));
    }

    @Test
    @Order(4)
    public void deleteMedia() throws ApiException {
        Basic.setUsername(BW_USERNAME);
        Basic.setPassword(BW_PASSWORD);

        ApiResponse<Void> response = api.deleteMediaWithHttpInfo(BW_ACCOUNT_ID, this.mediaId);
        assertThat(response.getStatusCode(), is(204));
    }
}
