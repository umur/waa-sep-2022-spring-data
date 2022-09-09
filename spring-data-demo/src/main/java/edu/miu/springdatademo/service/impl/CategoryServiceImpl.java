package edu.miu.springdatademo.service.impl;

import edu.miu.springdatademo.dto.CategoryDTO;
import edu.miu.springdatademo.entity.Category;
import edu.miu.springdatademo.repo.CategoryRepo;
import edu.miu.springdatademo.service.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepo categoryRepo;
    private ModelMapper mapper;

    @Autowired
    public CategoryServiceImpl(CategoryRepo categoryRepo, ModelMapper mapper) {
        this.categoryRepo = categoryRepo;
        this.mapper = mapper;
    }

    @Override
    public void save(CategoryDTO categoryDTO) {
        var category = mapper.map(categoryDTO, Category.class);
        categoryRepo.save(category);
    }

    @Override
    public List<CategoryDTO> findAll() {
        List<Category> categories = categoryRepo.findAll();
        List<CategoryDTO> categoryDTOs = new ArrayList<>();

        categories.forEach(category -> {
           var categoryDTO = mapper.map(category, CategoryDTO.class);
           categoryDTOs.add(categoryDTO);
        });

        return categoryDTOs;
    }

    @Override
    public CategoryDTO findById(int id) {
        Category category =  categoryRepo.findById(id).orElse(null);
        CategoryDTO categoryDTO = mapper.map(category, CategoryDTO.class);
        return categoryDTO;
    }

    @Override
    public void delete(int id) {
        categoryRepo.deleteById(id);
    }
}
