package miu.edu.homework3.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    private int rating;



//    Create them using uni-directional.
//    nothing will be written here
// *******************



    //bi-directional
    @ManyToOne
//    @JoinColumn(name = "category_id")
    private Category category;
//************************




}
