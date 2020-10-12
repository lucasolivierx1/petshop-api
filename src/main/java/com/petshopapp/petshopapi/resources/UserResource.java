package com.petshopapp.petshopapi.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.petshopapp.petshopapi.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>>  findAll(){
		User u = new User("1", "Teste", "teste@teste.com.br", "teste");
		User u2 = new User("2", "Teste 2 ", "teste2@teste.com.br", "teste2");
		
		List<User> lista = new ArrayList<User>();
		
		lista.addAll(Arrays.asList(u,u2));
		
		return ResponseEntity.ok().body(lista);
	
	}

}
