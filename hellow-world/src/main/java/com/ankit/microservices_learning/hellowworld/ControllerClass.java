package com.ankit.microservices_learning.hellowworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

	@RequestMapping("/")
	public String normal() {
		return "Hellow World";
	}
	
	@RequestMapping("/hellow-world")
	public String helloWorld() {
		return "Hellow World";
	}
	
	@RequestMapping("/hellow-world-bean")
	public HellowWorldBean helloWorldBean() {
		return new HellowWorldBean("Hellow World");
	}
	
	
	
	
}
