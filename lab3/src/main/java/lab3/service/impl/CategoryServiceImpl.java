package lab3.service.impl;

import lab3.entity.Category;
import lab3.repo.CategoryRepo;
import lab3.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepo categoryRepo;
    @Override
    public Category save(Category category) {
        return categoryRepo.save(category);
    }

    @Override
    public void update(Category category) {
    categoryRepo.deleteById(category.getId());
    categoryRepo.save(category);
    }

    @Override
    public void delete(int catId) {
    categoryRepo.deleteById(catId);
    }

    @Override
    public List<Category> findAll() {
        return (List<Category>) categoryRepo.findAll();
    }
}
