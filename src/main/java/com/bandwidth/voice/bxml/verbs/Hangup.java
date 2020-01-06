
package com.bandwidth.voice.bxml.verbs;

import lombok.Builder;

import javax.xml.bind.annotation.XmlType;

/**
 * The Hangup verb is used to hang up the current call.  No further BXML verbs are processed.
 *<br/>
 * The Hangup verb is also used to reject incoming calls either explicitly or implicitly.
 */
@Builder
@XmlType(name = Hangup.TYPE_NAME)
public class Hangup implements Verb {
    public static final String TYPE_NAME = "Hangup";

}
