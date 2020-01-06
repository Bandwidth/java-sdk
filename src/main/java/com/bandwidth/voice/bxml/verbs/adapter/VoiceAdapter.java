
package com.bandwidth.voice.bxml.verbs.adapter;

import com.bandwidth.voice.bxml.verbs.Voice;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class VoiceAdapter extends XmlAdapter<String, Voice> {

    @Override
    public Voice unmarshal(String v) throws Exception {
        return Voice.fromValue(v);
    }

    @Override
    public String marshal(Voice v) throws Exception {
        return v == null ? null : v.toString();
    }
}
