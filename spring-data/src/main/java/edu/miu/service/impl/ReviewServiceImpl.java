package edu.miu.service.impl;

import edu.miu.entity.Review;
import edu.miu.repo.ReviewRepo;
import edu.miu.service.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepo reviewRepo;

    public ReviewServiceImpl(ReviewRepo reviewRepo) {
        this.reviewRepo = reviewRepo;
    }

    @Override
    public void save(Review review) {
        reviewRepo.save(review);
    }

    @Override
    public void delete(long id) {
        reviewRepo.deleteById(id);
    }

    @Override
    public List<Review> findAll() {
        return reviewRepo.findAll();
    }

    @Override
    public List<Review> findAllByProductId(long productId) {
        return reviewRepo.findAllByProductId(productId);
    }
}
