package com.simple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SimpleController {

	@GetMapping
	public String sayHello() {
		return "Hello from Simple API";
	}
}
