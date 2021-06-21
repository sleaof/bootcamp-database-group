package com.example.demo.service.impl;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity addUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public UserEntity getUser(long userId) {
        return findById(userId);
    }

    @Override
    public UserEntity updateUser(long id, UserEntity userEntity) {
        UserEntity userUpdate = getUser(id);
        userUpdate.setName(userEntity.getName());
        userUpdate.setType(userEntity.getType());
        return addUser(userUpdate);
    }

    @Override
    public void removeUser(long userId) {
        UserEntity userEntity = findById(userId);
        userRepository.delete(userEntity);
    }

    @Override
    public UserEntity findById(long userId) {
        return userRepository.findById(userId).orElseThrow();
    }
}
