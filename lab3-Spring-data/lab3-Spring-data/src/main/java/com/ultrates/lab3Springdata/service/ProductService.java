package com.ultrates.lab3Springdata.service;

import com.ultrates.lab3Springdata.dto.ProductDto;
import com.ultrates.lab3Springdata.dto.ReviewDto;

import java.util.List;

public interface ProductService {

    void save(ProductDto p);
    void deleteById(int id);
    ProductDto getById(int id);
    List<ProductDto> getAll();

    List<ProductDto> findByPriceGreaterThan(float price);
    List<ProductDto> findByCategoryAndPriceLessThan(String Category, float price);
    List<ProductDto> findByNameContaining(String name);

    List<ReviewDto> getReviewByProductId(int id);

}
