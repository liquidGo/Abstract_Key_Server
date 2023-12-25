package com.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// springBootServletInitializer
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * TODO: 多Maven改为单Maven，后续购买服务器再迁移。
 */
@SpringBootApplication
public class App  extends SpringBootServletInitializer{
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}