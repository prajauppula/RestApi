package com.akshar.smartlife.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping
	public String welcomeMsg() {
		return "Welcome to SpringBoot Microservices...............!!!!!!";
	}
}
