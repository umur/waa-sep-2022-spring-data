package edu.miu.springdataday3.service.impl;

import edu.miu.springdataday3.dto.UserDto;
import edu.miu.springdataday3.entitiy.User;
import edu.miu.springdataday3.repo.UserRepo;
import edu.miu.springdataday3.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;

    @Autowired
    ModelMapper modelMapper;
    @Override
    public List<UserDto> findAll() {
//        userRepo.findAll();
        return null;
    }

    @Override
    public UserDto findByID(int id) {
        return modelMapper.map(userRepo.findById(id).get(),UserDto.class);
    }

    @Override
    public void save(UserDto user) {
//        userRepo.save(user);
    }

    @Override
    public void deleteById(int id) {
        userRepo.deleteById(id);
    }

    @Override
    public void update(UserDto userDto) {
        userRepo.save(modelMapper.map(userDto,User.class));
    }
}
