package edu.miu.lab_3.controller;

import edu.miu.lab_3.dto.CategoryDto;
import edu.miu.lab_3.service.imp.CategoryServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryServiceImp categoryService;

    @GetMapping
    public List<CategoryDto> findAll(){
        return categoryService.findAll();
    }
    @GetMapping("/{id}")
    public CategoryDto getCategoryById(@PathVariable int id) {
        return categoryService.getCategoryById(id);
    }
    @PostMapping
    public void saveCategoryDto(@RequestBody CategoryDto categoryDto){
        categoryService.saveCategoryDto(categoryDto);
    }
    @DeleteMapping("/{id}")
    public void deleteCategoryDto (@PathVariable int id) {
        categoryService.deleteCategoryDtoById(id);

    }
    @PutMapping("/{id}")
    public CategoryDto updateCategoryDto(@PathVariable int id, @RequestBody CategoryDto categoryDto) {
        return categoryService.updateCategoryDto(id, categoryDto);
    }


}
