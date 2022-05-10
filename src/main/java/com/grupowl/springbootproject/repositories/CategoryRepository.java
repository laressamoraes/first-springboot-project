package com.grupowl.springbootproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupowl.springbootproject.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
