package edu.miu.springdataday3.repo;

import edu.miu.springdataday3.entitiy.Review;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepo extends CrudRepository<Review,Integer> {
}
