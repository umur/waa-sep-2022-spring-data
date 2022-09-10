package com.waa.springdata.service.impl;

import com.waa.springdata.dto.CategoryDTO;
import com.waa.springdata.entity.Category;
import com.waa.springdata.repo.CategoryRepo;
import com.waa.springdata.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepo categoryRepo;

    public CategoryServiceImpl(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    @Override
    public void save(Category category) {
        categoryRepo.save(category);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepo.findAll();
    }

    @Override
    public Category findById(long id) {
        var category = categoryRepo.findById(id);

        return category.orElse(null);
    }

    @Override
    public void update( long id, CategoryDTO categoryDTO) {
        var category = categoryRepo.findById(id).orElse(null);

        if (category != null) {
            category.setName(categoryDTO.getName());
            categoryRepo.save(category);
        }
    }

    @Override
    public void delete(long id) {
        categoryRepo.deleteById(id);
    }
}
