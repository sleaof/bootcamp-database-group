package com.example.mongo_demo.Services;

import com.example.mongo_demo.Entitys.dto.AddressDTO;
import com.example.mongo_demo.Entitys.dto.UserDTO;

import java.util.List;

public interface AddressService {
    public AddressDTO createAddress(AddressDTO addressDTO);
    public List<AddressDTO> findAllAddress();
    public void deleteAddress(String id);
    public void putAddress(String id, AddressDTO addressDTO);
}
