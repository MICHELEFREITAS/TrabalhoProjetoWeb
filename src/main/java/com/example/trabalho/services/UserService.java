package com.example.trabalho.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trabalho.entities.User;
import com.example.trabalho.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}

	//inserir usuário
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	//deleção do usuário
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		//getOne prepara o obj para mecher depois
		User entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	//atualizar dados do entity(user) com base no que chegou no obj
	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
