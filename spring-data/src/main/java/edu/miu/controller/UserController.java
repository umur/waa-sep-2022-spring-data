package edu.miu.controller;

import edu.miu.dto.UserDTO;
import edu.miu.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
@RestController
public class UserController {
    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping
    public void save(@RequestBody UserDTO userDTO) {
        userService.save(userDTO);
    }

    @GetMapping
    public List<UserDTO> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public UserDTO findById(@PathVariable long id) {
        return userService.findById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable long id, @RequestBody UserDTO userDTO) {
        userService.update(id, userDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        userService.delete(id);
    }
}
