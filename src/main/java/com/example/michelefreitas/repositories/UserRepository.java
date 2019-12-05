package com.example.michelefreitas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.michelefreitas.entities.User;

//instancia operações para trab. com usuário
public interface UserRepository extends JpaRepository<User, Long> {

}
