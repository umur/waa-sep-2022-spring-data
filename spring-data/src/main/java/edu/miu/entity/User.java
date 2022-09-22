package edu.miu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "user")
//    @JoinColumn(name = "user_id")
//    @JoinTable
    private List<Review> reviews = new ArrayList<>();

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Product> products = new ArrayList<>();

    @OneToMany
    private List<Role> roles = new ArrayList<>();

    @OneToOne
    private Address address;

    public Long getId() {
        return id;
    }
}
