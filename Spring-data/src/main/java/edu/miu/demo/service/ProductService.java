package edu.miu.demo.service;

import edu.miu.demo.dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> findAll();

    ProductDto findById(int id);

    ProductDto save(ProductDto product);

    void remove(int id);

    List<ProductDto> findAllByPriceGreaterThan(Double minPrice);

    List<ProductDto> findByCategoryNameAndPriceLessThan(String categoryName, Double maxPrice);

    List<ProductDto> findAllByNameContains(String keyword);
}
