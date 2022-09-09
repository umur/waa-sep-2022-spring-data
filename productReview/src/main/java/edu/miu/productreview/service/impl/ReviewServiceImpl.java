package edu.miu.productreview.service.impl;

import edu.miu.productreview.domain.Review;
import edu.miu.productreview.dto.ReviewDto;
import edu.miu.productreview.mapper.ReviewMapper;
import edu.miu.productreview.repo.ReviewRepo;
import edu.miu.productreview.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    private final ReviewMapper reviewMapper;
    private final ReviewRepo reviewRepo;
    @Override
    public ReviewDto save(ReviewDto review) {
        Review result = reviewRepo.save(reviewMapper.toEntity(review));
        return reviewMapper.toDto(result);
    }

    @Override
    public List<ReviewDto> findAll() {
        List<Review> reviews = new ArrayList<>();
        reviewRepo.findAll().forEach(reviews::add);
        return reviewMapper.toDtos(reviews);
    }

    @Override
    public ReviewDto findById(int id) {
        return reviewRepo.findById(id)
                .map(reviewMapper::toDto)
                .orElse(new ReviewDto());
    }

    @Override
    public ReviewDto update(int id, ReviewDto review) {
        if(reviewRepo.existsById(id)) {
            review.setId(id);
            return this.save(review);
        } else {
            throw new NoResultException();
        }
    }

    @Override
    public void delete(int id) {
        reviewRepo.deleteById(id);
    }

    @Override
    public List<ReviewDto> findAllByProduct(int productId) {
        List<Review> reviews = new ArrayList<>();
        reviewRepo.findAllByProduct(productId).forEach(reviews::add);
        return reviewMapper.toDtos(reviews);
    }
}
