package edu.miu.lab_3.service;

import edu.miu.lab_3.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> findAll();
    UserDto findUserById(int id);
    void deleteUserById(int id);
    void save(UserDto userDto);
    void update(int id, UserDto userDto);

}
