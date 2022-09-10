package com.springdata.springdata.controller;

import com.springdata.springdata.DTOs.ReviewDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.springdata.springdata.service.ReviewService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/review")
public class ReviewController {
    private final ReviewService reviewService;

    @PostMapping
    public ReviewDTO save(@RequestBody ReviewDTO review) {
        return reviewService.save(review);
    }

    @GetMapping
    public List<ReviewDTO> findAll() {
        return reviewService.findAll();
    }

    @PutMapping("/{id}")
    public ReviewDTO update(@PathVariable int id, @RequestBody ReviewDTO review) {
        return reviewService.update(id, review);
    }

    @DeleteMapping("/{id}")
    public ReviewDTO delete(@PathVariable int id) {
        return reviewService.delete(id);
    }
}
