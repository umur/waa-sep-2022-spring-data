package com.miu.day3Jpa.controller;


import com.miu.day3Jpa.dto.UserDTO;
import com.miu.day3Jpa.entity.Review;
import com.miu.day3Jpa.service.impl.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserServiceImpl userServiceImpl;
    @GetMapping
    public List<UserDTO> getAllUsers(){
        return userServiceImpl.getAllUsers();
    };
    @PostMapping
    public void saveProduct(@RequestBody UserDTO user){
        userServiceImpl.saveNewUser(user);
    }
    @PutMapping("/{id}")
    public void updateProduct(@PathVariable int id,@RequestBody UserDTO user){
        userServiceImpl.updateSpecificCourse(user,id);
    }
    @DeleteMapping("/{id}")
    public void updateProduct(@PathVariable int id){
        userServiceImpl.deleteSpecificUser(id);
    }
}
