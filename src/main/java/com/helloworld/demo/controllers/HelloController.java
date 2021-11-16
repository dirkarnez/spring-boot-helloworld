package com.helloworld.demo.controllers;

import com.helloworld.demo.dtos.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public Greeting index() {
		var greeting = new Greeting();
		greeting.setContent("Hello from Greeting.java");
		return greeting;
	}
}