package com.springdata.springdata.service.impl;

import com.springdata.springdata.DTOs.CategoryDTO;
import lombok.RequiredArgsConstructor;
import com.springdata.springdata.models.Category;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springdata.springdata.repository.CategoryRepo;
import com.springdata.springdata.service.CategoryService;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImp implements CategoryService {
    @Autowired
    private CategoryRepo categoryRepo;
    private final ModelMapper mapper;

    @Override
    public CategoryDTO save(CategoryDTO category) {
        Category mappedCategory = mapper.map(category, Category.class);
        return mapper.map(categoryRepo.save(mappedCategory), CategoryDTO.class);
    }

    @Override
    public List<CategoryDTO> findAll() {
        List<CategoryDTO> mappedCategories = new ArrayList<>();
        categoryRepo.findAll().forEach(category -> mappedCategories.add(mapper.map(category, CategoryDTO.class)));
        return mappedCategories;
    }

    @Override
    public CategoryDTO findOne(int id) {
        return mapper.map(categoryRepo.findById(id), CategoryDTO.class);
    }

    @Override
    public CategoryDTO update(int id, CategoryDTO category) {
        Category mappedCategory = mapper.map(category, Category.class);
        Category updatedCategory = categoryRepo.save(mappedCategory);
        return mapper.map(updatedCategory, CategoryDTO.class);
    }

    @Override
    public CategoryDTO delete(int id) {
       Category category = categoryRepo.findById(id).orElseThrow(() -> new RuntimeException("ID is not valid !!!"));
       return mapper.map(category, CategoryDTO.class);
    }
}
