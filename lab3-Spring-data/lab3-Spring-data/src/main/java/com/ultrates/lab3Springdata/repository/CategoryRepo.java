package com.ultrates.lab3Springdata.repository;

import com.ultrates.lab3Springdata.entity.bidirectional.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends CrudRepository<Category, Integer> {
}
