package edu.miu.demo.repo;

import edu.miu.demo.domain.bidirection.joincolumn.Review;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReviewRepo extends CrudRepository<Review, Long> {
    List<Review> findAllByProductId(Long id);

}
