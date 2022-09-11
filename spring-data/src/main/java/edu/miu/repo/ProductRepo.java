package edu.miu.repo;

import edu.miu.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
    List<Product> findProductByPriceGreaterThan(double minPrice);
    List<Product> findProductByNameContaining(String keyword);
    List<Product> findProductByCategoryIdAndPriceLessThan(long categoryId, double maxPrice);
}
