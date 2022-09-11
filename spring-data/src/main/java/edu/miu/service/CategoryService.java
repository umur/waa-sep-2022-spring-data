package edu.miu.service;

import edu.miu.dto.CategoryDTO;
import edu.miu.entity.Category;

import java.util.List;

public interface CategoryService {
    void save(Category category);
    List<Category> findAll();
    Category findById(long id);
    void update(long id, CategoryDTO categoryDTO);
    void delete(long id);
}
