package edu.miu.productreview.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String name;
    private Float price;
    private Float rating;

    //a product can belong to only one category
    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "product") //on column, bidirection
    private List<Review> reviews;
}
