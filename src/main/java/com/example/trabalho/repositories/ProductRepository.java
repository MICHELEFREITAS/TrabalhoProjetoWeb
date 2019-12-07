package com.example.trabalho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trabalho.entities.Product;

//instancia operações para trab. com usuário
public interface ProductRepository extends JpaRepository<Product, Long> {

}
