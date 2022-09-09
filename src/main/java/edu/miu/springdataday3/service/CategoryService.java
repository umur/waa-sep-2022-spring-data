package edu.miu.springdataday3.service;

import edu.miu.springdataday3.entity.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {
    // get
    List<CategoryDTO> getAll();

    //post
    CategoryDTO save(CategoryDTO categoryDTO);

    //update
    CategoryDTO update(Long id, CategoryDTO categoryDTO);

    //delete
    CategoryDTO delete(Long id);
}
