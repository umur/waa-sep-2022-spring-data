package com.miu.day3Jpa.repository;

import com.miu.day3Jpa.entity.Product;
import com.miu.day3Jpa.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer> {

    List<Product> findProductByNameContainingIgnoreCase(String keyword);
    List<Product> findAllByPriceGreaterThan(double minPrice);

    List<Product> findAllByCategory_NameAndPriceLessThan(String cat,double maxPrice);

    List<Review> findByReviewsProductId(int id);
}
