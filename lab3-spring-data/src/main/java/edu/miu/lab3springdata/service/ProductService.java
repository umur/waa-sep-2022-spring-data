package edu.miu.lab3springdata.service;

import edu.miu.lab3springdata.dto.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> getProducts();

    void delete(int id);

    void add(int categoryId, ProductDto productDto);

    List<ProductDto> findByPrice(Double minPrice);


    List<ProductDto> findByCategoryAndMaxPrice(int categoryId, Double maxPrice);
}
