package henry.waasep2022springdata.service;

import henry.waasep2022springdata.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    void save(CategoryDto categoryDto);
    List<CategoryDto> findAll();
    void update(int categoryId, CategoryDto categoryDto);
    CategoryDto delete(int categoryId);
}
