package edu.miu.controller;

import edu.miu.dto.CategoryDTO;
import edu.miu.entity.Category;
import edu.miu.service.impl.CategoryServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/categories")
@RestController
public class CategoryController {
    private final CategoryServiceImpl categoryService;

    public CategoryController(CategoryServiceImpl categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> findAll() {
        return categoryService.findAll();
    }

    @GetMapping("/{id}")
    public Category findById(@PathVariable long id) {
        return categoryService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody Category category) {
        categoryService.save(category);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable long id, @RequestBody CategoryDTO categoryDTO) {
        categoryService.update(id, categoryDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        categoryService.delete(id);
    }
}
