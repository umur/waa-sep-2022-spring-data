package henry.waasep2022springdata.controller;

import henry.waasep2022springdata.dto.ProductDto;
import henry.waasep2022springdata.dto.ReviewDto;
import henry.waasep2022springdata.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@CrossOrigin
@RestController
@RequestMapping("/reviews")
public class ReviewController {
    private final ReviewService reviewService;

    @PostMapping
    public void save(@RequestBody ReviewDto reviewDto) {
        reviewService.save(reviewDto);
    }

    @GetMapping
    public List<ReviewDto> findAll() {
        return reviewService.findAll();
    }

    @PutMapping("/{reviewId}")
    public void update(@PathVariable int reviewId, @RequestBody ReviewDto reviewDto) {
        reviewService.update(reviewId, reviewDto);
    }

    @DeleteMapping("/{reviewId}")
    public ReviewDto delete(@PathVariable int reviewId) {
        return reviewService.delete(reviewId);
    }
}
