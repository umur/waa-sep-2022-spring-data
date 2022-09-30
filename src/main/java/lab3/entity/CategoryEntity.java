package lab3.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_category")

    private List<ProductEntity> products;

}
