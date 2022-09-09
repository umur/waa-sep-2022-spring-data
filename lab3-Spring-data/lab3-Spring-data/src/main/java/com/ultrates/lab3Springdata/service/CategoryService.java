package com.ultrates.lab3Springdata.service;

import com.ultrates.lab3Springdata.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    void save(CategoryDto p);
    void deleteById(int id);
    CategoryDto getById(int id);
    List<CategoryDto> getAll();
}
