package com.api.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/")
  public String hello() {
    System.out.println("hello");
    return "你好，世界们！";
  }

  @GetMapping("/greet/{name}")
  public String greet(@PathVariable String name) {
    return "你好，" + name + "！";
  }

  @PostMapping("/calculate")
  public String calculate(@RequestParam int num1, @RequestParam int num2) {
    int sum = num1 + num2;
    return "两数之和为：" + sum;
  }
}