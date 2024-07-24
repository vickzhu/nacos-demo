package com.pentagon.nacos.service.consumer.hystrix;

import org.springframework.stereotype.Component;

import com.pentagon.nacos.service.consumer.api.HelloClient;

@Component
public class HelloFallback implements HelloClient {
	
	public HelloFallback() {
		System.out.println("Init Hello Fallback!!!");
	}

	@Override
	public String hello() {
		return "Hello fallback!!!";
	}

}
