package edu.miu.springdataday3.service.impl;

import edu.miu.springdataday3.entity.Category;
import edu.miu.springdataday3.entity.dto.CategoryDTO;
import edu.miu.springdataday3.repo.CategoryRepo;
import edu.miu.springdataday3.service.CategoryService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {


    private final CategoryRepo categoryRepo;
    private final ModelMapper modelMapper;

    @Override
    public List<CategoryDTO> getAll() {
        List<Category> category = categoryRepo.findAll();
        return category.stream().map(category1 -> modelMapper.map(category1, CategoryDTO.class)).collect(Collectors.toList());
    }

    @Override
    public CategoryDTO save(CategoryDTO categoryDTO) {
        return modelMapper.map(categoryRepo.save(modelMapper.map(categoryDTO, Category.class)), CategoryDTO.class);
    }

    @Override
    public CategoryDTO update(Long id, CategoryDTO categoryDTO) {
        if (id != categoryDTO.getId()) throw new RuntimeException("Category Not Found");
        return modelMapper.map(categoryRepo.save(modelMapper.map(categoryDTO, Category.class)), CategoryDTO.class);
    }

    @Override
    public CategoryDTO delete(Long id) {
        Category category = categoryRepo.findById(id).orElseThrow(() -> new RuntimeException("Category Not found"));
        categoryRepo.delete(category);
        return modelMapper.map(category, CategoryDTO.class);
    }
}
