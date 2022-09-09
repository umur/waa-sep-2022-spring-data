package edu.miu.springdataday3.entitiy;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "productUser")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    @JsonManagedReference
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
//    @BatchSize(size = 2)
    private List<Review> reviews;

    @JsonManagedReference
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Address address;


}
