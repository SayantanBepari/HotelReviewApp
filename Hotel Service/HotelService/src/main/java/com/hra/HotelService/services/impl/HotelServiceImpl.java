package com.hra.HotelService.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hra.HotelService.entities.Hotel;
import com.hra.HotelService.exceptions.ResourceNotFoundException;
import com.hra.HotelService.repositories.HotelRepository;
import com.hra.HotelService.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public Hotel create(Hotel hotel) {
		String hotelId = UUID.randomUUID().toString();
		hotel.setId(hotelId);
		Hotel hotel1 = hotelRepository.save(hotel);
		return hotel1;
	}

	@Override
	public List<Hotel> getAll() {
		return hotelRepository.findAll();
	}

	@Override
	public Hotel get(String id) {
		return hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("No Hotel found by the provided id : "+id));
		
	}

}
