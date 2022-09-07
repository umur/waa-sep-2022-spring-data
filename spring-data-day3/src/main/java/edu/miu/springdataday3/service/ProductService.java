package edu.miu.springdataday3.service;

import edu.miu.springdataday3.entitiy.Product;
import edu.miu.springdataday3.repo.ProductRepo;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    void save(Product product);

    List<Product>findAllByPriceGreaterThan(double price);

    List<Product> findAllByNameContaining(String name);

    void deleteById(int id);
}
