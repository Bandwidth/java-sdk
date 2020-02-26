/*
 * BandwidthLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bandwidth.http.request;

import com.bandwidth.utilities.FileWrapper;
import com.bandwidth.http.Headers;

/**
 * Class to wrap file and headers to be sent as part of a multipart request.
 */
public class MultipartFileWrapper {

    private FileWrapper fileWrapper;
    private Headers headers;

    /**
     * Initialization constructor
     * @param fileWrapper
     * @param headers
     */
    public MultipartFileWrapper(FileWrapper fileWrapper, Headers headers) {
        this.fileWrapper = fileWrapper;
        this.headers = headers;
    }

    /**
     * @return FileWrapper instance
     */
    public FileWrapper getFileWrapper() {
        return fileWrapper;
    }

    /**
     * @return Headers
     */
    public Headers getHeaders() {
        return headers;
    }
}
