package com.waa.springdata.service;

import com.waa.springdata.dto.ProductDTO;
import com.waa.springdata.entity.Product;

import java.util.List;

public interface ProductService {
    void save(ProductDTO productDTO);
    List<Product> findAll();

    Product findById(long id);

    List<Product> findProductByPriceGreaterThan(double minPrice);
    List<Product> findProductByNameContaining(String keyword);
    List<Product> findProductByCategoryIdAndPriceLessThan(long categoryId, double maxPrice);

}
