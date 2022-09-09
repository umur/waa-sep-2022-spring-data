package edu.miu.springdatademo.service;

import edu.miu.springdatademo.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {
    void save(CategoryDTO categoryDTO);
    List<CategoryDTO> findAll();
    CategoryDTO findById(int id);
    void delete(int id);
}
