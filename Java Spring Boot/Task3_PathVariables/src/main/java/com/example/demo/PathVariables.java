package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class PathVariables {
	
	@RequestMapping("/travel/{name}")
	public String travel(@PathVariable("name") String name) {
		return "Congratulations! You will soon travel to " + name;
	}
	
	
	@RequestMapping("/lotto/{num}")
	public String lotto(@PathVariable("num") int num) {
		if(num % 2 == 0) {
			return "You will take a grand journey in the near future but be wary of tempting offers";
		}
		
		else {
			return "You have enjoyed the fruits of your labor, but now is a great time to spend time with family and friends";
		}
		
	}
	
	
}
