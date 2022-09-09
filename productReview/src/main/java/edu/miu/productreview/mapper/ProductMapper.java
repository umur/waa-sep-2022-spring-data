package edu.miu.productreview.mapper;

import edu.miu.productreview.domain.Product;
import edu.miu.productreview.dto.ProductDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProductMapper {
    private final ModelMapper modelMapper;
    public ProductDto toDto(Product p) {
        return modelMapper.map(p, ProductDto.class);
    }
    public Product toEntity(ProductDto p) {
        return modelMapper.map(p, Product.class);
    }
    public List<ProductDto> toDtos(List<Product> products) {
        return products.stream().map(this::toDto).toList();
    }
    public List<Product> toEntities(List<ProductDto> products) {
        return products.stream().map(this::toEntity).toList();
    }
}
