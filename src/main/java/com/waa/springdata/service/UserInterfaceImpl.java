package com.waa.springdata.service;

import com.waa.springdata.repo.UserRepo;
import com.waa.springdata.service.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.waa.springdata.entity.User;
import java.util.List;
@Service
public class UserInterfaceImpl implements UserInterface {
    @Autowired
    private UserRepo userRepo;
    @Override
    public  User findById(int id){
        return userRepo.findAUsersById(id);
    }
}
