package com.example.mongo_demo.service.impl;

import com.example.mongo_demo.dto.UserDTO;
import com.example.mongo_demo.repository.UserRepository;
import com.example.mongo_demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO getUser(String userId) {
        return userRepository.findById(userId).orElseThrow();
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserDTO addUser(UserDTO userDTO) {
        return userRepository.save(userDTO);
    }

    @Override
    public UserDTO updateUser(String userId, UserDTO userDTO) {
        UserDTO userUpdate = userRepository.findById(userId).orElseThrow();
        userUpdate.setLogin(userDTO.getLogin());
        userUpdate.setPassword(userDTO.getPassword());
        return addUser(userUpdate);
    }

    @Override
    public void deleteUser(String userId) {
        UserDTO userDTO = userRepository.findById(userId).orElseThrow();
        userRepository.delete(userDTO);
    }

}
