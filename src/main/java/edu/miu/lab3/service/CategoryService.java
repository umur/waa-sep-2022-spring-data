package edu.miu.lab3.service;

import edu.miu.lab3.dto.CategoryDto;

import java.util.List;

public interface CategoryService {

    List<CategoryDto> get();
    CategoryDto get(int id);
    CategoryDto add(CategoryDto category);
    void update(int id, CategoryDto category);
    void delete(int id);

}