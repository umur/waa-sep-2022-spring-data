package miu.edu.homework3.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import miu.edu.homework3.entity.Product;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CategoryDTO {
    private Integer id;
    private  String name;

    @JsonManagedReference
    List<ProductDTO> productDTOs;

}
