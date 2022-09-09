package com.waa.springdata.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Product {
    @Id
    private int id;
    private String name;
    private int price;
    private double rating;

    @ManyToOne()
    private Category category;

}
