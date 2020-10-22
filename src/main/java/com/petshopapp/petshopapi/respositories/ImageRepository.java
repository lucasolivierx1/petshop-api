package com.petshopapp.petshopapi.respositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.petshopapp.petshopapi.domain.Image;

@Repository
public interface ImageRepository extends MongoRepository<Image, String>{

}
