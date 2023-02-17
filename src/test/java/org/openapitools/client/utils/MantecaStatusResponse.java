package org.openapitools.client.utils;

public class MantecaStatusResponse {
    public Boolean callRecorded;
    public Boolean callTranscribed;

    public MantecaStatusResponse(Boolean callRecorded, Boolean callTranscribed) {
        this.callRecorded = callRecorded;
        this.callTranscribed = callTranscribed;
    }

}
