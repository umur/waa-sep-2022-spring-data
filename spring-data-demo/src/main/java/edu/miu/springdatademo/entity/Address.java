package edu.miu.springdatademo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String street;

    private int zip;

    private String city;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
