package lab3.entity;

import lombok.Data;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@Entity
@Data
@Table(name = "product")
public class Product {
    @Id
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name="price")
    private Double price;
    @Column(name = "rating")
    private Double rating;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
