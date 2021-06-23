package com.example.mongo_demo.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "user")
public class UserDTO {

    @Id
    private String id;

    private String login;
    private String password;

}
