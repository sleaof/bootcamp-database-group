package com.example.demo.service;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;

public interface UserService {
    public UserEntity addUser(UserEntity userEntity);
    public UserEntity getUser(long userId);
    public UserEntity updateUser(long userId, UserEntity userEntity);
    public void removeUser(long userId);
    public UserEntity findById(long userId);
}
