package com.example.mongo_demo.Repository;

import com.example.mongo_demo.Entitys.dto.UserDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserDTO, String> {
}
