package com.pentagon.nacos.service.consumer.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.pentagon.nacos.service.consumer.hystrix.HelloFallback;

@FeignClient(name="service-provider", fallback = HelloFallback.class)
public interface HelloClient {
	
	@GetMapping("/hello")
	public String hello();
	
}
