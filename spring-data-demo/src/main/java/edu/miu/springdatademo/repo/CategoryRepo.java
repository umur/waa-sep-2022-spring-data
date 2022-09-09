package edu.miu.springdatademo.repo;

import edu.miu.springdatademo.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepo extends CrudRepository<Category, Integer> {
    List<Category> findAll();
}
