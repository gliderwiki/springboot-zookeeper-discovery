package com.libqa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/helloworld")
	public String helloWorld() {
		return "Hello World! provider 1";
	}
	
	@GetMapping("/name")
	public String name() {
		return "provider 1";
	}

}