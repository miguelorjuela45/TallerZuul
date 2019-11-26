package com.example.Api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@GetMapping("/")
	public String hi() {
		return "bienvenidos grupo de web";
	}
}
