package lab3.service;

import lab3.dto.ReviewDto;
import lab3.entity.ReviewEntity;
import lab3.entity.UserEntity;
import lab3.repository.UserRep;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserReviewServiceImpl implements  UserReviewService{
    @Autowired
    private UserRep userRep;
    @Autowired
    private ModelMapper mapper;
    @Override
    public void saveReviews(int id, ReviewDto reviewDto) {

        ReviewEntity reviewEntity =mapper.map(reviewDto,ReviewEntity.class);
       Optional<UserEntity> userEntity= userRep.findById(id);
       if(userEntity.isPresent()){
           UserEntity user =userEntity.get();
           user.addReview(reviewEntity);
           userRep.save(user);
       }
    }
}
