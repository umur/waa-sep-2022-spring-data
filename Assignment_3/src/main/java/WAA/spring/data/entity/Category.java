package WAA.spring.data.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Category {
    @Id
    private int id;
    private String name;
    @OneToMany(mappedBy = "category")

    @JsonBackReference
    private List<Product> productList;
}
