package edu.miu.productreview.mapper;

import edu.miu.productreview.domain.Review;
import edu.miu.productreview.dto.ReviewDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ReviewMapper {
    private final ModelMapper modelMapper;
    public ReviewDto toDto(Review review) {
        return modelMapper.map(review, ReviewDto.class);
    }
    public Review toEntity(ReviewDto review) {
        return modelMapper.map(review, Review.class);
    }
    public List<ReviewDto> toDtos(List<Review> reviews) {
        return reviews.stream().map(this::toDto).toList();
    }
    public List<Review> toEntities(List<ReviewDto> reviews) {
        return reviews.stream().map(this::toEntity).toList();
    }
}
