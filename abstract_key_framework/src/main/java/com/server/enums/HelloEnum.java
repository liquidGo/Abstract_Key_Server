package com.server.enums;

import lombok.Getter;

@Getter
public enum HelloEnum {

  FAILED("FAILED", "已完成", "TT");

  private String code;
  private String desc;
  private String names;

  HelloEnum(String code, String desc, String names) {
    this.code = code;
    this.desc = desc;
    this.names = names;
  }

  public static HelloEnum getHelloEnum(String name) {
    System.out.println(name);
    return null;
  }

}

