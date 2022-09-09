package com.ultrates.lab3Springdata.repository;

import com.ultrates.lab3Springdata.entity.bidirectional.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

}
