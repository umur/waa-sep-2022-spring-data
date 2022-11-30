package com.example.assignment3.service;

import com.example.assignment3.dto.CategoryDto;

import java.util.Optional;

public interface CategoryService {

    CategoryDto save(CategoryDto categoryDto);

    Optional<CategoryDto> getById(Long id);

    Optional<CategoryDto> deleteById(Long id);

    Optional<CategoryDto> update(Long id, CategoryDto categoryDto);
}
