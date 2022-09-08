package edu.miu.lab3springdata.service.impl;

import edu.miu.lab3springdata.dto.CategoryDto;
import edu.miu.lab3springdata.entity.Category;
import edu.miu.lab3springdata.exception.NotFoundException;
import edu.miu.lab3springdata.mapper.CategoryMapper;
import edu.miu.lab3springdata.mapper.ProductMapper;
import edu.miu.lab3springdata.repo.CategoryRepository;
import edu.miu.lab3springdata.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    private final CategoryMapper categoryMapper;

    private final ProductMapper productMapper;

    @Override
    public List<CategoryDto> getAll() {
        return categoryMapper.toDtos((List<Category>) categoryRepository.findAll());
    }

    @Override
    public CategoryDto getById(int id) {
        return categoryMapper.toDto(categoryRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Cannot find category: " + id)));
    }

    @Override
    @Transactional
    public void save(CategoryDto categoryDto) {
        categoryRepository.save(categoryMapper.toEntity(categoryDto));
    }


    @Override
    @Transactional
    public void delete(int id) {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Cannot find category: " + id));
        categoryRepository.delete(category);
    }
}
