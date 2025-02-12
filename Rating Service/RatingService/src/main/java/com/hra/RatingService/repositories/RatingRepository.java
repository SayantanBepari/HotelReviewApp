package com.hra.RatingService.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hra.RatingService.entities.Rating;
					
			// for relational db have to use JPA but for mongo db have to use MongoRepository
public interface RatingRepository extends MongoRepository<Rating, String>{  

	//custom finder method
	
	List<Rating> findByUserId(String userId); 
	List<Rating> findByHotelId(String hotelId);
}
