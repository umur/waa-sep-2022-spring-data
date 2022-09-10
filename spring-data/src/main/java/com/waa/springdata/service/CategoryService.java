package com.waa.springdata.service;

import com.waa.springdata.dto.CategoryDTO;
import com.waa.springdata.entity.Category;

import java.util.List;

public interface CategoryService {
    void save(Category category);
    List<Category> findAll();
    Category findById(long id);
    void update(long id, CategoryDTO categoryDTO);
    void delete(long id);
}
