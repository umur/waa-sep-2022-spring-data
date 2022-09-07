package edu.miu.springdataday3.service;

import edu.miu.springdataday3.entitiy.Category;

import java.util.List;

public interface CategoryService {
     public void save(Category category);

     public List<Category> findAll();

     public void deleteById(int id);



}
