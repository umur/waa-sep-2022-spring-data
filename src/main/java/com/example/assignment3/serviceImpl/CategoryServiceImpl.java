package com.example.assignment3.serviceImpl;

import com.example.assignment3.dto.CategoryDto;
import com.example.assignment3.entity.Category;
import com.example.assignment3.mapper.CategoryMapper;
import com.example.assignment3.repository.CategoryRepository;
import com.example.assignment3.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    private final CategoryMapper categoryMapper;

    @Override
    public CategoryDto save(CategoryDto categoryDto) {
        Category category = categoryMapper.toEntity(categoryDto);
        return categoryMapper.toDto(categoryRepository.save(category));
    }

    @Override
    public Optional<CategoryDto> getById(Long id) {
        return getByIdRaw(id).map(categoryMapper::toDto);
    }

    @Override
    public Optional<CategoryDto> deleteById(Long id) {
        Optional<Category> category = getByIdRaw(id);
        if(category.isPresent()){
            categoryRepository.deleteById(id);
        }
        return category.map(categoryMapper::toDto);
    }

    @Override
    public Optional<CategoryDto> update(Long id, CategoryDto categoryDto) {
        Optional<Category> updatedCategory = getByIdRaw(id).map((foundCategory) -> {
            categoryMapper.updateEntityFromDto(categoryDto, foundCategory);
            return categoryRepository.save(foundCategory);
        });
        return updatedCategory.map(categoryMapper::toDto);
    }

    private Optional<Category> getByIdRaw(Long id){
        return categoryRepository.findById(id);
    }
}
