package miu.edu.homework3;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
    @Id
    private int id;
    private String  street;
    private int zip;
    private String  city;

    @OneToOne
    private User user;


}
