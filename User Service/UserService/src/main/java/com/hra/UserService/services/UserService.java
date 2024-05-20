package com.hra.UserService.services;

import java.util.List;

import com.hra.UserService.entities.User;

public interface UserService {

	// user operations
	
	//create user
	User saveUser(User user);
	
	//get all user
	List<User> getAllUser();
	
	//get user by given Id
	User getUser(String userId);
	
	
}
