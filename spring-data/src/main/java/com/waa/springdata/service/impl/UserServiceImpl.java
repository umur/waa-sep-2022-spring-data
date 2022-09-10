package com.waa.springdata.service.impl;

import com.waa.springdata.dto.UserDTO;
import com.waa.springdata.entity.User;
import com.waa.springdata.repo.UserRepo;
import com.waa.springdata.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepo userRepo, ModelMapper modelMapper) {
        this.userRepo = userRepo;
        this.modelMapper = modelMapper;
    }

    @Override
    public void save(UserDTO userDTO) {
        userRepo.save(modelMapper.map(userDTO, User.class));
    }

    @Override
    public List<UserDTO> findAll() {
        return userRepo.findAll().stream().map(user -> modelMapper.map(user, UserDTO.class)).toList();
    }

    @Override
    public UserDTO findById(long id) {
        var user = userRepo.findById(id).orElse(null);

        if (user == null) return null;

        return modelMapper.map(user, UserDTO.class);
    }

    @Override
    public void update(long id, UserDTO userDTO) {
        var user = userRepo.findById(id).orElse(null);

        if (user != null){
            user.setEmail(userDTO.getEmail());
            user.setFirstName(userDTO.getFirstName());
            user.setLastName(userDTO.getLastName());
            user.setPassword(userDTO.getPassword());
            userRepo.save(user);
        }
    }

    @Override
    public void delete(long id) {
        userRepo.deleteById(id);
    }
}
