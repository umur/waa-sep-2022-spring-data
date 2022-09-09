package com.example.dayThree.repo;

import com.example.dayThree.entity.Product;
import com.example.dayThree.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
