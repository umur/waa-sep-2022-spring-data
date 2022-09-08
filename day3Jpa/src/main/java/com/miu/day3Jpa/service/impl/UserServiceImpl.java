package com.miu.day3Jpa.service.impl;

import com.miu.day3Jpa.dto.UserDTO;
import com.miu.day3Jpa.entity.Product;
import com.miu.day3Jpa.entity.User;
import com.miu.day3Jpa.repository.UserRepository;
import com.miu.day3Jpa.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ModelMapper modelMapper;

    public List<UserDTO> getAllUsers(){
        List<User> users= (List<User>) userRepository.findAll();
        return users.stream().map(User -> modelMapper.map(User,UserDTO.class)).collect(Collectors.toList());
    }
    public void saveNewUser(UserDTO user) {
        userRepository.save(modelMapper.map(user,User.class));
    }

    public void deleteSpecificUser(int id) {
        userRepository.deleteById(id);
    }

    public void updateSpecificCourse(UserDTO user,int id){
        User inputUser = modelMapper.map(user, User.class);
        userRepository.findById(id).map(user1 -> {
            user1.setFirstName(inputUser.getFirstName());
            user1.setLastName(inputUser.getLastName());
            user1.setEmail(inputUser.getEmail());
            user1.setAddress(inputUser.getAddress());
            user1.setPassword(inputUser.getPassword());
            user1.setId(inputUser.getId());
            return userRepository.save(user1);
        });
    }
}
