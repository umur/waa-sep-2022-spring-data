package edu.miu.lab_3.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private float price;
    private int rating;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}
