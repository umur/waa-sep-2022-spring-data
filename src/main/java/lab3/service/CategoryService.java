package lab3.service;

import lab3.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    void saveCategory(CategoryDto categoryDto);

    CategoryDto findById(Integer id);

    List<CategoryDto> findALL();
}
