package com.springdata.springdata.service;

import com.springdata.springdata.DTOs.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO save (UserDTO address);
    List<UserDTO> findAll();
    UserDTO findOne(int id);
    UserDTO update(int id, UserDTO address);
    UserDTO delete(int id);
}
