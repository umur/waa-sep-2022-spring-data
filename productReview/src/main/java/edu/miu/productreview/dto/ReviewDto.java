package edu.miu.productreview.dto;

import edu.miu.productreview.domain.Product;
import edu.miu.productreview.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReviewDto {
    private int id;
    private String comment;
    private UserDto user;
}
