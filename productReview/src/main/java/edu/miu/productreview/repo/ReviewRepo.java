package edu.miu.productreview.repo;

import edu.miu.productreview.domain.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepo extends CrudRepository<Review, Integer> {
    //Find reviews of the product whose id is id
    List<Review> findAllByProduct(Integer id);
}
