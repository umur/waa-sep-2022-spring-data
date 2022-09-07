package edu.miu.springdataday3.repo;

import edu.miu.springdataday3.entitiy.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product,Integer> {
    List<Product> findAll();

    // Find all products that cost more than minPrice
    List<Product>findAllByPriceGreaterThan(double price);

    //Find all products in cat category and cost less than maxPrice


    //Find all products that contain keyword in the name
    List<Product> findAllByNameContaining(String name);
}
