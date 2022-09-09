package edu.miu.springdataday3.service;

import edu.miu.springdataday3.dto.ProductDto;
import edu.miu.springdataday3.entitiy.Product;
import edu.miu.springdataday3.repo.ProductRepo;

import java.util.List;

public interface ProductService {
    List<ProductDto> findDtoProducts();
    List<Product> findAll();

    void save(Product product);

    List<Product>findAllByPriceGreaterThan(double price);

    List<Product> findAllByNameContaining(String name);

    void deleteById(int id);
    List<Product> findProductsInCategoryByPriceLessThan(int id, double price);
}
