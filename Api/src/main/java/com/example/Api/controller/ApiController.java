package com.example.Api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiController {
	@Value("${app.id}")
	String instance;
	
	@GetMapping("/")
	public String hi()
	{
		return "welcome, i am " + instance;
	}
}
