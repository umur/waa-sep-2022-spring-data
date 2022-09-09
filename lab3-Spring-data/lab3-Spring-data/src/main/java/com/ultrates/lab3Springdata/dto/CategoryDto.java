package com.ultrates.lab3Springdata.dto;

import com.ultrates.lab3Springdata.entity.unidirectional.ProductUni;
import lombok.Data;

import java.util.List;

@Data
public class CategoryDto {
    private int id;
    private String name;
    private List<ProductUni> productUnis;
}
