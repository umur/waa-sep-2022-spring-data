package lab3.dto;

import lab3.entity.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {

    private int id;
    private String name;
    private List<ProductEntity> products;
}
