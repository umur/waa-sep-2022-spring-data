package edu.miu.springdataday3.controller;

import edu.miu.springdataday3.entitiy.Address;
import edu.miu.springdataday3.entitiy.Review;
import edu.miu.springdataday3.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewController {
    @Autowired
    ReviewService reviewService;

    @GetMapping
    public List<Review> findAll() {
        return reviewService.findAll();
    }

    @GetMapping("/{id}")
    public Review findByID(@PathVariable int id) {
        return reviewService.findByID(id);
    }

    @PostMapping
    public void save(@RequestBody Review review) {
        reviewService.save(review);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        reviewService.deleteById(id);

    }
}
