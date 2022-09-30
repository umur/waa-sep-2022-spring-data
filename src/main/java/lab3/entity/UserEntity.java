package lab3.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    List<ReviewEntity> reviews;

    public void addReview(ReviewEntity reviewEntity){
        reviews.add(reviewEntity);
        reviewEntity.setUser(this);
    }
}
