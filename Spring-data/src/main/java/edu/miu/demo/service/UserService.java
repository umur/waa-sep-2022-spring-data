package edu.miu.demo.service;

import edu.miu.demo.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> findAll();

    UserDto findById(Long id);

    UserDto save(UserDto user);

    void remove(Long id);

}
