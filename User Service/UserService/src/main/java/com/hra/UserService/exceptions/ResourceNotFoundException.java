package com.hra.UserService.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	public ResourceNotFoundException() {
		super("Resource not found on servcer !!");
	}
	
	public ResourceNotFoundException(String message) {
		super(message);
	}
	
}
