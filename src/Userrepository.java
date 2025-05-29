package com.cottagebooking.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cottagebooking.fullstackbackend.model.User;

@Repository

public interface Userrepository extends JpaRepository<User,Long>{


	

	
	

}
