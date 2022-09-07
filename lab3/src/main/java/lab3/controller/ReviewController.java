package lab3.controller;

import lab3.dto.ReviewDTO;
import lab3.entity.Review;
import lab3.service.impl.ReviewServiceImpl;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reviews")
public class ReviewController {
    private final ReviewServiceImpl service;

    private final ModelMapper mapper;

    @GetMapping
    public List<ReviewDTO> getAll() {
        return service.findAll()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }



    @PostMapping
    public ReviewDTO save(@RequestBody Review review) {
        return this.toDTO(service.save(review));
    }

    @PutMapping("/{id}")
    public ReviewDTO update(@PathVariable int id, @RequestBody Review review) {
        review.setId(id);
        return this.toDTO(service.save(review));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    @GetMapping("filter/{id}")
    public List<ReviewDTO> getByProduct(@PathVariable int id) {
        return service.findByProduct(id)
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    private ReviewDTO toDTO(Review review) {
        return mapper.map(review, ReviewDTO.class);
    }

    private Review toEntity(ReviewDTO review) {
        return mapper.map(review, Review.class);
    }
}
