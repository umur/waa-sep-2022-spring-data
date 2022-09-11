package edu.miu.controller;

import edu.miu.entity.Review;
import edu.miu.service.impl.ReviewServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/reviews")
@RestController
public class ReviewController {
    private final ReviewServiceImpl reviewService;

    public ReviewController(ReviewServiceImpl reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping
    public void save(@RequestBody Review review) {
        reviewService.save(review);
    }

    @GetMapping
    public List<Review> findAll() {
        return reviewService.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        reviewService.delete(id);
    }
}
