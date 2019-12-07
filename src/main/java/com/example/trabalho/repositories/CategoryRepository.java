package com.example.trabalho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trabalho.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
