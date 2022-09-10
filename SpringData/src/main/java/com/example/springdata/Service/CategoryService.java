package com.example.springdata.Service;

import com.example.springdata.Model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    public List<Category> findAllCategory();
    public Category findCategoryByID(int id);
    public Category addCategory(Category category);
    public Category updateCategory(Category category);
    public void deleteCategoryById(int id);

}
