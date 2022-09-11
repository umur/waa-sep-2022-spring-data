package com.waa.waalabthree.Service;

import com.waa.waalabthree.Entity.User;
import com.waa.waalabthree.Repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private IUserRepository iUserRepository;

    public List<User> getAllUser(){
        return (List<User>) iUserRepository.findAll();
    }

    public Optional<User> getUserById(int id){
        return iUserRepository.findById(id);
    }

    public void deleteAllUser(){
        iUserRepository.deleteAll();
    }

    public void deleteUserById(int id){
        iUserRepository.deleteById(id);
    }

    public User updateUserById(int id, User user){
        return iUserRepository.save(user);
    }

    public User createUser(User user){
        return iUserRepository.save(user);
    }

    public List<User> getUsersByEmail(String email){
        return iUserRepository.getUserByEmail(email);
    }

}
