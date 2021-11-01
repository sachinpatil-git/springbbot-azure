package com.sachin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/application/api")
public class MyApplicationController {
	
	private Logger logger = LoggerFactory.getLogger(MyApplicationController.class);
	
	@GetMapping("/")
	public String getMessage() {
		logger.info("Inside getMessage() ");
		return "!!!! Hello World !!!!";
	}
	@GetMapping("/hello")
	public String sayHello() {
		logger.info("Inside sayHello() ");
		return "!!!! Hello World 2 !!!!";
	}
	@GetMapping("/message")
	public String message() {
		logger.info("Inside message() ");
		return "!!!! My first Springboot Application Runnning on Azure Platform !!!!";
	}

}
