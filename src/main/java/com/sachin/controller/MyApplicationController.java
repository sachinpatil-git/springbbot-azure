package com.sachin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/application/api")
public class MyApplicationController {
	@GetMapping("/")
	public String getMessage() {
		return "!!!! Hello World !!!!";
	}
	@GetMapping("/hello")
	public String sayHello() {
		return "!!!! Hello World 2";
	}

}
