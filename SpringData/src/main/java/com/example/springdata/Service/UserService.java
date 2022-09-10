package com.example.springdata.Service;



import com.example.springdata.Model.User;

import java.util.List;

public interface UserService {
    public List<User> findAllUsers();
    public User findUserByID();
    public void addUser();
    public void updateUser();
    public void deleteUser();
}
