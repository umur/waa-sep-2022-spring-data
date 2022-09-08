package edu.miu.springdataday3.service.impl;

import edu.miu.springdataday3.entitiy.Product;
import edu.miu.springdataday3.repo.ProductRepo;
import edu.miu.springdataday3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepo productRepo;

    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public void save(Product product) {
        productRepo.save(product);
    }

    @Override
    public List<Product> findAllByPriceGreaterThan(double price) {
        return productRepo.findAllByPriceGreaterThan(price);
    }

    @Override
    public List<Product> findAllByNameContaining(String name) {
        return productRepo.findAllByNameContaining(name);
    }

    @Override
    public void deleteById(int id) {
        productRepo.deleteById(id);
    }

    @Override
    public List<Product> findProductsInCategoryByPriceLessThan(int id, double price) {
        return productRepo.findProductsInCategoryByPriceLessThan(id,price);
    }
}
