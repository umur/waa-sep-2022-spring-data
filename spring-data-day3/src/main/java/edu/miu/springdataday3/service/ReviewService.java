package edu.miu.springdataday3.service;

import edu.miu.springdataday3.entitiy.Address;
import edu.miu.springdataday3.entitiy.Review;

import java.util.List;

public interface ReviewService {
    List<Review> findAll();
    Review findByID(int id);
    void save(Review review);
    void deleteById(int id);
}
