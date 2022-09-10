package com.springdata.springdata.controller;

import com.springdata.springdata.DTOs.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.springdata.springdata.service.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @PostMapping
    public UserDTO save(@RequestBody UserDTO user) {
        return userService.save(user);
    }

    @GetMapping
    public List<UserDTO> findAll() {
        return userService.findAll();
    }

    @PutMapping("/{id}")
    public UserDTO update(@PathVariable int id, @RequestBody UserDTO user) {
        return userService.update(id, user);
    }

    @DeleteMapping("/{id}")
    public UserDTO delete(@PathVariable int id) {
        return userService.delete(id);
    }
}
