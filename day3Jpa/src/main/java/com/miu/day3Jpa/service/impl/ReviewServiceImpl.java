package com.miu.day3Jpa.service.impl;

import com.miu.day3Jpa.dto.ReviewDTO;
import com.miu.day3Jpa.dto.ReviewDTO;
import com.miu.day3Jpa.entity.Review;
import com.miu.day3Jpa.repository.ReviewRepository;
import com.miu.day3Jpa.service.ReviewService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    ReviewRepository reviewRepository;

    @Autowired
    ModelMapper modelMapper;

    public List<ReviewDTO> getAllReview(){
        List<Review> Reviewes = (List<Review>) reviewRepository.findAll();
        return Reviewes.stream().map(Review -> modelMapper.map(Review,ReviewDTO.class)).collect(Collectors.toList());
    }

    public void saveReview(ReviewDTO ReviewDTO){
        Review Review = modelMapper.map(ReviewDTO,Review.class);
        reviewRepository.save(Review);
    }
    @Transactional
    public void updateReview(ReviewDTO reviewDTO,int id){

        Review reviewToBeUpdated = reviewRepository.findById(id).get();
        reviewToBeUpdated.setComment(reviewDTO.getComment());
        reviewRepository.save(reviewToBeUpdated);
    }

    public void deleteReview(int id){
        reviewRepository.deleteById(id);
    }
}
