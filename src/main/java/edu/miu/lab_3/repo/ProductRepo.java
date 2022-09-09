package edu.miu.lab_3.repo;

import edu.miu.lab_3.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {

//    @Query("select  p form Product p where p.price >= price")
    public List<Product> findByPriceGreaterThan(float price);
//
//    @Query("select p form Product p where p.reviews.size >= :num")
//    public List<Product> findProductWithReviews(int num);



}
