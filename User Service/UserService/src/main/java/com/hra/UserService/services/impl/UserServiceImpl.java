package com.hra.UserService.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hra.UserService.entities.Rating;
import com.hra.UserService.entities.User;
import com.hra.UserService.exceptions.ResourceNotFoundException;
import com.hra.UserService.external.services.RatingService;
import com.hra.UserService.repositories.UserRepository;
import com.hra.UserService.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepositry;
	
	//@Autowired
	//private HotelService hotelService;
	
	@Autowired
	private RatingService ratingService;
	
	@Override
	public User saveUser(User user) {
		// generating random user id
		String randomUserId = UUID.randomUUID().toString();
		user.setUserId(randomUserId);
		return userRepositry.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return userRepositry.findAll();
	}

	@Override
	public User getUser(String userId) {
		User user = userRepositry.findById(userId).orElseThrow(()-> new ResourceNotFoundException("No user found by the given Id : "+userId));
		
		//getting the ratings
		List<Rating> ratingList = ratingService.getRatingsByUserId(user.getUserId());
		
		user.setRatings(ratingList);
		
		return user;
		
	}

}


