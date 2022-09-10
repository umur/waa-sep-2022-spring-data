package edu.miu.lab_3.service;

import edu.miu.lab_3.entity.Review;

import java.util.List;

public interface ReviewService {
    List<Review> findAll();
    Review findReviewById(int id);
    void deleteReviewById(int id);
    void saveReview(Review review);

}
