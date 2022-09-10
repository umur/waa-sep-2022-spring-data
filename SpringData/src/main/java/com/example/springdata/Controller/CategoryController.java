package com.example.springdata.Controller;

import com.example.springdata.Model.Category;
import com.example.springdata.Service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

   private CategoryService categoryService;

   public CategoryController(CategoryService categoryService){
       this.categoryService=categoryService;
   }

    @GetMapping
    public List<Category> findAllCategory() {
        List<Category> categories= (List)categoryService.findAllCategory();
        return categories;
    }

    @GetMapping("/{id}")
    public Category findCategoryByID(@PathVariable int id) {
        return categoryService.findCategoryByID(id);
    }

    @PostMapping
    public Category addCategory(@RequestBody Category category) {
        return categoryService.addCategory(category);
    }

    @PutMapping
    public Category updateCategory(@RequestBody Category category) {
        return categoryService.updateCategory(category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategoryById(@PathVariable int id) {
        categoryService.deleteCategoryById(id);
    }
}
