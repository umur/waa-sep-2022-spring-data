package com.example.dayThree.controller;

import com.example.dayThree.Service.ProductService;
import com.example.dayThree.Service.UserService;
import com.example.dayThree.entity.Product;
import com.example.dayThree.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping

    public List<User> productList(){
        return userService.getListOfProduct();
    }


    @PostMapping
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }
}
