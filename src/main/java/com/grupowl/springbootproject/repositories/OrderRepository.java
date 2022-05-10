package com.grupowl.springbootproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupowl.springbootproject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
