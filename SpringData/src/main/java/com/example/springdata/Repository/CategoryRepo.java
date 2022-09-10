package com.example.springdata.Repository;


import com.example.springdata.Model.Category;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CategoryRepo extends CrudRepository<Category,Integer> {

}
