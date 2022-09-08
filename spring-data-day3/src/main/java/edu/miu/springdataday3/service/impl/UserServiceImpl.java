package edu.miu.springdataday3.service.impl;

import edu.miu.springdataday3.entitiy.User;
import edu.miu.springdataday3.repo.UserRepo;
import edu.miu.springdataday3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public User findByID(int id) {
        return userRepo.findById(id).get();
    }

    @Override
    public void save(User user) {
        userRepo.save(user);
    }

    @Override
    public void deleteById(int id) {
        userRepo.deleteById(id);
    }
}
