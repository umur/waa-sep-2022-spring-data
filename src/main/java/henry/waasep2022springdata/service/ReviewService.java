package henry.waasep2022springdata.service;

import henry.waasep2022springdata.dto.ReviewDto;

import java.util.List;

public interface ReviewService {
    void save(ReviewDto reviewDto);
    List<ReviewDto> findAll();
    void update(int reviewId, ReviewDto reviewDto);
    ReviewDto delete(int reviewId);
}
