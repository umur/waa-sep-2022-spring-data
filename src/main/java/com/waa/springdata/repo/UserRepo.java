package com.waa.springdata.repo;

import org.springframework.data.repository.CrudRepository;
import com.waa.springdata.entity.User;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface UserRepo extends CrudRepository <User,Integer> {
    User findAUsersById(int id);

}
