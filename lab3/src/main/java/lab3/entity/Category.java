package lab3.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@Table(name = "category")
public class Category {
    @Id
    private Integer id;
    @Column(name = "name")
    private String name;

}
