package com.hra.UserService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hra.UserService.entities.User;

public interface UserRepository extends JpaRepository<User, String> {

}
