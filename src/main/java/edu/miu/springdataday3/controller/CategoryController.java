package edu.miu.springdataday3.controller;

import edu.miu.springdataday3.entity.dto.CategoryDTO;
import edu.miu.springdataday3.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    // get
    @GetMapping
    private List<CategoryDTO> getAll(){
        return categoryService.getAll();
    }

    //post
    @PostMapping
    public CategoryDTO save(@RequestBody CategoryDTO categoryDTO){
        return categoryService.save(categoryDTO);
    }

    //update
    @PutMapping("/{id}")
    public CategoryDTO update(@PathVariable Long id, @RequestBody CategoryDTO categoryDTO){
        return categoryService.update(id, categoryDTO);
    }

    //delete
    @DeleteMapping("/{id}")
    public CategoryDTO delete(@PathVariable Long id){
        return categoryService.delete(id);
    }

}
