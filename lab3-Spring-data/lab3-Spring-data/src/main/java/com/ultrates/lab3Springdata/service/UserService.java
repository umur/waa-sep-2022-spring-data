package com.ultrates.lab3Springdata.service;

import com.ultrates.lab3Springdata.dto.UserDto;

import java.util.List;

public interface UserService {
    void save(UserDto p);
    void deleteById(int id);
    UserDto getById(int id);
    List<UserDto> getAll();
}
