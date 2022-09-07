package lab3.repo;

import lab3.entity.Category;
import lab3.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Integer> {

    List<Product> findProductsByPriceGreaterThan(Double price);

    List<Product> findProductsByCategoryAndPriceLessThan(Category category, Double price);
    List<Product> findProductsByNameContains(String word);
}
