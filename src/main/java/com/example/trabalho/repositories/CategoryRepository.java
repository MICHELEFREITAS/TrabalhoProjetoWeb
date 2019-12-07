package com.example.trabalho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trabalho.entities.Category;

//instancia operações para trab. com usuário
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
