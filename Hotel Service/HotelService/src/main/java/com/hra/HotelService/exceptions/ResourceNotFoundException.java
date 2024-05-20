package com.hra.HotelService.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	public ResourceNotFoundException(String msg) {
		super(msg);
	}
	
	public ResourceNotFoundException() {
		super();
	}
	
}
