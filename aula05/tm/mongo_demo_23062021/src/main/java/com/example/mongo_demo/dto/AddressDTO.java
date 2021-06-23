package com.example.mongo_demo.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "address")
public class AddressDTO {

    @Id
    private String id;
    private String street;
    private String zipcode;

}
