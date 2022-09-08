package miu.edu.homework3;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Review {
    @Id
    private int id;
    private String comment;

    @ManyToOne
    private User user;
//

}
