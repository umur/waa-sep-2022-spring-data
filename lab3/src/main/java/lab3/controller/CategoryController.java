package lab3.controller;

import lab3.dto.CategoryDTO;
import lab3.entity.Category;
import lab3.service.impl.CategoryServiceImpl;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequiredArgsConstructor
@RequestMapping("/category")
public class CategoryController {
    private final CategoryServiceImpl service;

    private final ModelMapper mapper;

    @GetMapping
    public List<CategoryDTO> getAll() {
        return service.findAll()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }



    @PostMapping
    public CategoryDTO save(@RequestBody Category category) {
        return this.toDTO(service.save(category));
    }

    @PutMapping("/{id}")
    public CategoryDTO update(@PathVariable int id, @RequestBody Category category) {
        category.setId(id);
        return this.toDTO(service.save(category));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    private CategoryDTO toDTO(Category category) {
        return mapper.map(category, CategoryDTO.class);
    }

    private Category toEntity(CategoryDTO category) {
        return mapper.map(category, Category.class);
    }
}
