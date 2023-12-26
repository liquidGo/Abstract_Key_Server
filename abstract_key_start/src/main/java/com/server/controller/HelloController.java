package com.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.server.domain.HelloResult;
import com.server.enums.HelloEnum;

@RestController
public class HelloController {
  
  @GetMapping ("/hello/{code}")

  public String hello(HelloResult result) {

    result.setCode("200");
    return result.getCode();

  }

  @GetMapping ("/hello2/{code}")
  public String hello(@PathVariable("code") String code) {
    HelloResult result = new HelloResult();
    result.setCode(code);
    return result.getCode();
    // return "hello" + code;
  }

  @GetMapping("/h3")
  public String hello3() {

    return HelloEnum.FAILED.getNames();
  }

}
