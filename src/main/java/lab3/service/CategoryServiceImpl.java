package lab3.service;

import lab3.dto.CategoryDto;
import lab3.dto.ProductDto;
import lab3.entity.CategoryEntity;
import lab3.entity.ProductEntity;
import lab3.repository.CategoryRep;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService{
@Autowired
private CategoryRep categoryRep;
@Autowired
private ModelMapper mapper;
    @Override
    public void saveCategory(CategoryDto categoryDto) {
        CategoryEntity categoryEntity=mapper.map(categoryDto, CategoryEntity.class);

        categoryRep.save(categoryEntity);
    }

    @Override
    public CategoryDto findById(Integer id) {
        CategoryEntity categoryEntity =categoryRep.findById(id).get();
        CategoryDto categoryDto =mapper.map(categoryEntity, CategoryDto.class);
        return (categoryDto);
    }

    @Override
    public List<CategoryDto> findALL() {
        List<CategoryEntity> listOfCategories = new ArrayList<>();
        Iterator<CategoryEntity> iterator = categoryRep.findAll().iterator();
        while (iterator.hasNext()) {
            listOfCategories.add(iterator.next());
        }
        return listOfCategories.stream()
                .map(c->mapper.map(c,CategoryDto.class)).
                collect(Collectors.toList());


    }
}
