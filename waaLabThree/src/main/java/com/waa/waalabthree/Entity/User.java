package com.waa.waalabthree.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String email;
    private String password;
    private String firstname;
    private String lastName;

    @OneToMany
    @JoinColumn
    private List<Review> reviews;

    @OneToOne
    @JoinColumn
    private Address address;





}
