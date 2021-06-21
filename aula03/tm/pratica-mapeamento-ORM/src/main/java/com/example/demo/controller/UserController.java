package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

   private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserEntity> addUser(@RequestBody UserEntity userEntity) {
        return new ResponseEntity<>(userService.addUser(userEntity), HttpStatus.CREATED);
    }

    @GetMapping("/getUser/{userId}")
    public ResponseEntity<UserEntity> getUser(@PathVariable Integer userId) {
        return new ResponseEntity<>(userService.getUser(userId), HttpStatus.OK);
    }

    @PostMapping("/updateUser/{userId}")
    public ResponseEntity<UserEntity> updateUser(@PathVariable Integer userId, @RequestBody UserEntity userEntity) {
        return new ResponseEntity<>(userService.updateUser(userId, userEntity), HttpStatus.OK);
    }

    @GetMapping("/deleteUser/{userId}")
    public ResponseEntity<?> removeUser(@PathVariable Integer userId) {
        userService.removeUser(userId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
