package edu.miu.springdataday3.controller;

import edu.miu.springdataday3.entitiy.Category;
import edu.miu.springdataday3.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @PostMapping
    public void save(@RequestBody Category category) {
        categoryService.save(category);
    }

    @GetMapping
    public List<Category> findAll() {
        return categoryService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        categoryService.deleteById(id);
    }

}
