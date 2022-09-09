package com.example.dayThree.Service;

import com.example.dayThree.entity.Review;
import com.example.dayThree.entity.User;
import com.example.dayThree.repo.ReviewRepo;
import com.example.dayThree.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    @Autowired
    ReviewRepo reviewRepo;
    public List<User> getListOfProduct() {
       return userRepo.findAll();
    }

    public User saveUser(User user) {

     return userRepo.save(user);
    }
}
