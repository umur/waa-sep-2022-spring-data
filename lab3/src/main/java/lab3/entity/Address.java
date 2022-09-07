package lab3.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address {

    @Id
    private int id;

    @Column
    private String street;

    @Column
    private String zip;

    @Column
    private String city;
}
