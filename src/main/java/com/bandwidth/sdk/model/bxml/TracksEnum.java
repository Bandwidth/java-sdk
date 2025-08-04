package com.bandwidth.sdk.model.bxml;

public enum TracksEnum {
  
  inbound("inbound"),
  
  outbound("outbound");

  private String value;

  TracksEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
