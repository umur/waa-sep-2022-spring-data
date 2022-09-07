package lab3.service.impl;

import lab3.entity.Review;
import lab3.entity.User;
import lab3.repo.ProductRepo;
import lab3.repo.ReviewRepo;
import lab3.service.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    private ReviewRepo reviewRepo;
    private ProductRepo productRepo;
    @Override
    public Review save(Review review) {
        return reviewRepo.save(review);
    }

    @Override
    public Optional<Review> getById(int id) {
        return reviewRepo.findById(id);
    }

    @Override
    public void delete(int id) {
        reviewRepo.deleteById(id);

    }

    @Override
    public List<Review> findAll() {
        return reviewRepo.findAll();
    }

    @Override
    public List<Review> findByProduct(int id) {
        return productRepo.findById(id).map(reviewRepo::findReviewsByProduct).orElseGet(ArrayList::new);
    }
}
