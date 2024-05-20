package com.hra.HotelService.services;

import java.util.List;

import com.hra.HotelService.entities.Hotel;

public interface HotelService {
	
	//create
	
	Hotel create(Hotel hotel);
	
	//get all hotels
	
	List<Hotel> getAll();
	
	//get single by id
	Hotel get(String id);
	
	
	

}
