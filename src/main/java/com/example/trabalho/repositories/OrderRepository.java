package com.example.trabalho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trabalho.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
