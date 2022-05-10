package com.grupowl.springbootproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupowl.springbootproject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}