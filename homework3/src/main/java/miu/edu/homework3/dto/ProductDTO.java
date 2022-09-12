package miu.edu.homework3.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

    private int id;
    private String name;
    private int price;
    private  int rating;

    @JsonManagedReference
    private CategoryDTO category;
}
