package com.ultrates.lab3Springdata.entity.bidirectional;

import lombok.Data;

import javax.persistence.*;

//This Entity is being used for bidirectional association.
@Entity
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String street;
    private String zip;
    private String city;


     @OneToOne(mappedBy="address")
     private User user;

}
