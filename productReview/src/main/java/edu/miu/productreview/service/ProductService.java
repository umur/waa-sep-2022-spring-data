package edu.miu.productreview.service;

import edu.miu.productreview.domain.Product;
import edu.miu.productreview.dto.ProductDto;

import java.util.List;

public interface ProductService {
    ProductDto save(ProductDto product);
    void delete(int id);
    ProductDto findById(int id);
    ProductDto update(int id, ProductDto product);
    List<ProductDto> findAll();
    List<ProductDto> findAllByPriceGreaterThan(Float minPrice);
    List<ProductDto> findAllByCategoryAndPriceLessThan(String cat, Float maxPrice);
    List<ProductDto> findAllByNameContaining(String keyword);
}
