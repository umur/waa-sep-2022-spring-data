package com.waa.waalabthree.Repository;

import com.waa.waalabthree.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface IUserRepository extends CrudRepository<User,Integer> {
    List<User>user=new ArrayList<>();
    public default List<User> getUserByEmail(String email){
        return user.stream().filter(e->e.getEmail().equals(email)).toList();
    }
}
