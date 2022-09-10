package com.springdata.springdata.service;

import com.springdata.springdata.DTOs.CategoryDTO;

import java.util.List;

public interface CategoryService {
    CategoryDTO save (CategoryDTO address);
    List<CategoryDTO> findAll();
    CategoryDTO findOne(int id);
    CategoryDTO update(int id, CategoryDTO address);
    CategoryDTO delete(int id);
}
