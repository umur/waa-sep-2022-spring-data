package edu.miu.demo.service;

import edu.miu.demo.dto.ReviewDto;

import java.util.List;

public interface ReviewService {

    List<ReviewDto> findAll();

    ReviewDto findById(Long id);

    void delete(Long id);

    ReviewDto save(ReviewDto review);

    List<ReviewDto> findAllReviewByProductId(Long id);
}
