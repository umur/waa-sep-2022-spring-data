package edu.miu.productreview.service;

import edu.miu.productreview.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    //crud
    CategoryDto save(CategoryDto category);
    List<CategoryDto> findAll();
    CategoryDto findById(int id);
    CategoryDto update(int id, CategoryDto category);
    void delete(int id);
}
