package com.miu.day3Jpa.repository;

import com.miu.day3Jpa.entity.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ReviewRepository extends CrudRepository<Review,Integer> {

    List<Review> findByProductId(int id);


}
