package com.example.trabalho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trabalho.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
