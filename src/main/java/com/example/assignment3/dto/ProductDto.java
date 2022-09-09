package com.example.assignment3.dto;

import io.swagger.annotations.ApiModel;
import lombok.Value;

import java.io.Serializable;

/**
 * A DTO for the {@link com.example.assignment3.entity.Product} entity
 */
@Value
@ApiModel()
public class ProductDto implements Serializable {
    Long id;
    String name;
    int price;
    double rating;
    CategoryDto category;

    /**
     * A DTO for the {@link com.example.assignment3.entity.Category} entity
     */
    @Value
    public static class CategoryDto implements Serializable {
        Long id;
        String name;
    }
}