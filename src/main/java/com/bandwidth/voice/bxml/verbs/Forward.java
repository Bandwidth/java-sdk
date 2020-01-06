
package com.bandwidth.voice.bxml.verbs;

import lombok.Builder;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.time.Duration;

/**
 * Forwards an unanswered incoming call to another number.
 *
 */
@Builder
@XmlType(name = Forward.TYPE_NAME)
public class Forward implements Verb {

    public static final String TYPE_NAME = "Forward";

    /**
     * Number to forward the call to. Must be in E.164 format (e.g. +15555555555)
     */
    @XmlAttribute
    private String to;

    /**
     * <i>(optional)</i> Number to use for caller ID on the outgoing leg. Must be in E.164 format (e.g. +15555555555). If omitted, assumes the "to" number of the original leg.
     */
    @XmlAttribute
    private String from;

    /**
     * <i>(optional)</i> Number of seconds to wait for an answer before abandoning the call. Default: 30.
     */
    @XmlAttribute
    private long callTimeout;

    /**
     * <i>(optional)</i> Can be any of the following:
     * <br/>
     * <b>none</b>: No diversion headers are sent on the outbound leg of the transferred call.
     * <br/>
     * <b>propagate</b>: Copy the Diversion header from the inbound leg to the outbound leg. Ignored if there is no Diversion header present on the inbound leg.
     * <br/>
     * <b>stack</b>: After propagating any Diversion header from the inbound leg to the outbound leg, stack on top another Diversion header based on the Request-URI of the inbound call.
     *
     */
    @XmlAttribute
    private String diversionTreatment;


    /**
     * <i>(optional)</i> This parameter is considered only when diversionTreatment is set to stack.
     *<br/>
     * Can be any of the following Strings:
     * <br/>
     * unknown
     * <br/>
     * user-busy
     * <br/>
     * no-answer
     * <br/>
     * unavailable
     * <br/>
     * unconditional
     * <br/>
     * time-of-day
     * <br/>
     * do-not-disturb
     * <br/>
     * deflection
     * <br/>
     * follow-me
     * <br/>
     * out-of-service
     * <br/>
     * away
     *
     */
    @XmlAttribute
    private String diversionReason;

}
