package miu.edu.homework3.service.imp;

import miu.edu.homework3.dto.CategoryDTO;
import miu.edu.homework3.service.CategoryService;
import miu.edu.homework3.entity.Category;
import miu.edu.homework3.repo.CategoryRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//@RequiredArgsConstructor
@Service
public class CategoryServiceImp implements CategoryService {

    private final CategoryRepo categoryRepo;

    private ModelMapper mapper;

    @Autowired
    public CategoryServiceImp(CategoryRepo categoryRepo, ModelMapper mapper){
        this.categoryRepo = categoryRepo;
        this.mapper = mapper;
    }


    @Override
    public void save(CategoryDTO categoryDTO) {
        var category = mapper.map(categoryDTO, Category.class);
        categoryRepo.save(category);
    }

    @Override
    public List<CategoryDTO> findAll() {
        List<Category> categories = categoryRepo.findAll();
        List<CategoryDTO> holdData = new ArrayList<>();

        categories.forEach(c->{
            var categoryDTO = mapper.map(c, CategoryDTO.class);
            holdData.add(categoryDTO);
        });
        return holdData;
    }


    @Override
    public CategoryDTO findById(int id) {
        Category category = categoryRepo.findById(id).orElse(null);
        CategoryDTO categoryDTO = mapper.map(category, CategoryDTO.class);
        return categoryDTO;

    }

    @Override
    public void delete(int id) {
        categoryRepo.deleteById(id);
    }
}
