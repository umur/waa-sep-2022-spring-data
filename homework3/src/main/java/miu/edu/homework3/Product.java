package miu.edu.homework3;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Product {
    @Id
    private int id;
    private String name;
    private double price;
    private int rating;



//    Create them using uni-directional.
//    nothing will be written here
// *******************



    //bi-directional
    @ManyToOne
    private Category category;
//************************




}
