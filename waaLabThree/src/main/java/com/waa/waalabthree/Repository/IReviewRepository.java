package com.waa.waalabthree.Repository;

import com.waa.waalabthree.Entity.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IReviewRepository extends CrudRepository<Review,Integer> {

    public List<Review> getReviewByCommentIs(String s);
    public List<Review>findByCommentGreaterThan(int i);
}
