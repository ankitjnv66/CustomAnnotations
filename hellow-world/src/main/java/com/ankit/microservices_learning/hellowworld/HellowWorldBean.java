package com.ankit.microservices_learning.hellowworld;

public class HellowWorldBean {

	public String message;
	
	public HellowWorldBean(String message) {
		this.message=message;
	}

	@Override
	public String toString() {
		return "HellowWorldBean [message=" + message + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
