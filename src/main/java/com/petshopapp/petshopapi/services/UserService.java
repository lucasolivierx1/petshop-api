package com.petshopapp.petshopapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petshopapp.petshopapi.domain.User;
import com.petshopapp.petshopapi.dto.UserDTO;
import com.petshopapp.petshopapi.respositories.UserRepository;
import com.petshopapp.petshopapi.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {

		return repository.findAll();

	}
	
	public User findById(String pId) {
		
		Optional<User> user = repository.findById(pId);
		
		if (user.isEmpty()) 
			throw new ObjectNotFoundException("usuário não encontrado!");
		
		return user.get();		
	}
	
	
	public User insert(User obj) {
		return repository.insert(obj);
	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(),  objDto.getName(), objDto.getEmail(), null);
	}
	
	

}
