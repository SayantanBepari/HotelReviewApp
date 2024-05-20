package com.hra.UserService.external.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.hra.UserService.entities.Rating;

@FeignClient(name="RATINGSERVICE")
public interface RatingService {
	
	@GetMapping("/ratings/users/{userId}")
	List<Rating> getRatingsByUserId(@PathVariable String userId);

}
