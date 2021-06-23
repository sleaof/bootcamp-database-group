package com.example.mongo_demo.Resources;

import com.example.mongo_demo.Entitys.dto.AddressDTO;
import com.example.mongo_demo.Entitys.dto.UserDTO;
import com.example.mongo_demo.Services.AddressService;
import com.example.mongo_demo.Services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/address")
public class AddressController {

    final AddressService addressService;

    @PostMapping
    public AddressDTO createAddress(@RequestBody AddressDTO addressDTO) {
        return addressService.createAddress(addressDTO);
    }

    @GetMapping
    public List<AddressDTO> findAllAddress() {
        return addressService.findAllAddress();
    }

    @DeleteMapping("/{id}")
    public void deleteAddress(@PathVariable String id) {
        addressService.deleteAddress(id);
    }

    @PutMapping("/{id}")
    public void putAddress(@PathVariable String id, @RequestBody AddressDTO addressDTO) {
        addressService.putAddress(id,addressDTO);
    }
}
