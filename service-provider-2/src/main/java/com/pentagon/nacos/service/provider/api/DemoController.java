package com.pentagon.nacos.service.provider.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

	@RequestMapping(value = "/hello")
	public String hello() {
		logger.info("Hello from service provider-2");
		return "Hello from service provider-2.";
	}
	
}
