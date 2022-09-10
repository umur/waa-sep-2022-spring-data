package com.example.assignment3.controller;

import com.example.assignment3.dto.CategoryDto;
import com.example.assignment3.expection.ResourceNotFoundException;
import com.example.assignment3.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/category")
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping()
    public ResponseEntity<CategoryDto> save(CategoryDto categoryDto){
        CategoryDto createdCategory = categoryService.save(categoryDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCategory);
    }

    @GetMapping("/{id:[0-9]}")
    public CategoryDto getById(@PathVariable Long id){
        Optional<CategoryDto> foundCategory = categoryService.getById(id);
        return foundCategory.orElseThrow(ResourceNotFoundException::new);
    }

    @DeleteMapping("/{id:[0-9]}")
    public CategoryDto deleteById(@PathVariable Long id){
        Optional<CategoryDto> deletedCategory = categoryService.deleteById(id);
        return deletedCategory.orElseThrow(ResourceNotFoundException::new);
    }

    @PutMapping("/{id:[0-9]}")
    public CategoryDto updateById(@PathVariable Long id, @RequestBody CategoryDto categoryDto){
        Optional<CategoryDto> updatedCategory = categoryService.update(id, categoryDto);
        return updatedCategory.orElseThrow(ResourceNotFoundException::new);
    }
}
