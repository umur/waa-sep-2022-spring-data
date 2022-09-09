package edu.miu.productreview.dto;

import edu.miu.productreview.domain.Category;
import edu.miu.productreview.domain.Review;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDto {
    private int id;
    private String name;
    private Float price;
    private Float rating;
    private CategoryDto category;
    private List<ReviewDto> reviews;
}
