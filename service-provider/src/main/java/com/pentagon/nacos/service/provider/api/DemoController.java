package com.pentagon.nacos.service.provider.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	private static final Logger logger = LoggerFactory.getLogger(DemoController.class);
	
	@Value("${provider.name}")
	private String name;

	@Value("${provider.age}")
	private int age;
	
	@RequestMapping(value = "/hello")
	public String hello() {
		System.out.println("name: " + name);
		System.out.println("age:" + age);
		logger.info("Hello from service provider-1");
		return "Hello from service provider-1.";
	}
	
}
