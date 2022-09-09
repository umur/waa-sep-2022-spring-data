package edu.miu.productreview.controller;

import edu.miu.productreview.dto.UserDto;
import edu.miu.productreview.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userSvc;

    @GetMapping
    public List<UserDto> findAll() {
        return userSvc.findAll();
    }

    @GetMapping("/{id}")
    public UserDto findById(@PathVariable int id) {
        return userSvc.findById(id);
    }

    @PostMapping
    public UserDto save(@RequestBody UserDto user) {
        return userSvc.save(user);
    }

    @PutMapping("/{id}")
    public UserDto update(@PathVariable int id, @RequestBody UserDto user) {
        return userSvc.update(id, user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        userSvc.delete(id);
    }
}
