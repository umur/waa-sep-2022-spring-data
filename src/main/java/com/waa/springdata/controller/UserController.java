package com.waa.springdata.controller;

import com.waa.springdata.entity.Product;
import com.waa.springdata.entity.User;
import com.waa.springdata.service.ProductInterfaceImpl;
import com.waa.springdata.service.UserInterfaceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping

public class UserController {
//    @Autowired
//    private UserInterfaceImpl userService;
//
//    @PostMapping()
//    public User createUser(@RequestBody User user){
//        return this.userService.saveUser(user);
//    }
//    @GetMapping("/{id}")
//    public User getUser(@PathVariable int id){
//        return this.userService.getUser(id);
//    }
//
//    @PutMapping()
//    public User updateUser(@RequestBody User user){
//        return this.userService.updateUser(user);
//    }
//    @DeleteMapping("/{id}")
//    public void deleteUser(@PathVariable int id){
//        userService.deleteUser(id);
//    }
}
