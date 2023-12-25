package com.server.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.server.domain.ResponseResult;;

@RestController
public class HelloController {
  
  @GetMapping ("/hello/{code}")

  public ResponseResult hello(ResponseResult result) {

    result.setCode("200");
    return result;

  }

  @GetMapping ("/hello2/{code}")
  public String hello(@PathParam("code") String code) {
    return "hello" + code;
  }
}
