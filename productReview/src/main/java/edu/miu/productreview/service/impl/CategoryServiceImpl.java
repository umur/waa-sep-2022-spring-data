package edu.miu.productreview.service.impl;

import edu.miu.productreview.domain.Category;
import edu.miu.productreview.dto.CategoryDto;
import edu.miu.productreview.mapper.CategoryMapper;
import edu.miu.productreview.repo.CategoryRepo;
import edu.miu.productreview.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryMapper categoryMapper;
    private final CategoryRepo categoryRepo;

    @Override
    public CategoryDto save(CategoryDto category) {
        Category result = categoryRepo.save(categoryMapper.toEntity(category));
        return categoryMapper.toDto(result);
    }

    @Override
    public List<CategoryDto> findAll() {
        Iterable<Category> result = categoryRepo.findAll();
        List<Category> cats = new ArrayList<>();
        result.forEach(cats::add);
        return categoryMapper.toDtos(cats);
    }

    @Override
    public CategoryDto findById(int id) {
        return categoryRepo.findById(id)
                .map(categoryMapper::toDto)
                .orElse(new CategoryDto());
    }

    @Override
    public CategoryDto update(int id, CategoryDto category) {
        if(categoryRepo.existsById(id)) {
            category.setId(id);
            return this.save(category);
        } else {
            throw new NoResultException();
        }
    }

    @Override
    public void delete(int id) {
        categoryRepo.deleteById(id);
    }
}
