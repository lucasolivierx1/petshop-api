package com.petshopapp.petshopapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.petshopapp.petshopapi.domain.User;
import com.petshopapp.petshopapi.dto.UserDTO;
import com.petshopapp.petshopapi.respositories.UserRepository;
import com.petshopapp.petshopapi.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	
	@Autowired
	private BCryptPasswordEncoder pe;
	
	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(String pId) {
		Optional<User> user = repository.findById(pId);
		return user.orElseThrow(() -> new ObjectNotFoundException("usuário não encontrado!"));		
	}
		
	public User insert(User obj) {
		return repository.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		repository.deleteById(id);
	}
	
	public User update(User obj) {
		return repository.save(obj);	
	}
	
	public User fromDTO(UserDTO objDto) {
		User user = new User(objDto.getId(),  objDto.getName(), objDto.getEmail(), pe.encode(objDto.getPassword()));
		
		user.getPets().addAll(objDto.getPets());
		
		return user;
	}

}
