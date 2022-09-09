package edu.miu.productreview.controller;

import edu.miu.productreview.dto.CategoryDto;
import edu.miu.productreview.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/categories")
public class CategoryController {
    private final CategoryService categorySvc;

    @GetMapping
    public List<CategoryDto> findAll() {
        return categorySvc.findAll();
    }

    @GetMapping("/{id}")
    public CategoryDto findById(@PathVariable int id) {
        return categorySvc.findById(id);
    }

    @PostMapping
    public CategoryDto save(@RequestBody CategoryDto cat) {
        return categorySvc.save(cat);
    }

    @PutMapping("/{id}")
    public CategoryDto update(@PathVariable int id, @RequestBody CategoryDto cat) {
        return categorySvc.update(id, cat);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        categorySvc.delete(id);
    }
}
