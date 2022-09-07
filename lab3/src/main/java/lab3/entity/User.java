package lab3.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "user_lab")
//id, email, password, firstName, lastname
public class User {
    @Id
    private  int id;
    @Column
    private String email;

    private String firstName;

    private String lastName;


    @OneToOne
    private Address address;
}
