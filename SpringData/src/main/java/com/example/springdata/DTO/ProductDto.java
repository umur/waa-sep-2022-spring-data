package com.example.springdata.DTO;

import com.example.springdata.Model.Category;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class ProductDto {
    private int id;
    private String name;
    private double price;
    private double rating;


}
