package com.miu.day3Jpa.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Getter
@Setter
public class ProductDTO {

    private String name;
    private double price;
    private int rating;

}
