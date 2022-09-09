package com.example.assignment3.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;

/**
 * A DTO for the {@link com.example.assignment3.entity.Product} entity
 */
@Data
@ApiModel()
public class ProductDto implements Serializable {
    private Long id;
    private String name;
    private int price;
    private double rating;
    private CategoryDto category;

    /**
     * A DTO for the {@link com.example.assignment3.entity.Category} entity
     */
    @Data
    public static class CategoryDto implements Serializable {
        private Long id;
        private String name;
    }
}