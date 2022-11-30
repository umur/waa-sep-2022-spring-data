package com.example.assignment3.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "review_table")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String comment;

    private LocalDate createAt;

    private LocalDate updateAt;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}