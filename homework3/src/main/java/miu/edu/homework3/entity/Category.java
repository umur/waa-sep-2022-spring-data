package miu.edu.homework3.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;
    private String name;


    //Create them using uni-directional.
    @OneToMany(cascade = CascadeType.PERSIST , fetch = FetchType.LAZY , mappedBy = "category" )
    @JsonManagedReference
//    @JoinColumn(name = "category_id")
//    @JoinTable(name = "habb")    //for strong sidez

    private List<Product> products;

}
