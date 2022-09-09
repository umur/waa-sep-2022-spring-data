package edu.miu.lab3.dto;

import edu.miu.lab3.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDto {

    private int id;
    private String name;
    private Float price;
    private Integer rating;
    private CategoryDto category;

}
