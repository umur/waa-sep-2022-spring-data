package edu.miu.lab_3.controller;

import edu.miu.lab_3.entity.Review;
import edu.miu.lab_3.service.ReviewService;
import edu.miu.lab_3.service.imp.ReviewServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
    @Autowired
    ReviewServiceImp reviewService;

    @GetMapping
    public List<Review> findAll() {
        return reviewService.findAll();
    }

    @GetMapping("/{id}")
    public Review findReviewById( @PathVariable int id) {
        return reviewService.findReviewById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteReviewById(@PathVariable int id) {
        reviewService.deleteReviewById(id);
    }

    @PostMapping
    public void saveReview(@RequestBody Review review) {
        reviewService.saveReview(review);
    }
}
