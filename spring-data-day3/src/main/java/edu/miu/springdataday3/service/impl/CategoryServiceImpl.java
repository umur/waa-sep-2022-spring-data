package edu.miu.springdataday3.service.impl;

import edu.miu.springdataday3.entitiy.Category;
import edu.miu.springdataday3.repo.CategoryRepo;
import edu.miu.springdataday3.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepo categoryRepo;


    @Override
    public void save(Category category) {
        categoryRepo.save(category);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepo.findAll();
    }

    @Override
    public void deleteById(int id) {
        categoryRepo.deleteById(id);
    }
}
