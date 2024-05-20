package com.hra.RatingService.services;

import java.util.List;

import com.hra.RatingService.entities.Rating;

public interface RatingService {

	// create
	Rating create(Rating rating);
	
	// get all rating
	List<Rating> getAllRatings();
	
	
	
	// get all by userId
	List<Rating> getRatingByUserId(String userId);
	
	
	// get all by hotelId
	List<Rating> getRatingByHotelId(String hotelId);
	
	
	
}
