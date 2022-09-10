package com.waa.waalabthree.Controller;

import com.waa.waalabthree.Entity.Review;
import com.waa.waalabthree.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/review")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @GetMapping("/allreview")
    public List<Review> getAllReview(){
        return reviewService.getAllReview();
    }

    @GetMapping("/allreview/{id}")
    public Optional<Review> getReviewById(@PathVariable int id){
        return reviewService.getReviewById(id);
    }

    @DeleteMapping("/allreview")
    public void deleteAllReview(){
        reviewService.deleteAllReview();
    }

    @DeleteMapping("/allreview/{id}")
    public void deleteReviewById(@PathVariable int id){
        reviewService.deleteReviewById(id);
    }

    @PutMapping("/allreview/{id}")
    public Review updateReviewById(@PathVariable int id, @RequestBody Review review){
        return reviewService.updateReviewById(id, review);
    }

    @PostMapping("/allreview")
    public Review createReview(@RequestBody Review review){
        return reviewService.createReview(review);
    }
}
