package com.example.dayThree.repo;

import com.example.dayThree.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface CatagoryRepo extends JpaRepository<Category, Long> {
}
