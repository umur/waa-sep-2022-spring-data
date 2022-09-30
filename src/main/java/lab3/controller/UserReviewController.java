package lab3.controller;

import lab3.dto.ReviewDto;
import lab3.service.UserReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserReviewController {
@Autowired
    private UserReviewService userReviewService;

    @PostMapping("/userreview/{id}")
    public void saveReviews(@PathVariable int id , @RequestBody ReviewDto reviewDto){
        userReviewService.saveReviews(id,reviewDto);

    }


}
