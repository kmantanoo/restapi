package com.kriss.springboot.restapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/greeting")
	public String index() {
		return "Greetings from Spring Boot!";
	}
}
