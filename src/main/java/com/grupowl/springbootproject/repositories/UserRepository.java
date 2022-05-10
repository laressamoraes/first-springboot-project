package com.grupowl.springbootproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupowl.springbootproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
