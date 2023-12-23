package com.api.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class TestApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
    System.out.println("Hello World!");
		SpringApplication.run(TestApplication.class, args);
	}

}
