package com.miu.day3Jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

       @Id
       @GeneratedValue(strategy = GenerationType.SEQUENCE)
       private int id;
       private String street;
       private String zip;
       private String city;

}
