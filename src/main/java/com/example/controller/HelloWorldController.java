package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.SamplePojo;
import com.example.service.HelloWorldService;

@RestController
public class HelloWorldController {
	
	@Autowired
	private HelloWorldService service;
	
	@RequestMapping(value="display",method = RequestMethod.GET)
	public  SamplePojo displayHelloWorld() {
		SamplePojo a = new SamplePojo();
		a.setLastname("last");
		a.setName("name");
		return a;
	}
	
	@RequestMapping(value="display1",method = RequestMethod.GET)
	public  String displayHelloWorld1() {
		return "Hello " + service.fetchName();
	}
}
