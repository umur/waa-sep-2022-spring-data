package edu.miu.springdataday3.repo;

import edu.miu.springdataday3.entitiy.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<User,Integer> {
    List<User> findAll();


}
