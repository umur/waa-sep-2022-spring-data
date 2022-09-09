package com.example.assignment3.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * A DTO for the {@link com.example.assignment3.entity.Category} entity
 */
@Data
@ApiModel()
public class CategoryDto implements Serializable {
    private Long id;
    private String name;
    private LocalDate createAt;
    private LocalDate updateAt;
    private List<ProductDto1> productList;

    /**
     * A DTO for the {@link com.example.assignment3.entity.Product} entity
     */
    @Data
    public static class ProductDto1 implements Serializable {
        private Long id;
        private String name;
        private int price;
        private double rating;
        private LocalDate createAt;
        private LocalDate updateAt;
    }
}