package com.hra.UserService.external.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.hra.UserService.entities.Hotel;

@FeignClient(name="HOTESERVICE")
public interface HotelService {
	
	@GetMapping("/hotels/{hotelId}")
	Hotel getHotelByHotelId(@PathVariable("hotelId") String hotelId);
	
}
