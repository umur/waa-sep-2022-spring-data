package lab3.controller;

import lab3.dto.CategoryDto;
import lab3.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;


    @PostMapping("/category")
    public void saveCategory (@RequestBody CategoryDto categoryDto){

        categoryService.saveCategory(categoryDto);

    }

    @GetMapping("/category/{id}")
     public CategoryDto getCategoryById(@PathVariable Integer id){

        return categoryService.findById(id);
    }

    @GetMapping("/category")
    public List<CategoryDto> getAllCategories(){

        return categoryService.findALL();
    }


}
