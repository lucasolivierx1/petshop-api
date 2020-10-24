package com.petshopapp.petshopapi.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.petshopapp.petshopapi.domain.Pet;
import com.petshopapp.petshopapi.domain.User;

public class UserDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;

	private String name;
	private String email;
	private String password;
	
	private List<Pet> pets = new ArrayList<Pet>();	

	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	UserDTO() {
	}

	public UserDTO(User user) {

		this.id = user.getId();
		this.name = user.getName();
		this.email = user.getEmail();
		this.password = user.getPassword();
		this.pets = user.getPets();

	}


}
