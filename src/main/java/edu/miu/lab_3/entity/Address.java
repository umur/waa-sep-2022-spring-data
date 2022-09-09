package edu.miu.lab_3.entity;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Table(name = "living_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column()
    private String street;
    private String zip;
    private String city;

    @OneToOne(mappedBy = "address")
    private User user;
}
