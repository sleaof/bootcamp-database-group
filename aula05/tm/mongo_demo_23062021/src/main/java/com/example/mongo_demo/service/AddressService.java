package com.example.mongo_demo.service;

import com.example.mongo_demo.dto.AddressDTO;

import java.util.List;

public interface AddressService {

    AddressDTO getAddress(String addressId);
    List<AddressDTO> getAllAddresses();
    AddressDTO addAddress(AddressDTO addressDTO);
    AddressDTO updateAddress(String addressId, AddressDTO addressDTO);
    void deleteAddress(String addressId);

}
