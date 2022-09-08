package edu.miu.lab3.service;

import edu.miu.lab3.dto.CategoryDto;

import java.util.List;

public interface CategoryService {

    List<CategoryDto> findAll();
    CategoryDto findById(int id);
    CategoryDto add(CategoryDto category);
    void update(int id, CategoryDto category);
    void deleteById(int id);

}