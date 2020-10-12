package com.petshopapp.petshopapi.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.petshopapp.petshopapi.domain.User;
import com.petshopapp.petshopapi.respositories.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
	private UserRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		repository.deleteAll();
		
		User a1 = new User(null, "Maria",   "Maria@hotmail.com", "123123");
		User a2 = new User(null, "José", "José@hotmail.com", "123123");
		User a3 = new User(null, "Giovana ", "Giovana@hotmail.com", "123123");
	
		repository.saveAll(Arrays.asList(a1,a2,a3));
		
		
	}

}
