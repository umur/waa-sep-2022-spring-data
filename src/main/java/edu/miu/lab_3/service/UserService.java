package edu.miu.lab_3.service;

import edu.miu.lab_3.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> findAll();
    UserDto findUserById(int id);
    void deleteUserById(int id);
    UserDto save(UserDto userDto);
    UserDto update(int id, UserDto userDto);

}
