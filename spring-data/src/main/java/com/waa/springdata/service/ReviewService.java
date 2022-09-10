package com.waa.springdata.service;

import com.waa.springdata.entity.Review;

import java.util.List;

public interface ReviewService {
    void save(Review review);
    void delete(long id);
    List<Review> findAll();

    List<Review> findAllByProductId(long productId);
}
