package com.pentagon.nacos.service.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="service-provider")
public interface HelloClient {
	
	@RequestMapping(value = "/hello")
	public String hello();
	
}
