package com.waa.waalabthree.Controller;

import com.waa.waalabthree.Entity.Category;
import com.waa.waalabthree.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/allCategory")
    public List<Category> getAllCategory(){
        return categoryService.getAllCategory();
    }

    @GetMapping("/allCategory/{id}")
    public Optional<Category> getCategoryById(@PathVariable int id){
        return categoryService.getCategoryById(id);
    }

    @DeleteMapping("/allCategory")
    public void deleteCategory(){
        categoryService.deleteCategory();
    }

    @DeleteMapping("/allCategory/{id}")
    public void deleteCategoryById(@PathVariable int id){
        categoryService.deleteCategoryById(id);
    }

    @PostMapping("/allCategory")
    public Category createCategory(@RequestBody Category category){
        return categoryService.createCategory(category);
    }

    @PutMapping("/allCategory/{id}")
    public Category updateCategory(@PathVariable int id, @RequestBody Category category){
        return categoryService.updateCategory(id, category);
    }
}

