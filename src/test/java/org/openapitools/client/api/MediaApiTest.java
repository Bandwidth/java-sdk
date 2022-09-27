/*
 * Bandwidth
 * Bandwidth's Communication APIs
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: letstalk@bandwidth.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import java.io.File;
import org.openapitools.client.model.Media;
import org.openapitools.client.model.MessagingRequestError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MediaApi
 */
@Disabled
public class MediaApiTest {

    private final MediaApi api = new MediaApi();

    /**
     * Delete Media
     *
     * Deletes a media file from Bandwidth API server. Make sure you don&#39;t have any application scripts still using the media before you delete.  If you accidentally delete a media file you can immediately upload a new file with the same name.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteMediaTest() throws ApiException {
        String accountId = null;
        String mediaId = null;
        api.deleteMedia(accountId, mediaId);
        // TODO: test validations
    }

    /**
     * Get Media
     *
     * Downloads a media file you previously uploaded.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMediaTest() throws ApiException {
        String accountId = null;
        String mediaId = null;
        File response = api.getMedia(accountId, mediaId);
        // TODO: test validations
    }

    /**
     * List Media
     *
     * Gets a list of your media files. No query parameters are supported.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listMediaTest() throws ApiException {
        String accountId = null;
        String continuationToken = null;
        List<Media> response = api.listMedia(accountId, continuationToken);
        // TODO: test validations
    }

    /**
     * Upload Media
     *
     * Upload a file. You may add headers to the request in order to provide some control to your media file.  A list of supported media types can be found [here](https://support.bandwidth.com/hc/en-us/articles/360014128994-What-MMS-file-types-are-supported-).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uploadMediaTest() throws ApiException {
        String accountId = null;
        String mediaId = null;
        File body = null;
        String contentType = null;
        String cacheControl = null;
        api.uploadMedia(accountId, mediaId, body, contentType, cacheControl);
        // TODO: test validations
    }

}
