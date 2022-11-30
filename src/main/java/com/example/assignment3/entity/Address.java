package com.example.assignment3.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "address_table")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String street;
    private String city;
    private int zip;
    private LocalDate createAt;
    private LocalDate updateAt;

    @OneToOne(mappedBy = "address")
    @JoinColumn(name = "user_id")
    private User user;

}