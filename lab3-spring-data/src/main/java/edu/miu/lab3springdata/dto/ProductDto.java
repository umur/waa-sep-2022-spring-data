package edu.miu.lab3springdata.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

@Data
public class ProductDto {

    private Integer id;

    private String name;

    private Double price;

    private Integer rating;

    @JsonBackReference
    private CategoryDto category;
}
