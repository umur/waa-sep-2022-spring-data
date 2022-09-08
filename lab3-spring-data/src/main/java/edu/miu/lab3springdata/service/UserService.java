package edu.miu.lab3springdata.service;

import edu.miu.lab3springdata.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> getUsers();

    void delete(int id);

    void add(UserDto userDto);
}
