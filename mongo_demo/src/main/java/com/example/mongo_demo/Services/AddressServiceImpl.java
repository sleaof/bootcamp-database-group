package com.example.mongo_demo.Services;

import com.example.mongo_demo.Entitys.dto.AddressDTO;
import com.example.mongo_demo.Entitys.dto.UserDTO;
import com.example.mongo_demo.Repository.AddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AddressServiceImpl implements AddressService{

    private AddressRepository addressRepository;

    @Override
    public AddressDTO createAddress(AddressDTO addressDTO) {
        return addressRepository.save(addressDTO);
    }

    @Override
    public List<AddressDTO> findAllAddress() {
        return addressRepository.findAll();
    }

    @Override
    public void deleteAddress(String id) {
        addressRepository.deleteById(id);
    }

    @Override
    public void putAddress(String id, AddressDTO addressDTO) {
        AddressDTO addressFromDb = addressRepository.findById(id).orElseThrow();
        // crush the variables of the object found
        addressFromDb.setStreet(addressDTO.getStreet());
        addressFromDb.setZipcode(addressDTO.getZipcode());
        addressRepository.save(addressFromDb);
    }
}
