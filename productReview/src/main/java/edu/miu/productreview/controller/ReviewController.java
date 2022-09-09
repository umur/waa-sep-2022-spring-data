package edu.miu.productreview.controller;

import edu.miu.productreview.dto.ReviewDto;
import edu.miu.productreview.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reviews")
public class ReviewController {
    private final ReviewService reviewSvc;

    @GetMapping
    public List<ReviewDto> findAll() {
        return reviewSvc.findAll();
    }

    @GetMapping("/{id}")
    public ReviewDto findById(@PathVariable int id) {
        return reviewSvc.findById(id);
    }

    @PostMapping
    public ReviewDto save(@RequestBody ReviewDto review) {
        return reviewSvc.save(review);
    }

    @PutMapping("/{id}")
    public ReviewDto save(@PathVariable int id, @RequestBody ReviewDto review) {
        return reviewSvc.update(id, review);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        reviewSvc.delete(id);
    }

    @GetMapping("/product/{productId}")
    public List<ReviewDto> findAllByProduct(@PathVariable int productId) {
        return reviewSvc.findAllByProduct(productId);
    }
}
