package edu.miu.lab3springdata.service;

import edu.miu.lab3springdata.dto.CategoryDto;

import java.util.List;

public interface CategoryService {

    List<CategoryDto> getAll();

    CategoryDto getById(int id);

    void save(CategoryDto categoryDto);

    void delete(int id);
}
