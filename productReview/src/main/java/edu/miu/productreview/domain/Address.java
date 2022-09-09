package edu.miu.productreview.domain;

import lombok.Data;
import org.hibernate.annotations.ValueGenerationType;

import javax.persistence.*;

@Data
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String street;
    private String zip;
    private String city;

    //An address can belong to only one User
//    @OneToOne(mappedBy="address")
//    private User user;
}
