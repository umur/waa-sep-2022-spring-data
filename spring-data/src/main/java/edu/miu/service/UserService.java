package edu.miu.service;

import edu.miu.dto.UserDTO;

import java.util.List;

public interface UserService {
    void save(UserDTO userDTO);
    List<UserDTO> findAll();
    UserDTO findById(long id);
    void update(long id, UserDTO userDTO);
    void delete(long id);
}
