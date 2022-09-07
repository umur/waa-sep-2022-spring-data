package lab3.service;

import lab3.entity.Category;
import lab3.entity.Review;
import lab3.entity.User;

import java.util.List;
import java.util.Optional;

public interface ReviewService {
    Review save(Review newReview);


    Optional<Review> getById(int id);
    public void delete(int id);
    public List<Review> findAll();

    List<Review> findByProduct(int id);
}
