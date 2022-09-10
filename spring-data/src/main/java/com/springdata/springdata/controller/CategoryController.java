package com.springdata.springdata.controller;

import com.springdata.springdata.DTOs.CategoryDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.springdata.springdata.service.CategoryService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping
    public CategoryDTO save(@RequestBody CategoryDTO category) {
        return categoryService.save(category);
    }

    @GetMapping
    public List<CategoryDTO> findAll() {
        return categoryService.findAll();
    }

    @PutMapping("/{id}")
    public CategoryDTO update(@PathVariable int id, @RequestBody CategoryDTO category) {
        return categoryService.update(id, category);
    }

    @DeleteMapping("/{id}")
    public CategoryDTO delete(@PathVariable int id) {
        return categoryService.delete(id);
    }

}
