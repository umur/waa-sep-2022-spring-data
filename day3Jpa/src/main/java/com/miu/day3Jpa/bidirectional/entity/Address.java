package com.miu.day3Jpa.bidirectional.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

       @Id
       private int id;
       private String street;
       private String zip;
       private String city;
       @OneToOne(mappedBy = "address")
       private User user;
}
