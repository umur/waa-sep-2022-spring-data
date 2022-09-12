package miu.edu.homework3.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Data

public class Address {
    @Id
    private int id;
    private String  street;
    private int zip;
    private String  city;

    @OneToOne            // uniderict  strong tomonga quyas
                            /// biodirec week tomonga   JOincolumn
    @JoinColumn(name = "user_id")  //week side
    private User user;


}
