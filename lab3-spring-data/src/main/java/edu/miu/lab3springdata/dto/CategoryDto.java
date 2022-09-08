package edu.miu.lab3springdata.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import java.util.List;

@Data
public class CategoryDto {

    private Integer id;

    private String name;

    @JsonManagedReference
    private List<ProductDto> products;
}
