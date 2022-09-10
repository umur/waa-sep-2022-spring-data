package edu.miu.springdataday3.service;

import edu.miu.springdataday3.dto.UserDto;
import edu.miu.springdataday3.entitiy.Address;
import edu.miu.springdataday3.entitiy.Review;
import edu.miu.springdataday3.entitiy.User;

import java.util.List;

public interface UserService {
    List<UserDto> findAll();
    UserDto findByID(int id);
    void save(UserDto user);
    void deleteById(int id);
    void update(UserDto user);
}
