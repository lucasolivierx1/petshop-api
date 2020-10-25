package com.petshopapp.petshopapi.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.petshopapp.petshopapi.domain.Image;
import com.petshopapp.petshopapi.domain.Pet;
import com.petshopapp.petshopapi.domain.User;
import com.petshopapp.petshopapi.respositories.ImageRepository;
import com.petshopapp.petshopapi.respositories.PetRepository;
import com.petshopapp.petshopapi.respositories.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
	private UserRepository repository;
	
	@Autowired
	private PetRepository petRepository;
	
	@Autowired
	private ImageRepository imageRepository;
	
	
	@Autowired
	private BCryptPasswordEncoder pe;
	
	@Override
	public void run(String... args) throws Exception {
		
		repository.deleteAll();
		
		petRepository.deleteAll();
		
		imageRepository.deleteAll();
		
		User a1 = new User(null, "Maria",   "Maria@hotmail.com", pe.encode("123123") );
		User a2 = new User(null, "José", "José@hotmail.com", pe.encode("123123"));
		User a3 = new User(null, "Giovana ", "Giovana@hotmail.com", pe.encode("123123"));
		
		Pet p1 = new Pet(null, "Rex", 0, null);
		Pet p2 = new Pet(null, "Rex", 0, null);
		Pet p3 = new Pet(null, "Rex", 0, null);
		Pet p4 = new Pet(null, "Rex", 0, null);
	
		Image i1 = new Image(null, "BASE641");
		Image i2 = new Image(null, "BASE642");
		Image i3 = new Image(null, "BASE643");
		Image i4 = new Image(null, "BASE644");
		Image i5 = new Image(null, "BASE645");
	
		repository.saveAll(Arrays.asList(a1,a2,a3));
		imageRepository.saveAll(Arrays.asList(i1,i2,i3,i4,i5));
		
		p1.getImages().add(i1);
		p1.getImages().add(i2);
		p2.getImages().add(i3);
		p3.getImages().add(i4);
		p4.getImages().add(i5);
		
		petRepository.saveAll(Arrays.asList(p1,p2,p3,p4));
		
		a1.getPets().addAll(Arrays.asList(p1,p4));
		a2.getPets().addAll(Arrays.asList(p2));
		a3.getPets().addAll(Arrays.asList(p3));
		
		repository.saveAll(Arrays.asList(a1,a2,a3));
						
	}

}
