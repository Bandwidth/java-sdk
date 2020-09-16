
package com.bandwidth.voice.bxml.verbs;

import lombok.Builder;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.net.URI;

/**
 * Start Gather Verb
 */
@Builder
@XmlType(name = StartGather.TYPE_NAME)
public class StartGather implements Verb {
    public static final String TYPE_NAME = "StartGather";

    /**
     * <i>(optional)</i> A custom string that will be sent with this and all future callbacks unless overwritten by a future tag attribute or cleared.
     * <br/>
     * May be cleared by setting tag=""
     * <br/>
     * Max length 256 characters.
     */
    @XmlAttribute
    private String tag;

    /**
     * <i>(optional)</i> The username to send in the HTTP request to recordCompleteUrl or recordingAvailableUrl. If specified, the URLs must be TLS-encrypted (i.e., https).
     */
    @XmlAttribute
    protected String username;

    /**
     * <i>(optional)</i> The password to send in the HTTP request to recordCompleteUrl or recordingAvailableUrl. If specified, the URLs must be TLS-encrypted (i.e., https).
     */
    @XmlAttribute
    protected String password;

    @XmlAttribute
    protected URI dtmfUrl;

    @XmlAttribute
    protected Method dtmfMethod;

    public static class StartGatherBuilder {

        /**
         * URL to send the DTMF event to. May be a relative URL.
         */
        public StartGatherBuilder dtmfUrl(URI uri ){
            this.dtmfUrl = uri;
            return this;
        }

        /**
         * URL to send the DTMF event to. May be a relative URL.
         */
        public StartGatherBuilder dtmfUrl(String uri){
            return dtmfUrl(URI.create(uri));
        }

        /**
         * (optional) The HTTP method to use for the request to dtmfUrl. GET or POST. Default value is POST.
         */
        public StartGatherBuilder dtmfMethod(Method method){
            this.dtmfMethod = method;
            return this;
        }

        /**
         * (optional) The HTTP method to use for the request to dtmfUrl. GET or POST. Default value is POST.  Converts String to Method using Method.fromValue(method)
         */
        public StartGatherBuilder dtmfMethod(String method){
            return dtmfMethod(Method.fromValue(method));
        }
    }

}
