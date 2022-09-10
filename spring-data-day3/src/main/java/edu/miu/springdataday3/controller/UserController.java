package edu.miu.springdataday3.controller;

import edu.miu.springdataday3.dto.UserDto;
import edu.miu.springdataday3.entitiy.User;
import edu.miu.springdataday3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public List<UserDto> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public UserDto findByID(@PathVariable int id) {
        return userService.findByID(id);
    }

    @PostMapping
    public void save(@RequestBody UserDto user) {
        userService.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        userService.deleteById(id);
    }

    @PutMapping
    public void update(@RequestBody UserDto user){
        userService.save(user);

    }

}
