
package com.bandwidth.voice.bxml.verbs.adapter;

import com.bandwidth.voice.bxml.verbs.FileFormat;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class FileFormatAdapter extends XmlAdapter<String, FileFormat> {

    @Override
    public FileFormat unmarshal(String v) throws Exception {
        return FileFormat.fromValue(v);
    }

    @Override
    public String marshal(FileFormat v) throws Exception {
        return v == null ? null : v.toString();
    }
}
