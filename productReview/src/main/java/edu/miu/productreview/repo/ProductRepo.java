package edu.miu.productreview.repo;

import edu.miu.productreview.domain.Category;
import edu.miu.productreview.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {
    //Find all products that cost more than minPrice
    List<Product> findAllByPriceGreaterThan(Float minPrice);

    //Find all products in cat category and cost less than maxPrice
    List<Product> findAllByCategoryAndPriceLessThan(Category cat, Float maxPrice);

    //Find all products that contain keyword in the name
    List<Product> findAllByNameContaining(String keyword);
}
