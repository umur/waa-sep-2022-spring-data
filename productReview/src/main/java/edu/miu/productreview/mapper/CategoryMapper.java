package edu.miu.productreview.mapper;

import edu.miu.productreview.domain.Category;
import edu.miu.productreview.dto.CategoryDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CategoryMapper {
    private final ModelMapper modelMapper;
    public CategoryDto toDto(Category cat) {
        return modelMapper.map(cat, CategoryDto.class);
    }
    public Category toEntity(CategoryDto cat) {
        return modelMapper.map(cat, Category.class);
    }
    public List<CategoryDto> toDtos(List<Category> cats) {
        return cats.stream().map(this::toDto).toList();
    }
    public List<Category> toEntities(List<CategoryDto> cats) {
        return cats.stream().map(this::toEntity).toList();
    }
}
