package com.waa.waalabthree.Service;

import com.waa.waalabthree.Entity.Category;
import com.waa.waalabthree.Repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;

    public List<Category> getAllCategory(){
        return (List<Category>) iCategoryRepository.findAll();
    }

    public Optional<Category> getCategoryById(int id){
        return iCategoryRepository.findById(id);
    }

    public void deleteCategory(){
        iCategoryRepository.deleteAll();
    }

    public void deleteCategoryById(int id){
        iCategoryRepository.deleteById(id);
    }

    public Category createCategory(Category category){
        return iCategoryRepository.save(category);
    }

    public Category updateCategory(int id, Category category){
        return iCategoryRepository.save(category);
    }


}
