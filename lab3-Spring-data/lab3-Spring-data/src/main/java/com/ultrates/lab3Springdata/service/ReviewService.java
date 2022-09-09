package com.ultrates.lab3Springdata.service;

import com.ultrates.lab3Springdata.dto.ReviewDto;

import java.util.List;

public interface ReviewService {
    void save(ReviewDto p);
    void deleteById(int id);
    ReviewDto getById(int id);
    List<ReviewDto> getAll();
}
