package lab3.service;

import lab3.dto.ReviewDto;

public interface UserReviewService {
    void saveReviews(int id, ReviewDto reviewDto);
}
