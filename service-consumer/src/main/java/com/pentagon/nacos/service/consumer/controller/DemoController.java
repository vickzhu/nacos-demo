package com.pentagon.nacos.service.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pentagon.nacos.service.consumer.api.HelloClient;

@RestController
public class DemoController {
	
	@Autowired
	private HelloClient helloClient;

	@GetMapping(value = "/hello")
	public String hello() {
//		System.out.println(111111);
		return helloClient.hello();
	}
	
}
