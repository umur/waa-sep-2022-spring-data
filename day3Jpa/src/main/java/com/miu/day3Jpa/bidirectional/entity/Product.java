package com.miu.day3Jpa.bidirectional.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
@Getter
@Setter
public class Product {
    @Id
    private int id;
    private String name;
    private double price;
    private int rating;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
