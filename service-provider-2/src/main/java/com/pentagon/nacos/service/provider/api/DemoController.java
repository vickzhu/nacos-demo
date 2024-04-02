package com.pentagon.nacos.service.provider.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping(value = "/hello")
	public String hello() {
		return "Hello from service provider-2.";
	}
	
}
