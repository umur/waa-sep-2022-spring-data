package com.waa.springdata.service;


import com.waa.springdata.entity.Product;
import com.waa.springdata.repo.ProductRepo;

import java.util.List;

public interface ProductInterface {

    public Product saveProduct(Product p);

    List<Product> findByPrice(int price);

    List<Product> findByRating(double rate);
    //Product findById(int id);
    Product getProduct(int id);
}
