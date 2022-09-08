package com.miu.day3Jpa.controller;

import com.miu.day3Jpa.dto.ReviewDTO;
import com.miu.day3Jpa.service.impl.ReviewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewController {
    @Autowired
    ReviewServiceImpl reviewService;

    @GetMapping
    public List<ReviewDTO> getAllreview(){
        return reviewService.getAllReview();
    }
    @PostMapping
    public void savereview(@RequestBody ReviewDTO reviewDTO){
        reviewService.saveReview(reviewDTO);
    }
    @PutMapping("/{id}")
    public void updatereview(@RequestBody ReviewDTO reviewDTO,@PathVariable int id){
        reviewService.updateReview(reviewDTO,id);
    }
    @DeleteMapping("/{id}")
    public void updatereview(@PathVariable int id){
        reviewService.deleteReview(id);
    }
}
