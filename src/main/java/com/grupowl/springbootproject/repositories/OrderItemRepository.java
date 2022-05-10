package com.grupowl.springbootproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupowl.springbootproject.entities.OrderItem;
import com.grupowl.springbootproject.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}