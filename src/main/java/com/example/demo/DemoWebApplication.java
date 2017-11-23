package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

import com.example.beans.HelloName;
import com.example.beans.HelloWorldBean;

@SpringBootApplication
@ComponentScan("com.example")
public class DemoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoWebApplication.class, args);
	}
	
	@Bean("sampleBean")
	public HelloName getHelloWorldBean() {
		HelloName bean = new HelloWorldBean();
		bean.setName("prowareness");
		return bean;
	}
}
