package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Checking {
	
	@GetMapping("/abc")
	public String Check() {
		return "Hello Vikas";
	}

}
