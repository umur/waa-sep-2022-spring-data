package com.waa.waalabthree.Service;

import com.waa.waalabthree.Entity.Review;
import com.waa.waalabthree.Repository.IReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {
    @Autowired
    private IReviewRepository iReviewRepository;

    public List<Review> getAllReview(){
        return (List<Review>) iReviewRepository.findAll();
    }

    public Optional<Review> getReviewById(int id){
        return iReviewRepository.findById(id);
    }

    public void deleteAllReview(){
        iReviewRepository.deleteAll();
    }

    public void deleteReviewById(int id){
        iReviewRepository.deleteById(id);
    }

    public Review updateReviewById(int id, Review review){
        return (Review) iReviewRepository.save(review);
    }

    public Review createReview(Review review){
        return (Review) iReviewRepository.save(review);
    }

}
