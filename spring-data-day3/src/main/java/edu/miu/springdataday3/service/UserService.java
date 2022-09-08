package edu.miu.springdataday3.service;

import edu.miu.springdataday3.entitiy.Address;
import edu.miu.springdataday3.entitiy.Review;
import edu.miu.springdataday3.entitiy.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findByID(int id);
    void save(User user);
    void deleteById(int id);
}
