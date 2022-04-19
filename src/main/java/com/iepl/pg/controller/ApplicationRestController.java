package com.iepl.pg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationRestController {

	@GetMapping("/welcome")
	public String getHello() {
		
		return "Hello";
	}
}
