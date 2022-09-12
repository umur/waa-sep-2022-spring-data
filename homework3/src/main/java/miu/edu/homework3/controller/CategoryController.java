package miu.edu.homework3.controller;

import miu.edu.homework3.dto.CategoryDTO;
import miu.edu.homework3.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/categories")
@Transactional

public class CategoryController {
    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @PostMapping
    public void save(@RequestBody CategoryDTO categoryDTO){
        categoryService.save(categoryDTO);
    }

    @GetMapping
    public List<CategoryDTO> findALl(){
        return categoryService.findAll();
    }


    @GetMapping("/{id}")
    public CategoryDTO getById (@PathVariable Integer id){
        return categoryService.findById(id);
    }

    @DeleteMapping
    public void delete(@PathVariable Integer id){
        categoryService.delete(id);
    }
}
