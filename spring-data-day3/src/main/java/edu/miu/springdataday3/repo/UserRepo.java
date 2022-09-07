package edu.miu.springdataday3.repo;

import edu.miu.springdataday3.entitiy.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User,Integer> {
}
