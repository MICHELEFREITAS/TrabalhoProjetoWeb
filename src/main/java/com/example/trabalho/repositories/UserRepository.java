package com.example.trabalho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trabalho.entities.User;

//instancia operações para trab. com usuário
public interface UserRepository extends JpaRepository<User, Long> {

}
