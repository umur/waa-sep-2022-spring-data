package com.example.springdata.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    private double rating;
    @JsonBackReference
    @ManyToOne( cascade=CascadeType.PERSIST)
    @JoinColumn(name="category_id")
    private Category category;
}
