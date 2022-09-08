package edu.miu.demo.repo;

import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
}
