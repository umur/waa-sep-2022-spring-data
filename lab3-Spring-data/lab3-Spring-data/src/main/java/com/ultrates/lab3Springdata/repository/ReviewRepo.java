package com.ultrates.lab3Springdata.repository;

import com.ultrates.lab3Springdata.entity.bidirectional.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends CrudRepository<Review, Integer> {
}
