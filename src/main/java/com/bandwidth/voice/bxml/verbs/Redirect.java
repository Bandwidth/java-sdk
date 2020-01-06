
package com.bandwidth.voice.bxml.verbs;

import lombok.Builder;

import java.net.URI;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * The Redirect verb is used to redirect the current XML execution to another URL.
 */
@Builder
@XmlType(name = Redirect.TYPE_NAME)
public class Redirect implements Verb {

    public static final String TYPE_NAME = "Redirect";


    /**
     * <b>(required)</b> URL to request new BXML from. A Redirect event will be sent to this endpoint.
     */
    @XmlAttribute
    private URI redirectUrl;

    /**
     * <i>(optional)</i> The HTTP method to use for the request to redirectUrl. GET or POST. Default Value is POST.
     */
    @XmlAttribute
    private Method redirectMethod;

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
     * <i>(optional)</i> The username to send in the HTTP request to redirectUrl.
     */
    @XmlAttribute
    protected String username;

    /**
     * <i>(optional)</i> The password to send in the HTTP request to redirectUrl.
     */
    @XmlAttribute
    protected String password;

    public static class RedirectBuilder {

        /**
         * <b>(required)</b> URL to request new BXML from. A Redirect event will be sent to this endpoint.
         */
        public RedirectBuilder redirectUrl(URI uri ){
            this.redirectUrl = uri;
            return this;
        }

        /**
         * <b>(required)</b> URL to request new BXML from. A Redirect event will be sent to this endpoint.  Converts to URI using URI.create(url)
         */
        public RedirectBuilder redirectUrl(String uri){
            return redirectUrl(URI.create(uri));
        }

        /**
         * <i>(optional)</i> The HTTP method to use for the request to redirectUrl. GET or POST. Default Value is POST.
         */
        public RedirectBuilder redirectMethod(Method method){
            this.redirectMethod = method;
            return this;
        }

        /**
         * <i>(optional)</i> The HTTP method to use for the request to redirectUrl. GET or POST. Default Value is POST.  Converts String to Method using Method.fromValue(method)
         */
        public RedirectBuilder redirectMethod(String method){
            return redirectMethod(Method.fromValue(method));
        }
    }
}
