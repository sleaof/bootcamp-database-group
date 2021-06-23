package com.example.mongo_demo.Resources;

import com.example.mongo_demo.Entitys.dto.UserDTO;
import com.example.mongo_demo.Services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

    final UserService userService;

    @PostMapping
    public UserDTO createUser(@RequestBody UserDTO userDTO) {
        return userService.createUser(userDTO);
    }

    @GetMapping
    public List<UserDTO> findAllUsers() {
        return userService.findAllUsers();
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
      userService.deleteUser(id);
    }

    @PutMapping("/{id}")
    public void putUser(@PathVariable String id, @RequestBody UserDTO userDTO) {
        userService.putUser(id,userDTO);
    }
}
