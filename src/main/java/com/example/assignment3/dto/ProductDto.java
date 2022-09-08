package com.example.assignment3.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.example.assignment3.entity.Product} entity
 */
@Data
public class ProductDto implements Serializable {
    private final Long id;
    private final String name;
    private final int price;
    private final double rating;
    private final CategoryDto category;

    /**
     * A DTO for the {@link com.example.assignment3.entity.Category} entity
     */
    @Data
    public static class CategoryDto implements Serializable {
        private final Long id;
        private final String name;
    }
}