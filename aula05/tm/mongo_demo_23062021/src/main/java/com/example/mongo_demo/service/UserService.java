package com.example.mongo_demo.service;

import com.example.mongo_demo.dto.UserDTO;

import java.util.List;

public interface UserService {

    UserDTO getUser(String userId);
    List<UserDTO> getAllUsers();
    UserDTO addUser(UserDTO userDTO);
    UserDTO updateUser(String userId, UserDTO userDTO);
    void deleteUser(String userId);

}
