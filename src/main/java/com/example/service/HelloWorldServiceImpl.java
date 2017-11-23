package com.example.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.example.beans.HelloName;
import com.example.demo.DemoWebApplication;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {
	
	@Override
	public String fetchName() {
		ApplicationContext context = new AnnotationConfigApplicationContext(DemoWebApplication.class);
		HelloName name = (HelloName)context.getBean("sampleBean");
		return name.getName();
	}

}
