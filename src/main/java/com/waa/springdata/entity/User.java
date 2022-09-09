package com.waa.springdata.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Users")
public class User {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    //@OneToMany()
    //@OneToMany(mappedBy = "user")
    @OneToMany()
    //@JoinColumn()
    private List<Review> reviews;

    @OneToOne
    private Address address;
}

