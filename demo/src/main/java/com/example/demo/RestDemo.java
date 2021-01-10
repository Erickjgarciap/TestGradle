package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDemo {
	
	@GetMapping("/test")
	public String test() {

		return "Hola mundo desde branch test :)";
	}
}
