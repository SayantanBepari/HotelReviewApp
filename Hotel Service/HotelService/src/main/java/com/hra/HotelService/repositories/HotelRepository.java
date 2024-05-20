package com.hra.HotelService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hra.HotelService.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel,String> {

}
