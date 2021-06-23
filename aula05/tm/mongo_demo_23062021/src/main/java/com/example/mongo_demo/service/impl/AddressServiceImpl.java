package com.example.mongo_demo.service.impl;

import com.example.mongo_demo.dto.AddressDTO;
import com.example.mongo_demo.dto.UserDTO;
import com.example.mongo_demo.repository.AddressRepository;
import com.example.mongo_demo.service.AddressService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    public final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public AddressDTO getAddress(String addressId) {
        return addressRepository.findById(addressId).orElseThrow();
    }

    @Override
    public List<AddressDTO> getAllAddresses() {
        return addressRepository.findAll();
    }

    @Override
    public AddressDTO addAddress(AddressDTO addressDTO) {
        return addressRepository.save(addressDTO);
    }

    @Override
    public AddressDTO updateAddress(String addressId, AddressDTO addressDTO) {
        AddressDTO addressUpdate = addressRepository.findById(addressId).orElseThrow();
        addressUpdate.setStreet(addressDTO.getStreet());
        addressUpdate.setZipcode(addressDTO.getZipcode());
        return addAddress(addressUpdate);
    }

    @Override
    public void deleteAddress(String addressId) {
        AddressDTO addressDTO = addressRepository.findById(addressId).orElseThrow();
        addressRepository.delete(addressDTO);
    }

}
