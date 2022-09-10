package edu.miu.springdataday3.service.impl;

import edu.miu.springdataday3.entitiy.Address;
import edu.miu.springdataday3.entitiy.Review;
import edu.miu.springdataday3.repo.ReviewRepo;
import edu.miu.springdataday3.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    ReviewRepo reviewRepo;
    @Override
    public List<Review> findAll() {
        return reviewRepo.findAll();
    }

    @Override
    public Review findByID(int id) {
        return reviewRepo.findById(id).get();
    }

    @Override
    public void save(Review review) {
        reviewRepo.save(review);
    }

    @Override
    public void deleteById(int id) {
        reviewRepo.deleteById(id);

    }
}
