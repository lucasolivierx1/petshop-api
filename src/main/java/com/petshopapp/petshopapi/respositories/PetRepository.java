package com.petshopapp.petshopapi.respositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.petshopapp.petshopapi.domain.Pet;

@Repository
public interface PetRepository extends MongoRepository<Pet, String>{

}
