package com.example.mongo_demo.Services;

import com.example.mongo_demo.Entitys.dto.UserDTO;
import java.util.List;

public interface UserService {

    public UserDTO createUser(UserDTO userDTO);
    public List<UserDTO> findAllUsers();
    public void deleteUser(String id);
    public void putUser(String id, UserDTO user);


}
