package edu.miu.service;

import edu.miu.dto.ProductDTO;
import edu.miu.entity.Product;

import java.util.List;

public interface ProductService {
    void save(ProductDTO productDTO);
    List<Product> findAll();

    Product findById(long id);

    List<Product> findProductByPriceGreaterThan(double minPrice);
    List<Product> findProductByNameContaining(String keyword);
    List<Product> findProductByCategoryIdAndPriceLessThan(long categoryId, double maxPrice);

}
