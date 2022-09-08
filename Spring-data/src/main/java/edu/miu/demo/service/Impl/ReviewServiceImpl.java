package edu.miu.demo.service.Impl;

import edu.miu.demo.domain.bidirection.joincolumn.Review;
import edu.miu.demo.dto.ReviewDto;
import edu.miu.demo.repo.ReviewRepo;
import edu.miu.demo.service.ReviewService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Type;
import java.util.List;

public class ReviewServiceImpl implements ReviewService {

    private ReviewRepo reviewRepository;

    private ModelMapper modelMapper;

    public ReviewServiceImpl(ReviewRepo reviewRepository,ModelMapper modelMapper){
        this.reviewRepository = reviewRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    @Transactional(readOnly = true)
    public List<ReviewDto> findAll() {
        var reviews = reviewRepository.findAll();
        Type listType = new TypeToken<List<ReviewDto>>(){}.getType();
        return modelMapper.map(reviews,listType);
    }

    @Override
    @Transactional(readOnly = true)
    public ReviewDto findById(Long id) {
        var review = reviewRepository.findById(id).orElseThrow(()-> new RuntimeException(String.format("Review with id %s does not exits",id)));
        return modelMapper.map(review, ReviewDto.class);
    }

    @Override
    public void delete(Long id) {
        reviewRepository.deleteById(id);
    }

    @Override
    public ReviewDto save(ReviewDto reviewDto) {
        var review = modelMapper.map(reviewDto, Review.class);
        return modelMapper.map(reviewRepository.save(review), ReviewDto.class);
    }

    @Override
    public List<ReviewDto> findAllReviewByProductId(Long id) {
        var reviews = reviewRepository.findAllByProductId(id);
        Type listType = new TypeToken<List<ReviewDto>>(){}.getType();
        return modelMapper.map(reviews,listType);
    }

}
