package edu.miu.lab_3.repo;

import edu.miu.lab_3.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {}
