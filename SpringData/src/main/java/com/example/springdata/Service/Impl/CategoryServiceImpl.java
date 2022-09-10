package com.example.springdata.Service.Impl;

import com.example.springdata.Model.Category;
import com.example.springdata.Repository.CategoryRepo;
import com.example.springdata.Service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    CategoryRepo categoryRepo;

    public CategoryServiceImpl(CategoryRepo categoryRepo){
        this.categoryRepo=categoryRepo;
    }

    @Override
    public List<Category> findAllCategory() {
         return (List<Category>) categoryRepo.findAll();
//        var result = new ArrayList<Category>();
//        var data =categoryRepo.findAll();
//        data.forEach(l->{
//         var p=   l.getProducts().get(0);
//         result.add(l);
//        });
//        return result;
    }

    @Override
    public Category findCategoryByID(int id) {
       return categoryRepo.findById(id).get();
    }

    @Override
    public Category addCategory(Category category) {
        return (Category) categoryRepo.save(category);
    }

    @Override
    public Category updateCategory( Category category) {
        return (Category)  categoryRepo.save(category);
    }

    @Override
    public void deleteCategoryById(int id) {
        categoryRepo.deleteById(id);


    }


}
