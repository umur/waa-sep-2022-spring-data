package com.example.springdata.Service;

import com.example.springdata.Model.Review;

import java.util.List;

public interface ReviewService {
    public List<Review> findAllReview();
    public Review findReviewByID();
    public void addReview();
    public void updateReview();
    public void deleteReview();
}
