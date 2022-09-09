package miu.edu.homework3;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastname;



    //Create User and Review mapping with Join Table. // get rid of user_reviews table

    @OneToMany
//    @JoinTable
    @JoinColumn
    private List<Review> reviews;




    @OneToOne
//    @JoinTable
    @JoinColumn
    private  Address address;

}
