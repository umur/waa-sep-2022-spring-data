package com.waa.springdata.repo;

import com.waa.springdata.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {
    List<Product> findAllByPriceGreaterThan(int price);
    List<Product> findByPriceLessThan(int price);
    List<Product> findAllProductsByRating(double rate);

    Product save(Product p);
    Product findById(int id);
    void deleteById(int id);

    List<Product> findAll();
}
