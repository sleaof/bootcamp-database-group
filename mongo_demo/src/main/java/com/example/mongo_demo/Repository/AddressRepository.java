package com.example.mongo_demo.Repository;

import com.example.mongo_demo.Entitys.dto.AddressDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressRepository extends MongoRepository<AddressDTO, String> {
}
