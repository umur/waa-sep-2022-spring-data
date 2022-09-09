package edu.miu.lab_3.repo;

import edu.miu.lab_3.entity.Review;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepo extends CrudRepository<Review, Integer> {

}
