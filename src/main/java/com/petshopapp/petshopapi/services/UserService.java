package com.petshopapp.petshopapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petshopapp.petshopapi.domain.User;
import com.petshopapp.petshopapi.respositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {

		return repository.findAll();

	}

}
