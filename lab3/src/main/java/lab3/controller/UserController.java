package lab3.controller;

import lab3.dto.UserDTO;
import lab3.entity.User;
import lab3.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserServiceImpl service;

    private final ModelMapper mapper;

    @GetMapping
    public List<UserDTO> getAll() {
        return service.findAll()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }


    @PostMapping
    public UserDTO save(@RequestBody User user) {
        return this.toDTO(service.save(user));
    }

    @PutMapping("/{id}")
    public UserDTO update(@PathVariable int id, @RequestBody User user) {
        user.setId(id);
        return this.toDTO(service.save(user));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    private UserDTO toDTO(User user) {
        return mapper.map(user, UserDTO.class);
    }

    private User toEntity(UserDTO user) {
        return mapper.map(user, User.class);
    }
}
