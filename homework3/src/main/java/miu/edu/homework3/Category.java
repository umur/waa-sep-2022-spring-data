package miu.edu.homework3;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Category {

    @Id
    private int id;
    private String name;


    //Create them using uni-directional.
    @OneToMany
    private List<Product> products;

}
