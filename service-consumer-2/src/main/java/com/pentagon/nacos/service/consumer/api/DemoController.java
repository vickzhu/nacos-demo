package com.pentagon.nacos.service.consumer.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pentagon.nacos.service.consumer.client.HelloClient;

@RestController
public class DemoController {
	
	@Autowired
	private HelloClient helloClient;

	@RequestMapping(value = "/hello")
	public String hello() {
//		System.out.println(111111);
		return helloClient.hello();
	}
	
}
