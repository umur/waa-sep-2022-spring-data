package edu.miu.springdataday3.repo;

import edu.miu.springdataday3.entitiy.Category;
import edu.miu.springdataday3.entitiy.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Locale;
@Repository
public interface CategoryRepo extends CrudRepository<Category,Integer> {
    List<Category> findAll();



}
