package edu.miu.springdatademo.service.impl;

import edu.miu.springdatademo.dto.UserDTO;
import edu.miu.springdatademo.entity.User;
import edu.miu.springdatademo.repo.UserRepo;
import edu.miu.springdatademo.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    private ModelMapper mapper;
    @Autowired
    public UserServiceImpl(UserRepo userRepo, ModelMapper mapper) {
        this.userRepo = userRepo;
        this.mapper = mapper;
    }

    public void save(UserDTO userDTO) {
        User user = mapper.map(userDTO, User.class);
        userRepo.save(user);
    }
}
