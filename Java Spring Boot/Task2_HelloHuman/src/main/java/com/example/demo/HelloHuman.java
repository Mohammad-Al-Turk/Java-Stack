package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHuman {
	
	@RequestMapping("/")
	public String HelloHuman() {
		return "Hello Human";
	}
	
	@RequestMapping("/{name}")
	public String name(@PathVariable("name") String name) {
		return "Hello " + name;
	}
	
	
}
