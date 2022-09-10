package edu.miu.lab_3.service;

import edu.miu.lab_3.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    List<CategoryDto> findAll();
    CategoryDto getCategoryById (int id);
    void saveCategoryDto (CategoryDto categoryDto);
    void deleteCategoryDtoById (int id);
    CategoryDto updateCategoryDto(int id, CategoryDto categoryDto);

}
