package com.example.mongo_demo.Services;

import com.example.mongo_demo.Entitys.dto.UserDTO;
import com.example.mongo_demo.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService{

    final UserRepository userRepository;

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        return userRepository.save(userDTO);
    }

    @Override
    public List<UserDTO> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

    @Override
    public void putUser(String id, UserDTO user) {
        UserDTO userFromDb = userRepository.findById(id).orElseThrow();
        // crush the variables of the object found
        userFromDb.setLogin(user.getLogin());
        userFromDb.setPassword(user.getPassword());
        userRepository.save(userFromDb);
    }
}
