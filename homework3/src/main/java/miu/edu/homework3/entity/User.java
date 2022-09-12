package miu.edu.homework3.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Data
@Entity
@Table(name = "my_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastname;



    //Create User and Review mapping with Join Table. // get rid of user_reviews table

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Review> reviews;

//
//    @OneToOne(mappedBy = "user")
//    private  Address address;

}
