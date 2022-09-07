package lab3.repo;

import lab3.entity.Product;
import lab3.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepo extends JpaRepository<Review,Integer> {
    List<Review> findReviewsByProduct(Product product);
}
