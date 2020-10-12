package com.petshopapp.petshopapi.respositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.petshopapp.petshopapi.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
